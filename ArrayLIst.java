package com.company;
import java.util.ArrayList;
public class ArrayLIst {
    public static void main(String[] args) {
        ArrayList li1=new ArrayList();
//        ArrayList<Integer> li1=new ArrayList<Integer>();
        li1.add("Aarif");//add()
        li1.add("Ali");//addaAll()
        li1.add("saifi");//remove()
        li1.add("billa");//removeAll()
        li1.add(2,"khalid");
        li1.remove("khalid");
        li1.add(12);
        li1.add(13);
        li1.add(14);
        li1.add(14);
        li1.add(6,15);
        li1.set(2,"sahil");
        System.out.println(li1.get(2));
        System.out.println(  "The toatal number of the elememts in side the list:"+ li1.size());

//        List li2=new ArrayList();
        System.out.println(li1);



    }
}

