package com.nursing.management;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.Locale;

public class ReportActivity extends AppCompatActivity {

    public static String LOG = null;
    public static String pushString = "";
    public static ArrayList<Integer> report_content_number = new ArrayList<>();
    Button btn_info;
    Button btn_voice_recog;
    Button btn_write;
    public ArrayList<String> content = new ArrayList<>();
    public ArrayList<String> date = new ArrayList<>();
    EditText et_report_write_content;
    EditText et_report_write_title;
    public static boolean singleResult;
    /* access modifiers changed from: private */
    public RecognitionListener listener = new RecognitionListener() {
        public void onBeginningOfSpeech() {
        }

        public void onBufferReceived(byte[] bArr) {
        }

        public void onEndOfSpeech() {
        }

        public void onError(int i) {
        }

        public void onEvent(int i, Bundle bundle) {
        }

        public void onPartialResults(Bundle bundle) {
        }

        public void onRmsChanged(float f) {
        }

        public void onReadyForSpeech(Bundle bundle) {
            Toast.makeText(ReportActivity.this.getApplicationContext(), "마이크가 활성화 되었습니다.", Toast.LENGTH_LONG).show();
        }

        public void onResults(Bundle bundle) {
            Log.d("what", String.valueOf(singleResult));
            Log.d("whatis", pushString);
            if(singleResult) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
                String[] strArr = new String[stringArrayList.size()];
                stringArrayList.toArray(strArr);
                pushString += "\n" + strArr[0] + ".";
                //.replaceAll(" ", "");
                ReportActivity.this.et_report_write_content.setText(pushString);
                singleResult = false;
            }
        }
    };
    ListView lv_report;
    SpeechRecognizer mRecognizer;
    ReportAdapter reportAdapter;
    Intent speechIntent;
    public ArrayList<String> title = new ArrayList<>();
    TextView tv_report_content_content;
    TextView tv_report_content_date;
    TextView tv_report_content_title;
    TextView tv_report_content_writer;
    TextView tv_report_write_date;
    TextView tv_report_write_writer;
    public ArrayList<String> writer = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.report);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Initialize();
        if (ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0) {
            Toast.makeText(getApplicationContext(), "마이크 권한이 허용되어 있습니다", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "마이크 권한이 허용되어 있지 않습니다", Toast.LENGTH_LONG).show();
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
        }
        this.btn_write.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            public void onClick(View view) {
                @SuppressLint("WrongConstant") View inflate = ((LayoutInflater) ReportActivity.this.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.report_write, (ViewGroup) null);
                ReportActivity.this.tv_report_write_writer = (TextView) inflate.findViewById(R.id.tv_report_write_writer);
                ReportActivity.this.tv_report_write_date = (TextView) inflate.findViewById(R.id.tv_report_write_date);
                ReportActivity.this.et_report_write_title = (EditText) inflate.findViewById(R.id.et_report_write_title);
                ReportActivity.this.et_report_write_content = (EditText) inflate.findViewById(R.id.et_report_write_content);
                ReportActivity.this.tv_report_write_writer.setText(ManagementActivity.loginId);
                ReportActivity.this.tv_report_write_date.setText(ReportActivity.this.DateGet());
                ReportActivity.this.btn_voice_recog = (Button) inflate.findViewById(R.id.btn_voice_recog);
                ReportActivity.this.speechIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                ReportActivity.this.speechIntent.putExtra("calling_package", ReportActivity.this.getPackageName());
                ReportActivity.this.speechIntent.putExtra("android.speech.extra.LANGUAGE", "ko-KR");
                ReportActivity.this.btn_voice_recog.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ReportActivity.this.mRecognizer.startListening(ReportActivity.this.speechIntent);
                        singleResult = true;
                    }
                });
                ReportActivity reportActivity = ReportActivity.this;
                reportActivity.mRecognizer = SpeechRecognizer.createSpeechRecognizer(reportActivity);
                ReportActivity.this.mRecognizer.setRecognitionListener(ReportActivity.this.listener);
                AlertDialog.Builder builder = new AlertDialog.Builder(ReportActivity.this);
                builder.setCancelable(false);
                builder.setView(inflate);
                builder.setPositiveButton("등록", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ReportActivity.pushString = "";
                    }
                });
                final AlertDialog create = builder.create();
                create.show();
                create.getButton(-1).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Boolean bool = false;
                        if (ReportActivity.this.et_report_write_title.getText().toString().equals("") || ReportActivity.this.et_report_write_content.getText().toString().equals("")) {
                            Toast.makeText(ReportActivity.this.getApplicationContext(), "제목 혹은 내용이 비어있습니다", Toast.LENGTH_SHORT).show();
                        } else {
                            if (ManagementActivity.loginId.equals("sm580228")) {
                                ReportActivity reportActivity = ReportActivity.this;
                                reportActivity.Insert("INSERT INTO report (report_writer, report_date, report_title, report_content) VALUES ('관리자', '" + ReportActivity.this.DateGet() + "', '" + ReportActivity.this.et_report_write_title.getText().toString() + "', '" + ReportActivity.this.et_report_write_content.getText().toString() + "')");
                            } else {
                                ReportActivity reportActivity2 = ReportActivity.this;
                                reportActivity2.Insert("INSERT INTO report (report_writer, report_date, report_title, report_content) VALUES ('" + ManagementActivity.loginId + "', '" + ReportActivity.this.DateGet() + "', '" + ReportActivity.this.et_report_write_title.getText().toString() + "', '" + ReportActivity.this.et_report_write_content.getText().toString() + "')");
                            }
                            bool = true;
                        }
                        if (bool.booleanValue()) {
                            create.dismiss();
                        }
                    }
                });
            }
        });
        this.btn_info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                @SuppressLint("WrongConstant") View inflate = ((LayoutInflater) ReportActivity.this.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.report_info, (ViewGroup) null);
                AlertDialog.Builder builder = new AlertDialog.Builder(ReportActivity.this);
                builder.setCancelable(false);
                builder.setView(inflate);
                builder.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.create().show();
            }
        });
        this.lv_report.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                @SuppressLint("WrongConstant") View inflate = ((LayoutInflater) ReportActivity.this.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.report_content, (ViewGroup) null);
                ReportActivity.this.tv_report_content_writer = (TextView) inflate.findViewById(R.id.tv_report_content_writer);
                ReportActivity.this.tv_report_content_date = (TextView) inflate.findViewById(R.id.tv_report_content_date);
                ReportActivity.this.tv_report_content_title = (TextView) inflate.findViewById(R.id.tv_report_content_title);
                ReportActivity.this.tv_report_content_content = (TextView) inflate.findViewById(R.id.tv_report_content_content);
                ReportActivity.this.tv_report_content_writer.setText(ReportActivity.this.writer.get(i));
                ReportActivity.this.tv_report_content_date.setText(ReportActivity.this.date.get(i));
                ReportActivity.this.tv_report_content_title.setText(ReportActivity.this.title.get(i));
                ReportActivity.this.tv_report_content_content.setText(ReportActivity.this.content.get(i));
                AlertDialog.Builder builder = new AlertDialog.Builder(ReportActivity.this);
                builder.setCancelable(false);
                builder.setView(inflate);
                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.create().show();
                return false;
            }
        });
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1) {
            return;
        }
        if (iArr.length > 0) {
            iArr[0] = 0;
            Toast.makeText(getApplicationContext(), "마이크 녹음 권한을 사용자가 허용함", Toast.LENGTH_LONG).show();
            return;
        }
        Toast.makeText(getApplicationContext(), "마이크 녹음 권한을 사용자가 허용하지 않음", Toast.LENGTH_LONG).show();
    }

    private void Initialize() {
        this.lv_report = (ListView) findViewById(R.id.lv_report);
        this.reportAdapter = new ReportAdapter();
        this.btn_write = (Button) findViewById(R.id.btn_report_write);
        this.btn_info = (Button) findViewById(R.id.btn_report_information);
        Load();
    }

    /* access modifiers changed from: private */
    @RequiresApi(api = Build.VERSION_CODES.N)
    public String DateGet() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(Calendar.getInstance().getTime());
    }

    /* access modifiers changed from: private */
    public void Load() {
        new AsyncTask<Void, Void, Void>() {
            ProgressDialog progressDialog = new ProgressDialog(ReportActivity.this);

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                ReportActivity.this.reportAdapter.clearAdapter();
                ReportActivity.report_content_number.clear();
                ReportActivity.this.writer.clear();
                ReportActivity.this.date.clear();
                ReportActivity.this.title.clear();
                ReportActivity.this.content.clear();
                this.progressDialog.setProgressStyle(0);
                this.progressDialog.setMessage("인계장 리스트를 불러오는 중입니다");
                this.progressDialog.setCancelable(false);
                this.progressDialog.show();
            }

            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                JSONArray execQuery = new ServerConnect().execQuery((String) null, "SELECT * FROM report ORDER BY report_date DESC");
                try {
                    Thread.sleep(500);
                    if (!execQuery.toString().equals("[777]")) {
                        if (!execQuery.toString().equals("[444]")) {
                            for (int i = 0; i < execQuery.length(); i++) {
                                ReportActivity.report_content_number.add(Integer.valueOf(execQuery.getJSONObject(i).getInt("idx")));
                                ReportActivity.this.writer.add(execQuery.getJSONObject(i).getString("report_writer"));
                                ReportActivity.this.date.add(execQuery.getJSONObject(i).getString("report_date"));
                                ReportActivity.this.title.add(execQuery.getJSONObject(i).getString("report_title"));
                                ReportActivity.this.content.add(execQuery.getJSONObject(i).getString("report_content"));
                            }
                            ReportActivity.LOG = "에러아님";
                            return null;
                        }
                    }
                    ReportActivity.LOG = "에러";
                } catch (InterruptedException | JSONException unused) {
                }
                return null;
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(Void voidR) {
                this.progressDialog.dismiss();
                for (int i = 0; i < ReportActivity.this.writer.size(); i++) {
                    ReportActivity.this.reportAdapter.addItem(ReportActivity.this.writer.get(i), ReportActivity.this.date.get(i), ReportActivity.this.title.get(i));
                }
                ReportActivity.this.lv_report.setAdapter(ReportActivity.this.reportAdapter);
            }
        }.execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    public void Insert(final String str) {
        new AsyncTask<Void, Void, Void>() {
            ProgressDialog progressDialog = new ProgressDialog(ReportActivity.this);

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                this.progressDialog.setProgressStyle(0);
                this.progressDialog.setMessage("글을 등록하는 중입니다");
                this.progressDialog.setCancelable(false);
                this.progressDialog.show();
            }

            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                new ServerConnect().execQuery((String) null, str);
                return null;
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(Void voidR) {
                this.progressDialog.dismiss();
                ReportActivity.this.Load();
            }
        }.execute();
    }
}