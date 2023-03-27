package day12_forlops;

public class C09_NestedForloops {
    public static void main(String[] args) {
        /*
                    *
                    *  *
                    *  * *
                    *  * * *
         */

        int satır=6;


        for (int i=1; i<=satır; i++){
            for (int j = 1; j <=i ;j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }


    }

}
