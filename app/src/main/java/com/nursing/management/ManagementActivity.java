package com.nursing.management;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ManagementActivity extends AppCompatActivity implements View.OnClickListener {

    public static String loginId;
    public static String loginName;
    Button btn_base;
    Button btn_communication;
    Button btn_graph;
    Button btn_logout;
    Button btn_professional;
    Button btn_report;
    Button btn_cartoon;
    TextView tv_login_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.management);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Initialize();
    }

    public void onBackPressed() {
        this.btn_logout.performClick();
    }

    private void Initialize() {
        this.btn_professional = (Button) findViewById(R.id.btn_professional);
        this.btn_base = (Button) findViewById(R.id.btn_base);
        this.btn_communication = (Button) findViewById(R.id.btn_communication);
        this.btn_report = (Button) findViewById(R.id.btn_report);
        this.btn_graph = (Button) findViewById(R.id.btn_graph);
        this.btn_logout = (Button) findViewById(R.id.btn_logout);
        this.btn_cartoon = (Button) findViewById(R.id.btn_cartoon);
        this.btn_professional.setOnClickListener(this);
        this.btn_base.setOnClickListener(this);
        this.btn_communication.setOnClickListener(this);
        this.btn_report.setOnClickListener(this);
        this.btn_graph.setOnClickListener(this);
        this.btn_logout.setOnClickListener(this);
        this.btn_cartoon.setOnClickListener(this);
        this.tv_login_info = (TextView) findViewById(R.id.tv_login_info);
        Intent intent = getIntent();
        loginId = intent.getStringExtra("loginId");
        loginName = intent.getStringExtra("loginName");
        if (loginId.equals("sm580228")) {
            this.tv_login_info.setText("관리자님, 접속을 환영합니다");
        } else if (loginId.equals("goodluckcy")) {
            this.tv_login_info.setText("개발자님, 접속을 환영합니다");
        } else {
            TextView textView = this.tv_login_info;
            textView.setText(loginName + "님, 접속을 환영합니다");
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_base:
                startActivity(new Intent(this, BaseActivity.class));
                return;
            case R.id.btn_communication:
                startActivity(new Intent(this, CommunicationActivity.class));
                return;
            case R.id.btn_graph:
                if (loginId.equals("sm580228") || loginId.equals("goodluckcy")) {
                    startActivity(new Intent(this, LoginGraphActivity.class));
                    return;
                } else {
                    Toast.makeText(getApplicationContext(), "관리자가 아니므로 접근할 수 없습니다", Toast.LENGTH_SHORT).show();
                    return;
                }
            case R.id.btn_logout:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle((CharSequence) "로그아웃 하시겠습니까?");
                builder.setPositiveButton((CharSequence) "네", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ManagementActivity.this.startActivity(new Intent(ManagementActivity.this, LoginActivity.class));
                        ManagementActivity.this.finish();
                    }
                });
                builder.setNegativeButton((CharSequence) "아니오", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.setCancelable(false);
                builder.create().show();
                return;
            case R.id.btn_professional:
                startActivity(new Intent(this, ProfessionalActivity.class));
                return;
            case R.id.btn_report:
                startActivity(new Intent(this, ReportActivity.class));
                return;
            case R.id.btn_cartoon:
                startActivity(new Intent(this, CartoonActivity.class));
            default:
                return;
        }
    }
}