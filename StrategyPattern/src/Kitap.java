public class Kitap {

    private String adi;
    private String yazar;
    private int sayfaSayisi;

    private boolean populerlik;

    public boolean isPopulerlik() {
        return populerlik;
    }

    public void setPopulerlik(boolean populerlik) {
        this.populerlik = populerlik;
    }

    public boolean isOnerilen() {
        return isOnerilen;
    }

    public void setOnerilen(boolean onerilen) {
        isOnerilen = onerilen;
    }

    private boolean isOnerilen;



    public Kitap(String adi,String yazar, int sayfaSayisi){
        this.adi = adi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;

    }
    public Kitap(String adi, String yazar, int sayfaSayisi, boolean populerlik, boolean isOnerilen) {
        this.adi = adi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
        this.populerlik = populerlik;
        this.isOnerilen = isOnerilen;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String toString(){
        return "Kitap{" +
                "Başlık = '" + adi + '\'' +
                ", Yazar = '" + yazar + '\'' +
                ", Sayfa Sayısı = '" + sayfaSayisi +
                '}';
    }



}
