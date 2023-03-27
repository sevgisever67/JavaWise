package studyMyself;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TrayCatch2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan =new Scanner(System.in);
        String str="anami ";
        int [] arr={1,2,34,4,25,65,8,9,52,66,45,99,47};

        try {
           System.out.println("Index olarak kullanmak üzere 0 veya bbir tam sayı giriniz");
            int index=scan.nextInt();
            System.out.println(arr[index]);
            System.out.println(str.charAt(index));
        } catch (InputMismatchException e) {
            System.out.println("Lütfen bir tamsayı giriniz");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Lütfen Array in sınırları içinde bir index giriniz");
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Lütfen String sınırları içinde bir index giriniz");
        }
        System.out.println("Nihayet bu konuyu anladım");



    }
}
