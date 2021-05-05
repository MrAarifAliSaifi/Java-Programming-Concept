package com.company;
import java.util.Locale;
public class Stringmethod{
    public static void main(String[] args) {
        String str="name"; //here we are decalring  the string here
        //in this program we will see some method of the string
        int value=str.length();
        System.out.println("the length of the string is "+value);
        System.out.println(str.toUpperCase());
        String str2="aarif ali saif";
        System.out.println(str2.toUpperCase());
        System.out.println(str2.substring(3));
        System.out.println(str);//we can say that string are immutable
    }

}
