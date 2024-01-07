public class Main {
    public static void main(String[] args) {

        // Temel Bilgisayar
        Bilgisayar temelBilgisayar = new TemelBilgisayar();
        System.out.println("Fiyat: " + temelBilgisayar.fiyat() + "TL");
        System.out.println("Açıklama: " + temelBilgisayar.aciklama());
        System.out.println();

        // Ram Eklenmiş Bilgisayar
        Bilgisayar ramBilgisayar = new RamEkleDecorator(new TemelBilgisayar(), 8);
        System.out.println("Temel Bilgisayar");
        System.out.println("Açıklama: " + ramBilgisayar.aciklama());
        System.out.println("Fiyat: " + ramBilgisayar.fiyat() + "TL");
        System.out.println();

        // Depolama Birimi ve Ram Eklenmiş Bilgisayar
        Bilgisayar depolamaRamliBilgisayar = new DepolamaBirimEkleDecorator(new RamEkleDecorator(new TemelBilgisayar(), 16), 2);
        System.out.println("Açıklama: " + depolamaRamliBilgisayar.aciklama());
        System.out.println("Fiyat: " + depolamaRamliBilgisayar.fiyat() + "TL");
        System.out.println();

        // Sadece Depolama Birimi  512 GB Eklenmiş Bilgisayar
        Bilgisayar depolamaBilgisayar = new DepolamaBirimEkleDecorator(new TemelBilgisayar(), 512);
        System.out.println("Açıklama: " + depolamaBilgisayar.aciklama());
        System.out.println("Fiyat: " + depolamaBilgisayar.fiyat() + "TL");
        System.out.println();

        // Sadece Depolama Birimi  2 TB Eklenmiş Bilgisayar
        Bilgisayar depolamaBilgisayar2 = new DepolamaBirimEkleDecorator(new TemelBilgisayar(), 2);
        System.out.println("Açıklama: " + depolamaBilgisayar2.aciklama());
        System.out.println("Fiyat: " + depolamaBilgisayar2.fiyat() + "TL");


    }
}
