package PBOMinggu9.InterfaceLatihan;

class Pascasarjana extends Mahasiswa implements ICumlaude, IBerprestasi{
    public Pascasarjana(String nama){
        super(nama);
    }

    //Implementasi ICumlaude
    @Override
    public void lulus(){
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK ku lebih dari 3.71");
    }

    @Override
    public void kuliahDiKampus(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    //implementasi Iberprestasi

    @Override
    public void menjuaraiKompetisi() {
        //work in progress
    }

    @Override
    public void membuatPublikasiIlmiah() {

    }
}
