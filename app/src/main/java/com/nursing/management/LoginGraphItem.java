package com.nursing.management;

public class LoginGraphItem {
    private int count;
    private String id;
    private String lastLoginDate;
    private String name;

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setDate(String str) {
        this.lastLoginDate = str;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }

    public String getLastDate() {
        return this.lastLoginDate;
    }
}
