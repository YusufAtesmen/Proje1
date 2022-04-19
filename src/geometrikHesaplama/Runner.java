package geometrikHesaplama;

import java.util.Scanner;

public class Runner extends Ucgen{

    static int ucgenCevre;

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        try {
            System.out.println("Dikdortgenin 1. kenarini girin");

            double sayi=scan.nextDouble();
            System.out.println("Dikdortgenin 2. kenarini girin");

            double sayi2=scan.nextDouble();

            if(sayi<=0){
                throw new IllegalArgumentException();

            }else if(sayi2<=0){
                throw new IllegalArgumentException();
            }else {
                Dikdortgen obj1 = new Dikdortgen();
                obj1.alanHesaplama(sayi, sayi2);
                obj1.cevreHesaplama(sayi,sayi2);
            }



        } catch (IllegalArgumentException e) {

            System.out.println("Hata!!! Girdigin degerlere dikkat et sifirdan buyuk olması gerekiyor");

            System.out.println("---------");
        }

        System.out.println("Karenin kenarini giriniz");

        try {
            int kareKenar=scan.nextInt();

            if(kareKenar<=0){
                throw new Exception();
            }else {
                Kare obj2 = new Kare();
                obj2.alanHesaplama(kareKenar,kareKenar);
                obj2.cevreHesaplama(kareKenar, kareKenar);
            }
        } catch (Exception e) {
            System.out.println("Hata!!! Girdigin degerlere dikkat et sifirdan buyuk olması gerekiyor");
            System.out.println("---------");
        }


        System.out.println("Cemberin yaricapini giriniz");

        try {
            double cemberYariCap=scan.nextDouble();

            if (cemberYariCap<=0){
                throw new IllegalArgumentException();
            }else {
                Cember obj3 = new Cember();

               obj3.cemberCevre(cemberYariCap);
               obj3.cemberAlan(cemberYariCap);
            }
        } catch (Exception e) {
            System.out.println("Hata!!! Girdigin degerlere dikkat et sifirdan buyuk olması gerekiyor");
            System.out.println("---------");
        }

        try {
            System.out.println("Ucgenin 1 kenarini giriniz");
            int kenar1= scan.nextInt();
            System.out.println("Ucgenin 2 kenarini giriniz");
            int kenar2= scan.nextInt();
            System.out.println("Ucgenin 3 kenarini giriniz");
            int kenar3= scan.nextInt();
            if(kenar1<=0){
                throw new IllegalArgumentException();

            }else if(kenar2<=0){
                throw new IllegalArgumentException();

            }else if(kenar3<=0){
                throw new IllegalArgumentException();
            }else {

                Ucgen obj4 = new Ucgen();

                ucgenCevre = obj4.ucgenCevre(kenar1, kenar2, kenar3);
                obj4.ucgenAlan(kenar1, kenar2, kenar3);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
