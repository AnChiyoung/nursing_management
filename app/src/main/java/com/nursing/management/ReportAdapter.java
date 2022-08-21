package com.nursing.management;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ReportAdapter extends BaseAdapter {
    public ArrayList<ReportItem> reportItem = new ArrayList<>();

    public long getItemId(int i) {
        return (long) i;
    }

    public void addItem(String str, String str2, String str3) {
        ReportItem reportItem2 = new ReportItem();
        reportItem2.setWriter(str);
        reportItem2.setDate(str2);
        reportItem2.setTitle(str3);
        this.reportItem.add(reportItem2);
    }

    public int getCount() {
        return this.reportItem.size();
    }

    public Object getItem(int i) {
        return this.reportItem.get(i);
    }

    @SuppressLint("WrongConstant")
    public View getView(final int i, View view, ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        ReportItem reportItem2 = this.reportItem.get(i);
        if (view == null) {
            view = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.report_detail, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.tv_report_writer)).setText(reportItem2.getWriter());
        ((TextView) view.findViewById(R.id.tv_report_date)).setText(reportItem2.getDate());
        ((TextView) view.findViewById(R.id.tv_report_title)).setText(reportItem2.getTitle());
        Button button = (Button) view.findViewById(R.id.btn_report_delete);
        button.setVisibility(View.GONE);
//        삭제버튼 비활성 20200608 버전
//        if (ManagementActivity.loginId.equals(reportItem2.getWriter())) {
//            button.setVisibility(View.VISIBLE);
//        } else if (ManagementActivity.loginId.equals("sm580228")) {
//            button.setVisibility(View.VISIBLE);
//        } else {
//            button.setVisibility(View.GONE);
//        }
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setCancelable(false);
                builder.setMessage("해당 게시물을 삭제하시겠습니까?");
                builder.setPositiveButton("삭제", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        new ReportActivity();
                        ReportAdapter reportAdapter = ReportAdapter.this;
                        reportAdapter.Delete("DELETE FROM report WHERE idx = " + ReportActivity.report_content_number.get(i));
                        ((ReportActivity) context).recreate();
                    }
                });
                builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.create().show();
            }
        });
        return view;
    }

    public void clearAdapter() {
        this.reportItem.clear();
        notifyDataSetChanged();
    }

    public void Delete(final String str) {
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                new ServerConnect().execQuery((String) null, str);
                return null;
            }
        }.execute(new Void[0]);
    }
}
