package PBOMinggu9.InterfaceLatihan;

class Sarjana extends Mahasiswa implements ICumlaude,IBerprestasi{
    Sarjana(String nama){
        super(nama);
    }

    @Override
    public void lulus(){
        System.out.println("Aku sudah menyelesaikan skripsi");
    }

    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK ku lebih dari 3.51");
    }

    @Override
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    //Implementasi Interface Iberprestasi
    @Override
    public void menjuaraiKompetisi(){
        System.out.println("Saya telah menjuarai kompetesi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
}
