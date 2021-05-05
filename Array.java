package com.company;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("hello this is aarif ali saifi");
        //here we are going to decalre a array
//        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int arr[];
        arr=new int[20];
        System.out.println("Please enter the value of the array");
        for(int i=0;i<arr.length;i++)
        {

            arr[i]=sc.nextInt();
        }
        System.out.println("The values of the array given by the user are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }




    }
}
