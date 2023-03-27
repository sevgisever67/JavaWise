package day30_inheritance;

public class EChild extends DParentAccesModifier{
    public static void main(String[] args) {
        EChild eChild=new EChild();
        System.out.println(eChild.sayiDefault);
        System.out.println(eChild.sayiProtected);
        System.out.println(eChild.sayiPublic);

    }
}
