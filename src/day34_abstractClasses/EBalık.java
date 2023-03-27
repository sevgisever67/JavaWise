package day34_abstractClasses;

public abstract class EBalık extends AHayvan{
  public void hareket(){
      System.out.println("Balıklar yüzer");
  }

    @Override
    public void solunum() {
      System.out.println("Balıklar solunum yapar");
    }

    @Override
    public void cogalma() {
        System.out.println("Balıklar yumurta ile çoğalır");
    }
    public  abstract void yüzgeç();
    public  abstract void iskeletYapısı();

}
