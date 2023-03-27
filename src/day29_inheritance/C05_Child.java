package day29_inheritance;

public class C05_Child extends C03_ParentClass {

    int c=20;
    int a;
    String s ="Child claa";
    String m;
    public  void metod1 (){
        System.out.println("parent metod1");
    }

    public static void main(String[] args) {
        C05_Child obj=new C05_Child();
        System.out.println(obj.a);
        System.out.println(obj.c);
        

    }
}
