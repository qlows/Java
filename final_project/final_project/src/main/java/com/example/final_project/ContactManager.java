package com.example.final_project;

import java.util.Objects;
import java.util.Scanner;

public class ContactManager {

    //variables initialized
    private int numberOfContacts, maxContacts;
    private Contact[] contactList;

    //constructor created
    public ContactManager(int maxContacts){
        numberOfContacts = 0;
        contactList = new Contact[maxContacts];
    }
    //method for finding a specific contact
    public Contact findContact(String firstName, String lastName){
        for ( int i = 0; i < numberOfContacts; i++){
            if (!Objects.equals(contactList[i].getFirstName(), firstName) || contactList[i].getLastName() != lastName) {
                continue;
            }
            return contactList[i];
        }
        return null;
    }

    //method to view all contacts
    public String viewAllContacts(){
        String s = "";
        for ( int i = 0; i < numberOfContacts; i++){
            s += contactList[i].toString() + "\n";
        }
        return s;
    }

    //method to view contats
    public Contact[] allContacts() {
        Contact[] response = new Contact[numberOfContacts];
        for (int i = 0; i < numberOfContacts; i++) {
            response[i] = contactList[i];
        }
        return response;
    }

    // method to viw contact on basis of city
    public String viewContactsInCity(String city){
        String s = "";
        for ( int i = 0; i < numberOfContacts; i++){
            if(contactList[i].getCity() == city){
                s += contactList[i].toString() + "\n";
            }
        }
        return s;
    }
    //method to add a contact
    public String add(String firstName, String lastName, String homePhone, String workPhone, Address homeAddress, String email, String notes, MyDate birthday){
        String s = "";
        if(findContact(firstName,lastName) != null){
            s = "Contact with same number already exists";
            return s;
        }
        contactList[numberOfContacts] = new Contact(firstName, lastName, homePhone, workPhone, email, notes, birthday, homeAddress);
            numberOfContacts++;

        s = "Contact " + firstName +" " + lastName + " with home phone " + homePhone + " is added successfully ";
        return s;
    }
    //method to edit a contact
    public String edit(String firstName, String lastName){
        String x = "";
        Scanner scanContact = new Scanner(System.in);
        if(findContact(firstName,lastName) == null){
            x = "Contact " + firstName + " " + lastName + " does not exist";
            return x;
        }
        //options for editing the contact
        System.out.println("What would you like to edit?");
        System.out.println("1 - Edit First Name");
        System.out.println("2 - Edit Last Name");
        System.out.println("3 - Edit Home Phone");
        System.out.println("4 - Edit Work Phone");
        System.out.println("5 - Edit Home Address");
        System.out.println("6 - Edit Email");
        System.out.println("7 - Edit Notes");
        System.out.println("8 - Edit Birthday");
        System.out.println("9- To Exit");

        int input = scanContact.nextInt();
        switch (input){
            //editing the 1st name
            case 1:
                System.out.println(findContact(firstName,lastName).getFirstName() + " is the current name");
                try{
                    System.out.println("Enter the new name");
                    String inputName = scanContact.next();
                    if(inputName == findContact(firstName,lastName).getFirstName()){
                        System.out.println("New name cannot be same");
                    }
                    findContact(firstName, lastName).setFirstName(inputName);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                break;

            //editing last name
            case 2:
                System.out.println(findContact(firstName, lastName).getLastName() + " is the current last name");
                try{
                    System.out.println("Enter the new last name");
                    String inputLastName = scanContact.next();
                    if(inputLastName == findContact(firstName, lastName).getLastName()){
                        System.out.println("New last name cannot be same");
                    }
                    findContact(firstName, lastName).setLastName(inputLastName);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                break;

            //editing home phone number
            case 3:
                System.out.println(findContact(firstName, lastName).getHomePhone() + " is the current Home Phone");
                try{
                    System.out.println("Enter the new home phone");
                    String inputHomePhone = scanContact.next();
                    if(inputHomePhone == findContact(firstName, lastName).getHomePhone()){
                        System.out.println("New home phone cannot be same");
                    }
                    findContact(firstName, lastName).setHomePhone(inputHomePhone);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                break;

            //editing work phone number
            case 4:
                System.out.println(findContact(firstName, lastName).getWorkPhone() + " is the current work phone");
                try{
                    System.out.println("Enter the new work phone");
                    String inputWorkPhone = scanContact.next();
                    if(inputWorkPhone == findContact(firstName, lastName).getWorkPhone()){
                        System.out.println("New work phone cannot be same");
                    }
                    findContact(firstName, lastName).setWorkPhone(inputWorkPhone);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                break;

            //editing home address
            case 5:
                System.out.println(findContact(firstName, lastName).getAddress() + " is the current home address");

                try{
                    System.out.println("Enter the new home address");

                    System.out.println("Street address 1:");//enter the st1
                    String inputSt1 = scanContact.next();

                    System.out.println("Street address 2:"); // enter st2
                    String inputSt2 = scanContact.next();

                    System.out.println("Province:"); // enter the province
                    String inputProvince = scanContact.next();

                    System.out.println("City:"); //enter the city
                    String inputCity = scanContact.next();

                    System.out.println("Postal Code:"); // enter postal code
                    String inputPostal = scanContact.next();

                    System.out.println("Country:"); // enter the country
                    String inputCountry = scanContact.next();

                    String fullAddress = inputSt1 + " " + inputSt2 + " " + inputProvince + " " + inputCity + " " + inputPostal + " " + inputCountry; // returns the address in form of string

                    if(fullAddress == findContact(firstName, lastName).getHomeAddress()){
                        System.out.println("New home address cannot be same as previous address!"); // checks if the new address matches the current or any other address
                    }
                    findContact(firstName, lastName).setHomeAddress(inputSt1,inputSt2,inputProvince,inputCity,inputPostal,inputCountry);
                        System.out.println("Address successfully updated!");// if the address is new and different it gets updated
                }
                catch (Exception e){
                    System.out.println(e.getMessage()); // gives an error message
                }
                break;

            case 6:
                System.out.println(findContact(firstName, lastName).getEmail() + " is the current Email address"); // enter the current(working) email id

                try{
                    System.out.println("Enter the new email address");// enter the new email id
                    String inputEmailAddress = scanContact.next();
                    if(inputEmailAddress == findContact(firstName, lastName).getEmail()){
                        System.out.println("New Email address cannot be same"); // checks if the current and new email id . If tehy arent same it gets updated
                    }
                    findContact(firstName, lastName).setEmail(inputEmailAddress);

                }catch (Exception e){
                    System.out.println(e.getMessage()); // gives an error message
                }
                break;

            case 7:
                System.out.println(findContact(firstName, lastName).getNotes() + " is the current note");// Write a note

                try{
                    System.out.println("Enter the new note"); // enter new note
                    String inputNote = scanContact.next();

                    if(inputNote == findContact(firstName, lastName).getNotes()){ // checks if the 2 notes are same. If not updates to the new one
                        System.out.println("New note cannot be same");
                    }
                    findContact(firstName, lastName).setNotes(inputNote);
                }catch (Exception e){
                    System.out.println(e.getMessage());// gives an error message
                }
                break;

            case 8:
                System.out.println(findContact(firstName, lastName).getBirthday() + " " +findContact(firstName, lastName).getBirthMonthLongForm() + " " + findContact(firstName, lastName).getBirthYear() + " is the current birthday"); // enter the birthday(bday_

                try{
                    System.out.println("Enter the new birthday"); // enter the new birthday
                    int inputBirthday = scanContact.nextInt();
                    System.out.println("Enter the new birth month"); // enter the new birth month
                    int inputBirthMonth = scanContact.nextInt();
                    System.out.println("Enter the new birth year"); // enter  the new birth year
                    int inputBirthYear = scanContact.nextInt();

                    if(inputBirthday == findContact(firstName, lastName).getBirthDay() && inputBirthMonth == findContact(firstName, lastName).getBirthMonth() && inputBirthYear == findContact(firstName, lastName).getBirthYear()){
                        System.out.println("New Birthday cannot be same as your last birthday"); // check if the 2 birthdays are same or not
                    }
                    findContact(firstName, lastName).setBirthday(inputBirthday);
                    findContact(firstName, lastName).setBirthMonth(inputBirthMonth);
                    findContact(firstName, lastName).setBirthYear(inputBirthYear);

                    System.out.println("Your birthday updated as " + inputBirthday + " " + findContact(firstName, lastName).getBirthMonthShortForm() + " " + inputBirthYear);// updates the bday and returns in form of string
                }catch (Exception e){
                    System.out.println(e.getMessage()); // gives an error message
                }
                break;

            case 9:
                System.out.println("Exiting...");// exits the option
                break;
        }
        x = "Please enter a number from 1 to 9!";
        return x;
    }

    public String delete(String firstName, String lastName)// deletes the user by taking his/her name
    {
        String s = "";
        if(findContact(firstName, lastName) == null){
            s = "Contact is not exist!";
            return s;
        }
        for (int i = 0; i < numberOfContacts; i++){
            if(contactList[i].getFirstName() == firstName && contactList[i].getLastName() == lastName){
                s = "Contact " + contactList[i].getFirstName() + " with number " + contactList[i].getHomePhone() + " has been removed";
                contactList[i] = null;
                numberOfContacts--;// removes the contact
                return s;
            }
        }
        s = "Something went wrong";
        return s;
    }
}

