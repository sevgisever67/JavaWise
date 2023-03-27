package day31_inheritance;

public class CToyota extends BAraba {
    String str2="Toyota";
   protected CToyota(){
        System.out.println("parametresiz constructor çalıştı");
    }
    protected CToyota(String str){
        System.out.println("Strin parametreli");
    }
}
