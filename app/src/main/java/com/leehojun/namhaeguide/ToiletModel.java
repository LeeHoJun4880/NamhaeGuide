package com.leehojun.namhaeguide;

public class ToiletModel {

    private String type;
    private String name;
    private String address1;
    private String address2;
    private String mantoilet;
    private String manurinal;
    private String mandisabledtoilet;
    private String womantoilet;
    private String womandisabledtoilet;
    private String managementagency;
    private String tel;
    private String openingtime;
    private Double lat;
    private Double lng;

    public ToiletModel(String type, String name, String address1, String address2, String mantoilet, String manurinal, String mandisabledtoilet, String womantoilet, String womandisabledtoilet, String managementagency, String tel, String openingtime, Double lat, Double lng) {
        this.type = type;
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.mantoilet = mantoilet;
        this.manurinal = manurinal;
        this.mandisabledtoilet = mandisabledtoilet;
        this.womantoilet = womantoilet;
        this.womandisabledtoilet = womandisabledtoilet;
        this.managementagency = managementagency;
        this.tel = tel;
        this.openingtime = openingtime;
        this.lat = lat;
        this.lng = lng;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getMantoilet() {
        return mantoilet;
    }

    public void setMantoilet(String mantoilet) {
        this.mantoilet = mantoilet;
    }

    public String getManurinal() {
        return manurinal;
    }

    public void setManurinal(String manurinal) {
        this.manurinal = manurinal;
    }

    public String getMandisabledtoilet() {
        return mandisabledtoilet;
    }

    public void setMandisabledtoilet(String mandisabledtoilet) {
        this.mandisabledtoilet = mandisabledtoilet;
    }

    public String getWomantoilet() {
        return womantoilet;
    }

    public void setWomantoilet(String womantoilet) {
        this.womantoilet = womantoilet;
    }

    public String getWomandisabledtoilet() {
        return womandisabledtoilet;
    }

    public void setWomandisabledtoilet(String womandisabledtoilet) {
        this.womandisabledtoilet = womandisabledtoilet;
    }

    public String getManagementagency() {
        return managementagency;
    }

    public void setManagementagency(String managementagency) {
        this.managementagency = managementagency;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getOpeningtime() {
        return openingtime;
    }

    public void setOpeningtime(String openingtime) {
        this.openingtime = openingtime;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
