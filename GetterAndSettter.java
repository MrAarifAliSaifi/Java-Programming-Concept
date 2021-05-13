package com.company;
import java.util.Scanner;
class Myemployee{//this is my main class
   private int age;//here we are deaclarigg the attributes
     private String name;//here we are decalring the name
     public void setAge(int n){//from this point the concept of getter and setter has benn started
       if(n<18)
       {
           System.out.println("Please enter the valid age:more than 18 ");
       }
       else{
           age=n;
       }
     }
    public void setname(String m){

    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class GetterAndSettter{//this is our derived code
    public static void main(String[] args){
     Myemployee m=new Myemployee();
//     m.setname("aarif ali saifi");
//     m.setAge(34);
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the credentails");
        System.out.println("Please Enter the age");
        int age=sc.nextInt();
        m.setAge(age);
//        String name=sc.nextLine();
//        m.setname(name);
//        System.out.println("the age of the wmployee is given :");
////        m.setAge(age);
//        System.out.println(m.getName());
        System.out.println("Your age is"+m.getAge());





//     m.age=34;
//     m.name="aarif ali saifi";
//     System.out.println("the age of the employee is:"+m.age);
//        System.out.println("the age of the employee is:"+m.name);

    }
}
