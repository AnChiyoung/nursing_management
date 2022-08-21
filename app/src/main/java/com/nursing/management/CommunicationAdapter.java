package com.nursing.management;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class CommunicationAdapter extends BaseAdapter {
    public ArrayList<CommunicationItem> communicationItem = new ArrayList<>();

    public long getItemId(int i) {
        return (long) i;
    }

    public void addItem(String str, String str2, String str3) {
        CommunicationItem communicationItem2 = new CommunicationItem();
        communicationItem2.setWriter(str);
        communicationItem2.setDate(str2);
        communicationItem2.setTitle(str3);
        this.communicationItem.add(communicationItem2);
    }

    public int getCount() {
        return this.communicationItem.size();
    }

    public Object getItem(int i) {
        return this.communicationItem.get(i);
    }

    @SuppressLint("WrongConstant")
    public View getView(final int i, View view, ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        CommunicationItem communicationItem2 = this.communicationItem.get(i);
        if (view == null) {
            view = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.communication_detail, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.tv_communication_writer)).setText(communicationItem2.getWriter());
        ((TextView) view.findViewById(R.id.tv_communication_date)).setText(communicationItem2.getDate());
        ((TextView) view.findViewById(R.id.tv_communication_title)).setText(communicationItem2.getTitle());
        Button button = (Button) view.findViewById(R.id.btn_communication_delete);
        button.setVisibility(View.GONE);
//        삭제버튼 비활성 20200608 버전
//        if (ManagementActivity.loginId.equals(communicationItem2.getWriter())) {
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
                        Log.d("iis", String.valueOf(i));
                        new CommunicationActivity();
                        CommunicationAdapter communicationAdapter = CommunicationAdapter.this;
                        communicationAdapter.Delete("DELETE FROM communication WHERE idx = " + CommunicationActivity.content_number.get(i + 1));
                        ((CommunicationActivity) context).recreate();
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
        this.communicationItem.clear();
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
