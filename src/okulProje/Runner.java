package okulProje;

import java.util.Scanner;

public class Runner extends Bilgi_Class {
    Scanner scan = new Scanner(System.in);
   static String kisi;

    public static void main(String[] args) {

        Runner obj = new Runner();

    }

    public Runner(){
        System.out.println("\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisi = "Ogrenci";
                altMenu();
                break;
            case "2":
                kisi = "Ogretmen";
                altMenu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                Runner obj = new Runner();
                break;
        }
    }

    public void altMenu() {
        System.out.println(
                "=== "+kisi+" sayfasina hosgeldiniz ===\n" +
                "\t 1-EKLEME\n" +
                "\t 2-ARAMA\n" +
                "\t 3-LİSTELEME\n" +
                "\t 4-SİLME\n" +
                "\t 5-ANA MENÜ\n");
        //scan.nextLine();//dummy
        int secim2 = scan.nextInt();//nextline alirsan dongudekli dummy ler calisir extrdadan
        switch (secim2) {
            case 1:
                ekleme();
                // altMenu(); try catch ile bagli oldugu icin surekli calisir

                break;
            case 2:
                arama();
                altMenu();
                break;
            case 3:
                listeleme();
                altMenu();
                break;
            case 4:
                silme();
                altMenu();
                break;
            case 5:
                Runner obj = new Runner();
                break;
            default:
                System.out.println("hacim yanlis tusa bastin tekrar deneyin");
                altMenu();
                break;
        }

    }
}