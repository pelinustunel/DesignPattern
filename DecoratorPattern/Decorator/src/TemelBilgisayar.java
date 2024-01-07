// Temel Bileşen Sınıfı
public class TemelBilgisayar implements Bilgisayar{

    @Override
    public double fiyat() {
        return 25000.00;
    }

    @Override
    public String aciklama() {
        return "Temel Bilgisayar ";
    }
}
