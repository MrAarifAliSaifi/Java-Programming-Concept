package com.company;
public class Exception {
    //in java there is primarily three types of errors when doing coding
    //1: syntax error
    int i=10;//it is a valid syntax in java
    //b=10;//this is a invalid syntax
    //these are called synjtax error
    //2: logical error
    //  lets take an analogy and this analogy is all about to print the prime number
    public static void main(String[] args) {//this is called a prime number here every thing is correct but threre is a logical error
        for(int i=1;i<5;i++)
        {
            System.out.println(i*2+1);
        }
        //exception error
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println(" i am working here");

    }


}
