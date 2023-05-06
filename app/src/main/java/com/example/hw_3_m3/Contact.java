package com.example.hw_3_m3;

public class Contact {

    private int icon;
    private String nameTextView;
    private String nameTextViewTwo;

    public Contact(String title, String subtitle) {
        this.icon = icon;
        this.nameTextView = title;
        this.nameTextViewTwo = subtitle;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getNameTextView() {
        return nameTextView;
    }

    public void setNameTextView(String nameTextView) {
        this.nameTextView = nameTextView;
    }

    public String getNameTextViewTwo() {
        return nameTextViewTwo;
    }

    public void setNameTextViewTwo(String nameTextViewTwo) {
        this.nameTextViewTwo = nameTextViewTwo;
    }
}


