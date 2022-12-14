package com.nursing.management;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.json.JSONArray;

import java.util.regex.Pattern;

public class JoinActivity extends AppCompatActivity {

    public static String LOG = "ėëŽėë";
    Button btn_change;
    Button btn_join;
    Button btn_join_01;
    Button btn_join_02;
    EditText et_id;
    EditText et_id_02;
    EditText et_name;
    EditText et_password;
    EditText et_password_02;
    EditText et_password_origin;
    EditText et_password_re;
    EditText et_password_re_02;
    LinearLayout layout_join;
    LinearLayout layout_password_change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.join);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Initialize();
        this.btn_join.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                JoinActivity.this.CheckForm();
            }
        });
        this.btn_join_01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                JoinActivity.this.btn_join_01.setTextColor(Color.BLACK);
                JoinActivity.this.btn_join_02.setTextColor(Color.GRAY);
                JoinActivity.this.layout_join.setVisibility(View.VISIBLE);
                JoinActivity.this.layout_password_change.setVisibility(View.GONE);
            }
        });
        this.btn_join_02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                JoinActivity.this.btn_join_01.setTextColor(Color.GRAY);
                JoinActivity.this.btn_join_02.setTextColor(Color.BLACK);
                JoinActivity.this.layout_join.setVisibility(View.GONE);
                JoinActivity.this.layout_password_change.setVisibility(View.VISIBLE);
            }
        });
        this.btn_change.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                JoinActivity.this.CheckFormChange();
            }
        });
    }

    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle((CharSequence) "ėėīë ėėąė ę·ļë§ëėęē ėĩëęđ?");
        builder.setPositiveButton((CharSequence) "ëĪ", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                JoinActivity.this.startActivity(new Intent(JoinActivity.this, LoginActivity.class));
                JoinActivity.this.finish();
            }
        });
        builder.setNegativeButton((CharSequence) "ėëėĪ", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.setCancelable(false);
        builder.create().show();
    }

    private void Initialize() {
        this.et_name = (EditText) findViewById(R.id.et_join_name);
        this.et_id = (EditText) findViewById(R.id.et_join_id);
        this.et_password = (EditText) findViewById(R.id.et_join_password);
        this.et_password_re = (EditText) findViewById(R.id.et_join_re_password);
        this.btn_join = (Button) findViewById(R.id.btn_join_submit);
        this.btn_join_01 = (Button) findViewById(R.id.btn_join_01);
        this.btn_join_02 = (Button) findViewById(R.id.btn_join_02);
        this.btn_join_01.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.btn_join_02.setTextColor(-7829368);
        this.layout_join = (LinearLayout) findViewById(R.id.layout_join);
        this.layout_password_change = (LinearLayout) findViewById(R.id.layout_password_change);
        this.et_id_02 = (EditText) findViewById(R.id.et_join_id_02);
        this.et_password_origin = (EditText) findViewById(R.id.et_join_password_origin);
        this.et_password_02 = (EditText) findViewById(R.id.et_join_password_02);
        this.et_password_re_02 = (EditText) findViewById(R.id.et_join_re_password_02);
        this.btn_change = (Button) findViewById(R.id.btn_change);
    }

    public void CheckForm() {
        if (this.et_name.getText().toString().equals("") || this.et_id.getText().toString().equals("") || this.et_password.getText().toString().equals("") || this.et_password_re.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "ęģĩë°ąėļ í­ëŠĐėī ėėĩëëĪ", Toast.LENGTH_SHORT).show();
        } else if (!Pattern.matches("^[a-zA-Z]*$", this.et_id.getText().toString()) || !Pattern.matches("^[a-zA-Z]{1}[a-zA-Z0-9]{7,14}$", this.et_password.getText().toString()) || !Pattern.matches("^[a-zA-Z]{1}[a-zA-Z0-9]{7,14}$", this.et_password_re.getText().toString())) {
            Toast.makeText(getApplicationContext(), "ííė ë§ė§ėë ėë Ĩí­ëŠĐėī ėėĩëëĪ.\nę° í­ëŠĐė íėļíīėĢžėļė", Toast.LENGTH_SHORT).show();
        } else if (this.et_password_re.getText().toString().equals(this.et_password.getText().toString())) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage((CharSequence) "ę°ėė ė§ííėęē ėĩëęđ?\nėīëĶ : " + this.et_name.getText().toString() + "\nėėīë : " + this.et_id.getText().toString());
            builder.setPositiveButton((CharSequence) "ëĪ", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    new JoinSubmit().execute(new Void[0]);
                }
            });
            builder.setNegativeButton((CharSequence) "ėëėĪ", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder.setCancelable(false);
            builder.create().show();
        } else {
            Toast.makeText(getApplicationContext(), "ëđë°ëēíļę° ėžėđíė§ ėėĩëëĪ", Toast.LENGTH_SHORT).show();
        }
    }

    public void CheckFormChange() {
        if (this.et_id_02.getText().toString().equals("") || this.et_password_origin.getText().toString().equals("") || this.et_password_02.getText().toString().equals("") || this.et_password_re_02.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "ęģĩë°ąėļ í­ëŠĐėī ėėĩëëĪ", Toast.LENGTH_SHORT).show();
        } else {
            new IdCheck().execute(new Void[0]);
        }
    }

    private class JoinSubmit extends AsyncTask<Void, Void, Void> {
        ProgressDialog progressDialog;

        private JoinSubmit() {
            this.progressDialog = new ProgressDialog(JoinActivity.this);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            JoinActivity.LOG = "ėëŽėë";
            this.progressDialog.setProgressStyle(0);
            this.progressDialog.setCancelable(false);
            this.progressDialog.setMessage("ę°ėė ėëĢíë ėĪėëëĪ");
            this.progressDialog.show();
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voidArr) {
            ServerConnect serverConnect = new ServerConnect();
            serverConnect.execQuery((String) null, "INSERT INTO user (id, name, password, login_count, last_login_date) VALUES ('" + JoinActivity.this.et_id.getText().toString() + "', '" + JoinActivity.this.et_name.getText().toString() + "', '" + JoinActivity.this.et_password.getText().toString() + "', '0', 'ė ėęļ°ëĄėė')");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Void voidR) {
            this.progressDialog.dismiss();
            Toast.makeText(JoinActivity.this.getApplicationContext(), "ę°ėėī ėëĢëėėĩëëĪ", Toast.LENGTH_SHORT).show();
            JoinActivity.this.startActivity(new Intent(JoinActivity.this, LoginActivity.class));
            JoinActivity.this.finish();
        }
    }

    private class IdCheck extends AsyncTask<Void, Void, Void> {
        private IdCheck() {
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voidArr) {
            ServerConnect serverConnect = new ServerConnect();
            JSONArray execQuery = serverConnect.execQuery((String) null, "SELECT id, password FROM user WHERE id = '" + JoinActivity.this.et_id_02.getText().toString() + "' AND password = '" + JoinActivity.this.et_password_origin.getText().toString() + "'");
            if (execQuery.toString().equals("[777]") || execQuery.toString().equals("[444]")) {
                JoinActivity.LOG = "ėëŽ";
            } else {
                JoinActivity.LOG = "ėëŽėë";
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Void voidR) {
            if (JoinActivity.LOG.equals("ėëŽ")) {
                Toast.makeText(JoinActivity.this.getApplicationContext(), "ėėīëė ęļ°ėĄī ëđë°ëēíļė ė ëģīę° ė ííė§ ėėĩëëĪ", Toast.LENGTH_SHORT).show();
            } else if (!JoinActivity.LOG.equals("ėëŽėë")) {
            } else {
                if (!Pattern.matches("^[a-zA-Z]{1}[a-zA-Z0-9]{7,14}$", JoinActivity.this.et_password_02.getText().toString()) || !Pattern.matches("^[a-zA-Z]{1}[a-zA-Z0-9]{7,14}$", JoinActivity.this.et_password_re_02.getText().toString())) {
                    Toast.makeText(JoinActivity.this.getApplicationContext(), "ííė ë§ė§ėë ėë Ĩí­ëŠĐėī ėėĩëëĪ.\nę° í­ëŠĐė íėļíīėĢžėļė", Toast.LENGTH_SHORT).show();
                } else if (JoinActivity.this.et_password_re_02.getText().toString().equals(JoinActivity.this.et_password_02.getText().toString())) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(JoinActivity.this);
                    builder.setMessage((CharSequence) "ëđë°ëēíļëĨž ė ë§ëĄ ëģęē―íėęē ėĩëęđ?");
                    builder.setPositiveButton((CharSequence) "ëĪ", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            new UpdatePassword().execute(new Void[0]);
                        }
                    });
                    builder.setNegativeButton((CharSequence) "ėëėĪ", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    builder.setCancelable(false);
                    builder.create().show();
                } else {
                    Toast.makeText(JoinActivity.this.getApplicationContext(), "ëģęē―íęģ ė íë ëđë°ëēíļę° ėžėđíė§ ėėĩëëĪ", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private class UpdatePassword extends AsyncTask<Void, Void, Void> {
        ProgressDialog progressDialog;

        private UpdatePassword() {
            this.progressDialog = new ProgressDialog(JoinActivity.this);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.progressDialog.setProgressStyle(0);
            this.progressDialog.setCancelable(false);
            this.progressDialog.setMessage("ëđë°ëēíļëĨž ėë°ėīíļ ėĪėëëĪ");
            this.progressDialog.show();
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voidArr) {
            ServerConnect serverConnect = new ServerConnect();
            serverConnect.execQuery((String) null, "UPDATE user SET password = '" + JoinActivity.this.et_password_02.getText().toString() + "' WHERE id = '" + JoinActivity.this.et_id_02.getText().toString() + "'");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Void voidR) {
            this.progressDialog.dismiss();
            Toast.makeText(JoinActivity.this.getApplicationContext(), "ëđë°ëēíļę° ëģęē―ëėėĩëëĪ", Toast.LENGTH_SHORT).show();
        }
    }
}