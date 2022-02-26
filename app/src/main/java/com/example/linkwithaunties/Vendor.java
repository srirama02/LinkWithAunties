package com.example.linkwithaunties;

public class Vendor {

    private int Vendor_ID;
    private String Vendor_Name;

    private String Street_Address;
    private String State;
    private String City;


    public Vendor(int Vendor_ID, String Vendor_Name, String State, String City, String Street_Address){

        this.Vendor_ID = Vendor_ID;         //ID IS PRIMARY KEY IN DB
        this.Vendor_Name = Vendor_Name;

        this.Street_Address = Street_Address;
        this.State = State;
        this.City = City;
    }


    //GETTERS AND SETTERS
    public int getVendor_ID() {
        return Vendor_ID;
    }

    public void setVendor_ID(int vendor_ID) {
        Vendor_ID = vendor_ID;
    }

    public String getVendor_Name() {
        return Vendor_Name;
    }

    public void setVendor_Name(String vendor_Name) {
        Vendor_Name = vendor_Name;
    }

    public String getStreet_Address() {
        return Street_Address;
    }

    public void setStreet_Address(String street_Address) {
        Street_Address = street_Address;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
