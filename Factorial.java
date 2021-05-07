package com.company;
public class Factorial {//here in this code we are going to find the factorail of a number using the recursive appraoch
    static int fact(int a)
    {
        if(a==0||a==1)
        {
            return 1;
        }else
        {
            return a*fact(a-1);
        }
    }

    public static void main(String[] args) {
        int f=fact(1);
        System.out.println(f);

    }
}
