package PBOMinggu9.InterfaceLatihan;

class Mahasiswa implements ICumlaude {
    protected String nama;

    Mahasiswa(String nama){
        this.nama = nama;
    }

    @Override
    public void lulus(){
        System.out.println("Aku mahasiswa masih belum lulus (kurang skkm hehe)");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK ku 4 coy ong ong ong");
    }

    @Override
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }


}
