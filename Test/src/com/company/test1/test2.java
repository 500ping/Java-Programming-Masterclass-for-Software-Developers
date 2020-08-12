package com.company.test1;

public class test2 {

    public static void main(String[] args) {
        printSquareStar(5);
    }

//    // Copy solution (working on udemy)
//    public static void printSquareStar(int num) {
//        if (num < 5) {
//            System.out.println("Invalid Value");
//        } else {
//            for (int row = 1; row <= num; row++) {
//                for (int column = 1; column <= num; column++) {
//                    if (row == 1 || row == num || column == 1 || column == num ||
//                            row == column || (num - row + 1) == column) {
//                        System.out.print("*");
//                        if (column == num) {
//                            System.out.println();
//                        }
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//            }
//        }
//    }

    //My solution not work on udemy
    public static void printSquareStar(int num) {
        if (num < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= num; row++) {
                String draw = "";
                for (int column = 1; column <= num; column++) {
                    if (row == 1 || row == num || column == 1 || column == num ||
                            row == column || (num - row + 1) == column) {
                        draw += "*";
                    } else {
                        draw += " ";
                    }
                }
                System.out.println(draw);
            }
        }
    }

    public static int getLargestPrime(int num) {
        if (num < 0)
            return -1;

        int largestPrime = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (i >= 2) {
                    boolean check = true;
                    for (int j = 2; j <= (long) Math.sqrt(i); j ++) {
                        if (i % j == 0) {
                            check = false;
                        }
                    }
                    if (check) {
                        largestPrime = i;
                    }
                }
            }
        }

        return largestPrime >= 2 ? largestPrime : -1;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(num); i ++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        for (int i = 0; i <= bigCount; i++) {
            for (int j = 0; j <= smallCount; j++) {
                if ( ((i * 5) + (j * 1)) == goal ) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            int reverseNum = reverse(num);

            while (reverseNum > 0) {
                int lastNum = reverseNum % 10;
                reverseNum /= 10;

                switch (lastNum) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    default:
                        System.out.println("Nine");
                        break;
                }
            }

            if (getDigitCount(num) > getDigitCount(reverse(num))) {
                for (int i = 0; i < getDigitCount(num) - getDigitCount(reverse(num)); i++) {
                    System.out.println("Zero");
                }
            }
        }
    }

    //2521
    public static int reverse(int num) {
        int reverseNum = 0;
        int numInAbs = Math.abs(num);

        while (numInAbs > 0) {
            reverseNum += numInAbs % 10;
            if (numInAbs >= 10)
                reverseNum *= 10;
            numInAbs /= 10;
        }

        return num > 0 ? reverseNum : -reverseNum;
    }

    public static int getDigitCount(int num) {
        if (num < 0) {
            return  -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (Math.abs(num) > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }

        int sumOfFactors = 0;

        for (int i = 1; i <= (num / 2); i ++) {
            if (num % i == 0) {
                sumOfFactors += i;
            }
        }

        return sumOfFactors == num;
    }

    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
        } else  {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int greatesCommonDivisor = 1;

        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }

        for (int i = 1; i <= first; i++) {
            if (first % i == 0 && second % i == 0) {
                greatesCommonDivisor = i;
            }
        }

        return greatesCommonDivisor;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int lastDigitNum1 = num1 % 10;
        int lastDigitNum2 = num2 % 10;
        int lastDigitNum3 = num3 % 10;

        return (lastDigitNum1 == lastDigitNum2) || (lastDigitNum1 == lastDigitNum3)
                || (lastDigitNum2 == lastDigitNum3);
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ( (num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99) ) {
            return false;
        }

        int digit1FromNum1 = num1 % 10;
        int digit2FromNum1 = num1 / 10;

        int digit1FromNum2 = num2 % 10;
        int digit2FromNum2 = num2 / 10;

        return (digit1FromNum1 == digit1FromNum2) || (digit1FromNum1 == digit2FromNum2) ||
                (digit2FromNum1 == digit1FromNum2) || (digit2FromNum1 == digit2FromNum2);
    }

    public static int getEvenDigitSum(int num) {
        if (num < 0) {
            return -1;
        }

        int sum = 0;

        while (num > 0) {
            int numberFromLast = num % 10;
            num /= 10;

            if (numberFromLast % 2 == 0) {
                sum += numberFromLast;
            }
        }

        return sum;
    }

    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        }

        if (num < 10) {
            return num * 2;
        }

        int firstDigit = num % 10;
        int lastDigit = 0;

        while (num / 10 > 0) {
            num /= 10;
            lastDigit = num;
        }

        return firstDigit + lastDigit;
    }

    public static boolean isPalindrome(int num) {
        int palindromeNum = 0;
        int firstNumber = num;

        while (Math.abs(num) > 0) {
            if (num >= 0) {
                palindromeNum += num % 10;
            } else {
                palindromeNum -= -(num % 10);
            }
            //mutiply palindromeNum to 10 if num has 2 digits or more
            if (num >= 10 || num <= -10)
                palindromeNum *= 10;

            System.out.println(palindromeNum);

            num /= 10;
        }

        System.out.println(palindromeNum);

        return palindromeNum == firstNumber;
    }
}
