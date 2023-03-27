package day31_inheritance;

import day30_inheritance.GParent;

public class AChild extends GParent {
     String childStr;
    AChild(){
        System.out.println("Child class constructor çalıştı");
    }

    public static void main(String[] args) {
        AChild objChild=new AChild();


    }
}
