package com.nursing.management;

public class CommunicationItem {
    private String date;
    private String title;
    private String writer;

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWriter(String str) {
        this.writer = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public String getTitle() {
        return this.title;
    }

    public String getWriter() {
        return this.writer;
    }

    public String getDate() {
        return this.date;
    }
}
