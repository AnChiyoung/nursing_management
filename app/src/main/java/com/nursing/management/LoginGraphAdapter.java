package com.nursing.management;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.view.ViewCompat;

import java.util.ArrayList;

public class LoginGraphAdapter extends BaseAdapter {
    public ArrayList<LoginGraphItem> graphItem = new ArrayList<>();

    public long getItemId(int i) {
        return (long) i;
    }

    public void addItem(String str, String str2, int i, String str3) {
        LoginGraphItem loginGraphItem = new LoginGraphItem();
        loginGraphItem.setId(str);
        loginGraphItem.setName(str2);
        loginGraphItem.setCount(i);
        loginGraphItem.setDate(str3);
        this.graphItem.add(loginGraphItem);
    }

    public int getCount() {
        return this.graphItem.size();
    }

    public Object getItem(int i) {
        return this.graphItem.get(i);
    }

    @SuppressLint("WrongConstant")
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        LoginGraphItem loginGraphItem = this.graphItem.get(i);
        if (view == null) {
            view = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.logingraph_detail, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_rank);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_logingraph_id_name);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_logingraph_last_login_time);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_graph);
        textView.setText((i + 1) + "위");
        textView2.setText(loginGraphItem.getId() + " (" + loginGraphItem.getName() + ")");
        StringBuilder sb = new StringBuilder();
        sb.append("마지막 접속 일자 : ");
        sb.append(loginGraphItem.getLastDate());
        textView3.setText(sb.toString());
        ((TextView) view.findViewById(R.id.tv_graph_count)).setText("  " + loginGraphItem.getCount() + "회");
        if (!(LoginGraphActivity.count.get(0).intValue() == 0 || LoginGraphActivity.count.get(0).intValue() == 0)) {
            textView4.setLayoutParams(new LinearLayout.LayoutParams((LoginGraphActivity.count.get(i).intValue() * 600) / LoginGraphActivity.count.get(0).intValue(), 70));
        }
        if (i == 0) {
            textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            textView3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            textView4.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        return view;
    }

    public void clearAdapter() {
        this.graphItem.clear();
        notifyDataSetChanged();
    }
}
