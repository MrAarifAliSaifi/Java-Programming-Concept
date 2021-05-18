package com.company;
class A{
//    int n=19;
    public void add() {
        System.out.println("i dint take any thig");
    }
        public void add(int a){
            System.out.println("i take only one variable"+a);
        }
        public void add(int a,int b,int c){
            System.out.println("i take three variable");
        }
    }


class B extends A{
//    int n=20;
    B()
    {
//        System.out.println(n);
//        System.out.println(super.n);
    }
    public void add(){
        System.out.println("hello welcome to the programming of child");


    }
    public void add(int a){
        System.out.println("1");
        super.add(12);


    }
    public void add(int b,int c){
        System.out.println("2d");


    }
}
public class Super{
    public static void main(String[] args) {
        B obj =new B();
        obj.add(1);

    }
}
