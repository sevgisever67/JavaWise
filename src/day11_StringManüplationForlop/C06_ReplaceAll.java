package day11_StringManüplationForlop;

public class C06_ReplaceAll {
            public static void main(String[] args) {
        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // input1 : “15.30 €” , input2 : “11.40 €”
        // output : 26.70 €

                String input="15.30 €";
                String input2="11.40 €";

                input=input.replaceAll("\\D","");
                input2=input2.replaceAll("\\D","");
                System.out.println(input+ ""+ input2);

                double inp=Double.parseDouble(input);
                double inp2=Double.parseDouble(input2);

                System.out.println((inp+inp2)/100+ " €");





    }
}
