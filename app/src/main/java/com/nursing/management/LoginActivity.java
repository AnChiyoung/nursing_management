package com.nursing.management;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.util.Calendar;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class LoginActivity extends AppCompatActivity {

    public static String LOG = null;
    public static String common_id = null;
    public static String id = null;
    public static int loginCount = 0;
    public static boolean loginOk = false;
    public static String name;
    public static String password;
    Button btn_join;
    Button btn_login;
    EditText et_id;
    EditText et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Initialize();
        this.btn_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                LoginActivity.this.NetworkCheck();
            }
        });
        this.btn_join.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                LoginActivity.this.startActivity(new Intent(LoginActivity.this, JoinActivity.class));
                LoginActivity.this.finish();
            }
        });
    }

    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) "????????????????????? ?????????????????????????");
        builder.setPositiveButton((CharSequence) "???", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                LoginActivity.this.finishAndRemoveTask();
            }
        });
        builder.setNegativeButton((CharSequence) "?????????", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.setCancelable(false);
        builder.create().show();
    }

    private void Initialize() {
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_join = (Button) findViewById(R.id.btn_join);
        et_id = (EditText) findViewById(R.id.et_id);
        et_password = (EditText) findViewById(R.id.et_password);
    }



    public void NetworkCheck() {
        NetworkInfo networkInfo = getNetworkInfo();
        if (networkInfo == null || !networkInfo.isConnected()) {
            Toast.makeText(getApplicationContext(), "??????????????? ???????????? ???????????????", Toast.LENGTH_SHORT).show();
        } else if (networkInfo.getType() == 1) {
            Toast.makeText(getApplicationContext(), "WiFI??? ????????? ???????????????", Toast.LENGTH_SHORT).show();
            LoginCheck();
        } else if (networkInfo.getType() == 0) {
            Toast.makeText(getApplicationContext(), "3G / LTE??? ????????? ???????????????", Toast.LENGTH_SHORT).show();
            LoginCheck();
        }
    }

    @SuppressLint("WrongConstant")
    private NetworkInfo getNetworkInfo() {
        return ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public String DateGet() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(Calendar.getInstance().getTime());
    }

    @SuppressLint("StaticFieldLeak")
    private void LoginCheck() {
        new AsyncTask<Void, Void, Void>() {
            ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this);

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                LoginActivity.id = "";
                LoginActivity.password = "";
                LoginActivity.name = "";
                LoginActivity.loginCount = 0;
                LoginActivity.loginOk = false;
                this.progressDialog.setProgressStyle(0);
                this.progressDialog.setMessage("???????????? ??????????????? ?????? ????????????");
                this.progressDialog.setCancelable(false);
                this.progressDialog.show();
            }

            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                JSONArray execQuery = new ServerConnect().execQuery((String) null, "SELECT * FROM user");
                try {
                    Thread.sleep(500);
                    if (!execQuery.toString().equals("[777]")) {
                        if (!execQuery.toString().equals("[444]")) {
                            for (int i = 0; i < execQuery.length(); i++) {
                                LoginActivity.id = execQuery.getJSONObject(i).getString("id");
                                LoginActivity.password = execQuery.getJSONObject(i).getString("password");
                                boolean z = true;
                                if (!LoginActivity.id.equals(LoginActivity.this.et_id.getText().toString()) || !LoginActivity.password.equals(LoginActivity.this.et_password.getText().toString())) {
                                    if (!LoginActivity.loginOk) {
                                        z = false;
                                    }
                                    LoginActivity.loginOk = z;
                                } else {
                                    LoginActivity.loginOk = true;
                                    LoginActivity.name = execQuery.getJSONObject(i).getString("name");
                                    LoginActivity.loginCount = execQuery.getJSONObject(i).getInt("login_count");
                                }
                            }
                            LoginActivity.LOG = "????????????";
                            return null;
                        }
                    }
                    LoginActivity.LOG = "??????";
                } catch (InterruptedException | JSONException unused) {
                }
                return null;
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(Void voidR) {
                this.progressDialog.dismiss();
                if (!LoginActivity.loginOk) {
                    Toast.makeText(LoginActivity.this.getApplicationContext(), "???????????? ??????????????? ?????????????????????", Toast.LENGTH_SHORT).show();
                } else if (LoginActivity.loginOk) {
                    Intent intent = new Intent(LoginActivity.this, ManagementActivity.class);
                    intent.putExtra("loginId", LoginActivity.this.et_id.getText().toString());
                    intent.putExtra("loginName", LoginActivity.name);
                    LoginActivity.this.Update();
                    LoginActivity.this.startActivity(intent);
                    LoginActivity.this.finish();
                }
            }
        }.execute();
    }

    public void Update() {
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            @SuppressLint("StaticFieldLeak")
            @RequiresApi(api = Build.VERSION_CODES.N)
            public Void doInBackground(Void... voidArr) {
                ServerConnect serverConnect = new ServerConnect();
                serverConnect.execQuery((String) null, "UPDATE user SET login_count = '" + (LoginActivity.loginCount + 1) + "', last_login_date = '" + LoginActivity.this.DateGet() + "' WHERE id = '" + LoginActivity.this.et_id.getText().toString() + "'");
                return null;
            }
        }.execute();
    }
}