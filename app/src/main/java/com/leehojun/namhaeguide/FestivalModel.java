package com.leehojun.namhaeguide;

public class FestivalModel {

    private String name;
    private String place;
    private String startdate;
    private String enddate;
    private String contents;
    private String hostagency;
    private String managementagency;
    private String sponsorship;
    private String webpage;
    private String address1;
    private String address2;
    private Double lat;
    private Double lng;
    private String datadate;

    public FestivalModel(String name, String place, String startdate, String enddate, String contents, String hostagency, String managementagency, String sponsorship, String webpage, String address1, String address2, Double lat, Double lng, String datadate) {
        this.name = name;
        this.place = place;
        this.startdate = startdate;
        this.enddate = enddate;
        this.contents = contents;
        this.hostagency = hostagency;
        this.managementagency = managementagency;
        this.sponsorship = sponsorship;
        this.webpage = webpage;
        this.address1 = address1;
        this.address2 = address2;
        this.lat = lat;
        this.lng = lng;
        this.datadate = datadate;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getHostagency() {
        return hostagency;
    }

    public void setHostagency(String hostagency) {
        this.hostagency = hostagency;
    }

    public String getManagementagency() {
        return managementagency;
    }

    public void setManagementagency(String managementagency) {
        this.managementagency = managementagency;
    }

    public String getSponsorship() {
        return sponsorship;
    }

    public void setSponsorship(String sponsorship) {
        this.sponsorship = sponsorship;
    }

    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
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

    public String getDatadate() {
        return datadate;
    }

    public void setDatadate(String datadate) {
        this.datadate = datadate;
    }
}
