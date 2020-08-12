package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
//	    while (count != 5) {
//            System.out.println("Count value is: " + count);
//            count++;
//        }
//
//        System.out.println("---------------------");

//	    count = 0;
//	    while (true) {
//            System.out.println("Count valus is: " + count);
//            count++;
//
//            if (count == 5)
//                break;
//        }

//        do {
//            System.out.println("Count value was: " + count);
//            count++;
//        } while (count != 5);

        //challenge
        int number = 4;
        int finishNumber = 20;

        int sum = 0;
        count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            sum += number;
            count++;
            if (count == 5) {
                break;
            }
        }

        System.out.println(sum);

        //challenge 2
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int num) {
        if (num < 10) {
            return -1;
        }

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

}
