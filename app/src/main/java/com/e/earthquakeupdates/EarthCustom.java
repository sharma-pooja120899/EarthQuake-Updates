package com.e.earthquakeupdates;

public class EarthCustom {

    private String magnitude;
    private String location;
    private String place;
    private String date;
    private String time;
    private String url;

    public EarthCustom(String magnitude,String location,String date,String time,String place,String url) {
        this.magnitude=magnitude;
        this.location=location;
        this.date=date;
        this.time=time;
        this.place=place;
        this.url=url;
    }

    public String getDate() {
        return date;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }
    public String getTime(){
        return time;
    }
    public String getPlace(){
        return place;
    }
    public String getUrl(){
        return url;
    }
}
