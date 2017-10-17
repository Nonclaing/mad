package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int k = sc.nextInt();

        /*for (int i = 1; i < k; i++) {
            int num = i;
            int reverseNum = 0;
            int tmpNum = num;

            while (tmpNum != 0) {
                int digit = tmpNum % 10;
                reverseNum = reverseNum * 10 + digit;
                tmpNum /= 10;
            }
            if (num == reverseNum) {
                System.out.println(num + "; ");
            }
        }*/

        int k = sc.nextInt();

        for (int j = 2; j < k; j++) {
            int num = j;
            int count = 2;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (count == 2) {
                System.out.println(num + "; ");



            }

        }

    }
}
