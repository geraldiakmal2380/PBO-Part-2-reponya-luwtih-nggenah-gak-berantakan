package PBOMinggu9.InterfaceLatihan;

class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        Pascasarjana masterCumlaude = new Pascasarjana("Elok");

        pakRektor.bersertifikatCumlaude(mahasiswaBiasa);
        pakRektor.bersertifikatCumlaude(sarjanaCumlaude);
        pakRektor.bersertifikatCumlaude(masterCumlaude);
    }
}
