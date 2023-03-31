package day03_DataCastinveWrapperClass;

public class C05_explicitNarrowing {
    public static void main(String[] args) {

        double db1=45.32;
        int in1= (int) db1; //

        System.out.println(in1);

        byte by1=(byte) in1;
        System.out.println(by1);

        in1= 130;
        by1= (byte) in1;
        System.out.println(by1+"");





    }

}
