package com.leehojun.namhaeguide;

public class ParkingplaceModel {

    private String name;
    private String division;
    private String type;
    private String address1;
    private String address2;
    private int parkingdivision;
    private String operatingday;
    private String weekday_start_time;
    private String weekday_end_time;
    private String saturday_start_time;
    private String saturday_end_time;
    private String holiday_start_time;
    private String holiday_end_time;
    private String pricinginfo;
    private String basictime;
    private String basicprice;
    private String plustime;
    private String plusprice;
    private String pricemethod;
    private String uniqueness;
    private String managementagency;
    private String tel;
    private Double lat;
    private Double lng;

    public ParkingplaceModel(String name, String division, String type, String address1, String address2, int parkingdivision, String operatingday, String weekday_start_time, String weekday_end_time, String saturday_start_time, String saturday_end_time, String holiday_start_time, String holiday_end_time, String pricinginfo, String basictime, String basicprice, String plustime, String plusprice, String pricemethod, String uniqueness, String managementagency, String tel, Double lat, Double lng) {
        this.name = name;
        this.division = division;
        this.type = type;
        this.address1 = address1;
        this.address2 = address2;
        this.parkingdivision = parkingdivision;
        this.operatingday = operatingday;
        this.weekday_start_time = weekday_start_time;
        this.weekday_end_time = weekday_end_time;
        this.saturday_start_time = saturday_start_time;
        this.saturday_end_time = saturday_end_time;
        this.holiday_start_time = holiday_start_time;
        this.holiday_end_time = holiday_end_time;
        this.pricinginfo = pricinginfo;
        this.basictime = basictime;
        this.basicprice = basicprice;
        this.plustime = plustime;
        this.plusprice = plusprice;
        this.pricemethod = pricemethod;
        this.uniqueness = uniqueness;
        this.managementagency = managementagency;
        this.tel = tel;
        this.lat = lat;
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getParkingdivision() {
        return parkingdivision;
    }

    public void setParkingdivision(int parkingdivision) {
        this.parkingdivision = parkingdivision;
    }

    public String getOperatingday() {
        return operatingday;
    }

    public void setOperatingday(String operatingday) {
        this.operatingday = operatingday;
    }

    public String getWeekday_start_time() {
        return weekday_start_time;
    }

    public void setWeekday_start_time(String weekday_start_time) {
        this.weekday_start_time = weekday_start_time;
    }

    public String getWeekday_end_time() {
        return weekday_end_time;
    }

    public void setWeekday_end_time(String weekday_end_time) {
        this.weekday_end_time = weekday_end_time;
    }

    public String getSaturday_start_time() {
        return saturday_start_time;
    }

    public void setSaturday_start_time(String saturday_start_time) {
        this.saturday_start_time = saturday_start_time;
    }

    public String getSaturday_end_time() {
        return saturday_end_time;
    }

    public void setSaturday_end_time(String saturday_end_time) {
        this.saturday_end_time = saturday_end_time;
    }

    public String getHoliday_start_time() {
        return holiday_start_time;
    }

    public void setHoliday_start_time(String holiday_start_time) {
        this.holiday_start_time = holiday_start_time;
    }

    public String getHoliday_end_time() {
        return holiday_end_time;
    }

    public void setHoliday_end_time(String holiday_end_time) {
        this.holiday_end_time = holiday_end_time;
    }

    public String getPricinginfo() {
        return pricinginfo;
    }

    public void setPricinginfo(String pricinginfo) {
        this.pricinginfo = pricinginfo;
    }

    public String getBasictime() {
        return basictime;
    }

    public void setBasictime(String basictime) {
        this.basictime = basictime;
    }

    public String getBasicprice() {
        return basicprice;
    }

    public void setBasicprice(String basicprice) {
        this.basicprice = basicprice;
    }

    public String getPlustime() {
        return plustime;
    }

    public void setPlustime(String plustime) {
        this.plustime = plustime;
    }

    public String getPlusprice() {
        return plusprice;
    }

    public void setPlusprice(String plusprice) {
        this.plusprice = plusprice;
    }

    public String getPricemethod() {
        return pricemethod;
    }

    public void setPricemethod(String pricemethod) {
        this.pricemethod = pricemethod;
    }

    public String getUniqueness() {
        return uniqueness;
    }

    public void setUniqueness(String uniqueness) {
        this.uniqueness = uniqueness;
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
