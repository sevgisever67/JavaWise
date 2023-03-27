package day16_doWhileOOP_Scope;

public class C01_Hastane {
    public static void main(String[] args) {
        ADoktor dok1= new ADoktor();
        System.out.println(dok1.askerlikYaptiMi); // false
        dok1.isim= "Kemal";
        dok1.soyisim ="Yilmaz";
        dok1.dogumYili=1980;
        System.out.println(dok1.isim); // Kemal


        ADoktor dok2= new ADoktor();
        System.out.println(dok2.isim); // null
        dok2.soyisim="Celik";
        System.out.println(dok2.soyisim); // Celik
        System.out.println(dok1);

        System.out.println(dok1.fakülte); //Tip
        System.out.println(dok2.fakülte); //Tip
        dok1.isim="burcu";
        System.out.println(dok2);
        dok1.fakülte="Tip Fakültesi";


        ADoktor dok3=new ADoktor();
        System.out.println(dok3.dogumYili);//0
        System.out.println(dok3.fakülte);

        System.out.println(ADoktor.fakülte);// static variable için tavsiye edilen erişim
                                            //yöntemi: Classİsmi.StaticUye

        System.out.println(dok1.askerlikYaptiMi);

    }



}
