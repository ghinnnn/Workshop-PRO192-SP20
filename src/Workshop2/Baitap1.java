package Workshop2;

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Baitap1 {

    private static final Scanner in = new Scanner(System.in);

    // kiem tra input//
    private static int CheckInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please Input Number");
                System.out.print("Enter again");
            }
        }
    }

    private static int InputSizeOfArray() {
        System.out.print("Enter number of array");
        int n = CheckInputInt();
        return n;
    }

    private static int[] InputValueOfArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "]: ");
            a[i] = CheckInputInt();
        }
        return a;
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Bonjour");
    }

    // BubbleSort//
    private static void sortArray(int[] a) {
        System.out.print("Unsorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    private static void print(int[] a) {
        System.out.printf("Sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(a[i] + " ");
        }
    }

    private static void averageOdd(int[] a) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                sum = sum + a[i];
                count++;
            }
        }
        double avg = sum / count;
        System.out.println("\nSum of odd numbers are:" + avg);
    }

    public static void findTheMaxValue(int[] a) {
        int maxValue = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > maxValue) maxValue = a[i];
        System.out.printf("The maximum value is: %d\n", +maxValue);
    }

    public static void findTheLastValue(int[] a) {
        int lastNums;
        lastNums = a[a.length - 1];
        System.out.printf("Last Number : " + lastNums);
    }


    public static int[] removeTheElement(int[] a, int index) {
        if (a == null || index < 0 || index >= a.length) {
            return a;
        }
        int[] anotherArray = new int[a.length - 1];

        for (int i = 0, k = 0; i < a.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = a[i];
        }
        return anotherArray;
    }

    public static int[] insertX(int n, int[] a, int x, int pos){
        Scanner input = new Scanner(System.in);
        int newarr[]= new int[n+1];
        for (int i = 0; i < n+1; i++) {
            if (i < pos -1)
                Ånewarr[i] = a[i];
            else if(i==pos-1)
                newarr[i]=x;
            else newarr[i] = a[i-1];
        }
return newarr;
        }

    public static void main(String[] args){
        int n= InputSizeOfArray();
        int[] a = InputValueOfArray(n);
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        int x = input.nextInt();
        int pos = input.nextInt();
        sortArray(a);
        print(a);
        averageOdd(a);
        findTheMaxValue(a);
        findTheLastValue(a);
        System.out.println("\nOriginal Array:"+ Arrays.toString(a));
        System.out.println("Enter Index to remove: " + index);
        a = removeTheElement(a,index);
        System.out.println("Result Array:"+ Arrays.toString(a));

        System.out.println("Initial Array:\n"+ Arrays.toString(a));
        System.out.println("Input x: "+ x);
        System.out.println("Input pos: "+pos);
        a = insertX(n,a,x,pos);
        System.out.println("\nArray with " + x
                + " inserted at position "
                + pos + ":\n"
                + Arrays.toString(a));



    }
}


