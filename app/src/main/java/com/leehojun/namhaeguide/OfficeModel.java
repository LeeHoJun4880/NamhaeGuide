package com.leehojun.namhaeguide;

public class OfficeModel {

    private int no;
    private String office_name;
    private String office_addr;
    private String office_tel;

    public OfficeModel(int no, String office_name, String office_addr, String office_tel) {
        this.no = no;
        this.office_name = office_name;
        this.office_addr = office_addr;
        this.office_tel = office_tel;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getOffice_name() {
        return office_name;
    }

    public void setOffice_name(String office_name) {
        this.office_name = office_name;
    }

    public String getOffice_addr() {
        return office_addr;
    }

    public void setOffice_addr(String office_addr) {
        this.office_addr = office_addr;
    }

    public String getOffice_tel() {
        return office_tel;
    }

    public void setOffice_tel(String office_tel) {
        this.office_tel = office_tel;
    }
}
