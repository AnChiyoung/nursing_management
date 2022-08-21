package com.nursing.management;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Pro05Checklist extends AppCompatActivity {

    int result01_05_01 = 0;
    int result01_05_02 = 0;
    int result02_05_01 = 0;
    int result02_05_02 = 0;
    int result03_05_01 = 0;
    int result03_05_02 = 0;
    int result04_05_01 = 0;
    int result04_05_02 = 0;
    int result05_05_01 = 0;
    int result05_05_02 = 0;
    int result06_05_01 = 0;
    int result06_05_02 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.pro05checklist);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        RadioButton radioButton = (RadioButton) findViewById(R.id.rb_pro05_01_01);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.rb_pro05_01_02);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.rb_pro05_01_03);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.rb_pro05_01_04);
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.rb_pro05_01_05);
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.rb_pro05_01_06);
        RadioButton radioButton7 = (RadioButton) findViewById(R.id.rb_pro05_01_07);
        RadioButton radioButton8 = (RadioButton) findViewById(R.id.rb_pro05_01_08);
        RadioButton radioButton9 = (RadioButton) findViewById(R.id.rb_pro05_01_09);
        RadioButton radioButton10 = (RadioButton) findViewById(R.id.rb_pro05_01_10);
        RadioButton radioButton11 = (RadioButton) findViewById(R.id.rb_pro05_01_11);
        RadioButton radioButton12 = (RadioButton) findViewById(R.id.rb_pro05_01_12);
        RadioButton radioButton13 = (RadioButton) findViewById(R.id.rb_pro05_01_13);
        RadioButton radioButton14 = (RadioButton) findViewById(R.id.rb_pro05_01_14);
        RadioButton radioButton15 = (RadioButton) findViewById(R.id.rb_pro05_01_15);
        RadioButton radioButton16 = (RadioButton) findViewById(R.id.rb_pro05_01_16);
        RadioButton radioButton17 = (RadioButton) findViewById(R.id.rb_pro05_01_17);
        RadioButton radioButton18 = (RadioButton) findViewById(R.id.rb_pro05_01_18);
        RadioButton radioButton19 = (RadioButton) findViewById(R.id.rb_pro05_01_19);
        RadioButton radioButton20 = (RadioButton) findViewById(R.id.rb_pro05_01_20);
        RadioButton radioButton21 = (RadioButton) findViewById(R.id.rb_pro05_01_21);
        RadioButton radioButton22 = (RadioButton) findViewById(R.id.rb_pro05_01_22);
        RadioButton radioButton23 = (RadioButton) findViewById(R.id.rb_pro05_01_23);
        final TextView textView1 = (TextView) findViewById(R.id.pro05_01_sum);
        ((RadioGroup) findViewById(R.id.rg_pro05_01_01)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro05_01_01) {
                    Pro05Checklist.this.result01_05_01 = 1;
                } else if (i == R.id.rb_pro05_01_02) {
                    Pro05Checklist.this.result01_05_01 = 2;
                } else if (i == R.id.rb_pro05_01_03) {
                    Pro05Checklist.this.result01_05_01 = 3;
                } else if (i == R.id.rb_pro05_01_04) {
                    Pro05Checklist.this.result01_05_01 = 4;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro05Checklist.this.result01_05_01 + Pro05Checklist.this.result02_05_01 + Pro05Checklist.this.result03_05_01 + Pro05Checklist.this.result04_05_01 + Pro05Checklist.this.result05_05_01 + Pro05Checklist.this.result06_05_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro05_01_02)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro05_01_05) {
                    Pro05Checklist.this.result02_05_01 = 1;
                } else if (i == R.id.rb_pro05_01_06) {
                    Pro05Checklist.this.result02_05_01 = 2;
                } else if (i == R.id.rb_pro05_01_07) {
                    Pro05Checklist.this.result02_05_01 = 3;
                } else if (i == R.id.rb_pro05_01_08) {
                    Pro05Checklist.this.result02_05_01 = 4;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro05Checklist.this.result01_05_01 + Pro05Checklist.this.result02_05_01 + Pro05Checklist.this.result03_05_01 + Pro05Checklist.this.result04_05_01 + Pro05Checklist.this.result05_05_01 + Pro05Checklist.this.result06_05_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro05_01_03)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro05_01_09) {
                    Pro05Checklist.this.result03_05_01 = 1;
                } else if (i == R.id.rb_pro05_01_10) {
                    Pro05Checklist.this.result03_05_01 = 2;
                } else if (i == R.id.rb_pro05_01_11) {
                    Pro05Checklist.this.result03_05_01 = 3;
                } else if (i == R.id.rb_pro05_01_12) {
                    Pro05Checklist.this.result03_05_01 = 4;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro05Checklist.this.result01_05_01 + Pro05Checklist.this.result02_05_01 + Pro05Checklist.this.result03_05_01 + Pro05Checklist.this.result04_05_01 + Pro05Checklist.this.result05_05_01 + Pro05Checklist.this.result06_05_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro05_01_04)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro05_01_13) {
                    Pro05Checklist.this.result04_05_01 = 1;
                } else if (i == R.id.rb_pro05_01_14) {
                    Pro05Checklist.this.result04_05_01 = 2;
                } else if (i == R.id.rb_pro05_01_15) {
                    Pro05Checklist.this.result04_05_01 = 3;
                } else if (i == R.id.rb_pro05_01_16) {
                    Pro05Checklist.this.result04_05_01 = 4;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro05Checklist.this.result01_05_01 + Pro05Checklist.this.result02_05_01 + Pro05Checklist.this.result03_05_01 + Pro05Checklist.this.result04_05_01 + Pro05Checklist.this.result05_05_01 + Pro05Checklist.this.result06_05_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro05_01_05)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro05_01_17) {
                    Pro05Checklist.this.result05_05_01 = 1;
                } else if (i == R.id.rb_pro05_01_18) {
                    Pro05Checklist.this.result05_05_01 = 2;
                } else if (i == R.id.rb_pro05_01_19) {
                    Pro05Checklist.this.result05_05_01 = 3;
                } else if (i == R.id.rb_pro05_01_20) {
                    Pro05Checklist.this.result05_05_01 = 4;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro05Checklist.this.result01_05_01 + Pro05Checklist.this.result02_05_01 + Pro05Checklist.this.result03_05_01 + Pro05Checklist.this.result04_05_01 + Pro05Checklist.this.result05_05_01 + Pro05Checklist.this.result06_05_01));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro05_01_06)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro05_01_21) {
                    Pro05Checklist.this.result06_05_01 = 1;
                } else if (i == R.id.rb_pro05_01_22) {
                    Pro05Checklist.this.result06_05_01 = 2;
                } else if (i == R.id.rb_pro05_01_23) {
                    Pro05Checklist.this.result06_05_01 = 3;
                }
                TextView textView = textView1;
                textView.setText("합계 : " + (Pro05Checklist.this.result01_05_01 + Pro05Checklist.this.result02_05_01 + Pro05Checklist.this.result03_05_01 + Pro05Checklist.this.result04_05_01 + Pro05Checklist.this.result05_05_01 + Pro05Checklist.this.result06_05_01));
            }
        });
        RadioButton radioButton24 = (RadioButton) findViewById(R.id.rb_pro05_02_01);
        RadioButton radioButton25 = (RadioButton) findViewById(R.id.rb_pro05_02_02);
        RadioButton radioButton26 = (RadioButton) findViewById(R.id.rb_pro05_02_03);
        RadioButton radioButton27 = (RadioButton) findViewById(R.id.rb_pro05_02_04);
        RadioButton radioButton28 = (RadioButton) findViewById(R.id.rb_pro05_02_05);
        RadioButton radioButton29 = (RadioButton) findViewById(R.id.rb_pro05_02_06);
        RadioButton radioButton30 = (RadioButton) findViewById(R.id.rb_pro05_02_07);
        RadioButton radioButton31 = (RadioButton) findViewById(R.id.rb_pro05_02_08);
        RadioButton radioButton32 = (RadioButton) findViewById(R.id.rb_pro05_02_09);
        RadioButton radioButton33 = (RadioButton) findViewById(R.id.rb_pro05_02_10);
        RadioButton radioButton34 = (RadioButton) findViewById(R.id.rb_pro05_02_11);
        RadioButton radioButton35 = (RadioButton) findViewById(R.id.rb_pro05_02_12);
        RadioButton radioButton36 = (RadioButton) findViewById(R.id.rb_pro05_02_13);
        RadioButton radioButton37 = (RadioButton) findViewById(R.id.rb_pro05_02_14);
        final TextView textView2 = (TextView) findViewById(R.id.pro05_02_sum);
        ((RadioGroup) findViewById(R.id.rg_pro05_02_01)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro05_02_01) {
                    Pro05Checklist.this.result01_05_02 = 0;
                } else if (i == R.id.rb_pro05_02_02) {
                    Pro05Checklist.this.result01_05_02 = 25;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro05Checklist.this.result01_05_02 + Pro05Checklist.this.result02_05_02 + Pro05Checklist.this.result03_05_02 + Pro05Checklist.this.result04_05_02 + Pro05Checklist.this.result05_05_02 + Pro05Checklist.this.result06_05_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro05_02_02)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro05_02_03) {
                    Pro05Checklist.this.result02_05_02 = 0;
                } else if (i == R.id.rb_pro05_02_04) {
                    Pro05Checklist.this.result02_05_02 = 15;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro05Checklist.this.result01_05_02 + Pro05Checklist.this.result02_05_02 + Pro05Checklist.this.result03_05_02 + Pro05Checklist.this.result04_05_02 + Pro05Checklist.this.result05_05_02 + Pro05Checklist.this.result06_05_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro05_02_03)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro05_02_05) {
                    Pro05Checklist.this.result03_05_02 = 0;
                } else if (i == R.id.rb_pro05_02_06) {
                    Pro05Checklist.this.result03_05_02 = 15;
                } else if (i == R.id.rb_pro05_02_07) {
                    Pro05Checklist.this.result03_05_02 = 30;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro05Checklist.this.result01_05_02 + Pro05Checklist.this.result02_05_02 + Pro05Checklist.this.result03_05_02 + Pro05Checklist.this.result04_05_02 + Pro05Checklist.this.result05_05_02 + Pro05Checklist.this.result06_05_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro05_02_04)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro05_02_08) {
                    Pro05Checklist.this.result04_05_02 = 0;
                } else if (i == R.id.rb_pro05_02_09) {
                    Pro05Checklist.this.result04_05_02 = 20;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro05Checklist.this.result01_05_02 + Pro05Checklist.this.result02_05_02 + Pro05Checklist.this.result03_05_02 + Pro05Checklist.this.result04_05_02 + Pro05Checklist.this.result05_05_02 + Pro05Checklist.this.result06_05_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro05_02_05)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro05_02_10) {
                    Pro05Checklist.this.result05_05_02 = 0;
                } else if (i == R.id.rb_pro05_02_11) {
                    Pro05Checklist.this.result05_05_02 = 10;
                } else if (i == R.id.rb_pro05_02_12) {
                    Pro05Checklist.this.result05_05_02 = 20;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro05Checklist.this.result01_05_02 + Pro05Checklist.this.result02_05_02 + Pro05Checklist.this.result03_05_02 + Pro05Checklist.this.result04_05_02 + Pro05Checklist.this.result05_05_02 + Pro05Checklist.this.result06_05_02));
            }
        });
        ((RadioGroup) findViewById(R.id.rg_pro05_02_06)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_pro05_02_13) {
                    Pro05Checklist.this.result06_05_02 = 0;
                } else if (i == R.id.rb_pro05_02_14) {
                    Pro05Checklist.this.result06_05_02 = 15;
                }
                TextView textView = textView2;
                textView.setText("합계 : " + (Pro05Checklist.this.result01_05_02 + Pro05Checklist.this.result02_05_02 + Pro05Checklist.this.result03_05_02 + Pro05Checklist.this.result04_05_02 + Pro05Checklist.this.result05_05_02 + Pro05Checklist.this.result06_05_02));
            }
        });
    }
}