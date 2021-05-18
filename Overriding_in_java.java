package com.company;
class Ekclass{
    public void add()
    {
        System.out.println("hey, i can add two numbers at once ");
    }
    public void sub()
    {
        System.out.println("hey, i can sub two numbers at once ");
    }
    public void mul()
    {
        System.out.println("hey, i can mul two numbers at once ");
    }
    public void div()
    {
        System.out.println("hey, i can div two numbers at once ");
    }
}
class Ekor extends Ekclass{
    @Override
    public void div()
    {
        System.out.println("hey, i can divide two numbers at once ");
    }

}
public class Overriding_in_java {
    public static void main(String[] args) {
        Ekor obj=new Ekor();
        obj.add();
        obj.div();
        obj.sub();
        obj.mul();

    }
}
