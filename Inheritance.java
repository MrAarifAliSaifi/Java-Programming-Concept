package com.company;
class first{//class created by the subham
    int x=10;
    int y=11;
    int m=22;
}
class amit extends first{
    int z=20;
}
class khalid extends amit{
    int z=20;
}
public class Inheritance{
    public static void main(String[] args) {
        amit a=new amit();
        System.out.println("the value of the x is"+a.);
    }
}
