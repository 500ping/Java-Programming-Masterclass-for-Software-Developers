package com.company.test1;

import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {

    }

    //Math.ceil: return the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer
    public static int getBucketCount(double width,double height, double areaPerBucket, int extraBuckets){
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0){
            return -1;
        }
        double numberOfBuckets = ((width*height)/areaPerBucket)-extraBuckets;
        return (int)Math.ceil(numberOfBuckets);
    }

    public static int getBucketCount(double width,double height, double areaPerBucket){
        if(width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }
        double numberOfBuckets = ((width*height)/areaPerBucket);
        return (int)Math.ceil(numberOfBuckets);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0||areaPerBucket<=0){
            return -1;
        }
        double numberOfBuckets = ((area)/areaPerBucket);
        return (int)Math.ceil(numberOfBuckets);
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int input = scanner.nextInt();
                sum += input;
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        long avg = count != 0 ? Math.round((double )sum / count) : 0;
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }

}
