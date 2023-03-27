package day14_OverLoading;

public class C01_AsalSayıYazdır {
    public static void main(String[] args) {
        //verilen pozitif bir sayının asal olup olmadığını yazdıran bir metod oluşturun.


        asalMiYazdır(2);
        asalMiYazdır(7);
        asalMiYazdır(53);


    }
    public static void asalMiYazdır(int sayi){
        int flag=0;


        for (int i=2; i<sayi; i++){
            if (sayi%i==0){
                flag++;
                break;
            }
        }
        if (sayi==2){
            System.out.println("2 asal sayıdır");
        }
        else if(flag==0){
            System.out.println("Girilen : "+ sayi + "sayısı asal sayıdır");
        }else {
            System.out.println("asal değil");
        }

    }

}
