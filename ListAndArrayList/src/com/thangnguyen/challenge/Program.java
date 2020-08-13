package com.thangnguyen.challenge;

import java.util.Scanner;

public class Program {
    static boolean run = true;
    static MobilePhone contacts = new MobilePhone();

    public static void main(String[] args) {
        while (run) {
            printMenu();
            int choice = getChoice();
            runFunction(choice);
        }
    }

    private static void printMenu() {
        System.out.println("+----------------------------------------+");
        System.out.println("1. show list contacts");
        System.out.println("2. add contact");
        System.out.println("3. modify contact");
        System.out.println("4. remove contact");
        System.out.println("5. quit");
        System.out.println("+----------------------------------------+");
    }

    private static int getChoice() {
        InputScanner inputScanner = new InputScanner();
        while (true) {
            int choice = inputScanner.getIntInput("Enter your choice (1 -> 5):");
            if (choice >= 1 && choice <= 5) {
                return choice;
            }
        }
    }

    private static void runFunction(int choice) {
        InputScanner inputScanner = new InputScanner();

        switch (choice) {
            case 1:
                contacts.printContacts();
                break;
            case 2:
                String name = inputScanner.getInputString("Enter name:");
                String phoneNumber = inputScanner.getInputString("Enter phone number:");
                Contact contact = new Contact(name, phoneNumber);
                contacts.addContact(contact);
                break;
            default:
                System.out.println("Bye!");
                run = false;
        }
    }
}
