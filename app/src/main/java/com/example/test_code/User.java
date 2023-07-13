package com.example.test_code;

public class User {
    int src;
    String text;

    public User(int src, String text) {
        this.src = src;
        this.text = text;
    }

    public User() {
    }

    public int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
