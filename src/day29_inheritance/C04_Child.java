package day29_inheritance;

public class C04_Child  extends C03_ParentClass {
    int c=20;
    int a;
    String s ="Child claa";
    String m;
    public  void metod1 (){
        System.out.println("parent metod1");
    }
    public static void main(String[] args) {
        C03_ParentClass objC03= new C03_ParentClass();
        objC03.a=20;
        objC03.b=22;
        objC03.s="p";
        objC03.t="k";
        objC03.metod1();
        C04_Child objC04=new C04_Child();
        objC04.a=50;
        objC04.c=20;
        objC04.s="u";
        objC04.m="l";
        objC04.metod1();

        objC04.t="y";
        


    }
}
