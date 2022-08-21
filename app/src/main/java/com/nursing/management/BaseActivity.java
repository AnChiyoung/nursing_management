package com.nursing.management;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    private static boolean btnPush01 = false;
    private static boolean btnPush02 = false;
    private static boolean btnPush03 = false;
    Button btn01;
    Button btn02;
    Button btn03;
    Button btn_content_base01;
    Button btn_content_base02_01;
    Button btn_content_base02_02;
    Button btn_content_base02_03;
    Button btn_content_base02_04;
    Button btn_content_base02_05;
    Button btn_content_base03_01;
    Button btn_content_base03_02;
    Button btn_content_base03_03;
    Button btn_content_base03_04;
    Button btn_content_base03_05;
    Button btn_content_base03_06;
    Button btn_content_base03_07;
    Button btn_content_base03_08;
    Button btn_content_base03_09;
    Button btn_content_base03_10;
    Button btn_content_base03_11;
    Button btn_cycle_base01;
    Button btn_movie_base01;
    LinearLayout layout_base01;
    LinearLayout layout_base02;
    LinearLayout layout_base03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.base);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Initialize();
    }

    private void Initialize() {
        this.btn01 = (Button) findViewById(R.id.btn_base01);
        this.btn02 = (Button) findViewById(R.id.btn_base02);
        this.btn03 = (Button) findViewById(R.id.btn_base03);
        this.btn01.setOnClickListener(this);
        this.btn02.setOnClickListener(this);
        this.btn03.setOnClickListener(this);
        this.layout_base01 = (LinearLayout) findViewById(R.id.layout_base01);
        this.layout_base02 = (LinearLayout) findViewById(R.id.layout_base02);
        this.layout_base03 = (LinearLayout) findViewById(R.id.layout_base03);
        this.btn_movie_base01 = (Button) findViewById(R.id.btn_movie_base01);
        this.btn_cycle_base01 = (Button) findViewById(R.id.btn_cycle_base01);
        this.btn_content_base01 = (Button) findViewById(R.id.btn_content_base01);
        this.btn_content_base02_01 = (Button) findViewById(R.id.btn_title_base02_01);
        this.btn_content_base02_02 = (Button) findViewById(R.id.btn_title_base02_02);
        this.btn_content_base02_03 = (Button) findViewById(R.id.btn_title_base02_03);
        this.btn_content_base02_04 = (Button) findViewById(R.id.btn_title_base02_04);
        this.btn_content_base02_05 = (Button) findViewById(R.id.btn_title_base02_05);
        this.btn_content_base03_01 = (Button) findViewById(R.id.btn_title_base03_01);
        this.btn_content_base03_02 = (Button) findViewById(R.id.btn_title_base03_02);
        this.btn_content_base03_03 = (Button) findViewById(R.id.btn_title_base03_03);
        this.btn_content_base03_04 = (Button) findViewById(R.id.btn_title_base03_04);
        this.btn_content_base03_05 = (Button) findViewById(R.id.btn_title_base03_05);
        this.btn_content_base03_06 = (Button) findViewById(R.id.btn_title_base03_06);
        this.btn_content_base03_07 = (Button) findViewById(R.id.btn_title_base03_07);
        this.btn_content_base03_08 = (Button) findViewById(R.id.btn_title_base03_08);
        this.btn_content_base03_09 = (Button) findViewById(R.id.btn_title_base03_09);
        this.btn_content_base03_10 = (Button) findViewById(R.id.btn_title_base03_10);
        this.btn_content_base03_11 = (Button) findViewById(R.id.btn_title_base03_11);
        this.btn_movie_base01.setOnClickListener(this);
        this.btn_cycle_base01.setOnClickListener(this);
        this.btn_content_base01.setOnClickListener(this);
        this.btn_content_base02_01.setOnClickListener(this);
        this.btn_content_base02_02.setOnClickListener(this);
        this.btn_content_base02_03.setOnClickListener(this);
        this.btn_content_base02_04.setOnClickListener(this);
        this.btn_content_base02_05.setOnClickListener(this);
        this.btn_content_base03_01.setOnClickListener(this);
        this.btn_content_base03_02.setOnClickListener(this);
        this.btn_content_base03_03.setOnClickListener(this);
        this.btn_content_base03_04.setOnClickListener(this);
        this.btn_content_base03_05.setOnClickListener(this);
        this.btn_content_base03_06.setOnClickListener(this);
        this.btn_content_base03_07.setOnClickListener(this);
        this.btn_content_base03_08.setOnClickListener(this);
        this.btn_content_base03_09.setOnClickListener(this);
        this.btn_content_base03_10.setOnClickListener(this);
        this.btn_content_base03_11.setOnClickListener(this);
    }

    public void onClick(View view) {
        @SuppressLint("WrongConstant") LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService("layout_inflater");
        int id = view.getId();
        if (id == R.id.btn_content_base01) {
            startActivity(new Intent(this, Base01Content.class));
        } else if (id == R.id.btn_cycle_base01) {
            startActivity(new Intent(this, Base01Cycle.class));
        } else if (id != R.id.btn_movie_base01) {
            switch (id) {
                case R.id.btn_base01:
                    Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.layout_set);
                    SpannableString spannableString = new SpannableString(this.btn01.getText().toString());
                    boolean z = btnPush01;
                    if (!z) {
                        this.layout_base01.setVisibility(View.VISIBLE);
                        this.layout_base01.setAnimation(loadAnimation);
                        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                        this.btn01.setText(spannableString);
                        btnPush01 = true;
                        return;
                    } else if (z) {
                        this.layout_base01.setVisibility(View.GONE);
                        this.btn01.setText("환자 이동 및 환의 교환");
                        btnPush01 = false;
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_base02:
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.layout_set);
                    SpannableString spannableString2 = new SpannableString(this.btn02.getText().toString());
                    boolean z2 = btnPush02;
                    if (!z2) {
                        this.layout_base02.setVisibility(View.VISIBLE);
                        this.layout_base02.setAnimation(loadAnimation2);
                        spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
                        this.btn02.setText(spannableString2);
                        btnPush02 = true;
                        return;
                    } else if (z2) {
                        this.layout_base02.setVisibility(View.GONE);
                        this.btn02.setText("혈액 검사의 임상적 의의");
                        btnPush02 = false;
                        return;
                    } else {
                        return;
                    }
                case R.id.btn_base03:
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(this, R.anim.layout_set);
                    SpannableString spannableString3 = new SpannableString(this.btn03.getText().toString());
                    boolean z3 = btnPush03;
                    if (!z3) {
                        this.layout_base03.setVisibility(View.VISIBLE);
                        this.layout_base03.setAnimation(loadAnimation3);
                        spannableString3.setSpan(new UnderlineSpan(), 0, spannableString3.length(), 0);
                        this.btn03.setText(spannableString3);
                        btnPush03 = true;
                        return;
                    } else if (z3) {
                        this.layout_base03.setVisibility(View.GONE);
                        this.btn03.setText("병동별 의학용어 정리");
                        btnPush03 = false;
                        return;
                    } else {
                        return;
                    }
                default:
                    switch (id) {
                        case R.id.btn_title_base02_01:
                            startActivity(new Intent(this, Base02Content01.class));
                            return;
                        case R.id.btn_title_base02_02:
                            startActivity(new Intent(this, Base02Content02.class));
                            return;
                        case R.id.btn_title_base02_03:
                            startActivity(new Intent(this, Base02Content03.class));
                            return;
                        case R.id.btn_title_base02_04:
                            startActivity(new Intent(this, Base02Content04.class));
                            return;
                        case R.id.btn_title_base02_05:
                            startActivity(new Intent(this, Base02Content05.class));
                            return;
                        case R.id.btn_title_base03_01:
                            View inflate = layoutInflater.inflate(R.layout.base_03_content01, (ViewGroup) null);
                            AlertDialog.Builder builder = new AlertDialog.Builder(this);
                            builder.setCancelable(false);
                            builder.setView(inflate);
                            builder.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });
                            builder.create().show();
                            return;
                        case R.id.btn_title_base03_02:
                            View inflate2 = layoutInflater.inflate(R.layout.base_03_content02, (ViewGroup) null);
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                            builder2.setCancelable(false);
                            builder2.setView(inflate2);
                            builder2.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });
                            builder2.create().show();
                            return;
                        case R.id.btn_title_base03_03:
                            View inflate3 = layoutInflater.inflate(R.layout.base_03_content03, (ViewGroup) null);
                            AlertDialog.Builder builder3 = new AlertDialog.Builder(this);
                            builder3.setCancelable(false);
                            builder3.setView(inflate3);
                            builder3.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });
                            builder3.create().show();
                            return;
                        case R.id.btn_title_base03_04:
                            View inflate4 = layoutInflater.inflate(R.layout.base_03_content04, (ViewGroup) null);
                            AlertDialog.Builder builder4 = new AlertDialog.Builder(this);
                            builder4.setCancelable(false);
                            builder4.setView(inflate4);
                            builder4.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });
                            builder4.create().show();
                            return;
                        case R.id.btn_title_base03_05:
                            View inflate5 = layoutInflater.inflate(R.layout.base_03_content05, (ViewGroup) null);
                            AlertDialog.Builder builder5 = new AlertDialog.Builder(this);
                            builder5.setCancelable(false);
                            builder5.setView(inflate5);
                            builder5.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });
                            builder5.create().show();
                            return;
                        case R.id.btn_title_base03_06:
                            View inflate6 = layoutInflater.inflate(R.layout.base_03_content06, (ViewGroup) null);
                            AlertDialog.Builder builder6 = new AlertDialog.Builder(this);
                            builder6.setCancelable(false);
                            builder6.setView(inflate6);
                            builder6.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });
                            builder6.create().show();
                            return;
                        case R.id.btn_title_base03_07:
                            View inflate7 = layoutInflater.inflate(R.layout.base_03_content07, (ViewGroup) null);
                            AlertDialog.Builder builder7 = new AlertDialog.Builder(this);
                            builder7.setCancelable(false);
                            builder7.setView(inflate7);
                            builder7.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });
                            builder7.create().show();
                            return;
                        case R.id.btn_title_base03_08:
                            View inflate8 = layoutInflater.inflate(R.layout.base_03_content08, (ViewGroup) null);
                            AlertDialog.Builder builder8 = new AlertDialog.Builder(this);
                            builder8.setCancelable(false);
                            builder8.setView(inflate8);
                            builder8.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });
                            builder8.create().show();
                            return;
                        case R.id.btn_title_base03_09:
                            View inflate9 = layoutInflater.inflate(R.layout.base_03_content09, (ViewGroup) null);
                            AlertDialog.Builder builder9 = new AlertDialog.Builder(this);
                            builder9.setCancelable(false);
                            builder9.setView(inflate9);
                            builder9.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });
                            builder9.create().show();
                            return;
                        case R.id.btn_title_base03_10:
                            View inflate10 = layoutInflater.inflate(R.layout.base_03_content10, (ViewGroup) null);
                            AlertDialog.Builder builder10 = new AlertDialog.Builder(this);
                            builder10.setCancelable(false);
                            builder10.setView(inflate10);
                            builder10.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });
                            builder10.create().show();
                            return;
                        case R.id.btn_title_base03_11:
                            View inflate11 = layoutInflater.inflate(R.layout.base_03_content11, (ViewGroup) null);
                            AlertDialog.Builder builder11 = new AlertDialog.Builder(this);
                            builder11.setCancelable(false);
                            builder11.setView(inflate11);
                            builder11.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            });
                            builder11.create().show();
                            return;
                        default:
                            return;
                    }
            }
        } else {
            View inflate12 = layoutInflater.inflate(R.layout.base_01_movie, (ViewGroup) null);
            ((Button) inflate12.findViewById(R.id.btn_base_01_movie_01)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    BaseActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/VcwSpQq9k18")));
                }
            });
            ((Button) inflate12.findViewById(R.id.btn_base_01_movie_02)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    BaseActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/7JsMMK1tgI4")));
                }
            });
            ((Button) inflate12.findViewById(R.id.btn_base_01_movie_03)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    BaseActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/A5W-sSlZiBk")));
                }
            });
            AlertDialog.Builder builder12 = new AlertDialog.Builder(this);
            builder12.setCancelable(false);
            builder12.setView(inflate12);
            builder12.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder12.create().show();
        }
    }
}