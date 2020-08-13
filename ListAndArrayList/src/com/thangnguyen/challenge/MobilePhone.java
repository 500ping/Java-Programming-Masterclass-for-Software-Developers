package com.thangnguyen.challenge;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts;

    public MobilePhone() {
        this.contacts = new ArrayList<>();
    }

    public void printContacts() {
        System.out.println("There are " + this.contacts.size() + " contacts");
        for (Contact contact : contacts) {
            System.out.println("-- " + contact.getName() + " - " + contact.getPhoneNumber());
        }
        System.out.println("-------------------------------------------------------");
    }

//    public boolean isExits(String name) {
//        for (Contact query : this.contacts) {
//            if (query.getName().equals(name)) {
//                return true;
//            }
//        }
//        return false;
//    }

    public Contact find(String name) {
        for (Contact query : this.contacts) {
            if (query.getName().equals(name)) {
                return query;
            }
        }
        return null;
    }

    public int getIndex(Contact contact) {
        return this.contacts.indexOf(contact);
    }

    public void addContact(Contact contact) {
        if(this.find(contact.getName()) == null) {
            this.contacts.add(contact);
            System.out.println("Added!");
            this.printContacts();
        } else {
            System.out.println("This contact already exits.");
        }
    }

    public void modifyContact(Contact contact, int index) {
        if(this.find(contact.getName()) == null) {
            this.contacts.set(index, contact);
            System.out.println("Modified!");
            this.printContacts();
        } else {
            System.out.println("This contact already exits.");
        }
    }

    public void removeContact(int index) {
        this.contacts.remove(index);
        System.out.println("Modified!");
        this.printContacts();
    }
}
