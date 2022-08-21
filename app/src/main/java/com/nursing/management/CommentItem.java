package com.nursing.management;

public class CommentItem {
    private String comment;
    private String date;
    private String writer;

    public void setComment(String str) {
        this.comment = str;
    }

    public void setWriter(String str) {
        this.writer = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public String getComment() {
        return this.comment;
    }

    public String getWriter() {
        return this.writer;
    }

    public String getDate() {
        return this.date;
    }
}
