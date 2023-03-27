package day12_forlops;

public class C05_Faktöriyel2 {
    public static void main(String[] args) {
        //Kullanıcıdan 20 den küçük bir sayı alın.
        //Bu sayının faktöryeel değerini hesaplayın.
        //Konsolafaktöryel hesabının yapılışını yazın.
        //Or: 6!= 6*5*4*3*2*1=720


        int sayı=6;
        int faktöryel=1;

      /*  System.out.print(sayı+"! =");

        for (int i=sayı; i>0; i--){
            faktöryel*=i;
            if (i!=1){System.out.print( i+" * ");
            }else {
                System.out.print(i+ " ");
            }
        }
        System.out.println( "="+ faktöryel);
*/
        System.out.println("=================");

        System.out.print(sayı+"! = ");
        for (int i=sayı; i>=1; i--){
            faktöryel*=i;

            System.out.print(i>1?i+" * ": i+" ");
        }

        System.out.print( " = " +faktöryel);


    }
}
