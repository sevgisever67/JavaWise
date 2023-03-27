package day12_forlops;

public class C06_StringiTerseÇevirme {
    public static void main(String[] args) {

        String input="Java Candır";
        //String output="rıdmaC avaJ";

        String output="";


        for (int i=input.length()-1; i>=0; i--){
            output+=input.charAt(i);
        }
        System.out.print(output+ " ");

    }

}
