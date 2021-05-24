package com.company;
import java.util.Scanner;
public class SpecificationExceptionHandling {
    public static void main(String[] args) {
        int arr[]=new int[3];
        arr[0]=50;
        arr[1]=30;
        arr[2]=60;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the index number:");
        int ind=sc.nextInt();
        System.out.println("please let us know by which number do you want to devide this index of array");
        int num=sc.nextInt();
        try {
            System.out.println("the result is:" + arr[ind] / num);
        }
        catch(ArrayIndexOutOfBoundsException e)//here we are using the exception specific handling concept
        {
            System.out.println("some errors occur:");
            System.out.println(e);
        }
        catch (ArithmeticException e)//here also
        {
            System.out.println(e);

        }


//        System.out.println("welcome you have entered the index number:"+ind);

    }

}
