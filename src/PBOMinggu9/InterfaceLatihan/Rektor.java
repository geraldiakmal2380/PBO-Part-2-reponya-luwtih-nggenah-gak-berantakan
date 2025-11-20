package PBOMinggu9.InterfaceLatihan;

class Rektor {
    public void bersertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya rektor, memberikan sertifikat cumlaude");
        System.out.println("Selamat! silahkan perkenalkan diri anda");

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        mahasiswa.kuliahDiKampus();

        System.out.println("--------------------------------------------");

    }
}
