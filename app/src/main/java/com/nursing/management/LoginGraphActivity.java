package com.nursing.management;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class LoginGraphActivity extends AppCompatActivity {

    public static String LOG;
    public static ArrayList<Integer> count = new ArrayList<>();
    public static ArrayList<String> id = new ArrayList<>();
    public static ArrayList<String> lastLoginDate = new ArrayList<>();
    public static ArrayList<String> name = new ArrayList<>();
    LoginGraphAdapter loginGraphAdapter;
    ListView lv_graph;
    Button btn_graph01, btn_graph02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.logingraph);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Initialize();
    }

    private void Initialize() {
        this.lv_graph = (ListView) findViewById(R.id.lv_graph);
        this.loginGraphAdapter = new LoginGraphAdapter();
        btn_graph01 = (Button)findViewById(R.id.btn_graph01);
        btn_graph02 = (Button)findViewById(R.id.btn_graph02);
        btn_graph01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginGraphActivity.this, LoginGraph01.class));
            }
        });
        btn_graph02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginGraphActivity.this, LoginGraph02.class));
            }
        });
        Load();
    }

    private void Load() {
        new AsyncTask<Void, Void, Void>() {
            ProgressDialog progressDialog = new ProgressDialog(LoginGraphActivity.this);

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                LoginGraphActivity.this.loginGraphAdapter.clearAdapter();
                LoginGraphActivity.id.clear();
                LoginGraphActivity.name.clear();
                LoginGraphActivity.count.clear();
                LoginGraphActivity.lastLoginDate.clear();
                this.progressDialog.setProgressStyle(0);
                this.progressDialog.setMessage("데이터를 불러오는 중입니다");
                this.progressDialog.setCancelable(false);
                this.progressDialog.show();
            }

            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                JSONArray execQuery = new ServerConnect().execQuery((String) null, "SELECT * from user WHERE id NOT IN ('sm580228', 'goodluckcy') ORDER BY login_count DESC");
                try {
                    Thread.sleep(500);
                    if (!execQuery.toString().equals("[777]")) {
                        if (!execQuery.toString().equals("[444]")) {
                            for (int i = 0; i < execQuery.length(); i++) {
                                LoginGraphActivity.id.add(execQuery.getJSONObject(i).getString("id"));
                                LoginGraphActivity.name.add(execQuery.getJSONObject(i).getString("name"));
                                LoginGraphActivity.count.add(Integer.valueOf(execQuery.getJSONObject(i).getInt("login_count")));
                                LoginGraphActivity.lastLoginDate.add(execQuery.getJSONObject(i).getString("last_login_date"));
                            }
                            LoginGraphActivity.LOG = "에러아님";
                            return null;
                        }
                    }
                    LoginGraphActivity.LOG = "에러";
                } catch (InterruptedException | JSONException unused) {
                }
                return null;
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(Void voidR) {
                this.progressDialog.dismiss();
                for (int i = 0; i < LoginGraphActivity.id.size(); i++) {
                    LoginGraphActivity.this.loginGraphAdapter.addItem(LoginGraphActivity.id.get(i), LoginGraphActivity.name.get(i), LoginGraphActivity.count.get(i).intValue(), LoginGraphActivity.lastLoginDate.get(i));
                }
                LoginGraphActivity.this.lv_graph.setAdapter(LoginGraphActivity.this.loginGraphAdapter);
            }
        }.execute();
    }
}