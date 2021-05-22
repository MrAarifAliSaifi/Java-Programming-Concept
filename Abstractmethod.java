package com.company;
 abstract class Apni1//here is abstract method available
{
    public void welcome()
    {
        System.out.println("welcome");
    }
    public void greeting()
    {
        System.out.println("goodmorning");

    }
    abstract void welcome1();
    
}
class apni2 extends Apni1
{
    void welcome1()//here is abstract method implemented in the child class
    {
        System.out.println("i am the  method of the apni1 class and i am here implemented");
    }
}
public class Abstractmethod {
    public static void main(String[] args) {
        Apni1 ap = new Apni1() {
            @Override
            void welcome1() {

            }


        };
    }

}