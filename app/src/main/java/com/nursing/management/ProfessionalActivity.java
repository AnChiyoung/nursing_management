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

public class ProfessionalActivity extends AppCompatActivity {

    /* access modifiers changed from: private */
    public static boolean btnPush01 = false;
    /* access modifiers changed from: private */
    public static boolean btnPush02 = false;
    /* access modifiers changed from: private */
    public static boolean btnPush03 = false;
    /* access modifiers changed from: private */
    public static boolean btnPush04 = false;
    /* access modifiers changed from: private */
    public static boolean btnPush05 = false;
    Button btn01;
    Button btn02;
    Button btn03;
    Button btn04;
    Button btn05;
    Button btn_checklist_pro01;
    Button btn_checklist_pro02;
    Button btn_checklist_pro03;
    Button btn_checklist_pro05;
    Button btn_content_pro01;
    Button btn_content_pro02;
    Button btn_content_pro03;
    Button btn_content_pro04;
    Button btn_content_pro05;
    Button btn_cycle_pro01;
    Button btn_cycle_pro02;
    Button btn_cycle_pro03;
    Button btn_cycle_pro04;
    Button btn_cycle_pro05;
    Button btn_movie_pro01;
    Button btn_movie_pro02;
    Button btn_movie_pro03;
    Button btn_movie_pro04;
    Button btn_title_pro01;
    Button btn_title_pro02;
    Button btn_title_pro03;
    Button btn_title_pro04;
    Button btn_title_pro05;
    LinearLayout layout_pro01;
    LinearLayout layout_pro02;
    LinearLayout layout_pro03;
    LinearLayout layout_pro04;
    LinearLayout layout_pro05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.professional);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Initialize();
        this.btn01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Animation loadAnimation = AnimationUtils.loadAnimation(ProfessionalActivity.this, R.anim.layout_set);
                SpannableString spannableString = new SpannableString(ProfessionalActivity.this.btn01.getText().toString());
                if (!ProfessionalActivity.btnPush01) {
                    ProfessionalActivity.this.layout_pro01.setVisibility(View.VISIBLE);
                    ProfessionalActivity.this.layout_pro01.setAnimation(loadAnimation);
                    spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                    ProfessionalActivity.this.btn01.setText(spannableString);
                    boolean unused = ProfessionalActivity.btnPush01 = true;
                } else if (ProfessionalActivity.btnPush01) {
                    ProfessionalActivity.this.layout_pro01.setVisibility(View.GONE);
                    ProfessionalActivity.this.btn01.setText("활력징후");
                    boolean unused2 = ProfessionalActivity.btnPush01 = false;
                }
            }
        });
        this.btn02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Animation loadAnimation = AnimationUtils.loadAnimation(ProfessionalActivity.this, R.anim.layout_set);
                SpannableString spannableString = new SpannableString(ProfessionalActivity.this.btn02.getText().toString());
                if (!ProfessionalActivity.btnPush02) {
                    ProfessionalActivity.this.layout_pro02.setVisibility(View.VISIBLE);
                    ProfessionalActivity.this.layout_pro02.setAnimation(loadAnimation);
                    spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                    ProfessionalActivity.this.btn02.setText(spannableString);
                    boolean unused = ProfessionalActivity.btnPush02 = true;
                } else if (ProfessionalActivity.btnPush02) {
                    ProfessionalActivity.this.layout_pro02.setVisibility(View.GONE);
                    ProfessionalActivity.this.btn02.setText("신체계측");
                    boolean unused2 = ProfessionalActivity.btnPush02 = false;
                }
            }
        });
        this.btn03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Animation loadAnimation = AnimationUtils.loadAnimation(ProfessionalActivity.this, R.anim.layout_set);
                SpannableString spannableString = new SpannableString(ProfessionalActivity.this.btn03.getText().toString());
                if (!ProfessionalActivity.btnPush03) {
                    ProfessionalActivity.this.layout_pro03.setVisibility(View.VISIBLE);
                    ProfessionalActivity.this.layout_pro03.setAnimation(loadAnimation);
                    spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                    ProfessionalActivity.this.btn03.setText(spannableString);
                    boolean unused = ProfessionalActivity.btnPush03 = true;
                } else if (ProfessionalActivity.btnPush03) {
                    ProfessionalActivity.this.layout_pro03.setVisibility(View.GONE);
                    ProfessionalActivity.this.btn03.setText("투약간호");
                    boolean unused2 = ProfessionalActivity.btnPush03 = false;
                }
            }
        });
        this.btn04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Animation loadAnimation = AnimationUtils.loadAnimation(ProfessionalActivity.this, R.anim.layout_set);
                SpannableString spannableString = new SpannableString(ProfessionalActivity.this.btn04.getText().toString());
                if (!ProfessionalActivity.btnPush04) {
                    ProfessionalActivity.this.layout_pro04.setVisibility(View.VISIBLE);
                    ProfessionalActivity.this.layout_pro04.setAnimation(loadAnimation);
                    spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                    ProfessionalActivity.this.btn04.setText(spannableString);
                    boolean unused = ProfessionalActivity.btnPush04 = true;
                } else if (ProfessionalActivity.btnPush04) {
                    ProfessionalActivity.this.layout_pro04.setVisibility(View.GONE);
                    ProfessionalActivity.this.btn04.setText("혈당검사");
                    boolean unused2 = ProfessionalActivity.btnPush04 = false;
                }
            }
        });
        this.btn05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Animation loadAnimation = AnimationUtils.loadAnimation(ProfessionalActivity.this, R.anim.layout_set);
                SpannableString spannableString = new SpannableString(ProfessionalActivity.this.btn05.getText().toString());
                if (!ProfessionalActivity.btnPush05) {
                    ProfessionalActivity.this.layout_pro05.setVisibility(View.VISIBLE);
                    ProfessionalActivity.this.layout_pro05.setAnimation(loadAnimation);
                    spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                    ProfessionalActivity.this.btn05.setText(spannableString);
                    boolean unused = ProfessionalActivity.btnPush05 = true;
                } else if (ProfessionalActivity.btnPush05) {
                    ProfessionalActivity.this.layout_pro05.setVisibility(View.GONE);
                    ProfessionalActivity.this.btn05.setText("입원관리");
                    boolean unused2 = ProfessionalActivity.btnPush05 = false;
                }
            }
        });
        this.btn_title_pro01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro01Title.class));
            }
        });
        this.btn_movie_pro01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                @SuppressLint("WrongConstant") View inflate = ((LayoutInflater) ProfessionalActivity.this.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.pro01movie, (ViewGroup) null);
                ((Button) inflate.findViewById(R.id.btn_pro_01_movie_01)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ProfessionalActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/rzQZ095lFvQ")));
                    }
                });
                ((Button) inflate.findViewById(R.id.btn_pro_01_movie_02)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ProfessionalActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/NNKYItbei3w")));
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(ProfessionalActivity.this);
                builder.setCancelable(false);
                builder.setView(inflate);
                builder.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.create().show();
            }
        });
        this.btn_cycle_pro01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro01Cycle.class));
            }
        });
        this.btn_content_pro01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro01Content.class));
            }
        });
        this.btn_checklist_pro01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro01Checklist.class));
            }
        });
        this.btn_title_pro02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro02Title.class));
            }
        });
        this.btn_movie_pro02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                @SuppressLint("WrongConstant") View inflate = ((LayoutInflater) ProfessionalActivity.this.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.pro02movie, (ViewGroup) null);
                ((Button) inflate.findViewById(R.id.btn_pro_02_movie_01)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ProfessionalActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/fNYvp2jR3aI")));
                    }
                });
                ((Button) inflate.findViewById(R.id.btn_pro_02_movie_02)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ProfessionalActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/EWViFbjIv-c")));
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(ProfessionalActivity.this);
                builder.setCancelable(false);
                builder.setView(inflate);
                builder.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.create().show();
            }
        });
        this.btn_cycle_pro02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro02Cycle.class));
            }
        });
        this.btn_content_pro02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro02Content.class));
            }
        });
        this.btn_checklist_pro02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro02Checklist.class));
            }
        });
        this.btn_title_pro03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro03Title.class));
            }
        });
        this.btn_movie_pro03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                @SuppressLint("WrongConstant") View inflate = ((LayoutInflater) ProfessionalActivity.this.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.pro03movie, (ViewGroup) null);
                ((Button) inflate.findViewById(R.id.btn_pro_03_movie_01)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ProfessionalActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/XIbBeR4oR7E")));
                    }
                });
                ((Button) inflate.findViewById(R.id.btn_pro_03_movie_02)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ProfessionalActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/ctLXmpfxSww")));
                    }
                });
                ((Button) inflate.findViewById(R.id.btn_pro_03_movie_03)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ProfessionalActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/4j96HRsunb8")));
                    }
                });
                ((Button) inflate.findViewById(R.id.btn_pro_03_movie_04)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ProfessionalActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/mPgd08X5rnk")));
                    }
                });
                ((Button) inflate.findViewById(R.id.btn_pro_03_movie_05)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ProfessionalActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/blZFjOxMKEI")));
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(ProfessionalActivity.this);
                builder.setCancelable(false);
                builder.setView(inflate);
                builder.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.create().show();
            }
        });
        this.btn_cycle_pro03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro03Cycle.class));
            }
        });
        this.btn_content_pro03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro03Content.class));
            }
        });
        this.btn_checklist_pro03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro03Checklist.class));
            }
        });
        this.btn_title_pro04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro04Title.class));
            }
        });
        this.btn_movie_pro04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                @SuppressLint("WrongConstant") View inflate = ((LayoutInflater) ProfessionalActivity.this.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.pro04movie, (ViewGroup) null);
                ((Button) inflate.findViewById(R.id.btn_pro_04_movie_01)).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ProfessionalActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/EX3ZAgC7MM0")));
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(ProfessionalActivity.this);
                builder.setCancelable(false);
                builder.setView(inflate);
                builder.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.create().show();
            }
        });
        this.btn_cycle_pro04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro04Cycle.class));
            }
        });
        this.btn_content_pro04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro04Content.class));
            }
        });
        this.btn_title_pro05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro05Title.class));
            }
        });
        this.btn_cycle_pro05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro05Cycle.class));
            }
        });
        this.btn_content_pro05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro05Content.class));
            }
        });
        this.btn_checklist_pro05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ProfessionalActivity professionalActivity = ProfessionalActivity.this;
                professionalActivity.startActivity(new Intent(professionalActivity, Pro05Checklist.class));
            }
        });
    }

    private void Initialize() {
        this.btn01 = (Button) findViewById(R.id.btn_pro01);
        this.btn02 = (Button) findViewById(R.id.btn_pro02);
        this.btn03 = (Button) findViewById(R.id.btn_pro03);
        this.btn04 = (Button) findViewById(R.id.btn_pro04);
        this.btn05 = (Button) findViewById(R.id.btn_pro05);
        this.layout_pro01 = (LinearLayout) findViewById(R.id.layout_pro01);
        this.layout_pro02 = (LinearLayout) findViewById(R.id.layout_pro02);
        this.layout_pro03 = (LinearLayout) findViewById(R.id.layout_pro03);
        this.layout_pro04 = (LinearLayout) findViewById(R.id.layout_pro04);
        this.layout_pro05 = (LinearLayout) findViewById(R.id.layout_pro05);
        this.btn_title_pro01 = (Button) findViewById(R.id.btn_title_pro01);
        this.btn_movie_pro01 = (Button) findViewById(R.id.btn_movie_pro01);
        this.btn_cycle_pro01 = (Button) findViewById(R.id.btn_cycle_pro01);
        this.btn_content_pro01 = (Button) findViewById(R.id.btn_content_pro01);
        this.btn_checklist_pro01 = (Button) findViewById(R.id.btn_checklist_pro01);
        this.btn_title_pro02 = (Button) findViewById(R.id.btn_title_pro02);
        this.btn_movie_pro02 = (Button) findViewById(R.id.btn_movie_pro02);
        this.btn_cycle_pro02 = (Button) findViewById(R.id.btn_cycle_pro02);
        this.btn_content_pro02 = (Button) findViewById(R.id.btn_content_pro02);
        this.btn_checklist_pro02 = (Button) findViewById(R.id.btn_checklist_pro02);
        this.btn_title_pro03 = (Button) findViewById(R.id.btn_title_pro03);
        this.btn_movie_pro03 = (Button) findViewById(R.id.btn_movie_pro03);
        this.btn_cycle_pro03 = (Button) findViewById(R.id.btn_cycle_pro03);
        this.btn_content_pro03 = (Button) findViewById(R.id.btn_content_pro03);
        this.btn_checklist_pro03 = (Button) findViewById(R.id.btn_checklist_pro03);
        this.btn_title_pro04 = (Button) findViewById(R.id.btn_title_pro04);
        this.btn_movie_pro04 = (Button) findViewById(R.id.btn_movie_pro04);
        this.btn_cycle_pro04 = (Button) findViewById(R.id.btn_cycle_pro04);
        this.btn_content_pro04 = (Button) findViewById(R.id.btn_content_pro04);
        this.btn_title_pro05 = (Button) findViewById(R.id.btn_title_pro05);
        this.btn_cycle_pro05 = (Button) findViewById(R.id.btn_cycle_pro05);
        this.btn_content_pro05 = (Button) findViewById(R.id.btn_content_pro05);
        this.btn_checklist_pro05 = (Button) findViewById(R.id.btn_checklist_pro05);
    }
}