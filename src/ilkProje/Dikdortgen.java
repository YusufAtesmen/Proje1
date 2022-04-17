package ilkProje;

public class Dikdortgen extends Sekil{




    @Override
    public void alanHesaplama(double x, double y) {

        System.out.println("Dikdortgenin alani : "+x*y);

    }

    @Override
    public void cevreHesaplama(double x, double y) {

        System.out.println("Dikdortgenin cevresi : "+(x+y)*2);



    }
}
