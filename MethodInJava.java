package com.company;
        class Checking {//this is our custom method
            public int check(int a, int b) {
                int c = a + b;
//                System.out.println("The sum of two number is:" + c);
                return c;//this is return type
            }
        }
            public class MethodInJava
            {
                public static void main(String[] args)
                {
                    //in this video we will discuss about the method of java
                    Checking ch=new Checking();//here we are calling to this function here
                    int result=ch.check(8,8);
                    System.out.println(result);

                }
            }

