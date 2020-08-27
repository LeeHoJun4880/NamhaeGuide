package com.leehojun.namhaeguide;

public class FoodstoreModel {

    private int no;
    private String type;
    private String name;
    private String representative;
    private String address;
    private String tel;
    private String major;
    private String majormenu;

    public FoodstoreModel(int no, String type, String name, String representative, String address, String tel, String major, String majormenu) {
        this.no = no;
        this.type = type;
        this.name = name;
        this.representative = representative;
        this.address = address;
        this.tel = tel;
        this.major = major;
        this.majormenu = majormenu;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajormenu() {
        return majormenu;
    }

    public void setMajormenu(String majormenu) {
        this.majormenu = majormenu;
    }
}
