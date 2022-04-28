package hospital_Proje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    static Scanner scan = new Scanner(System.in);
    static int giris;
    static String kelime;
    static double kontrol;



    public static int intGirisi() {
        try {
            giris = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("sayi gir");
            scan.nextLine();
            intGirisi();
        }
        return giris;
    }
    public static double doubleGirisi() {
        try {
            kontrol = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("sayi gir");
            scan.nextLine();
            doubleGirisi();
        }
        return kontrol;
    }

    public static String stringGirisi() {
        try {
            kelime = scan.nextLine();
            String kontrol = kelime.replaceAll("\\D", "");

            if (kontrol.length() != 0 ) {
                throw new InputMismatchException("Please Enter Letters");
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            stringGirisi();
        }

        return kelime;
    }
}