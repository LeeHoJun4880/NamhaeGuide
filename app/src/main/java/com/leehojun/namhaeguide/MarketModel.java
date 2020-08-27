package com.leehojun.namhaeguide;

public class MarketModel {

    private String name;
    private String type;
    private String address1;
    private String address2;
    private String openperiod;
    private Double lat;
    private Double lng;
    private int marketcount;
    private String productkinds;
    private String giftcard;
    private String webpage;
    private String toilet;
    private String parkingplace;
    private String openyear;
    private String tel;

    public MarketModel(String name, String type, String address1, String address2, String openperiod, Double lat, Double lng, int marketcount, String productkinds, String giftcard, String webpage, String toilet, String parkingplace, String openyear, String tel) {
        this.name = name;
        this.type = type;
        this.address1 = address1;
        this.address2 = address2;
        this.openperiod = openperiod;
        this.lat = lat;
        this.lng = lng;
        this.marketcount = marketcount;
        this.productkinds = productkinds;
        this.giftcard = giftcard;
        this.webpage = webpage;
        this.toilet = toilet;
        this.parkingplace = parkingplace;
        this.openyear = openyear;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getOpenperiod() {
        return openperiod;
    }

    public void setOpenperiod(String openperiod) {
        this.openperiod = openperiod;
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

    public int getMarketcount() {
        return marketcount;
    }

    public void setMarketcount(int marketcount) {
        this.marketcount = marketcount;
    }

    public String getProductkinds() {
        return productkinds;
    }

    public void setProductkinds(String productkinds) {
        this.productkinds = productkinds;
    }

    public String getGiftcard() {
        return giftcard;
    }

    public void setGiftcard(String giftcard) {
        this.giftcard = giftcard;
    }

    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }

    public String getToilet() {
        return toilet;
    }

    public void setToilet(String toilet) {
        this.toilet = toilet;
    }

    public String getParkingplace() {
        return parkingplace;
    }

    public void setParkingplace(String parkingplace) {
        this.parkingplace = parkingplace;
    }

    public String getOpenyear() {
        return openyear;
    }

    public void setOpenyear(String openyear) {
        this.openyear = openyear;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}