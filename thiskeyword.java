package com.company;
//in java this keyword is used to make reference to the current class
//in any class there may be a local and instance variable coompiler get confused which one is what
class All{
    int a;
    int b;
    All(int a){
//        System.out.println(t);
        this.a=a;//here we are initializing the variable of the class

    }
}
public class thiskeyword {
    public static void main(String[] args) {
        All obj=new All(100);
        System.out.println(obj);
        System.out.println(obj.a);
    }
}
