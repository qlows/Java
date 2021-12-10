package com.example.final_project;

public class Address {

    //variables initialized
    public String streetInfo1 , streetInfo2;
    public String city ;
    public String postalCode;
    public String province;
    public String Country;

    //constructor crated
    public Address(String st1, String st2, String city, String postCode, String prov, String country) {
        this.streetInfo1 = st1;
        this.streetInfo2 = st2;
        this.city = city;
        this.postalCode = postCode;
        this.province = prov;
        this.Country = country;
    }
    // Prints out in sentence form
    @Override
    public String toString() {
        return "Address{" +
                "streetInfo1='" + streetInfo1 + '\'' +
                ", streetInfo2='" + streetInfo2 + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", province='" + province + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}

