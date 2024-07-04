package hotel;

public class Kamar {
    // Enkapsulasi
    private String nomorKamar;
    private double hargaPerMalam;

    // Constructor
    public Kamar(String nomorKamar, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        this.hargaPerMalam = hargaPerMalam;
    }

    // Accessor
    public String getNomorKamar() {
        return nomorKamar;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    // Mutator
    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public void setHargaPerMalam(double hargaPerMalam) {
        this.hargaPerMalam = hargaPerMalam;
    }

    // Method untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Harga Per Malam: Rp" + hargaPerMalam);
    }
}
