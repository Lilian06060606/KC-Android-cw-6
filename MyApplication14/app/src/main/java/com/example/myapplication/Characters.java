package com.example.myapplication;

public class Characters {
    private String manname;
    private int manage;
    private  int wealth;
    private  int photo;

    public String getManname() {
        return manname;
    }

    public void setManname(String manname) {
        this.manname = manname;
    }

    public int getManage() {
        return manage;
    }

    public void setManage(int manage) {
        this.manage = manage;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public Characters(String manname, int manage, int wealth, int photo) {
        this.manname = manname;
        this.manage = manage;
        this.wealth = wealth;
        this.photo = photo;
    }
}
