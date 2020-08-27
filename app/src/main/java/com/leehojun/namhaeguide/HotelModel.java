package com.leehojun.namhaeguide;

public class HotelModel {

    private String name;
    private String sectors;
    private String serviceobject;
    private String address1;
    private String address2;
    private String tel;
    private String numberofrooms;
    private String amenities;
    private String parkinglotavailability;
    private String payment;
    private String webpage;
    private String surrounding_tourism_information;
    private Double lat;
    private Double lng;

    public HotelModel(String name, String sectors, String serviceobject, String address1, String address2, String tel, String numberofrooms, String amenities, String parkinglotavailability, String payment, String webpage, String surrounding_tourism_information, Double lat, Double lng) {
        this.name = name;
        this.sectors = sectors;
        this.serviceobject = serviceobject;
        this.address1 = address1;
        this.address2 = address2;
        this.tel = tel;
        this.numberofrooms = numberofrooms;
        this.amenities = amenities;
        this.parkinglotavailability = parkinglotavailability;
        this.payment = payment;
        this.webpage = webpage;
        this.surrounding_tourism_information = surrounding_tourism_information;
        this.lat = lat;
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSectors() {
        return sectors;
    }

    public void setSectors(String sectors) {
        this.sectors = sectors;
    }

    public String getServiceobject() {
        return serviceobject;
    }

    public void setServiceobject(String serviceobject) {
        this.serviceobject = serviceobject;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNumberofrooms() {
        return numberofrooms;
    }

    public void setNumberofrooms(String numberofrooms) {
        this.numberofrooms = numberofrooms;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getParkinglotavailability() {
        return parkinglotavailability;
    }

    public void setParkinglotavailability(String parkinglotavailability) {
        this.parkinglotavailability = parkinglotavailability;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }

    public String getSurrounding_tourism_information() {
        return surrounding_tourism_information;
    }

    public void setSurrounding_tourism_information(String surrounding_tourism_information) {
        this.surrounding_tourism_information = surrounding_tourism_information;
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
