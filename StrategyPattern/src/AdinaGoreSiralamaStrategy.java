import java.util.List;

public class AdinaGoreSiralamaStrategy implements KitapSiralamaStrategy{
    @Override
    public void sort(List<Kitap> kitaplar) {
        // lambda fonksiyonu iki nesneyi karşılaştırarak kontrol edecek fonksiyon
        // lambda liste üzerinde sıralama yapmak için kullandığımız özel fonksiyon
        // compareTo da karşılaştırma için
        kitaplar.sort((b1,b2) -> b1.getAdi().compareTo(b2.getAdi()));
        System.out.println("Kitaplar, başlık sırasına göre sıralandı.");
    }
}
