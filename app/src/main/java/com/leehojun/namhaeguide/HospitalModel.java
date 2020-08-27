package com.leehojun.namhaeguide;

public class HospitalModel {

    private int no;
    private String hospital_name;
    private String hospital_address;
    private String hospital_tel;
    private String hospital_weekday_starttime;
    private String hospital_weekday_endtime;
    private String hospital_saturday_starttime;
    private String getHospital_saturday_endtime;
    private String hospital_holiday_starttime;
    private String getHospital_holiday_endtime;
    private String hospital_remark;

    public HospitalModel(int no, String hospital_name, String hospital_address, String hospital_tel, String hospital_weekday_starttime, String hospital_weekday_endtime, String hospital_saturday_starttime, String getHospital_saturday_endtime, String hospital_holiday_starttime, String getHospital_holiday_endtime, String hospital_remark) {
        this.no = no;
        this.hospital_name = hospital_name;
        this.hospital_address = hospital_address;
        this.hospital_tel = hospital_tel;
        this.hospital_weekday_starttime = hospital_weekday_starttime;
        this.hospital_weekday_endtime = hospital_weekday_endtime;
        this.hospital_saturday_starttime = hospital_saturday_starttime;
        this.getHospital_saturday_endtime = getHospital_saturday_endtime;
        this.hospital_holiday_starttime = hospital_holiday_starttime;
        this.getHospital_holiday_endtime = getHospital_holiday_endtime;
        this.hospital_remark = hospital_remark;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getHospital_address() {
        return hospital_address;
    }

    public void setHospital_address(String hospital_address) {
        this.hospital_address = hospital_address;
    }

    public String getHospital_tel() {
        return hospital_tel;
    }

    public void setHospital_tel(String hospital_tel) {
        this.hospital_tel = hospital_tel;
    }

    public String getHospital_weekday_starttime() {
        return hospital_weekday_starttime;
    }

    public void setHospital_weekday_starttime(String hospital_weekday_starttime) {
        this.hospital_weekday_starttime = hospital_weekday_starttime;
    }

    public String getHospital_weekday_endtime() {
        return hospital_weekday_endtime;
    }

    public void setHospital_weekday_endtime(String hospital_weekday_endtime) {
        this.hospital_weekday_endtime = hospital_weekday_endtime;
    }

    public String getHospital_saturday_starttime() {
        return hospital_saturday_starttime;
    }

    public void setHospital_saturday_starttime(String hospital_saturday_starttime) {
        this.hospital_saturday_starttime = hospital_saturday_starttime;
    }

    public String getGetHospital_saturday_endtime() {
        return getHospital_saturday_endtime;
    }

    public void setGetHospital_saturday_endtime(String getHospital_saturday_endtime) {
        this.getHospital_saturday_endtime = getHospital_saturday_endtime;
    }

    public String getHospital_holiday_starttime() {
        return hospital_holiday_starttime;
    }

    public void setHospital_holiday_starttime(String hospital_holiday_starttime) {
        this.hospital_holiday_starttime = hospital_holiday_starttime;
    }

    public String getGetHospital_holiday_endtime() {
        return getHospital_holiday_endtime;
    }

    public void setGetHospital_holiday_endtime(String getHospital_holiday_endtime) {
        this.getHospital_holiday_endtime = getHospital_holiday_endtime;
    }

    public String getHospital_remark() {
        return hospital_remark;
    }

    public void setHospital_remark(String hospital_remark) {
        this.hospital_remark = hospital_remark;
    }
}
