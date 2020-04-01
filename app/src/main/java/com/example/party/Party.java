package com.example.party;

public class Party {
    private int img;
    private String name;
    private String date;
    private String rad;
    private String time;
    private String address;
    private String desc;

    public Party(int img, String name, String date, String rad, String time, String address, String desc) {
        this.img = img;
        this.name = name;
        this.date = date;
        this.rad = rad;
        this.time = time;
        this.address = address;
        this.desc = desc;
    }


    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return this.date;
    }

    public String getAddress() {
        return address;
    }

    public String getRad() {
        return rad;
    }

    public String getTime() {
        return time;
    }

    public String getDesc() {
        return desc;
    }
}
