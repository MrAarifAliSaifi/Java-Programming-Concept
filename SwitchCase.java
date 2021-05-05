package com.company;
import java.util.Scanner;//this is our scanner class
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextByte();
        switch(value)//initialising the value of value taken by the user
        {
            case 1://case one
            {
                System.out.println("sunday");
                break;

            }
            case 2://case two
                System.out.println("monday");
                break;
        }
    }
}
