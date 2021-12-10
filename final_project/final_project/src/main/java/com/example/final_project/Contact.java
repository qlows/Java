package com.example.final_project;

public class Contact {

    //variables assigned
    private  String firstName , lastName ;
    private  String homePhone , WorkPhone ;
    private  String email , notes ;
    private  MyDate birthday ;
    private  Address homeAddress;

    //constructors created
    public Contact(String firstName, String lastName, String homePhone, String workPhone, String email, String notes, MyDate birthday, Address homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homePhone = homePhone;
        WorkPhone = workPhone;
        this.email = email;
        this.notes = notes;
        this.birthday = birthday;
        this.homeAddress = homeAddress;
    }

    //necessary getters and setters created
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return WorkPhone;
    }

    public void setWorkPhone(String workPhone) {
        WorkPhone = workPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public int getBirthDay() {
        return birthday.getDay();
    }

    public void setBirthday(int birthday) {
        this.birthday.setDay(birthday);
    }

    public void setBirthMonth(int birthMonth){
        birthday.setMonth(birthMonth);
    }

    public int getBirthMonth(){
        return birthday.getMonth();
    }

    public String getBirthMonthShortForm(){
        return birthday.getMonthShortForm();
    }

    public String getBirthMonthLongForm(){
        return birthday.getMonthLongForm();
    }

    public int getBirthYear(){
        return birthday.getYear();
    }

    public void setBirthYear(int birthYear){
        birthday.setYear(birthYear);
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return homeAddress;
    }

    public void setAddress(Address address) {
        this.homeAddress = address;
    }

    public  String getCity(){
        return homeAddress.city;
    }


    public String getHomeAddress()
    {
        return homeAddress.toString();
    }

    public void setHomeAddress(String streetInfo1, String streetInfo2, String province, String city, String postalCode, String country) {
        homeAddress.streetInfo1 = streetInfo1;
        homeAddress.streetInfo2 = streetInfo2;
        homeAddress.province = province;
        homeAddress.city = city;
        homeAddress.postalCode = postalCode;
        homeAddress.Country = country;
    }
}

