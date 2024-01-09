import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Kitap> kitaplar = new ArrayList<>();
       /*
        kitaplar.add(new Kitap("Design Patterns","Erich Gamma",400));
        kitaplar.add(new Kitap("Clean Code","Robert C.Martin",464));
        kitaplar.add(new Kitap("Java: The Complate Reference","Herbert Schild",1248));
        */

        kitaplar.add((new Kitap("Design Patterns","Erich Gamma",400,true,false)));
        kitaplar.add(new Kitap("Clean Code","Robert C.Martin",464,true,true));
        kitaplar.add(new Kitap("Java: The Complate Reference","Herbert Schild",1248,false,true));

        Kutuphane kutuphane = new Kutuphane();
        KitapSiralamaStrategy adinaGoreSiralamaStrategy = new AdinaGoreSiralamaStrategy();
        KitapSiralamaStrategy yazaraGoreSiralamaStrategy = new YazaraGoreSiralamaStrategy();
        KitapSiralamaStrategy sayfaSayisinaGoreSiralama = new SayfaSayisinaGoreSiralamaStrategy();

        KitapState populerKitapState = new PopulerKitaplarState();
        kutuphane.setSiralamaStrategy((adinaGoreSiralamaStrategy));
        kutuphane.kitaplariListele(kitaplar);
        kutuphane.setState(populerKitapState);
        kutuphane.kitaplarinGuncelDurumunuListele(kitaplar);



        kutuphane.setSiralamaStrategy(adinaGoreSiralamaStrategy);
        kutuphane.kitaplariListele(kitaplar);
        System.out.println();

        kutuphane.setSiralamaStrategy(yazaraGoreSiralamaStrategy);
        kutuphane.kitaplariListele(kitaplar);
        System.out.println();

        kutuphane.setSiralamaStrategy(sayfaSayisinaGoreSiralama);
        kutuphane.kitaplariListele(kitaplar);

    }
}