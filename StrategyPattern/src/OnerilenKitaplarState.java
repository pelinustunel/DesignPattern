import java.sql.SQLOutput;
import java.util.List;

public class OnerilenKitaplarState implements KitapState{
    @Override
    public void KitapGoruntule(List<Kitap> kitaplar) {
        System.out.println("Önerilen Kitaplar");

        for(Kitap kitap : kitaplar) {
            if(kitap.isOnerilen()) {
                System.out.println(kitap);
            }
        }
    }
}
