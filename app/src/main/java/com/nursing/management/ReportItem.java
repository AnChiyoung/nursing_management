package com.nursing.management;

public class ReportItem {
    private String content;
    private String date;
    private String title;
    private String writer;

    public void setWriter(String str) {
        this.writer = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getWriter() {
        return this.writer;
    }

    public String getDate() {
        return this.date;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }
}
