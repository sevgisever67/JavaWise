package day24_staticKeyword;

public class C01_staticBlock {


    public static void main(String[] args) {
        System.out.println("main metod çalıştı");
        System.out.println("=============");
        C01_staticBlock obj1=new C01_staticBlock();


    }
    static {
        System.out.println("static olan block çalıştı");
    }
    static {
        System.out.println("alttaki static block çalıştı");
    }
    {
        System.out.println("static olmayan block çalıştı");
    }
}

