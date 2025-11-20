package PBOMinggu9.AbstractClass;

class MainBerjalan {
    public static void main(String[] args) {
        Kucing kucingkampung = new Kucing();
        Ikan lumbaLumba = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("budi");

        ani.PeliharaHewan(kucingkampung);
        budi.PeliharaHewan(lumbaLumba);

        ani.AjakPeliharaanJalan();
        budi.AjakPeliharaanJalan();

        int a = 3;
        Math.round(a);
    }
}
