package com.nursing.management;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Pro03Checklist extends AppCompatActivity {

    int result01_03_01 = 0;
    int result01_03_02 = 0;
    int result01_03_03 = 0;
    int result01_03_04 = 0;
    int result01_03_05 = 0;
    int result02_03_01 = 0;
    int result02_03_02 = 0;
    int result02_03_03 = 0;
    int result02_03_04 = 0;
    int result02_03_05 = 0;
    int result03_03_01 = 0;
    int result03_03_02 = 0;
    int result03_03_03 = 0;
    int result03_04_03 = 0;
    int result03_05_03 = 0;
    int result04_03_01 = 0;
    int result04_03_02 = 0;
    int result04_03_03 = 0;
    int result04_03_04 = 0;
    int result04_03_05 = 0;
    int result05_03_01 = 0;
    int result05_03_02 = 0;
    int result05_03_03 = 0;
    int result05_03_04 = 0;
    int result05_03_05 = 0;
    int result06_03_01 = 0;
    int result06_03_02 = 0;
    int result06_03_03 = 0;
    int result06_03_04 = 0;
    int result06_03_05 = 0;
    int result07_03_01 = 0;
    int result07_03_02 = 0;
    int result07_03_03 = 0;
    int result07_03_04 = 0;
    int result07_03_05 = 0;
    int result08_03_01 = 0;
    int result08_03_02 = 0;
    int result08_03_03 = 0;
    int result08_03_04 = 0;
    int result08_03_05 = 0;
    int result09_03_01 = 0;
    int result09_03_02 = 0;
    int result09_03_03 = 0;
    int result09_03_04 = 0;
    int result09_03_05 = 0;
    int result10_03_01 = 0;
    int result10_03_02 = 0;
    int result10_03_03 = 0;
    int result10_03_04 = 0;
    int result10_03_05 = 0;
    int result11_03_01 = 0;
    int result11_03_02 = 0;
    int result11_03_03 = 0;
    int result11_03_04 = 0;
    int result11_03_05 = 0;
    int result12_03_01 = 0;
    int result12_03_02 = 0;
    int result12_03_03 = 0;
    int result12_03_04 = 0;
    int result12_03_05 = 0;
    int result13_03_01 = 0;
    int result13_03_02 = 0;
    int result13_03_03 = 0;
    int result13_03_04 = 0;
    int result13_03_05 = 0;
    int result14_03_01 = 0;
    int result14_03_02 = 0;
    int result14_03_03 = 0;
    int result14_03_04 = 0;
    int result14_03_05 = 0;
    int result15_03_01 = 0;
    int result15_03_02 = 0;
    int result15_03_03 = 0;
    int result15_03_04 = 0;
    int result15_03_05 = 0;
    int result16_03_02 = 0;
    int result16_03_03 = 0;
    int result16_03_04 = 0;
    int result16_03_05 = 0;
    int result17_03_02 = 0;
    int result17_03_03 = 0;
    int result17_03_04 = 0;
    int result17_03_05 = 0;
    int result18_03_02 = 0;
    int result18_03_03 = 0;
    int result18_03_04 = 0;
    int result18_03_05 = 0;
    int result19_03_02 = 0;
    int result19_03_03 = 0;
    int result19_03_04 = 0;
    int result19_03_05 = 0;
    int result20_03_02 = 0;
    int result20_03_03 = 0;
    int result20_03_04 = 0;
    int result20_03_05 = 0;
    int result21_03_02 = 0;
    int result21_03_03 = 0;
    int result21_03_04 = 0;
    int result21_03_05 = 0;
    int result22_03_03 = 0;
    int result22_03_04 = 0;
    int result22_03_05 = 0;
    int result23_03_03 = 0;
    int result23_03_04 = 0;
    int result23_03_05 = 0;
    int result24_03_03 = 0;
    int result24_03_04 = 0;
    int result24_03_05 = 0;
    int result25_03_03 = 0;
    int result25_03_04 = 0;
    int result25_03_05 = 0;
    int result26_03_03 = 0;
    int result26_03_04 = 0;
    int result26_03_05 = 0;
    int result27_03_03 = 0;
    int result27_03_04 = 0;
    int result27_03_05 = 0;
    int result28_03_04 = 0;
    int result28_03_05 = 0;
    int result29_03_04 = 0;
    int result29_03_05 = 0;
    int result30_03_04 = 0;
    int result31_03_04 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.pro03checklist);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rg_pro03_01_15);
        RadioButton radioButton = (RadioButton) findViewById(R.id.rb_pro03_01_01);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.rb_pro03_01_02);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.rb_pro03_01_03);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.rb_pro03_01_04);
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.rb_pro03_01_05);
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.rb_pro03_01_06);
        RadioButton radioButton7 = (RadioButton) findViewById(R.id.rb_pro03_01_07);
        RadioButton radioButton8 = (RadioButton) findViewById(R.id.rb_pro03_01_08);
        RadioButton radioButton9 = (RadioButton) findViewById(R.id.rb_pro03_01_09);
        RadioButton radioButton10 = (RadioButton) findViewById(R.id.rb_pro03_01_10);
        RadioButton radioButton11 = (RadioButton) findViewById(R.id.rb_pro03_01_11);
        RadioButton radioButton12 = (RadioButton) findViewById(R.id.rb_pro03_01_12);
        RadioButton radioButton13 = (RadioButton) findViewById(R.id.rb_pro03_01_13);
        RadioButton radioButton14 = (RadioButton) findViewById(R.id.rb_pro03_01_14);
        RadioButton radioButton15 = (RadioButton) findViewById(R.id.rb_pro03_01_15);
        RadioButton radioButton16 = (RadioButton) findViewById(R.id.rb_pro03_01_16);
        RadioButton radioButton17 = (RadioButton) findViewById(R.id.rb_pro03_01_17);
        RadioButton radioButton18 = (RadioButton) findViewById(R.id.rb_pro03_01_18);
        RadioButton radioButton19 = (RadioButton) findViewById(R.id.rb_pro03_01_19);
        RadioButton radioButton20 = (RadioButton) findViewById(R.id.rb_pro03_01_20);
        RadioButton radioButton21 = (RadioButton) findViewById(R.id.rb_pro03_01_21);
        RadioButton radioButton22 = (RadioButton) findViewById(R.id.rb_pro03_01_22);
        RadioButton radioButton23 = (RadioButton) findViewById(R.id.rb_pro03_01_23);
        RadioButton radioButton24 = (RadioButton) findViewById(R.id.rb_pro03_01_24);
        RadioButton radioButton25 = (RadioButton) findViewById(R.id.rb_pro03_01_25);
        RadioButton radioButton26 = (RadioButton) findViewById(R.id.rb_pro03_01_26);
        RadioButton radioButton27 = (RadioButton) findViewById(R.id.rb_pro03_01_27);
        RadioButton radioButton28 = (RadioButton) findViewById(R.id.rb_pro03_01_28);
        RadioButton radioButton29 = (RadioButton) findViewById(R.id.rb_pro03_01_29);
        RadioButton radioButton30 = (RadioButton) findViewById(R.id.rb_pro03_01_30);
        RadioButton radioButton31 = (RadioButton) findViewById(R.id.rb_pro03_01_31);
        RadioButton radioButton32 = (RadioButton) findViewById(R.id.rb_pro03_01_32);
        RadioButton radioButton33 = (RadioButton) findViewById(R.id.rb_pro03_01_33);
        RadioButton radioButton34 = (RadioButton) findViewById(R.id.rb_pro03_01_34);
        RadioButton radioButton35 = (RadioButton) findViewById(R.id.rb_pro03_01_35);
        RadioButton radioButton36 = (RadioButton) findViewById(R.id.rb_pro03_01_36);
        RadioButton radioButton37 = (RadioButton) findViewById(R.id.rb_pro03_01_37);
        RadioButton radioButton38 = (RadioButton) findViewById(R.id.rb_pro03_01_38);
        RadioButton radioButton39 = (RadioButton) findViewById(R.id.rb_pro03_01_39);
        RadioButton radioButton40 = (RadioButton) findViewById(R.id.rb_pro03_01_40);
        RadioButton radioButton41 = (RadioButton) findViewById(R.id.rb_pro03_01_41);
        RadioButton radioButton42 = (RadioButton) findViewById(R.id.rb_pro03_01_42);
        RadioButton radioButton43 = (RadioButton) findViewById(R.id.rb_pro03_01_43);
        RadioButton radioButton44 = (RadioButton) findViewById(R.id.rb_pro03_01_44);
        RadioButton radioButton45 = (RadioButton) findViewById(R.id.rb_pro03_01_45);
        final TextView textView1 = (TextView) findViewById(R.id.pro03_01_sum);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.rg_pro03_01_14);
        ((RadioGroup) findViewById(R.id.rg_pro03_01_01)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_01) {
                    Pro03Checklist.this.result01_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_02) {
                    Pro03Checklist.this.result01_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_03) {
                    Pro03Checklist.this.result01_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_01_02)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_04) {
                    Pro03Checklist.this.result02_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_05) {
                    Pro03Checklist.this.result02_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_06) {
                    Pro03Checklist.this.result02_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_01_03)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_07) {
                    Pro03Checklist.this.result03_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_08) {
                    Pro03Checklist.this.result03_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_09) {
                    Pro03Checklist.this.result03_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_01_04)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_10) {
                    Pro03Checklist.this.result04_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_11) {
                    Pro03Checklist.this.result04_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_12) {
                    Pro03Checklist.this.result04_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_01_05)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_13) {
                    Pro03Checklist.this.result05_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_14) {
                    Pro03Checklist.this.result05_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_15) {
                    Pro03Checklist.this.result05_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_01_06)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_16) {
                    Pro03Checklist.this.result06_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_17) {
                    Pro03Checklist.this.result06_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_18) {
                    Pro03Checklist.this.result06_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_01_07)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_19) {
                    Pro03Checklist.this.result07_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_20) {
                    Pro03Checklist.this.result07_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_21) {
                    Pro03Checklist.this.result07_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_01_08)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_22) {
                    Pro03Checklist.this.result08_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_23) {
                    Pro03Checklist.this.result08_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_24) {
                    Pro03Checklist.this.result08_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_01_09)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_25) {
                    Pro03Checklist.this.result09_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_26) {
                    Pro03Checklist.this.result09_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_27) {
                    Pro03Checklist.this.result09_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_01_10)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_28) {
                    Pro03Checklist.this.result10_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_29) {
                    Pro03Checklist.this.result10_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_30) {
                    Pro03Checklist.this.result10_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_01_11)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_31) {
                    Pro03Checklist.this.result11_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_32) {
                    Pro03Checklist.this.result11_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_33) {
                    Pro03Checklist.this.result11_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_01_12)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_34) {
                    Pro03Checklist.this.result12_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_35) {
                    Pro03Checklist.this.result12_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_36) {
                    Pro03Checklist.this.result12_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_01_13)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_37) {
                    Pro03Checklist.this.result13_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_38) {
                    Pro03Checklist.this.result13_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_39) {
                    Pro03Checklist.this.result13_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_40) {
                    Pro03Checklist.this.result14_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_41) {
                    Pro03Checklist.this.result14_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_42) {
                    Pro03Checklist.this.result14_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_01_43) {
                    Pro03Checklist.this.result15_03_01 = 2;
                } else if (i == R.id.rb_pro03_01_44) {
                    Pro03Checklist.this.result15_03_01 = 1;
                } else if (i == R.id.rb_pro03_01_45) {
                    Pro03Checklist.this.result15_03_01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_01 + Pro03Checklist.this.result02_03_01 + Pro03Checklist.this.result03_03_01 + Pro03Checklist.this.result04_03_01 + Pro03Checklist.this.result05_03_01 + Pro03Checklist.this.result06_03_01 + Pro03Checklist.this.result07_03_01 + Pro03Checklist.this.result08_03_01 + Pro03Checklist.this.result09_03_01 + Pro03Checklist.this.result10_03_01 + Pro03Checklist.this.result11_03_01 + Pro03Checklist.this.result12_03_01 + Pro03Checklist.this.result13_03_01 + Pro03Checklist.this.result14_03_01 + Pro03Checklist.this.result15_03_01));
            }
        });
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.rg_pro03_02_15);
        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.rg_pro03_02_16);
        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.rg_pro03_02_17);
        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.rg_pro03_02_18);
        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.rg_pro03_02_19);
        RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.rg_pro03_02_20);
        RadioGroup radioGroup9 = (RadioGroup) findViewById(R.id.rg_pro03_02_21);
        RadioButton radioButton46 = (RadioButton) findViewById(R.id.rb_pro03_02_01);
        RadioButton radioButton47 = (RadioButton) findViewById(R.id.rb_pro03_02_02);
        RadioButton radioButton48 = (RadioButton) findViewById(R.id.rb_pro03_02_03);
        RadioButton radioButton49 = (RadioButton) findViewById(R.id.rb_pro03_02_04);
        RadioButton radioButton50 = (RadioButton) findViewById(R.id.rb_pro03_02_05);
        RadioButton radioButton51 = (RadioButton) findViewById(R.id.rb_pro03_02_06);
        RadioButton radioButton52 = (RadioButton) findViewById(R.id.rb_pro03_02_07);
        RadioButton radioButton53 = (RadioButton) findViewById(R.id.rb_pro03_02_08);
        RadioButton radioButton54 = (RadioButton) findViewById(R.id.rb_pro03_02_09);
        RadioButton radioButton55 = (RadioButton) findViewById(R.id.rb_pro03_02_10);
        RadioButton radioButton56 = (RadioButton) findViewById(R.id.rb_pro03_02_11);
        RadioButton radioButton57 = (RadioButton) findViewById(R.id.rb_pro03_02_12);
        RadioButton radioButton58 = (RadioButton) findViewById(R.id.rb_pro03_02_13);
        RadioButton radioButton59 = (RadioButton) findViewById(R.id.rb_pro03_02_14);
        RadioButton radioButton60 = (RadioButton) findViewById(R.id.rb_pro03_02_15);
        RadioButton radioButton61 = (RadioButton) findViewById(R.id.rb_pro03_02_16);
        RadioButton radioButton62 = (RadioButton) findViewById(R.id.rb_pro03_02_17);
        RadioButton radioButton63 = (RadioButton) findViewById(R.id.rb_pro03_02_18);
        RadioButton radioButton64 = (RadioButton) findViewById(R.id.rb_pro03_02_19);
        RadioButton radioButton65 = (RadioButton) findViewById(R.id.rb_pro03_02_20);
        RadioButton radioButton66 = (RadioButton) findViewById(R.id.rb_pro03_02_21);
        RadioButton radioButton67 = (RadioButton) findViewById(R.id.rb_pro03_02_22);
        RadioButton radioButton68 = (RadioButton) findViewById(R.id.rb_pro03_02_23);
        RadioButton radioButton69 = (RadioButton) findViewById(R.id.rb_pro03_02_24);
        RadioButton radioButton70 = (RadioButton) findViewById(R.id.rb_pro03_02_25);
        RadioButton radioButton71 = (RadioButton) findViewById(R.id.rb_pro03_02_26);
        RadioButton radioButton72 = (RadioButton) findViewById(R.id.rb_pro03_02_27);
        RadioButton radioButton73 = (RadioButton) findViewById(R.id.rb_pro03_02_28);
        RadioButton radioButton74 = (RadioButton) findViewById(R.id.rb_pro03_02_29);
        RadioButton radioButton75 = (RadioButton) findViewById(R.id.rb_pro03_02_30);
        RadioButton radioButton76 = (RadioButton) findViewById(R.id.rb_pro03_02_31);
        RadioButton radioButton77 = (RadioButton) findViewById(R.id.rb_pro03_02_32);
        RadioButton radioButton78 = (RadioButton) findViewById(R.id.rb_pro03_02_33);
        RadioButton radioButton79 = (RadioButton) findViewById(R.id.rb_pro03_02_34);
        RadioButton radioButton80 = (RadioButton) findViewById(R.id.rb_pro03_02_35);
        RadioButton radioButton81 = (RadioButton) findViewById(R.id.rb_pro03_02_36);
        RadioButton radioButton82 = (RadioButton) findViewById(R.id.rb_pro03_02_37);
        RadioButton radioButton83 = (RadioButton) findViewById(R.id.rb_pro03_02_38);
        RadioButton radioButton84 = (RadioButton) findViewById(R.id.rb_pro03_02_39);
        RadioButton radioButton85 = (RadioButton) findViewById(R.id.rb_pro03_02_40);
        RadioButton radioButton86 = (RadioButton) findViewById(R.id.rb_pro03_02_41);
        RadioButton radioButton87 = (RadioButton) findViewById(R.id.rb_pro03_02_42);
        RadioButton radioButton88 = (RadioButton) findViewById(R.id.rb_pro03_02_43);
        RadioButton radioButton89 = (RadioButton) findViewById(R.id.rb_pro03_02_44);
        RadioButton radioButton90 = (RadioButton) findViewById(R.id.rb_pro03_02_45);
        RadioButton radioButton91 = (RadioButton) findViewById(R.id.rb_pro03_02_46);
        RadioButton radioButton92 = (RadioButton) findViewById(R.id.rb_pro03_02_47);
        RadioButton radioButton93 = (RadioButton) findViewById(R.id.rb_pro03_02_48);
        RadioButton radioButton94 = (RadioButton) findViewById(R.id.rb_pro03_02_49);
        RadioButton radioButton95 = (RadioButton) findViewById(R.id.rb_pro03_02_50);
        RadioButton radioButton96 = (RadioButton) findViewById(R.id.rb_pro03_02_51);
        RadioButton radioButton97 = (RadioButton) findViewById(R.id.rb_pro03_02_52);
        RadioButton radioButton98 = (RadioButton) findViewById(R.id.rb_pro03_02_53);
        RadioButton radioButton99 = (RadioButton) findViewById(R.id.rb_pro03_02_54);
        RadioButton radioButton100 = (RadioButton) findViewById(R.id.rb_pro03_02_55);
        RadioButton radioButton101 = (RadioButton) findViewById(R.id.rb_pro03_02_56);
        RadioButton radioButton102 = (RadioButton) findViewById(R.id.rb_pro03_02_57);
        RadioButton radioButton103 = (RadioButton) findViewById(R.id.rb_pro03_02_58);
        RadioButton radioButton104 = (RadioButton) findViewById(R.id.rb_pro03_02_59);
        RadioButton radioButton105 = (RadioButton) findViewById(R.id.rb_pro03_02_60);
        RadioButton radioButton106 = (RadioButton) findViewById(R.id.rb_pro03_02_61);
        RadioButton radioButton107 = (RadioButton) findViewById(R.id.rb_pro03_02_62);
        RadioButton radioButton108 = (RadioButton) findViewById(R.id.rb_pro03_02_63);
        final TextView textView2 = (TextView) findViewById(R.id.pro03_02_sum);
        RadioGroup radioGroup10 = (RadioGroup) findViewById(R.id.rg_pro03_02_14);
        ((RadioGroup) findViewById(R.id.rg_pro03_02_01)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_01) {
                    Pro03Checklist.this.result01_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_02) {
                    Pro03Checklist.this.result01_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_03) {
                    Pro03Checklist.this.result01_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_02_02)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_04) {
                    Pro03Checklist.this.result02_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_05) {
                    Pro03Checklist.this.result02_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_06) {
                    Pro03Checklist.this.result02_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_02_03)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_07) {
                    Pro03Checklist.this.result03_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_08) {
                    Pro03Checklist.this.result03_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_09) {
                    Pro03Checklist.this.result03_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_02_04)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_10) {
                    Pro03Checklist.this.result04_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_11) {
                    Pro03Checklist.this.result04_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_12) {
                    Pro03Checklist.this.result04_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_02_05)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_13) {
                    Pro03Checklist.this.result05_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_14) {
                    Pro03Checklist.this.result05_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_15) {
                    Pro03Checklist.this.result05_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_02_06)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_16) {
                    Pro03Checklist.this.result06_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_17) {
                    Pro03Checklist.this.result06_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_18) {
                    Pro03Checklist.this.result06_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_02_07)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_19) {
                    Pro03Checklist.this.result07_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_20) {
                    Pro03Checklist.this.result07_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_21) {
                    Pro03Checklist.this.result07_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_02_08)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_22) {
                    Pro03Checklist.this.result08_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_23) {
                    Pro03Checklist.this.result08_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_24) {
                    Pro03Checklist.this.result08_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_02_09)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_25) {
                    Pro03Checklist.this.result09_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_26) {
                    Pro03Checklist.this.result09_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_27) {
                    Pro03Checklist.this.result09_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_02_10)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_28) {
                    Pro03Checklist.this.result10_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_29) {
                    Pro03Checklist.this.result10_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_30) {
                    Pro03Checklist.this.result10_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_02_11)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_31) {
                    Pro03Checklist.this.result11_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_32) {
                    Pro03Checklist.this.result11_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_33) {
                    Pro03Checklist.this.result11_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_02_12)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_34) {
                    Pro03Checklist.this.result12_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_35) {
                    Pro03Checklist.this.result12_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_36) {
                    Pro03Checklist.this.result12_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_02_13)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_37) {
                    Pro03Checklist.this.result13_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_38) {
                    Pro03Checklist.this.result13_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_39) {
                    Pro03Checklist.this.result13_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        radioGroup10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_40) {
                    Pro03Checklist.this.result14_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_41) {
                    Pro03Checklist.this.result14_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_42) {
                    Pro03Checklist.this.result14_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_43) {
                    Pro03Checklist.this.result15_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_44) {
                    Pro03Checklist.this.result15_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_45) {
                    Pro03Checklist.this.result15_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_46) {
                    Pro03Checklist.this.result16_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_47) {
                    Pro03Checklist.this.result16_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_48) {
                    Pro03Checklist.this.result16_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_49) {
                    Pro03Checklist.this.result17_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_50) {
                    Pro03Checklist.this.result17_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_51) {
                    Pro03Checklist.this.result17_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_52) {
                    Pro03Checklist.this.result18_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_53) {
                    Pro03Checklist.this.result18_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_54) {
                    Pro03Checklist.this.result18_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_55) {
                    Pro03Checklist.this.result19_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_56) {
                    Pro03Checklist.this.result19_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_57) {
                    Pro03Checklist.this.result19_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_58) {
                    Pro03Checklist.this.result20_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_59) {
                    Pro03Checklist.this.result20_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_60) {
                    Pro03Checklist.this.result20_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        radioGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_02_61) {
                    Pro03Checklist.this.result21_03_02 = 2;
                } else if (i == R.id.rb_pro03_02_62) {
                    Pro03Checklist.this.result21_03_02 = 1;
                } else if (i == R.id.rb_pro03_02_63) {
                    Pro03Checklist.this.result21_03_02 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_02 + Pro03Checklist.this.result02_03_02 + Pro03Checklist.this.result03_03_02 + Pro03Checklist.this.result04_03_02 + Pro03Checklist.this.result05_03_02 + Pro03Checklist.this.result06_03_02 + Pro03Checklist.this.result07_03_02 + Pro03Checklist.this.result08_03_02 + Pro03Checklist.this.result09_03_02 + Pro03Checklist.this.result10_03_02 + Pro03Checklist.this.result11_03_02 + Pro03Checklist.this.result12_03_02 + Pro03Checklist.this.result13_03_02 + Pro03Checklist.this.result14_03_02 + Pro03Checklist.this.result15_03_02 + Pro03Checklist.this.result16_03_02 + Pro03Checklist.this.result17_03_02 + Pro03Checklist.this.result18_03_02 + Pro03Checklist.this.result19_03_02 + Pro03Checklist.this.result20_03_02 + Pro03Checklist.this.result21_03_02));
            }
        });
        RadioGroup radioGroup11 = (RadioGroup) findViewById(R.id.rg_pro03_03_15);
        RadioGroup radioGroup12 = (RadioGroup) findViewById(R.id.rg_pro03_03_16);
        RadioGroup radioGroup13 = (RadioGroup) findViewById(R.id.rg_pro03_03_17);
        RadioGroup radioGroup14 = (RadioGroup) findViewById(R.id.rg_pro03_03_18);
        RadioGroup radioGroup15 = (RadioGroup) findViewById(R.id.rg_pro03_03_19);
        RadioGroup radioGroup16 = (RadioGroup) findViewById(R.id.rg_pro03_03_20);
        RadioGroup radioGroup17 = (RadioGroup) findViewById(R.id.rg_pro03_03_21);
        RadioGroup radioGroup18 = (RadioGroup) findViewById(R.id.rg_pro03_03_22);
        RadioGroup radioGroup19 = (RadioGroup) findViewById(R.id.rg_pro03_03_23);
        RadioGroup radioGroup20 = (RadioGroup) findViewById(R.id.rg_pro03_03_24);
        RadioGroup radioGroup21 = (RadioGroup) findViewById(R.id.rg_pro03_03_25);
        RadioGroup radioGroup22 = (RadioGroup) findViewById(R.id.rg_pro03_03_26);
        RadioGroup radioGroup23 = (RadioGroup) findViewById(R.id.rg_pro03_03_27);
        RadioButton radioButton109 = (RadioButton) findViewById(R.id.rb_pro03_03_01);
        RadioButton radioButton110 = (RadioButton) findViewById(R.id.rb_pro03_03_02);
        RadioButton radioButton111 = (RadioButton) findViewById(R.id.rb_pro03_03_03);
        RadioButton radioButton112 = (RadioButton) findViewById(R.id.rb_pro03_03_04);
        RadioButton radioButton113 = (RadioButton) findViewById(R.id.rb_pro03_03_05);
        RadioButton radioButton114 = (RadioButton) findViewById(R.id.rb_pro03_03_06);
        RadioButton radioButton115 = (RadioButton) findViewById(R.id.rb_pro03_03_07);
        RadioButton radioButton116 = (RadioButton) findViewById(R.id.rb_pro03_03_08);
        RadioButton radioButton117 = (RadioButton) findViewById(R.id.rb_pro03_03_09);
        RadioButton radioButton118 = (RadioButton) findViewById(R.id.rb_pro03_03_10);
        RadioButton radioButton119 = (RadioButton) findViewById(R.id.rb_pro03_03_11);
        RadioButton radioButton120 = (RadioButton) findViewById(R.id.rb_pro03_03_12);
        RadioButton radioButton121 = (RadioButton) findViewById(R.id.rb_pro03_03_13);
        RadioButton radioButton122 = (RadioButton) findViewById(R.id.rb_pro03_03_14);
        RadioButton radioButton123 = (RadioButton) findViewById(R.id.rb_pro03_03_15);
        RadioButton radioButton124 = (RadioButton) findViewById(R.id.rb_pro03_03_16);
        RadioButton radioButton125 = (RadioButton) findViewById(R.id.rb_pro03_03_17);
        RadioButton radioButton126 = (RadioButton) findViewById(R.id.rb_pro03_03_18);
        RadioButton radioButton127 = (RadioButton) findViewById(R.id.rb_pro03_03_19);
        RadioButton radioButton128 = (RadioButton) findViewById(R.id.rb_pro03_03_20);
        RadioButton radioButton129 = (RadioButton) findViewById(R.id.rb_pro03_03_21);
        RadioButton radioButton130 = (RadioButton) findViewById(R.id.rb_pro03_03_22);
        RadioButton radioButton131 = (RadioButton) findViewById(R.id.rb_pro03_03_23);
        RadioButton radioButton132 = (RadioButton) findViewById(R.id.rb_pro03_03_24);
        RadioButton radioButton133 = (RadioButton) findViewById(R.id.rb_pro03_03_25);
        RadioButton radioButton134 = (RadioButton) findViewById(R.id.rb_pro03_03_26);
        RadioButton radioButton135 = (RadioButton) findViewById(R.id.rb_pro03_03_27);
        RadioButton radioButton136 = (RadioButton) findViewById(R.id.rb_pro03_03_28);
        RadioButton radioButton137 = (RadioButton) findViewById(R.id.rb_pro03_03_29);
        RadioButton radioButton138 = (RadioButton) findViewById(R.id.rb_pro03_03_30);
        RadioButton radioButton139 = (RadioButton) findViewById(R.id.rb_pro03_03_31);
        RadioButton radioButton140 = (RadioButton) findViewById(R.id.rb_pro03_03_32);
        RadioButton radioButton141 = (RadioButton) findViewById(R.id.rb_pro03_03_33);
        RadioButton radioButton142 = (RadioButton) findViewById(R.id.rb_pro03_03_34);
        RadioButton radioButton143 = (RadioButton) findViewById(R.id.rb_pro03_03_35);
        RadioButton radioButton144 = (RadioButton) findViewById(R.id.rb_pro03_03_36);
        RadioButton radioButton145 = (RadioButton) findViewById(R.id.rb_pro03_03_37);
        RadioButton radioButton146 = (RadioButton) findViewById(R.id.rb_pro03_03_38);
        RadioButton radioButton147 = (RadioButton) findViewById(R.id.rb_pro03_03_39);
        RadioButton radioButton148 = (RadioButton) findViewById(R.id.rb_pro03_03_40);
        RadioButton radioButton149 = (RadioButton) findViewById(R.id.rb_pro03_03_41);
        RadioButton radioButton150 = (RadioButton) findViewById(R.id.rb_pro03_03_42);
        RadioButton radioButton151 = (RadioButton) findViewById(R.id.rb_pro03_03_43);
        RadioButton radioButton152 = (RadioButton) findViewById(R.id.rb_pro03_03_44);
        RadioButton radioButton153 = (RadioButton) findViewById(R.id.rb_pro03_03_45);
        RadioButton radioButton154 = (RadioButton) findViewById(R.id.rb_pro03_03_46);
        RadioButton radioButton155 = (RadioButton) findViewById(R.id.rb_pro03_03_47);
        RadioButton radioButton156 = (RadioButton) findViewById(R.id.rb_pro03_03_48);
        RadioButton radioButton157 = (RadioButton) findViewById(R.id.rb_pro03_03_49);
        RadioButton radioButton158 = (RadioButton) findViewById(R.id.rb_pro03_03_50);
        RadioButton radioButton159 = (RadioButton) findViewById(R.id.rb_pro03_03_51);
        RadioButton radioButton160 = (RadioButton) findViewById(R.id.rb_pro03_03_52);
        RadioButton radioButton161 = (RadioButton) findViewById(R.id.rb_pro03_03_53);
        RadioButton radioButton162 = (RadioButton) findViewById(R.id.rb_pro03_03_54);
        RadioButton radioButton163 = (RadioButton) findViewById(R.id.rb_pro03_03_55);
        RadioButton radioButton164 = (RadioButton) findViewById(R.id.rb_pro03_03_56);
        RadioButton radioButton165 = (RadioButton) findViewById(R.id.rb_pro03_03_57);
        RadioButton radioButton166 = (RadioButton) findViewById(R.id.rb_pro03_03_58);
        RadioButton radioButton167 = (RadioButton) findViewById(R.id.rb_pro03_03_59);
        RadioButton radioButton168 = (RadioButton) findViewById(R.id.rb_pro03_03_60);
        RadioButton radioButton169 = (RadioButton) findViewById(R.id.rb_pro03_03_61);
        RadioButton radioButton170 = (RadioButton) findViewById(R.id.rb_pro03_03_62);
        RadioButton radioButton171 = (RadioButton) findViewById(R.id.rb_pro03_03_63);
        RadioButton radioButton172 = (RadioButton) findViewById(R.id.rb_pro03_03_64);
        RadioButton radioButton173 = (RadioButton) findViewById(R.id.rb_pro03_03_65);
        RadioButton radioButton174 = (RadioButton) findViewById(R.id.rb_pro03_03_66);
        RadioButton radioButton175 = (RadioButton) findViewById(R.id.rb_pro03_03_67);
        RadioButton radioButton176 = (RadioButton) findViewById(R.id.rb_pro03_03_68);
        RadioButton radioButton177 = (RadioButton) findViewById(R.id.rb_pro03_03_69);
        RadioButton radioButton178 = (RadioButton) findViewById(R.id.rb_pro03_03_70);
        RadioButton radioButton179 = (RadioButton) findViewById(R.id.rb_pro03_03_71);
        RadioButton radioButton180 = (RadioButton) findViewById(R.id.rb_pro03_03_72);
        RadioButton radioButton181 = (RadioButton) findViewById(R.id.rb_pro03_03_73);
        RadioButton radioButton182 = (RadioButton) findViewById(R.id.rb_pro03_03_74);
        RadioButton radioButton183 = (RadioButton) findViewById(R.id.rb_pro03_03_75);
        RadioButton radioButton184 = (RadioButton) findViewById(R.id.rb_pro03_03_76);
        RadioButton radioButton185 = (RadioButton) findViewById(R.id.rb_pro03_03_77);
        RadioButton radioButton186 = (RadioButton) findViewById(R.id.rb_pro03_03_78);
        RadioButton radioButton187 = (RadioButton) findViewById(R.id.rb_pro03_03_79);
        RadioButton radioButton188 = (RadioButton) findViewById(R.id.rb_pro03_03_80);
        RadioButton radioButton189 = (RadioButton) findViewById(R.id.rb_pro03_03_81);
        final TextView textView3 = (TextView) findViewById(R.id.pro03_03_sum);
        RadioGroup radioGroup24 = (RadioGroup) findViewById(R.id.rg_pro03_03_14);
        ((RadioGroup) findViewById(R.id.rg_pro03_03_01)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_01) {
                    Pro03Checklist.this.result01_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_02) {
                    Pro03Checklist.this.result01_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_03) {
                    Pro03Checklist.this.result01_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_03_02)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_04) {
                    Pro03Checklist.this.result02_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_05) {
                    Pro03Checklist.this.result02_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_06) {
                    Pro03Checklist.this.result02_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_03_03)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_07) {
                    Pro03Checklist.this.result03_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_08) {
                    Pro03Checklist.this.result03_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_09) {
                    Pro03Checklist.this.result03_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_03_04)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_10) {
                    Pro03Checklist.this.result04_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_11) {
                    Pro03Checklist.this.result04_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_12) {
                    Pro03Checklist.this.result04_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_03_05)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_13) {
                    Pro03Checklist.this.result05_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_14) {
                    Pro03Checklist.this.result05_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_15) {
                    Pro03Checklist.this.result05_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_03_06)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_16) {
                    Pro03Checklist.this.result06_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_17) {
                    Pro03Checklist.this.result06_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_18) {
                    Pro03Checklist.this.result06_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_03_07)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_19) {
                    Pro03Checklist.this.result07_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_20) {
                    Pro03Checklist.this.result07_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_21) {
                    Pro03Checklist.this.result07_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_03_08)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_22) {
                    Pro03Checklist.this.result08_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_23) {
                    Pro03Checklist.this.result08_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_24) {
                    Pro03Checklist.this.result08_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_03_09)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_25) {
                    Pro03Checklist.this.result09_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_26) {
                    Pro03Checklist.this.result09_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_27) {
                    Pro03Checklist.this.result09_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_03_10)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_28) {
                    Pro03Checklist.this.result10_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_29) {
                    Pro03Checklist.this.result10_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_30) {
                    Pro03Checklist.this.result10_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_03_11)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_31) {
                    Pro03Checklist.this.result11_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_32) {
                    Pro03Checklist.this.result11_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_33) {
                    Pro03Checklist.this.result11_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_03_12)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_34) {
                    Pro03Checklist.this.result12_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_35) {
                    Pro03Checklist.this.result12_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_36) {
                    Pro03Checklist.this.result12_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_03_13)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_37) {
                    Pro03Checklist.this.result13_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_38) {
                    Pro03Checklist.this.result13_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_39) {
                    Pro03Checklist.this.result13_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_40) {
                    Pro03Checklist.this.result14_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_41) {
                    Pro03Checklist.this.result14_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_42) {
                    Pro03Checklist.this.result14_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_43) {
                    Pro03Checklist.this.result15_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_44) {
                    Pro03Checklist.this.result15_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_45) {
                    Pro03Checklist.this.result15_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_46) {
                    Pro03Checklist.this.result16_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_47) {
                    Pro03Checklist.this.result16_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_48) {
                    Pro03Checklist.this.result16_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_49) {
                    Pro03Checklist.this.result17_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_50) {
                    Pro03Checklist.this.result17_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_51) {
                    Pro03Checklist.this.result17_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_52) {
                    Pro03Checklist.this.result18_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_53) {
                    Pro03Checklist.this.result18_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_54) {
                    Pro03Checklist.this.result18_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_55) {
                    Pro03Checklist.this.result19_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_56) {
                    Pro03Checklist.this.result19_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_57) {
                    Pro03Checklist.this.result19_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_58) {
                    Pro03Checklist.this.result20_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_59) {
                    Pro03Checklist.this.result20_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_60) {
                    Pro03Checklist.this.result20_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_61) {
                    Pro03Checklist.this.result21_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_62) {
                    Pro03Checklist.this.result21_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_63) {
                    Pro03Checklist.this.result21_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_64) {
                    Pro03Checklist.this.result22_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_65) {
                    Pro03Checklist.this.result22_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_66) {
                    Pro03Checklist.this.result22_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_67) {
                    Pro03Checklist.this.result23_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_68) {
                    Pro03Checklist.this.result23_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_69) {
                    Pro03Checklist.this.result23_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_70) {
                    Pro03Checklist.this.result24_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_71) {
                    Pro03Checklist.this.result24_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_72) {
                    Pro03Checklist.this.result24_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_73) {
                    Pro03Checklist.this.result25_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_74) {
                    Pro03Checklist.this.result25_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_75) {
                    Pro03Checklist.this.result25_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_76) {
                    Pro03Checklist.this.result26_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_77) {
                    Pro03Checklist.this.result26_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_78) {
                    Pro03Checklist.this.result26_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        radioGroup23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_03_79) {
                    Pro03Checklist.this.result27_03_03 = 2;
                } else if (i == R.id.rb_pro03_03_80) {
                    Pro03Checklist.this.result27_03_03 = 1;
                } else if (i == R.id.rb_pro03_03_81) {
                    Pro03Checklist.this.result27_03_03 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_03 + Pro03Checklist.this.result02_03_03 + Pro03Checklist.this.result03_03_03 + Pro03Checklist.this.result04_03_03 + Pro03Checklist.this.result05_03_03 + Pro03Checklist.this.result06_03_03 + Pro03Checklist.this.result07_03_03 + Pro03Checklist.this.result08_03_03 + Pro03Checklist.this.result09_03_03 + Pro03Checklist.this.result10_03_03 + Pro03Checklist.this.result11_03_03 + Pro03Checklist.this.result12_03_03 + Pro03Checklist.this.result13_03_03 + Pro03Checklist.this.result14_03_03 + Pro03Checklist.this.result15_03_03 + Pro03Checklist.this.result16_03_03 + Pro03Checklist.this.result17_03_03 + Pro03Checklist.this.result18_03_03 + Pro03Checklist.this.result19_03_03 + Pro03Checklist.this.result20_03_03 + Pro03Checklist.this.result21_03_03 + Pro03Checklist.this.result22_03_03 + Pro03Checklist.this.result23_03_03 + Pro03Checklist.this.result24_03_03 + Pro03Checklist.this.result25_03_03 + Pro03Checklist.this.result26_03_03 + Pro03Checklist.this.result27_03_03));
            }
        });
        RadioGroup radioGroup25 = (RadioGroup) findViewById(R.id.rg_pro03_04_15);
        RadioGroup radioGroup26 = (RadioGroup) findViewById(R.id.rg_pro03_04_16);
        RadioGroup radioGroup27 = (RadioGroup) findViewById(R.id.rg_pro03_04_17);
        RadioGroup radioGroup28 = (RadioGroup) findViewById(R.id.rg_pro03_04_18);
        RadioGroup radioGroup29 = (RadioGroup) findViewById(R.id.rg_pro03_04_19);
        RadioGroup radioGroup30 = (RadioGroup) findViewById(R.id.rg_pro03_04_20);
        RadioGroup radioGroup31 = (RadioGroup) findViewById(R.id.rg_pro03_04_21);
        RadioGroup radioGroup32 = (RadioGroup) findViewById(R.id.rg_pro03_04_22);
        RadioGroup radioGroup33 = (RadioGroup) findViewById(R.id.rg_pro03_04_23);
        RadioGroup radioGroup34 = (RadioGroup) findViewById(R.id.rg_pro03_04_24);
        RadioGroup radioGroup35 = (RadioGroup) findViewById(R.id.rg_pro03_04_25);
        RadioGroup radioGroup36 = (RadioGroup) findViewById(R.id.rg_pro03_04_26);
        RadioGroup radioGroup37 = (RadioGroup) findViewById(R.id.rg_pro03_04_27);
        RadioGroup radioGroup38 = (RadioGroup) findViewById(R.id.rg_pro03_04_28);
        RadioGroup radioGroup39 = (RadioGroup) findViewById(R.id.rg_pro03_04_29);
        RadioGroup radioGroup40 = (RadioGroup) findViewById(R.id.rg_pro03_04_30);
        RadioGroup radioGroup41 = (RadioGroup) findViewById(R.id.rg_pro03_04_31);
        RadioButton radioButton190 = (RadioButton) findViewById(R.id.rb_pro03_04_01);
        RadioButton radioButton191 = (RadioButton) findViewById(R.id.rb_pro03_04_02);
        RadioButton radioButton192 = (RadioButton) findViewById(R.id.rb_pro03_04_03);
        RadioButton radioButton193 = (RadioButton) findViewById(R.id.rb_pro03_04_04);
        RadioButton radioButton194 = (RadioButton) findViewById(R.id.rb_pro03_04_05);
        RadioButton radioButton195 = (RadioButton) findViewById(R.id.rb_pro03_04_06);
        RadioButton radioButton196 = (RadioButton) findViewById(R.id.rb_pro03_04_07);
        RadioButton radioButton197 = (RadioButton) findViewById(R.id.rb_pro03_04_08);
        RadioButton radioButton198 = (RadioButton) findViewById(R.id.rb_pro03_04_09);
        RadioButton radioButton199 = (RadioButton) findViewById(R.id.rb_pro03_04_10);
        RadioButton radioButton200 = (RadioButton) findViewById(R.id.rb_pro03_04_11);
        RadioButton radioButton201 = (RadioButton) findViewById(R.id.rb_pro03_04_12);
        RadioButton radioButton202 = (RadioButton) findViewById(R.id.rb_pro03_04_13);
        RadioButton radioButton203 = (RadioButton) findViewById(R.id.rb_pro03_04_14);
        RadioButton radioButton204 = (RadioButton) findViewById(R.id.rb_pro03_04_15);
        RadioButton radioButton205 = (RadioButton) findViewById(R.id.rb_pro03_04_16);
        RadioButton radioButton206 = (RadioButton) findViewById(R.id.rb_pro03_04_17);
        RadioButton radioButton207 = (RadioButton) findViewById(R.id.rb_pro03_04_18);
        RadioButton radioButton208 = (RadioButton) findViewById(R.id.rb_pro03_04_19);
        RadioButton radioButton209 = (RadioButton) findViewById(R.id.rb_pro03_04_20);
        RadioButton radioButton210 = (RadioButton) findViewById(R.id.rb_pro03_04_21);
        RadioButton radioButton211 = (RadioButton) findViewById(R.id.rb_pro03_04_22);
        RadioButton radioButton212 = (RadioButton) findViewById(R.id.rb_pro03_04_23);
        RadioButton radioButton213 = (RadioButton) findViewById(R.id.rb_pro03_04_24);
        RadioButton radioButton214 = (RadioButton) findViewById(R.id.rb_pro03_04_25);
        RadioButton radioButton215 = (RadioButton) findViewById(R.id.rb_pro03_04_26);
        RadioButton radioButton216 = (RadioButton) findViewById(R.id.rb_pro03_04_27);
        RadioButton radioButton217 = (RadioButton) findViewById(R.id.rb_pro03_04_28);
        RadioButton radioButton218 = (RadioButton) findViewById(R.id.rb_pro03_04_29);
        RadioButton radioButton219 = (RadioButton) findViewById(R.id.rb_pro03_04_30);
        RadioButton radioButton220 = (RadioButton) findViewById(R.id.rb_pro03_04_31);
        RadioButton radioButton221 = (RadioButton) findViewById(R.id.rb_pro03_04_32);
        RadioButton radioButton222 = (RadioButton) findViewById(R.id.rb_pro03_04_33);
        RadioButton radioButton223 = (RadioButton) findViewById(R.id.rb_pro03_04_34);
        RadioButton radioButton224 = (RadioButton) findViewById(R.id.rb_pro03_04_35);
        RadioButton radioButton225 = (RadioButton) findViewById(R.id.rb_pro03_04_36);
        RadioButton radioButton226 = (RadioButton) findViewById(R.id.rb_pro03_04_37);
        RadioButton radioButton227 = (RadioButton) findViewById(R.id.rb_pro03_04_38);
        RadioButton radioButton228 = (RadioButton) findViewById(R.id.rb_pro03_04_39);
        RadioButton radioButton229 = (RadioButton) findViewById(R.id.rb_pro03_04_40);
        RadioButton radioButton230 = (RadioButton) findViewById(R.id.rb_pro03_04_41);
        RadioButton radioButton231 = (RadioButton) findViewById(R.id.rb_pro03_04_42);
        RadioButton radioButton232 = (RadioButton) findViewById(R.id.rb_pro03_04_43);
        RadioButton radioButton233 = (RadioButton) findViewById(R.id.rb_pro03_04_44);
        RadioButton radioButton234 = (RadioButton) findViewById(R.id.rb_pro03_04_45);
        RadioButton radioButton235 = (RadioButton) findViewById(R.id.rb_pro03_04_46);
        RadioButton radioButton236 = (RadioButton) findViewById(R.id.rb_pro03_04_47);
        RadioButton radioButton237 = (RadioButton) findViewById(R.id.rb_pro03_04_48);
        RadioButton radioButton238 = (RadioButton) findViewById(R.id.rb_pro03_04_49);
        RadioButton radioButton239 = (RadioButton) findViewById(R.id.rb_pro03_04_50);
        RadioButton radioButton240 = (RadioButton) findViewById(R.id.rb_pro03_04_51);
        RadioButton radioButton241 = (RadioButton) findViewById(R.id.rb_pro03_04_52);
        RadioButton radioButton242 = (RadioButton) findViewById(R.id.rb_pro03_04_53);
        RadioButton radioButton243 = (RadioButton) findViewById(R.id.rb_pro03_04_54);
        RadioButton radioButton244 = (RadioButton) findViewById(R.id.rb_pro03_04_55);
        RadioButton radioButton245 = (RadioButton) findViewById(R.id.rb_pro03_04_56);
        RadioButton radioButton246 = (RadioButton) findViewById(R.id.rb_pro03_04_57);
        RadioButton radioButton247 = (RadioButton) findViewById(R.id.rb_pro03_04_58);
        RadioButton radioButton248 = (RadioButton) findViewById(R.id.rb_pro03_04_59);
        RadioButton radioButton249 = (RadioButton) findViewById(R.id.rb_pro03_04_60);
        RadioButton radioButton250 = (RadioButton) findViewById(R.id.rb_pro03_04_61);
        RadioButton radioButton251 = (RadioButton) findViewById(R.id.rb_pro03_04_62);
        RadioButton radioButton252 = (RadioButton) findViewById(R.id.rb_pro03_04_63);
        RadioButton radioButton253 = (RadioButton) findViewById(R.id.rb_pro03_04_64);
        RadioButton radioButton254 = (RadioButton) findViewById(R.id.rb_pro03_04_65);
        RadioButton radioButton255 = (RadioButton) findViewById(R.id.rb_pro03_04_66);
        RadioButton radioButton256 = (RadioButton) findViewById(R.id.rb_pro03_04_67);
        RadioButton radioButton257 = (RadioButton) findViewById(R.id.rb_pro03_04_68);
        RadioButton radioButton258 = (RadioButton) findViewById(R.id.rb_pro03_04_69);
        RadioButton radioButton259 = (RadioButton) findViewById(R.id.rb_pro03_04_70);
        RadioButton radioButton260 = (RadioButton) findViewById(R.id.rb_pro03_04_71);
        RadioButton radioButton261 = (RadioButton) findViewById(R.id.rb_pro03_04_72);
        RadioButton radioButton262 = (RadioButton) findViewById(R.id.rb_pro03_04_73);
        RadioButton radioButton263 = (RadioButton) findViewById(R.id.rb_pro03_04_74);
        RadioButton radioButton264 = (RadioButton) findViewById(R.id.rb_pro03_04_75);
        RadioButton radioButton265 = (RadioButton) findViewById(R.id.rb_pro03_04_76);
        RadioButton radioButton266 = (RadioButton) findViewById(R.id.rb_pro03_04_77);
        RadioButton radioButton267 = (RadioButton) findViewById(R.id.rb_pro03_04_78);
        RadioButton radioButton268 = (RadioButton) findViewById(R.id.rb_pro03_04_79);
        RadioButton radioButton269 = (RadioButton) findViewById(R.id.rb_pro03_04_80);
        RadioButton radioButton270 = (RadioButton) findViewById(R.id.rb_pro03_04_81);
        RadioButton radioButton271 = (RadioButton) findViewById(R.id.rb_pro03_04_82);
        RadioButton radioButton272 = (RadioButton) findViewById(R.id.rb_pro03_04_83);
        RadioButton radioButton273 = (RadioButton) findViewById(R.id.rb_pro03_04_84);
        RadioButton radioButton274 = (RadioButton) findViewById(R.id.rb_pro03_04_85);
        RadioButton radioButton275 = (RadioButton) findViewById(R.id.rb_pro03_04_86);
        RadioButton radioButton276 = (RadioButton) findViewById(R.id.rb_pro03_04_87);
        RadioButton radioButton277 = (RadioButton) findViewById(R.id.rb_pro03_04_88);
        RadioButton radioButton278 = (RadioButton) findViewById(R.id.rb_pro03_04_89);
        RadioButton radioButton279 = (RadioButton) findViewById(R.id.rb_pro03_04_90);
        RadioButton radioButton280 = (RadioButton) findViewById(R.id.rb_pro03_04_91);
        RadioButton radioButton281 = (RadioButton) findViewById(R.id.rb_pro03_04_92);
        RadioButton radioButton282 = (RadioButton) findViewById(R.id.rb_pro03_04_93);
        final TextView textView4 = (TextView) findViewById(R.id.pro03_04_sum);
        RadioGroup radioGroup42 = (RadioGroup) findViewById(R.id.rg_pro03_04_14);
        ((RadioGroup) findViewById(R.id.rg_pro03_04_01)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_01) {
                    Pro03Checklist.this.result01_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_02) {
                    Pro03Checklist.this.result01_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_03) {
                    Pro03Checklist.this.result01_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_04_02)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_04) {
                    Pro03Checklist.this.result02_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_05) {
                    Pro03Checklist.this.result02_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_06) {
                    Pro03Checklist.this.result02_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_04_03)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_07) {
                    Pro03Checklist.this.result03_04_03 = 2;
                } else if (i == R.id.rb_pro03_04_08) {
                    Pro03Checklist.this.result03_04_03 = 1;
                } else if (i == R.id.rb_pro03_04_09) {
                    Pro03Checklist.this.result03_04_03 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_04_04)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_10) {
                    Pro03Checklist.this.result04_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_11) {
                    Pro03Checklist.this.result04_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_12) {
                    Pro03Checklist.this.result04_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_04_05)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_13) {
                    Pro03Checklist.this.result05_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_14) {
                    Pro03Checklist.this.result05_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_15) {
                    Pro03Checklist.this.result05_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_04_06)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_16) {
                    Pro03Checklist.this.result06_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_17) {
                    Pro03Checklist.this.result06_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_18) {
                    Pro03Checklist.this.result06_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_04_07)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_19) {
                    Pro03Checklist.this.result07_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_20) {
                    Pro03Checklist.this.result07_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_21) {
                    Pro03Checklist.this.result07_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_04_08)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_22) {
                    Pro03Checklist.this.result08_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_23) {
                    Pro03Checklist.this.result08_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_24) {
                    Pro03Checklist.this.result08_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_04_09)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_25) {
                    Pro03Checklist.this.result09_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_26) {
                    Pro03Checklist.this.result09_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_27) {
                    Pro03Checklist.this.result09_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_04_10)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_28) {
                    Pro03Checklist.this.result10_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_29) {
                    Pro03Checklist.this.result10_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_30) {
                    Pro03Checklist.this.result10_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_04_11)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_31) {
                    Pro03Checklist.this.result11_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_32) {
                    Pro03Checklist.this.result11_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_33) {
                    Pro03Checklist.this.result11_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_04_12)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_34) {
                    Pro03Checklist.this.result12_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_35) {
                    Pro03Checklist.this.result12_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_36) {
                    Pro03Checklist.this.result12_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_04_13)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_37) {
                    Pro03Checklist.this.result13_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_38) {
                    Pro03Checklist.this.result13_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_39) {
                    Pro03Checklist.this.result13_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_40) {
                    Pro03Checklist.this.result14_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_41) {
                    Pro03Checklist.this.result14_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_42) {
                    Pro03Checklist.this.result14_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_43) {
                    Pro03Checklist.this.result15_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_44) {
                    Pro03Checklist.this.result15_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_45) {
                    Pro03Checklist.this.result15_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_46) {
                    Pro03Checklist.this.result16_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_47) {
                    Pro03Checklist.this.result16_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_48) {
                    Pro03Checklist.this.result16_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_49) {
                    Pro03Checklist.this.result17_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_50) {
                    Pro03Checklist.this.result17_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_51) {
                    Pro03Checklist.this.result17_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_52) {
                    Pro03Checklist.this.result18_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_53) {
                    Pro03Checklist.this.result18_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_54) {
                    Pro03Checklist.this.result18_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_55) {
                    Pro03Checklist.this.result19_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_56) {
                    Pro03Checklist.this.result19_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_57) {
                    Pro03Checklist.this.result19_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_58) {
                    Pro03Checklist.this.result20_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_59) {
                    Pro03Checklist.this.result20_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_60) {
                    Pro03Checklist.this.result20_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_61) {
                    Pro03Checklist.this.result21_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_62) {
                    Pro03Checklist.this.result21_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_63) {
                    Pro03Checklist.this.result21_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_64) {
                    Pro03Checklist.this.result22_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_65) {
                    Pro03Checklist.this.result22_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_66) {
                    Pro03Checklist.this.result22_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_67) {
                    Pro03Checklist.this.result23_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_68) {
                    Pro03Checklist.this.result23_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_69) {
                    Pro03Checklist.this.result23_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_70) {
                    Pro03Checklist.this.result24_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_71) {
                    Pro03Checklist.this.result24_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_72) {
                    Pro03Checklist.this.result24_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_73) {
                    Pro03Checklist.this.result25_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_74) {
                    Pro03Checklist.this.result25_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_75) {
                    Pro03Checklist.this.result25_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_76) {
                    Pro03Checklist.this.result26_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_77) {
                    Pro03Checklist.this.result26_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_78) {
                    Pro03Checklist.this.result26_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_79) {
                    Pro03Checklist.this.result27_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_80) {
                    Pro03Checklist.this.result27_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_81) {
                    Pro03Checklist.this.result27_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_82) {
                    Pro03Checklist.this.result28_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_83) {
                    Pro03Checklist.this.result28_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_84) {
                    Pro03Checklist.this.result28_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_85) {
                    Pro03Checklist.this.result29_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_86) {
                    Pro03Checklist.this.result29_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_87) {
                    Pro03Checklist.this.result29_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_88) {
                    Pro03Checklist.this.result30_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_89) {
                    Pro03Checklist.this.result30_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_90) {
                    Pro03Checklist.this.result30_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        radioGroup41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_04_91) {
                    Pro03Checklist.this.result31_03_04 = 2;
                } else if (i == R.id.rb_pro03_04_92) {
                    Pro03Checklist.this.result31_03_04 = 1;
                } else if (i == R.id.rb_pro03_04_93) {
                    Pro03Checklist.this.result31_03_04 = 0;
                }
                TextView textView = textView4;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_04 + Pro03Checklist.this.result02_03_04 + Pro03Checklist.this.result03_04_03 + Pro03Checklist.this.result04_03_04 + Pro03Checklist.this.result05_03_04 + Pro03Checklist.this.result06_03_04 + Pro03Checklist.this.result07_03_04 + Pro03Checklist.this.result08_03_04 + Pro03Checklist.this.result09_03_04 + Pro03Checklist.this.result10_03_04 + Pro03Checklist.this.result11_03_04 + Pro03Checklist.this.result12_03_04 + Pro03Checklist.this.result13_03_04 + Pro03Checklist.this.result14_03_04 + Pro03Checklist.this.result15_03_04 + Pro03Checklist.this.result16_03_04 + Pro03Checklist.this.result17_03_04 + Pro03Checklist.this.result18_03_04 + Pro03Checklist.this.result19_03_04 + Pro03Checklist.this.result20_03_04 + Pro03Checklist.this.result21_03_04 + Pro03Checklist.this.result22_03_04 + Pro03Checklist.this.result23_03_04 + Pro03Checklist.this.result24_03_04 + Pro03Checklist.this.result25_03_04 + Pro03Checklist.this.result26_03_04 + Pro03Checklist.this.result27_03_04 + Pro03Checklist.this.result28_03_04 + Pro03Checklist.this.result29_03_04 + Pro03Checklist.this.result30_03_04 + Pro03Checklist.this.result31_03_04));
            }
        });
        RadioGroup radioGroup43 = (RadioGroup) findViewById(R.id.rg_pro03_05_15);
        RadioGroup radioGroup44 = (RadioGroup) findViewById(R.id.rg_pro03_05_16);
        RadioGroup radioGroup45 = (RadioGroup) findViewById(R.id.rg_pro03_05_17);
        RadioGroup radioGroup46 = (RadioGroup) findViewById(R.id.rg_pro03_05_18);
        RadioGroup radioGroup47 = (RadioGroup) findViewById(R.id.rg_pro03_05_19);
        RadioGroup radioGroup48 = (RadioGroup) findViewById(R.id.rg_pro03_05_20);
        RadioGroup radioGroup49 = (RadioGroup) findViewById(R.id.rg_pro03_05_21);
        RadioGroup radioGroup50 = (RadioGroup) findViewById(R.id.rg_pro03_05_22);
        RadioGroup radioGroup51 = (RadioGroup) findViewById(R.id.rg_pro03_05_23);
        RadioGroup radioGroup52 = (RadioGroup) findViewById(R.id.rg_pro03_05_24);
        RadioGroup radioGroup53 = (RadioGroup) findViewById(R.id.rg_pro03_05_25);
        RadioGroup radioGroup54 = (RadioGroup) findViewById(R.id.rg_pro03_05_26);
        RadioGroup radioGroup55 = (RadioGroup) findViewById(R.id.rg_pro03_05_27);
        RadioGroup radioGroup56 = (RadioGroup) findViewById(R.id.rg_pro03_05_28);
        RadioGroup radioGroup57 = (RadioGroup) findViewById(R.id.rg_pro03_05_29);
        RadioButton radioButton283 = (RadioButton) findViewById(R.id.rb_pro03_05_01);
        RadioButton radioButton284 = (RadioButton) findViewById(R.id.rb_pro03_05_02);
        RadioButton radioButton285 = (RadioButton) findViewById(R.id.rb_pro03_05_03);
        RadioButton radioButton286 = (RadioButton) findViewById(R.id.rb_pro03_05_04);
        RadioButton radioButton287 = (RadioButton) findViewById(R.id.rb_pro03_05_05);
        RadioButton radioButton288 = (RadioButton) findViewById(R.id.rb_pro03_05_06);
        RadioButton radioButton289 = (RadioButton) findViewById(R.id.rb_pro03_05_07);
        RadioButton radioButton290 = (RadioButton) findViewById(R.id.rb_pro03_05_08);
        RadioButton radioButton291 = (RadioButton) findViewById(R.id.rb_pro03_05_09);
        RadioButton radioButton292 = (RadioButton) findViewById(R.id.rb_pro03_05_10);
        RadioButton radioButton293 = (RadioButton) findViewById(R.id.rb_pro03_05_11);
        RadioButton radioButton294 = (RadioButton) findViewById(R.id.rb_pro03_05_12);
        RadioButton radioButton295 = (RadioButton) findViewById(R.id.rb_pro03_05_13);
        RadioButton radioButton296 = (RadioButton) findViewById(R.id.rb_pro03_05_14);
        RadioButton radioButton297 = (RadioButton) findViewById(R.id.rb_pro03_05_15);
        RadioButton radioButton298 = (RadioButton) findViewById(R.id.rb_pro03_05_16);
        RadioButton radioButton299 = (RadioButton) findViewById(R.id.rb_pro03_05_17);
        RadioButton radioButton300 = (RadioButton) findViewById(R.id.rb_pro03_05_18);
        RadioButton radioButton301 = (RadioButton) findViewById(R.id.rb_pro03_05_19);
        RadioButton radioButton302 = (RadioButton) findViewById(R.id.rb_pro03_05_20);
        RadioButton radioButton303 = (RadioButton) findViewById(R.id.rb_pro03_05_21);
        RadioButton radioButton304 = (RadioButton) findViewById(R.id.rb_pro03_05_22);
        RadioButton radioButton305 = (RadioButton) findViewById(R.id.rb_pro03_05_23);
        RadioButton radioButton306 = (RadioButton) findViewById(R.id.rb_pro03_05_24);
        RadioButton radioButton307 = (RadioButton) findViewById(R.id.rb_pro03_05_25);
        RadioButton radioButton308 = (RadioButton) findViewById(R.id.rb_pro03_05_26);
        RadioButton radioButton309 = (RadioButton) findViewById(R.id.rb_pro03_05_27);
        RadioButton radioButton310 = (RadioButton) findViewById(R.id.rb_pro03_05_28);
        RadioButton radioButton311 = (RadioButton) findViewById(R.id.rb_pro03_05_29);
        RadioButton radioButton312 = (RadioButton) findViewById(R.id.rb_pro03_05_30);
        RadioButton radioButton313 = (RadioButton) findViewById(R.id.rb_pro03_05_31);
        RadioButton radioButton314 = (RadioButton) findViewById(R.id.rb_pro03_05_32);
        RadioButton radioButton315 = (RadioButton) findViewById(R.id.rb_pro03_05_33);
        RadioButton radioButton316 = (RadioButton) findViewById(R.id.rb_pro03_05_34);
        RadioButton radioButton317 = (RadioButton) findViewById(R.id.rb_pro03_05_35);
        RadioButton radioButton318 = (RadioButton) findViewById(R.id.rb_pro03_05_36);
        RadioButton radioButton319 = (RadioButton) findViewById(R.id.rb_pro03_05_37);
        RadioButton radioButton320 = (RadioButton) findViewById(R.id.rb_pro03_05_38);
        RadioButton radioButton321 = (RadioButton) findViewById(R.id.rb_pro03_05_39);
        RadioButton radioButton322 = (RadioButton) findViewById(R.id.rb_pro03_05_40);
        RadioButton radioButton323 = (RadioButton) findViewById(R.id.rb_pro03_05_41);
        RadioButton radioButton324 = (RadioButton) findViewById(R.id.rb_pro03_05_42);
        RadioButton radioButton325 = (RadioButton) findViewById(R.id.rb_pro03_05_43);
        RadioButton radioButton326 = (RadioButton) findViewById(R.id.rb_pro03_05_44);
        RadioButton radioButton327 = (RadioButton) findViewById(R.id.rb_pro03_05_45);
        RadioButton radioButton328 = (RadioButton) findViewById(R.id.rb_pro03_05_46);
        RadioButton radioButton329 = (RadioButton) findViewById(R.id.rb_pro03_05_47);
        RadioButton radioButton330 = (RadioButton) findViewById(R.id.rb_pro03_05_48);
        RadioButton radioButton331 = (RadioButton) findViewById(R.id.rb_pro03_05_49);
        RadioButton radioButton332 = (RadioButton) findViewById(R.id.rb_pro03_05_50);
        RadioButton radioButton333 = (RadioButton) findViewById(R.id.rb_pro03_05_51);
        RadioButton radioButton334 = (RadioButton) findViewById(R.id.rb_pro03_05_52);
        RadioButton radioButton335 = (RadioButton) findViewById(R.id.rb_pro03_05_53);
        RadioButton radioButton336 = (RadioButton) findViewById(R.id.rb_pro03_05_54);
        RadioButton radioButton337 = (RadioButton) findViewById(R.id.rb_pro03_05_55);
        RadioButton radioButton338 = (RadioButton) findViewById(R.id.rb_pro03_05_56);
        RadioButton radioButton339 = (RadioButton) findViewById(R.id.rb_pro03_05_57);
        RadioButton radioButton340 = (RadioButton) findViewById(R.id.rb_pro03_05_58);
        RadioButton radioButton341 = (RadioButton) findViewById(R.id.rb_pro03_05_59);
        RadioButton radioButton342 = (RadioButton) findViewById(R.id.rb_pro03_05_60);
        RadioButton radioButton343 = (RadioButton) findViewById(R.id.rb_pro03_05_61);
        RadioButton radioButton344 = (RadioButton) findViewById(R.id.rb_pro03_05_62);
        RadioButton radioButton345 = (RadioButton) findViewById(R.id.rb_pro03_05_63);
        RadioButton radioButton346 = (RadioButton) findViewById(R.id.rb_pro03_05_64);
        RadioButton radioButton347 = (RadioButton) findViewById(R.id.rb_pro03_05_65);
        RadioButton radioButton348 = (RadioButton) findViewById(R.id.rb_pro03_05_66);
        RadioButton radioButton349 = (RadioButton) findViewById(R.id.rb_pro03_05_67);
        RadioButton radioButton350 = (RadioButton) findViewById(R.id.rb_pro03_05_68);
        RadioButton radioButton351 = (RadioButton) findViewById(R.id.rb_pro03_05_69);
        RadioButton radioButton352 = (RadioButton) findViewById(R.id.rb_pro03_05_70);
        RadioButton radioButton353 = (RadioButton) findViewById(R.id.rb_pro03_05_71);
        RadioButton radioButton354 = (RadioButton) findViewById(R.id.rb_pro03_05_72);
        RadioButton radioButton355 = (RadioButton) findViewById(R.id.rb_pro03_05_73);
        RadioButton radioButton356 = (RadioButton) findViewById(R.id.rb_pro03_05_74);
        RadioButton radioButton357 = (RadioButton) findViewById(R.id.rb_pro03_05_75);
        RadioButton radioButton358 = (RadioButton) findViewById(R.id.rb_pro03_05_76);
        RadioButton radioButton359 = (RadioButton) findViewById(R.id.rb_pro03_05_77);
        RadioButton radioButton360 = (RadioButton) findViewById(R.id.rb_pro03_05_78);
        RadioButton radioButton361 = (RadioButton) findViewById(R.id.rb_pro03_05_79);
        RadioButton radioButton362 = (RadioButton) findViewById(R.id.rb_pro03_05_80);
        RadioButton radioButton363 = (RadioButton) findViewById(R.id.rb_pro03_05_81);
        RadioButton radioButton364 = (RadioButton) findViewById(R.id.rb_pro03_05_82);
        RadioButton radioButton365 = (RadioButton) findViewById(R.id.rb_pro03_05_83);
        RadioButton radioButton366 = (RadioButton) findViewById(R.id.rb_pro03_05_84);
        RadioButton radioButton367 = (RadioButton) findViewById(R.id.rb_pro03_05_85);
        RadioButton radioButton368 = (RadioButton) findViewById(R.id.rb_pro03_05_86);
        RadioButton radioButton369 = (RadioButton) findViewById(R.id.rb_pro03_05_87);
        final TextView textView5 = (TextView) findViewById(R.id.pro03_05_sum);
        RadioGroup radioGroup58 = (RadioGroup) findViewById(R.id.rg_pro03_05_14);
        ((RadioGroup) findViewById(R.id.rg_pro03_05_01)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_01) {
                    Pro03Checklist.this.result01_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_02) {
                    Pro03Checklist.this.result01_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_03) {
                    Pro03Checklist.this.result01_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_05_02)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_04) {
                    Pro03Checklist.this.result02_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_05) {
                    Pro03Checklist.this.result02_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_06) {
                    Pro03Checklist.this.result02_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_05_03)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_07) {
                    Pro03Checklist.this.result03_05_03 = 2;
                } else if (i == R.id.rb_pro03_05_08) {
                    Pro03Checklist.this.result03_05_03 = 1;
                } else if (i == R.id.rb_pro03_05_09) {
                    Pro03Checklist.this.result03_05_03 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_05_04)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_10) {
                    Pro03Checklist.this.result04_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_11) {
                    Pro03Checklist.this.result04_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_12) {
                    Pro03Checklist.this.result04_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_05_05)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_13) {
                    Pro03Checklist.this.result05_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_14) {
                    Pro03Checklist.this.result05_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_15) {
                    Pro03Checklist.this.result05_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_05_06)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_16) {
                    Pro03Checklist.this.result06_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_17) {
                    Pro03Checklist.this.result06_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_18) {
                    Pro03Checklist.this.result06_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_05_07)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_19) {
                    Pro03Checklist.this.result07_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_20) {
                    Pro03Checklist.this.result07_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_21) {
                    Pro03Checklist.this.result07_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_05_08)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_22) {
                    Pro03Checklist.this.result08_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_23) {
                    Pro03Checklist.this.result08_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_24) {
                    Pro03Checklist.this.result08_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_05_09)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_25) {
                    Pro03Checklist.this.result09_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_26) {
                    Pro03Checklist.this.result09_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_27) {
                    Pro03Checklist.this.result09_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_05_10)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_28) {
                    Pro03Checklist.this.result10_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_29) {
                    Pro03Checklist.this.result10_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_30) {
                    Pro03Checklist.this.result10_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_05_11)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_31) {
                    Pro03Checklist.this.result11_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_32) {
                    Pro03Checklist.this.result11_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_33) {
                    Pro03Checklist.this.result11_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_05_12)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_34) {
                    Pro03Checklist.this.result12_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_35) {
                    Pro03Checklist.this.result12_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_36) {
                    Pro03Checklist.this.result12_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro03_05_13)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_37) {
                    Pro03Checklist.this.result13_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_38) {
                    Pro03Checklist.this.result13_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_39) {
                    Pro03Checklist.this.result13_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup58.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_40) {
                    Pro03Checklist.this.result14_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_41) {
                    Pro03Checklist.this.result14_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_42) {
                    Pro03Checklist.this.result14_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_43) {
                    Pro03Checklist.this.result15_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_44) {
                    Pro03Checklist.this.result15_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_45) {
                    Pro03Checklist.this.result15_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_46) {
                    Pro03Checklist.this.result16_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_47) {
                    Pro03Checklist.this.result16_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_48) {
                    Pro03Checklist.this.result16_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_49) {
                    Pro03Checklist.this.result17_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_50) {
                    Pro03Checklist.this.result17_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_51) {
                    Pro03Checklist.this.result17_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_52) {
                    Pro03Checklist.this.result18_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_53) {
                    Pro03Checklist.this.result18_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_54) {
                    Pro03Checklist.this.result18_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_55) {
                    Pro03Checklist.this.result19_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_56) {
                    Pro03Checklist.this.result19_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_57) {
                    Pro03Checklist.this.result19_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_58) {
                    Pro03Checklist.this.result20_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_59) {
                    Pro03Checklist.this.result20_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_60) {
                    Pro03Checklist.this.result20_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_61) {
                    Pro03Checklist.this.result21_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_62) {
                    Pro03Checklist.this.result21_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_63) {
                    Pro03Checklist.this.result21_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_64) {
                    Pro03Checklist.this.result22_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_65) {
                    Pro03Checklist.this.result22_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_66) {
                    Pro03Checklist.this.result22_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_67) {
                    Pro03Checklist.this.result23_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_68) {
                    Pro03Checklist.this.result23_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_69) {
                    Pro03Checklist.this.result23_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_70) {
                    Pro03Checklist.this.result24_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_71) {
                    Pro03Checklist.this.result24_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_72) {
                    Pro03Checklist.this.result24_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_73) {
                    Pro03Checklist.this.result25_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_74) {
                    Pro03Checklist.this.result25_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_75) {
                    Pro03Checklist.this.result25_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_76) {
                    Pro03Checklist.this.result26_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_77) {
                    Pro03Checklist.this.result26_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_78) {
                    Pro03Checklist.this.result26_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup55.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_79) {
                    Pro03Checklist.this.result27_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_80) {
                    Pro03Checklist.this.result27_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_81) {
                    Pro03Checklist.this.result27_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup56.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_82) {
                    Pro03Checklist.this.result28_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_83) {
                    Pro03Checklist.this.result28_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_84) {
                    Pro03Checklist.this.result28_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
        radioGroup57.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro03_05_85) {
                    Pro03Checklist.this.result29_03_05 = 2;
                } else if (i == R.id.rb_pro03_05_86) {
                    Pro03Checklist.this.result29_03_05 = 1;
                } else if (i == R.id.rb_pro03_05_87) {
                    Pro03Checklist.this.result29_03_05 = 0;
                }
                TextView textView = textView5;
                textView.setText("합계 : " + (Pro03Checklist.this.result01_03_05 + Pro03Checklist.this.result02_03_05 + Pro03Checklist.this.result03_05_03 + Pro03Checklist.this.result04_03_05 + Pro03Checklist.this.result05_03_05 + Pro03Checklist.this.result06_03_05 + Pro03Checklist.this.result07_03_05 + Pro03Checklist.this.result08_03_05 + Pro03Checklist.this.result09_03_05 + Pro03Checklist.this.result10_03_05 + Pro03Checklist.this.result11_03_05 + Pro03Checklist.this.result12_03_05 + Pro03Checklist.this.result13_03_05 + Pro03Checklist.this.result14_03_05 + Pro03Checklist.this.result15_03_05 + Pro03Checklist.this.result16_03_05 + Pro03Checklist.this.result17_03_05 + Pro03Checklist.this.result18_03_05 + Pro03Checklist.this.result19_03_05 + Pro03Checklist.this.result20_03_05 + Pro03Checklist.this.result21_03_05 + Pro03Checklist.this.result22_03_05 + Pro03Checklist.this.result23_03_05 + Pro03Checklist.this.result24_03_05 + Pro03Checklist.this.result25_03_05 + Pro03Checklist.this.result26_03_05 + Pro03Checklist.this.result27_03_05 + Pro03Checklist.this.result28_03_05 + Pro03Checklist.this.result29_03_05));
            }
        });
    }
}