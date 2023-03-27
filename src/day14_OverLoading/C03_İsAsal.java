package day14_OverLoading;

public class C03_İsAsal {
    public static void main(String[] args) {

        System.out.println(isAsal(20));
        System.out.println(isAsal(88));
    }
    public static boolean isAsal(int sayi){
        int flag=0;


        for (int i=2; i<sayi; i++){
            if (sayi%i==0){
                flag++;
                break;
            }
        }
        if (sayi==2){return true;
        }
        else if(flag==0){
           return true;
        }else {
            return false;
        }

    }


}
