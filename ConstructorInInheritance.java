package com.company;
class parent{
    public parent()//this is our constructor and we are calling to this contuctor
    {
        System.out.println(" i am the constructor of parent class");
    }
}
class child extends parent{
    public child()
    {
        System.out.println(" i am the constructor of child class");
    }

}
public class ConstructorInInheritance {
    public static void main(String[] args) {
        child ch=new child();
    }
}
