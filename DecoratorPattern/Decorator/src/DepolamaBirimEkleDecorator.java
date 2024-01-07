public class DepolamaBirimEkleDecorator extends BilgisayarDecorator {

    private int depolamaBoyutu;

    public DepolamaBirimEkleDecorator(Bilgisayar bilgisayar, int depolamaBoyutu) {
        super(bilgisayar);
        this.depolamaBoyutu = depolamaBoyutu;
    }

    @Override
    public double fiyat() {
        double depolamaFiyati = super.fiyat();

        if (depolamaBoyutu == 512) {
            depolamaFiyati += 7300; // 512GB SSD için fiyat eklemesi
        } else if (depolamaBoyutu == 1) {
            depolamaFiyati += 9000; // 1TB SSD için fiyat eklemesi
        } else if (depolamaBoyutu == 2) {
            depolamaFiyati += 20000; // 2TB SSD için fiyat eklemesi
        }

        return depolamaFiyati;
    }

    @Override
    public String aciklama() {
        if (depolamaBoyutu == 512){
            return super.aciklama() + depolamaBoyutu + " GB SSD Disk Eklendi.";
        }
        else if ( depolamaBoyutu == 2 || depolamaBoyutu == 1){
            return super.aciklama() + depolamaBoyutu + " TB SSD Disk Eklendi.";
        }
        else {
            return "Geçersiz Depolama Boyutu";
        }

    }
}
