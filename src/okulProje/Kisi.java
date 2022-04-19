package okulProje;

public class Kisi implements OkulYonetim{
    private  String adSoyad;
    private String kimlikNo;
    private int yas;
    public Kisi(){

    }
    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return " " +
                "adSoyad = '" + adSoyad + '\'' +
                ", kimlikNo = '" + kimlikNo + '\'' +
                ", yas = " + yas ;
    }

    @Override
    public void ekleme() {

    }

    @Override
    public void arama() {

    }

    @Override
    public void listeleme() {

    }

    @Override
    public void silme() {

    }

    @Override
    public void menu() {

    }

    @Override
    public void altMenu() {

    }
}
