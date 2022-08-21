package com.nursing.management;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Pro02Checklist extends AppCompatActivity {

    int result01 = 0;
    int result01_2 = 0;
    int result01_3 = 0;
    int result02 = 0;
    int result02_2 = 0;
    int result02_3 = 0;
    int result03 = 0;
    int result03_2 = 0;
    int result03_3 = 0;
    int result04 = 0;
    int result04_2 = 0;
    int result04_3 = 0;
    int result05 = 0;
    int result05_2 = 0;
    int result05_3 = 0;
    int result06 = 0;
    int result06_2 = 0;
    int result06_3 = 0;
    int result07 = 0;
    int result07_2 = 0;
    int result07_3 = 0;
    int result08_2 = 0;
    int result08_3 = 0;
    int result09_2 = 0;
    int result09_3 = 0;
    int result10_2 = 0;
    int result10_3 = 0;
    int result11_3 = 0;
    int result12_3 = 0;
    int result13_3 = 0;
    int result14_3 = 0;
    int result15_3 = 0;
    int result16_3 = 0;
    int result17_3 = 0;
    int result18_3 = 0;
    int result19_3 = 0;
    int result20_3 = 0;
    int result21_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.pro02checklist);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        RadioButton radioButton = (RadioButton) findViewById(R.id.rb_pro02_01_01);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.rb_pro02_01_02);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.rb_pro02_01_03);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.rb_pro02_01_04);
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.rb_pro02_01_05);
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.rb_pro02_01_06);
        RadioButton radioButton7 = (RadioButton) findViewById(R.id.rb_pro02_01_07);
        RadioButton radioButton8 = (RadioButton) findViewById(R.id.rb_pro02_01_08);
        RadioButton radioButton9 = (RadioButton) findViewById(R.id.rb_pro02_01_09);
        RadioButton radioButton10 = (RadioButton) findViewById(R.id.rb_pro02_01_10);
        RadioButton radioButton11 = (RadioButton) findViewById(R.id.rb_pro02_01_11);
        RadioButton radioButton12 = (RadioButton) findViewById(R.id.rb_pro02_01_12);
        RadioButton radioButton13 = (RadioButton) findViewById(R.id.rb_pro02_01_13);
        RadioButton radioButton14 = (RadioButton) findViewById(R.id.rb_pro02_01_14);
        RadioButton radioButton15 = (RadioButton) findViewById(R.id.rb_pro02_01_15);
        RadioButton radioButton16 = (RadioButton) findViewById(R.id.rb_pro02_01_16);
        RadioButton radioButton17 = (RadioButton) findViewById(R.id.rb_pro02_01_17);
        RadioButton radioButton18 = (RadioButton) findViewById(R.id.rb_pro02_01_18);
        RadioButton radioButton19 = (RadioButton) findViewById(R.id.rb_pro02_01_19);
        RadioButton radioButton20 = (RadioButton) findViewById(R.id.rb_pro02_01_20);
        RadioButton radioButton21 = (RadioButton) findViewById(R.id.rb_pro02_01_21);
        final TextView textView1 = (TextView) findViewById(R.id.pro02_01_sum);
        ((RadioGroup) findViewById(R.id.rg_pro02_01_01)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_01_01) {
                    Pro02Checklist.this.result01 = 2;
                } else if (i == R.id.rb_pro02_01_02) {
                    Pro02Checklist.this.result01 = 1;
                } else if (i == R.id.rb_pro02_01_03) {
                    Pro02Checklist.this.result01 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro02Checklist.this.result01 + Pro02Checklist.this.result02 + Pro02Checklist.this.result03 + Pro02Checklist.this.result04 + Pro02Checklist.this.result05 + Pro02Checklist.this.result06 + Pro02Checklist.this.result07));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_01_02)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_01_04) {
                    Pro02Checklist.this.result02 = 2;
                } else if (i == R.id.rb_pro02_01_05) {
                    Pro02Checklist.this.result02 = 1;
                } else if (i == R.id.rb_pro02_01_06) {
                    Pro02Checklist.this.result02 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro02Checklist.this.result01 + Pro02Checklist.this.result02 + Pro02Checklist.this.result03 + Pro02Checklist.this.result04 + Pro02Checklist.this.result05 + Pro02Checklist.this.result06 + Pro02Checklist.this.result07));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_01_03)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_01_07) {
                    Pro02Checklist.this.result03 = 2;
                } else if (i == R.id.rb_pro02_01_08) {
                    Pro02Checklist.this.result03 = 1;
                } else if (i == R.id.rb_pro02_01_09) {
                    Pro02Checklist.this.result03 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro02Checklist.this.result01 + Pro02Checklist.this.result02 + Pro02Checklist.this.result03 + Pro02Checklist.this.result04 + Pro02Checklist.this.result05 + Pro02Checklist.this.result06 + Pro02Checklist.this.result07));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_01_04)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_01_10) {
                    Pro02Checklist.this.result04 = 2;
                } else if (i == R.id.rb_pro02_01_11) {
                    Pro02Checklist.this.result04 = 1;
                } else if (i == R.id.rb_pro02_01_12) {
                    Pro02Checklist.this.result04 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro02Checklist.this.result01 + Pro02Checklist.this.result02 + Pro02Checklist.this.result03 + Pro02Checklist.this.result04 + Pro02Checklist.this.result05 + Pro02Checklist.this.result06 + Pro02Checklist.this.result07));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_01_05)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_01_13) {
                    Pro02Checklist.this.result05 = 2;
                } else if (i == R.id.rb_pro02_01_14) {
                    Pro02Checklist.this.result05 = 1;
                } else if (i == R.id.rb_pro02_01_15) {
                    Pro02Checklist.this.result05 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro02Checklist.this.result01 + Pro02Checklist.this.result02 + Pro02Checklist.this.result03 + Pro02Checklist.this.result04 + Pro02Checklist.this.result05 + Pro02Checklist.this.result06 + Pro02Checklist.this.result07));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_01_06)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_01_16) {
                    Pro02Checklist.this.result06 = 2;
                } else if (i == R.id.rb_pro02_01_17) {
                    Pro02Checklist.this.result06 = 1;
                } else if (i == R.id.rb_pro02_01_18) {
                    Pro02Checklist.this.result06 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro02Checklist.this.result01 + Pro02Checklist.this.result02 + Pro02Checklist.this.result03 + Pro02Checklist.this.result04 + Pro02Checklist.this.result05 + Pro02Checklist.this.result06 + Pro02Checklist.this.result07));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_01_07)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_01_19) {
                    Pro02Checklist.this.result07 = 2;
                } else if (i == R.id.rb_pro02_01_20) {
                    Pro02Checklist.this.result07 = 1;
                } else if (i == R.id.rb_pro02_01_21) {
                    Pro02Checklist.this.result07 = 0;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro02Checklist.this.result01 + Pro02Checklist.this.result02 + Pro02Checklist.this.result03 + Pro02Checklist.this.result04 + Pro02Checklist.this.result05 + Pro02Checklist.this.result06 + Pro02Checklist.this.result07));
            }
        });

        RadioButton radioButton22 = (RadioButton) findViewById(R.id.rb_pro02_02_01);
        RadioButton radioButton23 = (RadioButton) findViewById(R.id.rb_pro02_02_02);
        RadioButton radioButton24 = (RadioButton) findViewById(R.id.rb_pro02_02_03);
        RadioButton radioButton25 = (RadioButton) findViewById(R.id.rb_pro02_02_04);
        RadioButton radioButton26 = (RadioButton) findViewById(R.id.rb_pro02_02_05);
        RadioButton radioButton27 = (RadioButton) findViewById(R.id.rb_pro02_02_06);
        RadioButton radioButton28 = (RadioButton) findViewById(R.id.rb_pro02_02_07);
        RadioButton radioButton29 = (RadioButton) findViewById(R.id.rb_pro02_02_08);
        RadioButton radioButton30 = (RadioButton) findViewById(R.id.rb_pro02_02_09);
        RadioButton radioButton31 = (RadioButton) findViewById(R.id.rb_pro02_02_10);
        RadioButton radioButton32 = (RadioButton) findViewById(R.id.rb_pro02_02_11);
        RadioButton radioButton33 = (RadioButton) findViewById(R.id.rb_pro02_02_12);
        RadioButton radioButton34 = (RadioButton) findViewById(R.id.rb_pro02_02_13);
        RadioButton radioButton35 = (RadioButton) findViewById(R.id.rb_pro02_02_14);
        RadioButton radioButton36 = (RadioButton) findViewById(R.id.rb_pro02_02_15);
        RadioButton radioButton37 = (RadioButton) findViewById(R.id.rb_pro02_02_16);
        RadioButton radioButton38 = (RadioButton) findViewById(R.id.rb_pro02_02_17);
        RadioButton radioButton39 = (RadioButton) findViewById(R.id.rb_pro02_02_18);
        RadioButton radioButton40 = (RadioButton) findViewById(R.id.rb_pro02_02_19);
        RadioButton radioButton41 = (RadioButton) findViewById(R.id.rb_pro02_02_20);
        RadioButton radioButton42 = (RadioButton) findViewById(R.id.rb_pro02_02_21);
        RadioButton radioButton43 = (RadioButton) findViewById(R.id.rb_pro02_02_22);
        RadioButton radioButton44 = (RadioButton) findViewById(R.id.rb_pro02_02_23);
        RadioButton radioButton45 = (RadioButton) findViewById(R.id.rb_pro02_02_24);
        RadioButton radioButton46 = (RadioButton) findViewById(R.id.rb_pro02_02_25);
        RadioButton radioButton47 = (RadioButton) findViewById(R.id.rb_pro02_02_26);
        RadioButton radioButton48 = (RadioButton) findViewById(R.id.rb_pro02_02_27);
        RadioButton radioButton49 = (RadioButton) findViewById(R.id.rb_pro02_02_28);
        RadioButton radioButton50 = (RadioButton) findViewById(R.id.rb_pro02_02_29);
        RadioButton radioButton51 = (RadioButton) findViewById(R.id.rb_pro02_02_30);
        final TextView textView2 = (TextView) findViewById(R.id.pro02_02_sum);
        ((RadioGroup) findViewById(R.id.rg_pro02_02_01)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_02_01) {
                    Pro02Checklist.this.result01_2 = 2;
                } else if (i == R.id.rb_pro02_02_02) {
                    Pro02Checklist.this.result01_2 = 1;
                } else if (i == R.id.rb_pro02_02_03) {
                    Pro02Checklist.this.result01_2 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_2 + Pro02Checklist.this.result02_2 + Pro02Checklist.this.result03_2 + Pro02Checklist.this.result04_2 + Pro02Checklist.this.result05_2 + Pro02Checklist.this.result06_2 + Pro02Checklist.this.result07_2 + Pro02Checklist.this.result08_2 + Pro02Checklist.this.result09_2 + Pro02Checklist.this.result10_2));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_02_02)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_02_04) {
                    Pro02Checklist.this.result02_2 = 2;
                } else if (i == R.id.rb_pro02_02_05) {
                    Pro02Checklist.this.result02_2 = 1;
                } else if (i == R.id.rb_pro02_02_06) {
                    Pro02Checklist.this.result02_2 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_2 + Pro02Checklist.this.result02_2 + Pro02Checklist.this.result03_2 + Pro02Checklist.this.result04_2 + Pro02Checklist.this.result05_2 + Pro02Checklist.this.result06_2 + Pro02Checklist.this.result07_2 + Pro02Checklist.this.result08_2 + Pro02Checklist.this.result09_2 + Pro02Checklist.this.result10_2));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_02_03)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_02_07) {
                    Pro02Checklist.this.result03_2 = 2;
                } else if (i == R.id.rb_pro02_02_08) {
                    Pro02Checklist.this.result03_2 = 1;
                } else if (i == R.id.rb_pro02_02_09) {
                    Pro02Checklist.this.result03_2 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_2 + Pro02Checklist.this.result02_2 + Pro02Checklist.this.result03_2 + Pro02Checklist.this.result04_2 + Pro02Checklist.this.result05_2 + Pro02Checklist.this.result06_2 + Pro02Checklist.this.result07_2 + Pro02Checklist.this.result08_2 + Pro02Checklist.this.result09_2 + Pro02Checklist.this.result10_2));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_02_04)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_02_10) {
                    Pro02Checklist.this.result04_2 = 2;
                } else if (i == R.id.rb_pro02_02_11) {
                    Pro02Checklist.this.result04_2 = 1;
                } else if (i == R.id.rb_pro02_02_12) {
                    Pro02Checklist.this.result04_2 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_2 + Pro02Checklist.this.result02_2 + Pro02Checklist.this.result03_2 + Pro02Checklist.this.result04_2 + Pro02Checklist.this.result05_2 + Pro02Checklist.this.result06_2 + Pro02Checklist.this.result07_2 + Pro02Checklist.this.result08_2 + Pro02Checklist.this.result09_2 + Pro02Checklist.this.result10_2));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_02_05)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_02_13) {
                    Pro02Checklist.this.result05_2 = 2;
                } else if (i == R.id.rb_pro02_02_14) {
                    Pro02Checklist.this.result05_2 = 1;
                } else if (i == R.id.rb_pro02_02_15) {
                    Pro02Checklist.this.result05_2 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_2 + Pro02Checklist.this.result02_2 + Pro02Checklist.this.result03_2 + Pro02Checklist.this.result04_2 + Pro02Checklist.this.result05_2 + Pro02Checklist.this.result06_2 + Pro02Checklist.this.result07_2 + Pro02Checklist.this.result08_2 + Pro02Checklist.this.result09_2 + Pro02Checklist.this.result10_2));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_02_06)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_02_16) {
                    Pro02Checklist.this.result06_2 = 2;
                } else if (i == R.id.rb_pro02_02_17) {
                    Pro02Checklist.this.result06_2 = 1;
                } else if (i == R.id.rb_pro02_02_18) {
                    Pro02Checklist.this.result06_2 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_2 + Pro02Checklist.this.result02_2 + Pro02Checklist.this.result03_2 + Pro02Checklist.this.result04_2 + Pro02Checklist.this.result05_2 + Pro02Checklist.this.result06_2 + Pro02Checklist.this.result07_2 + Pro02Checklist.this.result08_2 + Pro02Checklist.this.result09_2 + Pro02Checklist.this.result10_2));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_02_07)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_02_19) {
                    Pro02Checklist.this.result07_2 = 2;
                } else if (i == R.id.rb_pro02_02_20) {
                    Pro02Checklist.this.result07_2 = 1;
                } else if (i == R.id.rb_pro02_02_21) {
                    Pro02Checklist.this.result07_2 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_2 + Pro02Checklist.this.result02_2 + Pro02Checklist.this.result03_2 + Pro02Checklist.this.result04_2 + Pro02Checklist.this.result05_2 + Pro02Checklist.this.result06_2 + Pro02Checklist.this.result07_2 + Pro02Checklist.this.result08_2 + Pro02Checklist.this.result09_2 + Pro02Checklist.this.result10_2));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_02_08)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_02_22) {
                    Pro02Checklist.this.result08_2 = 2;
                } else if (i == R.id.rb_pro02_02_23) {
                    Pro02Checklist.this.result08_2 = 1;
                } else if (i == R.id.rb_pro02_02_24) {
                    Pro02Checklist.this.result08_2 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_2 + Pro02Checklist.this.result02_2 + Pro02Checklist.this.result03_2 + Pro02Checklist.this.result04_2 + Pro02Checklist.this.result05_2 + Pro02Checklist.this.result06_2 + Pro02Checklist.this.result07_2 + Pro02Checklist.this.result08_2 + Pro02Checklist.this.result09_2 + Pro02Checklist.this.result10_2));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_02_09)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_02_25) {
                    Pro02Checklist.this.result09_2 = 2;
                } else if (i == R.id.rb_pro02_02_26) {
                    Pro02Checklist.this.result09_2 = 1;
                } else if (i == R.id.rb_pro02_02_27) {
                    Pro02Checklist.this.result09_2 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_2 + Pro02Checklist.this.result02_2 + Pro02Checklist.this.result03_2 + Pro02Checklist.this.result04_2 + Pro02Checklist.this.result05_2 + Pro02Checklist.this.result06_2 + Pro02Checklist.this.result07_2 + Pro02Checklist.this.result08_2 + Pro02Checklist.this.result09_2 + Pro02Checklist.this.result10_2));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_02_10)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_02_28) {
                    Pro02Checklist.this.result10_2 = 2;
                } else if (i == R.id.rb_pro02_02_29) {
                    Pro02Checklist.this.result10_2 = 1;
                } else if (i == R.id.rb_pro02_02_30) {
                    Pro02Checklist.this.result10_2 = 0;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_2 + Pro02Checklist.this.result02_2 + Pro02Checklist.this.result03_2 + Pro02Checklist.this.result04_2 + Pro02Checklist.this.result05_2 + Pro02Checklist.this.result06_2 + Pro02Checklist.this.result07_2 + Pro02Checklist.this.result08_2 + Pro02Checklist.this.result09_2 + Pro02Checklist.this.result10_2));
            }
        });
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rg_pro02_03_15);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.rg_pro02_03_16);
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.rg_pro02_03_17);
        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.rg_pro02_03_18);
        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.rg_pro02_03_19);
        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.rg_pro02_03_20);
        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.rg_pro02_03_21);
        RadioButton radioButton52 = (RadioButton) findViewById(R.id.rb_pro02_03_01);
        RadioButton radioButton53 = (RadioButton) findViewById(R.id.rb_pro02_03_02);
        RadioButton radioButton54 = (RadioButton) findViewById(R.id.rb_pro02_03_03);
        RadioButton radioButton55 = (RadioButton) findViewById(R.id.rb_pro02_03_04);
        RadioButton radioButton56 = (RadioButton) findViewById(R.id.rb_pro02_03_05);
        RadioButton radioButton57 = (RadioButton) findViewById(R.id.rb_pro02_03_06);
        RadioButton radioButton58 = (RadioButton) findViewById(R.id.rb_pro02_03_07);
        RadioButton radioButton59 = (RadioButton) findViewById(R.id.rb_pro02_03_08);
        RadioButton radioButton60 = (RadioButton) findViewById(R.id.rb_pro02_03_09);
        RadioButton radioButton61 = (RadioButton) findViewById(R.id.rb_pro02_03_10);
        RadioButton radioButton62 = (RadioButton) findViewById(R.id.rb_pro02_03_11);
        RadioButton radioButton63 = (RadioButton) findViewById(R.id.rb_pro02_03_12);
        RadioButton radioButton64 = (RadioButton) findViewById(R.id.rb_pro02_03_13);
        RadioButton radioButton65 = (RadioButton) findViewById(R.id.rb_pro02_03_14);
        RadioButton radioButton66 = (RadioButton) findViewById(R.id.rb_pro02_03_15);
        RadioButton radioButton67 = (RadioButton) findViewById(R.id.rb_pro02_03_16);
        RadioButton radioButton68 = (RadioButton) findViewById(R.id.rb_pro02_03_17);
        RadioButton radioButton69 = (RadioButton) findViewById(R.id.rb_pro02_03_18);
        RadioButton radioButton70 = (RadioButton) findViewById(R.id.rb_pro02_03_19);
        RadioButton radioButton71 = (RadioButton) findViewById(R.id.rb_pro02_03_20);
        RadioButton radioButton72 = (RadioButton) findViewById(R.id.rb_pro02_03_21);
        RadioButton radioButton73 = (RadioButton) findViewById(R.id.rb_pro02_03_22);
        RadioButton radioButton74 = (RadioButton) findViewById(R.id.rb_pro02_03_23);
        RadioButton radioButton75 = (RadioButton) findViewById(R.id.rb_pro02_03_24);
        RadioButton radioButton76 = (RadioButton) findViewById(R.id.rb_pro02_03_25);
        RadioButton radioButton77 = (RadioButton) findViewById(R.id.rb_pro02_03_26);
        RadioButton radioButton78 = (RadioButton) findViewById(R.id.rb_pro02_03_27);
        RadioButton radioButton79 = (RadioButton) findViewById(R.id.rb_pro02_03_28);
        RadioButton radioButton80 = (RadioButton) findViewById(R.id.rb_pro02_03_29);
        RadioButton radioButton81 = (RadioButton) findViewById(R.id.rb_pro02_03_30);
        RadioButton radioButton82 = (RadioButton) findViewById(R.id.rb_pro02_03_31);
        RadioButton radioButton83 = (RadioButton) findViewById(R.id.rb_pro02_03_32);
        RadioButton radioButton84 = (RadioButton) findViewById(R.id.rb_pro02_03_33);
        RadioButton radioButton85 = (RadioButton) findViewById(R.id.rb_pro02_03_34);
        RadioButton radioButton86 = (RadioButton) findViewById(R.id.rb_pro02_03_35);
        RadioButton radioButton87 = (RadioButton) findViewById(R.id.rb_pro02_03_36);
        RadioButton radioButton88 = (RadioButton) findViewById(R.id.rb_pro02_03_37);
        RadioButton radioButton89 = (RadioButton) findViewById(R.id.rb_pro02_03_38);
        RadioButton radioButton90 = (RadioButton) findViewById(R.id.rb_pro02_03_39);
        RadioButton radioButton91 = (RadioButton) findViewById(R.id.rb_pro02_03_40);
        RadioButton radioButton92 = (RadioButton) findViewById(R.id.rb_pro02_03_41);
        RadioButton radioButton93 = (RadioButton) findViewById(R.id.rb_pro02_03_42);
        RadioButton radioButton94 = (RadioButton) findViewById(R.id.rb_pro02_03_43);
        RadioButton radioButton95 = (RadioButton) findViewById(R.id.rb_pro02_03_44);
        RadioButton radioButton96 = (RadioButton) findViewById(R.id.rb_pro02_03_45);
        RadioButton radioButton97 = (RadioButton) findViewById(R.id.rb_pro02_03_46);
        RadioButton radioButton98 = (RadioButton) findViewById(R.id.rb_pro02_03_47);
        RadioButton radioButton99 = (RadioButton) findViewById(R.id.rb_pro02_03_48);
        RadioButton radioButton100 = (RadioButton) findViewById(R.id.rb_pro02_03_49);
        RadioButton radioButton101 = (RadioButton) findViewById(R.id.rb_pro02_03_50);
        RadioButton radioButton102 = (RadioButton) findViewById(R.id.rb_pro02_03_51);
        RadioButton radioButton103 = (RadioButton) findViewById(R.id.rb_pro02_03_52);
        RadioButton radioButton104 = (RadioButton) findViewById(R.id.rb_pro02_03_53);
        RadioButton radioButton105 = (RadioButton) findViewById(R.id.rb_pro02_03_54);
        RadioButton radioButton106 = (RadioButton) findViewById(R.id.rb_pro02_03_55);
        RadioButton radioButton107 = (RadioButton) findViewById(R.id.rb_pro02_03_56);
        RadioButton radioButton108 = (RadioButton) findViewById(R.id.rb_pro02_03_57);
        RadioButton radioButton109 = (RadioButton) findViewById(R.id.rb_pro02_03_58);
        RadioButton radioButton110 = (RadioButton) findViewById(R.id.rb_pro02_03_59);
        RadioButton radioButton111 = (RadioButton) findViewById(R.id.rb_pro02_03_60);
        RadioButton radioButton112 = (RadioButton) findViewById(R.id.rb_pro02_03_61);
        final TextView textView3 = (TextView) findViewById(R.id.pro02_03_sum);
        RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.rg_pro02_03_14);
        ((RadioGroup) findViewById(R.id.rg_pro02_03_01)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_01) {
                    Pro02Checklist.this.result01_3 = 2;
                } else if (i == R.id.rb_pro02_03_02) {
                    Pro02Checklist.this.result01_3 = 1;
                } else if (i == R.id.rb_pro02_03_03) {
                    Pro02Checklist.this.result01_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_03_02)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_04) {
                    Pro02Checklist.this.result02_3 = 2;
                } else if (i == R.id.rb_pro02_03_05) {
                    Pro02Checklist.this.result02_3 = 1;
                } else if (i == R.id.rb_pro02_03_06) {
                    Pro02Checklist.this.result02_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_03_03)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_07) {
                    Pro02Checklist.this.result03_3 = 2;
                } else if (i == R.id.rb_pro02_03_08) {
                    Pro02Checklist.this.result03_3 = 1;
                } else if (i == R.id.rb_pro02_03_09) {
                    Pro02Checklist.this.result03_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_03_04)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_10) {
                    Pro02Checklist.this.result04_3 = 2;
                } else if (i == R.id.rb_pro02_03_11) {
                    Pro02Checklist.this.result04_3 = 1;
                } else if (i == R.id.rb_pro02_03_12) {
                    Pro02Checklist.this.result04_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_03_05)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_13) {
                    Pro02Checklist.this.result05_3 = 2;
                } else if (i == R.id.rb_pro02_03_14) {
                    Pro02Checklist.this.result05_3 = 1;
                } else if (i == R.id.rb_pro02_03_15) {
                    Pro02Checklist.this.result05_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_03_06)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_16) {
                    Pro02Checklist.this.result06_3 = 2;
                } else if (i == R.id.rb_pro02_03_17) {
                    Pro02Checklist.this.result06_3 = 1;
                } else if (i == R.id.rb_pro02_03_18) {
                    Pro02Checklist.this.result06_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_03_07)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_19) {
                    Pro02Checklist.this.result07_3 = 2;
                } else if (i == R.id.rb_pro02_03_20) {
                    Pro02Checklist.this.result07_3 = 1;
                } else if (i == R.id.rb_pro02_03_21) {
                    Pro02Checklist.this.result07_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_03_08)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_22) {
                    Pro02Checklist.this.result08_3 = 2;
                } else if (i == R.id.rb_pro02_03_23) {
                    Pro02Checklist.this.result08_3 = 1;
                } else if (i == R.id.rb_pro02_03_24) {
                    Pro02Checklist.this.result08_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_03_09)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_25) {
                    Pro02Checklist.this.result09_3 = 2;
                } else if (i == R.id.rb_pro02_03_26) {
                    Pro02Checklist.this.result09_3 = 1;
                } else if (i == R.id.rb_pro02_03_27) {
                    Pro02Checklist.this.result09_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_03_10)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_28) {
                    Pro02Checklist.this.result10_3 = 2;
                } else if (i == R.id.rb_pro02_03_29) {
                    Pro02Checklist.this.result10_3 = 1;
                } else if (i == R.id.rb_pro02_03_30) {
                    Pro02Checklist.this.result10_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_03_11)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_31) {
                    Pro02Checklist.this.result11_3 = 2;
                } else if (i == R.id.rb_pro02_03_32) {
                    Pro02Checklist.this.result11_3 = 1;
                } else if (i == R.id.rb_pro02_03_33) {
                    Pro02Checklist.this.result11_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_03_12)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_34) {
                    Pro02Checklist.this.result12_3 = 2;
                } else if (i == R.id.rb_pro02_03_35) {
                    Pro02Checklist.this.result12_3 = 1;
                } else if (i == R.id.rb_pro02_03_36) {
                    Pro02Checklist.this.result12_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro02_03_13)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_37) {
                    Pro02Checklist.this.result13_3 = 2;
                } else if (i == R.id.rb_pro02_03_38) {
                    Pro02Checklist.this.result13_3 = 1;
                } else if (i == R.id.rb_pro02_03_39) {
                    Pro02Checklist.this.result13_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_40) {
                    Pro02Checklist.this.result14_3 = 2;
                } else if (i == R.id.rb_pro02_03_41) {
                    Pro02Checklist.this.result14_3 = 1;
                } else if (i == R.id.rb_pro02_03_42) {
                    Pro02Checklist.this.result14_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_43) {
                    Pro02Checklist.this.result15_3 = 2;
                } else if (i == R.id.rb_pro02_03_44) {
                    Pro02Checklist.this.result15_3 = 1;
                } else if (i == R.id.rb_pro02_03_45) {
                    Pro02Checklist.this.result15_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_46) {
                    Pro02Checklist.this.result16_3 = 2;
                } else if (i == R.id.rb_pro02_03_47) {
                    Pro02Checklist.this.result16_3 = 1;
                } else if (i == R.id.rb_pro02_03_48) {
                    Pro02Checklist.this.result16_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_49) {
                    Pro02Checklist.this.result17_3 = 2;
                } else if (i == R.id.rb_pro02_03_50) {
                    Pro02Checklist.this.result17_3 = 1;
                } else if (i == R.id.rb_pro02_03_51) {
                    Pro02Checklist.this.result17_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_52) {
                    Pro02Checklist.this.result18_3 = 2;
                } else if (i == R.id.rb_pro02_03_53) {
                    Pro02Checklist.this.result18_3 = 1;
                } else if (i == R.id.rb_pro02_03_54) {
                    Pro02Checklist.this.result18_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_55) {
                    Pro02Checklist.this.result19_3 = 2;
                } else if (i == R.id.rb_pro02_03_56) {
                    Pro02Checklist.this.result19_3 = 1;
                } else if (i == R.id.rb_pro02_03_57) {
                    Pro02Checklist.this.result19_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_58) {
                    Pro02Checklist.this.result20_3 = 2;
                } else if (i == R.id.rb_pro02_03_59) {
                    Pro02Checklist.this.result20_3 = 1;
                } else if (i == R.id.rb_pro02_03_60) {
                    Pro02Checklist.this.result20_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro02_03_61) {
                    Pro02Checklist.this.result21_3 = 2;
                } else if (i == R.id.rb_pro02_03_62) {
                    Pro02Checklist.this.result21_3 = 1;
                } else if (i == R.id.rb_pro02_03_63) {
                    Pro02Checklist.this.result21_3 = 0;
                }
                TextView textView = textView3;
                textView.setText("합계 : " + (Pro02Checklist.this.result01_3 + Pro02Checklist.this.result02_3 + Pro02Checklist.this.result03_3 + Pro02Checklist.this.result04_3 + Pro02Checklist.this.result05_3 + Pro02Checklist.this.result06_3 + Pro02Checklist.this.result07_3 + Pro02Checklist.this.result08_3 + Pro02Checklist.this.result09_3 + Pro02Checklist.this.result10_3 + Pro02Checklist.this.result11_3 + Pro02Checklist.this.result12_3 + Pro02Checklist.this.result13_3 + Pro02Checklist.this.result14_3 + Pro02Checklist.this.result15_3 + Pro02Checklist.this.result16_3 + Pro02Checklist.this.result17_3 + Pro02Checklist.this.result18_3 + Pro02Checklist.this.result19_3 + Pro02Checklist.this.result20_3 + Pro02Checklist.this.result21_3));
            }
        });
    }
}