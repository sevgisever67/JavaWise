package day30_inheritance;

public class BToyota extends Araba {
    String marka="Toyota";
    String aku="inci";
    String lastik="Biriston";

    public void motor(){
        System.out.println("Toyoyolar çevreci motorlar kullanır");
    }
    public  void  güvenlik (){
        System.out.println("Toyota araçlar extra güvenlik önlemleri barındırır");
    }
}
