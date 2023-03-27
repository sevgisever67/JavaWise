package day30_inheritance;

public class CToyotaCoralla extends BToyota {

    String lastik="Lassa 205-55-55";
    String model="Corolla";
    String yakıt="dizel benzinli ve lektirikli olabilir";
    public void uretimYeri(){
        System.out.println("bütün Corolla Araçlar Türkiyede üretilir");
    }
    public void motor(){
        System.out.println("Corolla araçlar türkiyede üretilen motor kullanır");
    }
    public static void main(String[] args) {

        CToyotaCoralla coralla=new CToyotaCoralla();
        System.out.println(coralla.lastik);
        System.out.println(coralla.model);
        coralla.motor();
        coralla.uretiYeri();
        System.out.println(coralla.marka);
        System.out.println(coralla.aku);


    }
}
