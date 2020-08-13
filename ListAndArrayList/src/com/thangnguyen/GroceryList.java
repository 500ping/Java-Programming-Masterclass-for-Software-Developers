package com.thangnguyen;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
//    private int myNumbers[] = new int[50];
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        this.groceryList.add(item);
    }

    public void printGroceryList() {
        groceryList.forEach(System.out::println);
    }

    public void modifyGroceryItem(int index, String item) {
        groceryList.set(index, item);
    }

    public void modifyGroceryItem(String newitem) {
        int index = this.getIndex(newitem);

    }

    public void removeGroceryItem(int index) {
//        String item = groceryList.get(index);
//        groceryList.remove(item);

        groceryList.remove(index);
    }

    public String findItem(String item) {
//        boolean isExits = groceryList.contains(item);
        int index = groceryList.indexOf(item);
        return groceryList.get(index);
    }

    public int getIndex(String item) {
        return groceryList.indexOf(item);
    }

    public ArrayList<String> copy() {
        ArrayList<String> returnValue = new ArrayList<>(groceryList);
//        returnValue.addAll(groceryList);
        return returnValue;
    }

    public String[] convertToArray() {
        String returnArray[] = new String[this.groceryList.size()];
        returnArray = this.groceryList.toArray(returnArray);
        return returnArray;
    }
}
