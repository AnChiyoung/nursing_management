package com.nursing.management;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.Locale;

public class CommunicationActivity extends AppCompatActivity {

    public static String LOG;
    public static ArrayList<Integer> content_number = new ArrayList<>();
    Button btn_comment_regedit;
    Button btn_info;
    Button btn_write;
    public ArrayList<String> comment = new ArrayList<>();
    CommentAdapter commentAdapter;
    public ArrayList<String> comment_date = new ArrayList<>();
    public ArrayList<String> comment_writer = new ArrayList<>();
    CommunicationAdapter communicationAdapter;
    public ArrayList<String> content = new ArrayList<>();
    public ArrayList<String> date = new ArrayList<>();
    EditText et_comment;
    EditText et_communication_write_content;
    EditText et_communication_write_title;
    ListView lv_comment;
    ListView lv_communication;
    public ArrayList<String> title = new ArrayList<>();
    TextView tv_communication_content_comment_count;
    TextView tv_communication_content_content;
    TextView tv_communication_content_date;
    TextView tv_communication_content_title;
    TextView tv_communication_content_writer;
    TextView tv_communication_write_date;
    TextView tv_communication_write_writer;
    public ArrayList<String> writer = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.communication);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Initialize();
        this.btn_write.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            public void onClick(View view) {
                @SuppressLint("WrongConstant") View inflate = ((LayoutInflater) CommunicationActivity.this.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.communication_write, (ViewGroup) null);
                CommunicationActivity.this.tv_communication_write_writer = (TextView) inflate.findViewById(R.id.tv_communication_write_writer);
                CommunicationActivity.this.tv_communication_write_date = (TextView) inflate.findViewById(R.id.tv_communication_write_date);
                CommunicationActivity.this.et_communication_write_title = (EditText) inflate.findViewById(R.id.et_communication_write_title);
                CommunicationActivity.this.et_communication_write_content = (EditText) inflate.findViewById(R.id.et_communication_write_content);
                CommunicationActivity.this.tv_communication_write_writer.setText(ManagementActivity.loginId);
                CommunicationActivity.this.tv_communication_write_date.setText(CommunicationActivity.this.DateGet());
                AlertDialog.Builder builder = new AlertDialog.Builder(CommunicationActivity.this);
                builder.setCancelable(false);
                builder.setView(inflate);
                builder.setPositiveButton("등록", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                final AlertDialog create = builder.create();
                create.show();
                create.getButton(-1).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        Boolean bool = false;
                        if (CommunicationActivity.this.et_communication_write_title.getText().toString().equals("") || CommunicationActivity.this.et_communication_write_content.getText().toString().equals("")) {
                            Toast.makeText(CommunicationActivity.this.getApplicationContext(), "제목 혹은 내용이 비어있습니다", Toast.LENGTH_SHORT).show();
                        } else {
                            if (ManagementActivity.loginId.equals("sm580228")) {
                                CommunicationActivity communicationActivity = CommunicationActivity.this;
                                communicationActivity.Insert("INSERT INTO communication (writer, date, title, content) VALUES ('관리자', '" + CommunicationActivity.this.DateGet() + "', '" + CommunicationActivity.this.et_communication_write_title.getText().toString() + "', '" + CommunicationActivity.this.et_communication_write_content.getText().toString() + "')");
                            } else {
                                CommunicationActivity communicationActivity2 = CommunicationActivity.this;
                                communicationActivity2.Insert("INSERT INTO communication (writer, date, title, content) VALUES ('" + ManagementActivity.loginId + "', '" + CommunicationActivity.this.DateGet() + "', '" + CommunicationActivity.this.et_communication_write_title.getText().toString() + "', '" + CommunicationActivity.this.et_communication_write_content.getText().toString() + "')");
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
                @SuppressLint("WrongConstant") View inflate = ((LayoutInflater) CommunicationActivity.this.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.communication_info, (ViewGroup) null);
                AlertDialog.Builder builder = new AlertDialog.Builder(CommunicationActivity.this);
                builder.setCancelable(false);
                builder.setView(inflate);
                builder.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.create().show();
            }
        });
        this.lv_communication.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int i, long j) {
                @SuppressLint("WrongConstant") View inflate = ((LayoutInflater) CommunicationActivity.this.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.communication_content, (ViewGroup) null);
                CommunicationActivity.this.tv_communication_content_writer = (TextView) inflate.findViewById(R.id.tv_communication_content_writer);
                CommunicationActivity.this.tv_communication_content_date = (TextView) inflate.findViewById(R.id.tv_communication_content_date);
                CommunicationActivity.this.tv_communication_content_title = (TextView) inflate.findViewById(R.id.tv_communication_content_title);
                CommunicationActivity.this.tv_communication_content_content = (TextView) inflate.findViewById(R.id.tv_communication_content_content);
                CommunicationActivity.this.tv_communication_content_comment_count = (TextView) inflate.findViewById(R.id.tv_communication_comment_count);
                CommunicationActivity.this.tv_communication_content_writer.setText(CommunicationActivity.this.writer.get(i));
                CommunicationActivity.this.tv_communication_content_date.setText(CommunicationActivity.this.date.get(i));
                CommunicationActivity.this.tv_communication_content_title.setText(CommunicationActivity.this.title.get(i));
                CommunicationActivity.this.tv_communication_content_content.setText(CommunicationActivity.this.content.get(i));
                CommunicationActivity.this.et_comment = (EditText) inflate.findViewById(R.id.et_communication_content_comment);
                CommunicationActivity.this.lv_comment = (ListView) inflate.findViewById(R.id.lv_comment);
                CommunicationActivity.this.CommentLoad(i);
                CommunicationActivity.this.btn_comment_regedit = (Button) inflate.findViewById(R.id.btn_communication_comment_regedit);
                CommunicationActivity.this.btn_comment_regedit.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.N)
                    public void onClick(View view) {
                        if (CommunicationActivity.this.et_comment.getText().toString().equals("")) {
                            Toast.makeText(CommunicationActivity.this.getApplicationContext(), "내용을 입력하신 후 등록해주세요", Toast.LENGTH_SHORT).show();
                        } else if (ManagementActivity.loginId.equals("sm580228")) {
                            CommunicationActivity communicationActivity = CommunicationActivity.this;
                            communicationActivity.Insert("INSERT INTO comment (content_number, comment_writer, comment_date, comment) VALUES ('" + CommunicationActivity.content_number.get(i) + "', '관리자', '" + CommunicationActivity.this.DateGet() + "', '" + CommunicationActivity.this.et_comment.getText().toString() + "')");
                            CommunicationActivity.this.CommentLoad(i);
                        } else {
                            CommunicationActivity communicationActivity2 = CommunicationActivity.this;
                            communicationActivity2.Insert("INSERT INTO comment (content_number, comment_writer, comment_date, comment) VALUES ('" + CommunicationActivity.content_number.get(i) + "', '" + ManagementActivity.loginId + "', '" + CommunicationActivity.this.DateGet() + "', '" + CommunicationActivity.this.et_comment.getText().toString() + "')");
                            CommunicationActivity.this.CommentLoad(i);
                        }
                    }
                });
                AlertDialog.Builder builder = new AlertDialog.Builder(CommunicationActivity.this);
                builder.setCancelable(false);
                builder.setView(inflate);
                builder.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.create().show();
                return false;
            }
        });
    }

    private void Initialize() {
        this.lv_communication = (ListView) findViewById(R.id.lv_communication);
        this.communicationAdapter = new CommunicationAdapter();
        this.commentAdapter = new CommentAdapter();
        Load();
        this.btn_write = (Button) findViewById(R.id.btn_write);
        this.btn_info = (Button) findViewById(R.id.btn_communication_information);
    }

    /* access modifiers changed from: private */
    @RequiresApi(api = Build.VERSION_CODES.N)
    public String DateGet() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(Calendar.getInstance().getTime());
    }

    /* access modifiers changed from: private */
    public void CommentLoad(final int i) {
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            public void onPreExecute() {
                CommunicationActivity.this.commentAdapter.clearAdapter();
                CommunicationActivity.this.comment_writer.clear();
                CommunicationActivity.this.comment_date.clear();
                CommunicationActivity.this.comment.clear();
            }

            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                ServerConnect serverConnect = new ServerConnect();
                JSONArray execQuery = serverConnect.execQuery((String) null, "SELECT * FROM comment WHERE content_number = '" + CommunicationActivity.content_number.get(i) + "' ORDER BY comment_date DESC");
                try {
                    Thread.sleep(500);
                    if (!execQuery.toString().equals("[777]")) {
                        if (!execQuery.toString().equals("[444]")) {
                            for (int i = 0; i < execQuery.length(); i++) {
                                CommunicationActivity.this.comment_writer.add(execQuery.getJSONObject(i).getString("comment_writer"));
                                CommunicationActivity.this.comment_date.add(execQuery.getJSONObject(i).getString("comment_date"));
                                CommunicationActivity.this.comment.add(execQuery.getJSONObject(i).getString("comment"));
                            }
                            CommunicationActivity.LOG = "에러아님";
                            return null;
                        }
                    }
                    CommunicationActivity.LOG = "에러";
                } catch (InterruptedException | JSONException unused) {
                }
                return null;
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(Void voidR) {
                for (int i = 0; i < CommunicationActivity.this.comment_writer.size(); i++) {
                    CommunicationActivity.this.commentAdapter.addItem(CommunicationActivity.this.comment_writer.get(i), CommunicationActivity.this.comment_date.get(i), CommunicationActivity.this.comment.get(i));
                }
                CommunicationActivity.this.lv_comment.setAdapter(CommunicationActivity.this.commentAdapter);
                CommunicationActivity.this.tv_communication_content_comment_count.setText(String.valueOf(CommunicationActivity.this.comment_writer.size()));
            }
        }.execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    public void Load() {
        new AsyncTask<Void, Void, Void>() {
            ProgressDialog progressDialog = new ProgressDialog(CommunicationActivity.this);

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                CommunicationActivity.this.communicationAdapter.clearAdapter();
                CommunicationActivity.this.content_number.clear();
                CommunicationActivity.this.writer.clear();
                CommunicationActivity.this.date.clear();
                CommunicationActivity.this.title.clear();
                CommunicationActivity.this.content.clear();
                this.progressDialog.setProgressStyle(0);
                this.progressDialog.setMessage("글을 불러오는 중입니다");
                this.progressDialog.setCancelable(false);
                this.progressDialog.show();
            }

            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                JSONArray execQuery = new ServerConnect().execQuery((String) null, "SELECT * FROM communication ORDER BY date DESC");
                try {
                    Thread.sleep(500);
                    if (!execQuery.toString().equals("[777]")) {
                        if (!execQuery.toString().equals("[444]")) {
                            for (int i = 0; i < execQuery.length(); i++) {
                                CommunicationActivity.this.content_number.add(Integer.valueOf(execQuery.getJSONObject(i).getInt("idx")));
                                CommunicationActivity.this.writer.add(execQuery.getJSONObject(i).getString("writer"));
                                CommunicationActivity.this.date.add(execQuery.getJSONObject(i).getString("date"));
                                CommunicationActivity.this.title.add(execQuery.getJSONObject(i).getString("title"));
                                CommunicationActivity.this.content.add(execQuery.getJSONObject(i).getString("content"));
                            }
                            CommunicationActivity.LOG = "에러아님";
                            return null;
                        }
                    }
                    CommunicationActivity.LOG = "에러";
                } catch (InterruptedException | JSONException unused) {
                }
                return null;
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(Void voidR) {
                this.progressDialog.dismiss();
                for (int i = 0; i < CommunicationActivity.this.writer.size(); i++) {
                    CommunicationActivity.this.communicationAdapter.addItem(CommunicationActivity.this.writer.get(i), CommunicationActivity.this.date.get(i), CommunicationActivity.this.title.get(i));
                }
                CommunicationActivity.this.lv_communication.setAdapter((ListAdapter) CommunicationActivity.this.communicationAdapter);
            }
        }.execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    public void Insert(final String str) {
        new AsyncTask<Void, Void, Void>() {
            ProgressDialog progressDialog = new ProgressDialog(CommunicationActivity.this);

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
                CommunicationActivity.this.Load();
            }
        }.execute(new Void[0]);
    }
}