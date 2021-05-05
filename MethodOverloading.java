package com.company;
class Overloading{
    public int add(int a,int b)//here we are using the method overlaoding
    {
        int c=a+b;
        return c;
    }
    public float add(int a,float b)
    {
        float c=a+b;
        return c;
    }
    public double add(int a,double b)
    {
        double c=a+b;
        return c;
    }

}
public class MethodOverloading{
    public static void main(String[] args) {
        //method overlaoding is a technique where  we have multiple method with same nameOver
        Overloading obj=new Overloading();
        float sum=obj.add(12,14.12f);
        System.out.println(sum);

    }
}

