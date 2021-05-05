package com.company;
public class BreakAndContinue
{
    public static void main(String[] args) {
        //break is a keyword which is mostly used inside the loops
        for(int i=1;i<=50;i++)
        {
            if(i==5)
            {
                System.out.println("Ending the loop");
                break;//here the loop has been ended
            }
            System.out.println(i);
            System.out.println("java is great");

        }
    }
}
