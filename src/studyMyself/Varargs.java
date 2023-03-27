package studyMyself;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {

        topla(4,2,4,5);


    }
    public  static  void  topla(int c, int ... a){
        int toplam=0;
        for (int each:a
             ) {
            toplam+=each;
        }
        System.out.println(toplam/c);
    }
}
