package com.workintech.collections.mobile;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("1231231");
        Contact ahmet = new Contact("Ahmet", "1231231");
        phone.addNewContact(new Contact("Ali", "5464665"));
        phone.addNewContact(ahmet);
        phone.addNewContact(new Contact("Ilgın", "1231232"));
        phone.addNewContact(new Contact("Alican", "1231232"));
        phone.addNewContact(new Contact("Ilgın", "1231233"));
        phone.printContact();

        System.out.println("Index: " + phone.findContact(ahmet));
        System.out.println("Index with String: " + phone.findContact(ahmet.getName()));
        System.out.println("Query Contact: " + phone.queryContact("Ali"));
        phone.removeContact(ahmet);
        phone.printContact();

    }

}