package com.thangnguyen;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        String[] strArray = new String[10];
//        int[] intArray = new int[10];
//
//        ArrayList<String> srtArrayList = new ArrayList<>();
//        srtArrayList.add("Thang");
//
//        ArrayList<Integer> intArrayList = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            intArrayList.add(Integer.valueOf(i)); // --> Boxing
//        }
//
////        intArrayList.forEach(System.out::println);
//
////        System.out.println(intArrayList.toString());
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(intArrayList.get(i).intValue()); // --> Unboxing
//        }
//
//        Integer myIntValue = 56; // Integer.valueOf(56) --> AutoBoxing
//        int myInt = myIntValue; // myIntValue.intValue()
//
//        ArrayList<Double> myDoubleValue = new ArrayList<>();
//        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
//            myDoubleValue.add(dbl);
////            myDoubleValue.add(Double.valueOf(dbl));
//        }
//
//        for (int i = 0; i < myDoubleValue.size(); i++) {
////            System.out.println(myDoubleValue.get(i).doubleValue());
//            System.out.println(myDoubleValue.get(i));
//        }

        ArrayList<TestObj> tests = new ArrayList<>();
        tests.add(new TestObj("test 1", 20));
        tests.add(new TestObj("test 2", 10));
        tests.add(new TestObj("test 3", 30));
        tests.add(new TestObj("test 4", 50));

        tests.forEach(
                testObj -> System.out.println(testObj.getName() + "/" + testObj.getAmount())
        );

        System.out.println("-------------------------------");

        TestObj test = get(tests, 2);
        System.out.println(test.getName() + "/" + test.getAmount());
        test.setAmount(1000);
        System.out.println(test.getName() + "/" + test.getAmount());

        System.out.println("-------------------------------");

        tests.forEach(
                testObj -> System.out.println(testObj.getName() + "/" + testObj.getAmount())
        );

    }

    private static TestObj get(ArrayList<TestObj> tests, int index) {
        return tests.get(index);
    }
}
