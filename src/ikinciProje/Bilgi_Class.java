package ikinciProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static okulProje.Runner.kisi;


public class Bilgi_Class extends Kisi {
    //secimler de next al nextline degil
    Scanner scan = new Scanner(System.in);
    String arr[] = {"Kimya", "Fizik", "Biyoloji", "Matematik", "Geometri"};
    List<Kisi> ogretmen = new ArrayList<>();
    List<Kisi> ogrenci = new ArrayList<>();




        /*
        if (secim.equals("1")) {
            kisi = "OGRENCI";
            altMenu();
        } else if (secim.equals("2")) {
            kisi = "OGRETMEN";
            altMenu();
        } else if (secim.equalsIgnoreCase("Q")) {
            cikis();

        } else {
            System.out.println("Hatali giris yaptiniz");
            menu();
        }

         */


    public  void silme() {
        System.out.println("****** " + kisi + " silme  sayfasina hosgelmissen" + "*******");
        System.out.println("silmek istediginiz " + kisi + " nin kimlik no giriniz");
        String tc = scan.next();// bosluk durumuna gore try catch e bagla
        tc = tc.replaceAll(" ", "");
        boolean flag = true;
        if (kisi.equalsIgnoreCase("ogrenci")) {
            for (Kisi sil : ogrenci) {
                if (sil.getKimlikNo().equalsIgnoreCase(tc)) {
                    ogrenci.remove(sil);
                    System.out.println("silindi niye sildin ki ");
                    scan.nextLine();//dummy
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yanlis kimlik no girdiniz");
            }
        } else {
            for (Kisi sil : ogretmen) {
                if (sil.getKimlikNo().equalsIgnoreCase(tc)) {
                    ogretmen.remove(sil);
                    System.out.println("silindi niye sildin ki ");
                    scan.nextLine();//dummy
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yanlis kimlik no girdiniz");

            }
        }

    }

    public void listeleme() {
        if (kisi.equalsIgnoreCase("ogrenci")) {
            for (Kisi herOgrenci : ogrenci) {
                System.out.println(herOgrenci);
            }
        } else {
            for (Kisi herOgretmen : ogretmen) {
                System.out.println(herOgretmen);
            }
        }

    }

    public  void arama() {
        System.out.println("****** " + kisi + " arama sayfasina hosgelmissen" + "*******");
        System.out.println("aramak istediginiz " + kisi + " nin kimlik no giriniz");
        String tc = scan.next();
        tc = tc.replaceAll(" ", "");
        if (kisi.equalsIgnoreCase("ogrenci")) {
            boolean flag = true;//true aldik 91 95 arasi calisir ve flag false olur eger ogrenci yoksa 98 calisir
            for (Kisi tc1 : ogrenci) {
                if (tc.equals(tc1.getKimlikNo())) {
                    System.out.println(tc1.toString());//alinan tc li ogrenciyi geitirir
                    scan.nextLine();//dummy
                    flag = false;
                }
            }
            if (flag) {//true buddy si
                System.out.println("aradiginiz " + kisi + " listesinde yoktur");
            }
        } else {

            boolean flag = true;//true aldik 91 95 arasi calisir ve flag false olur eger ogrenci yoksa 98 calisir
            for (Kisi tc1 : ogretmen) {
                if (tc.equals(tc1.getKimlikNo())) {
                    System.out.println(tc1.toString());//alinan tc li ogretmeni geitirir
                    scan.nextLine();//dummy
                    flag = false;
                }
            }
            if (flag) {//true buddy si
                System.out.println("aradiginiz " + kisi + " listesinde yoktur");
            }


        }
    }

    public void ekleme() {//try catch calis{
        System.out.println("****** " + kisi + " ekleme sayfasina hosgelmissen" + "*********");

        System.out.println("isim gir");

        String adSoyad = scan.nextLine();
        System.out.println("kimlik no giriniz ");

        String kimlikNo = "";
        try {//1
            kimlikNo = scan.nextLine();
            kimlikNo = kimlikNo.replace(" ", "");//bosluklu girerse diye
            if (kimlikNo.length() != 5) {//2
                throw new StringIndexOutOfBoundsException("Hatali veya eksik tuslama yaptiniz");
            } else {//2
                if (kisi.equalsIgnoreCase("Ogrenci")) {//3
                    System.out.println("yas gir");

                    int yas = 0;
                    try {//4
                        yas = scan.nextInt();
                        scan.nextLine();//dummy
                        if (yas < 8 || yas > 19) {//5
                            throw new ArithmeticException("Bu yaslarda ogrenci olmaz");
                        } else {//5
                            System.out.println("ogrenci no gir");
                            int ogrenciNo = scan.nextInt();
                            scan.nextLine();//dummy
                            System.out.println("ogrenci sinif girin");
                            String sinif = scan.nextLine();

                            Ogrenci obj = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
                            ogrenci.add(obj);

                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());

                    }


                } else {//3
                    System.out.println("yas giriniz");

                    int yas = 0;

                    try {//4
                        yas = scan.nextInt();
                        scan.nextLine();//dummy
                        if (yas < 23 || yas > 65) {//5
                            throw new ArithmeticException("Bu yaslarda ogretmenlik yapamazsiniz");
                        } else {//5


                            System.out.println("brans gir");
                            boolean flag1 = false;
                            boolean flag = true;
                            String brans = "";
                            try {//6
                                brans = scan.nextLine();
                                for (int i = 0; i < arr.length; i++) {

                                    if (brans.equalsIgnoreCase(arr[i])) {//7


                                        flag = false;

                                    }


                                }

                                if (flag) {
                                    throw new ArrayStoreException("Boyle bir brans yoktur");
                                }else {
                                    System.out.println("sicil no gir");
                                    String sicilNo = "";

                                    try {
                                        sicilNo = scan.nextLine();
                                        sicilNo=sicilNo.replace(" ","");
                                        String sicilKontrol=sicilNo;
                                        sicilKontrol=sicilKontrol.replaceAll("\\d","");
                                        if(sicilKontrol.length()==1&&sicilNo.length()==6){
                                            Ogretmen obj2 = new Ogretmen(adSoyad, kimlikNo, yas, brans, sicilNo);
                                            ogretmen.add(obj2);
                                        }else{
                                            throw new Exception("Dikkat sicil no harf ile baslamali ve rakamla devam etmeli ve harften sonra sadece 5 rakam olmali");
                                        }
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }


                                }


                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }


                        }


                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        altMenu();
    }


    public static void cikis() {

        System.out.println("hoscakalin yine bekleriz");
    }
}
