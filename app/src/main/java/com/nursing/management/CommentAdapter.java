package com.nursing.management;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CommentAdapter extends BaseAdapter {
    public ArrayList<CommentItem> commentItem = new ArrayList<>();

    public long getItemId(int i) {
        return (long) i;
    }

    public void addItem(String str, String str2, String str3) {
        CommentItem commentItem2 = new CommentItem();
        commentItem2.setWriter(str);
        commentItem2.setDate(str2);
        commentItem2.setComment(str3);
        this.commentItem.add(commentItem2);
    }

    public int getCount() {
        return this.commentItem.size();
    }

    public Object getItem(int i) {
        return this.commentItem.get(i);
    }

    @SuppressLint("WrongConstant")
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        CommentItem commentItem2 = this.commentItem.get(i);
        if (view == null) {
            view = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.comment_detail, viewGroup, false);
        }
        ((TextView) view.findViewById(R.id.tv_comment_writer)).setText(commentItem2.getWriter());
        ((TextView) view.findViewById(R.id.tv_comment_date)).setText(commentItem2.getDate());
        ((TextView) view.findViewById(R.id.tv_comment_comment)).setText(commentItem2.getComment());
        return view;
    }

    public void clearAdapter() {
        this.commentItem.clear();
        notifyDataSetChanged();
    }
}
