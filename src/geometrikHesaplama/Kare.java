package geometrikHesaplama;

public class Kare extends Dikdortgen {
    @Override
    public void alanHesaplama(double x, double y) {

        System.out.println("Karenin alani : " + x * y);

    }

    @Override
    public void cevreHesaplama(double x, double y) {

        System.out.println("Karenin cevresi : " + (x + y) * 2);

    }
}


