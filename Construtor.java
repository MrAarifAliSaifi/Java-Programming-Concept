package com.company;
import java.sql.SQLOutput;
class Hahaha{
   private int age;
   private String name;
   private float id;
    public Hahaha()//here we are decalring the constructor
    {
        age=12;
        name="aarif";//initializing the value of the class using the constructor
        id=12.3f;
    }
    public Hahaha(int age,String name,float id)
    {
        age=age;
        name="name";
        id=id;
    }
//    public Hahaha(int age,String name,float id,)
//    {
//        age=age;
//        name="name";
//        id=id;
//    }
//   public void setter(int n)
//   {
//       age=n;
//   }
    public int getage()
    {
       return age;
    }
//    public void setter(String n)
//    {
//        name=n;
//    }
    public String getName()
    {
        return name;
    }
//    public void setter(float n)
//    {
//        id=n;
//    }
    public float getid()
    {
        return id;
    }

}
public class Construtor{
    public static void main(String[] args){
        Hahaha h=new Hahaha(12,"aarif",12.3f);
        System.out.println(h.getName());
        System.out.println(h.getid());
        System.out.println(h.getage());

        h.getage();
//        h.setter(13);
//        h.setter(123.3f);
//        h.setter("name");
//        System.out.println("the age of the user"+h.getage());
//        System.out.println("the id of the user"+h.getid());
//        System.out.println("the name of the user"+h.getName());
//       h.name="Aarif ali saifi";
//       h.id=12.123f;
//       System.out.println("the vaue of the user are given below");
//       System.out.println(h.age);
//       System.out.println(h.name);
//         hello my naem isaarif ali safii aliii fil System.out.println(h.id);
    }
}
