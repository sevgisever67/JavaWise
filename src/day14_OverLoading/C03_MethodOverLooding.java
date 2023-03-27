package day14_OverLoading;

public class C03_MethodOverLooding {
    public static void main(String[] args) {
        String str="Bu iş olacak";

        //Bir Clasda aynı isme ait farklı işlem yapacak
        //farklı method olabilir
        //Java bunlardan hangisinin çalışacağına parametrelere göre karar verebilir.
        //bir Clasta ismi aynı , parametreleri farklı methodlar olabilir.
        //bir Methoda birden fazla anlam yüklemesi denir.

        System.out.println(str.replace("Bu iş", "Java Güzel"));

        System.out.println(str.replace('u', 'e'));


    }
}
