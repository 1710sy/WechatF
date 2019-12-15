package com.example.wechatf;

import java.text.SimpleDateFormat;

public class People {
    private String name;
    private int imageID;
    private String time;
    public People(String name,int imageID,String time){
        this.name=name;
        this.imageID=imageID;
        this.time=time;
    }
    public String getName() {return name;}
    public int getImageID() {return imageID;}
    public String getTime() {return time;}
}
