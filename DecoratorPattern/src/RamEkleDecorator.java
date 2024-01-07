public class RamEkleDecorator extends BilgisayarDecorator {

    private int ramBoyutu;

    public RamEkleDecorator(Bilgisayar bilgisayar, int ramBoyutu) {
        super(bilgisayar);
        this.ramBoyutu = ramBoyutu;
    }

    @Override
    public double fiyat() {
        double ramFiyati = super.fiyat();

        if (ramBoyutu == 8) {
            ramFiyati += 2500; // 8 GB RAM için fiyat eklemesi
        } else if (ramBoyutu == 16) {
            ramFiyati += 4500; // 16 GB RAM için fiyat eklemesi
        } else if (ramBoyutu == 32) {
            ramFiyati += 9000; // 32 GB RAM için fiyat eklemesi
        }

        return ramFiyati;
    }

    @Override
    public String aciklama() {
        return super.aciklama() + ramBoyutu + " GB RAM eklendi.";
    }
}
