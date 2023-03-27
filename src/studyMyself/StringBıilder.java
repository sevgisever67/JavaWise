package studyMyself;

public class StringBıilder {
    public static void main(String[] args) {
        String str ="java candır.";

        StringBuilder sb1=new StringBuilder(str);
        StringBuilder sb2=new StringBuilder(str);
       // System.out.println(sb1.reverse());
        System.out.println(str);
        System.out.println(sb1);
        System.out.println(sb1.append(" can"));
        System.out.println(sb1 == sb1);
        System.out.println(sb1.equals(str));
        System.out.println(sb1.substring(1, 6));
        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString()));
        System.out.println(sb1.insert(11, str, 2, 3));
        System.out.println(sb1.replace(2, 4, str));
        sb1.ensureCapacity(8);


    }
}
