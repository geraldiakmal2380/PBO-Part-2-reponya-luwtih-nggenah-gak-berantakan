package PBOMinggu9.AbstractClass;

class Orang {
    private String nama;
    private Hewan hewanPeliharaan;

    Orang(String nama){
        this.nama = nama;
    }

    void PeliharaHewan(Hewan hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }

    void AjakPeliharaanJalan(){
        System.out.println("Namaku "+ this.nama);
        System.out.println("Hewan perliharaanku berjalan dengan cara : ");
        this.hewanPeliharaan.bergerak();
        System.out.println("-------------------------");
    }
}
