package hotel;

public class Reservasi extends Kamar {
    private String namaTamu;
    private int lamaInap;

    // Constructor
    public Reservasi(String nomorKamar, double hargaPerMalam, String namaTamu, int lamaInap) {
        super(nomorKamar, hargaPerMalam); // Memanggil constructor superclass
        this.namaTamu = namaTamu;
        this.lamaInap = lamaInap;
    }

    // Accessor
    public String getNamaTamu() {
        return namaTamu;
    }

    public int getLamaInap() {
        return lamaInap;
    }

    // Mutator
    public void setNamaTamu(String namaTamu) {
        this.namaTamu = namaTamu;
    }

    public void setLamaInap(int lamaInap) {
        this.lamaInap = lamaInap;
    }

    // Polimorfisme (overriding method)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Tamu: " + namaTamu);
        System.out.println("Lama Inap: " + lamaInap + " malam");
        System.out.println("Total Harga: Rp" + (super.getHargaPerMalam() * lamaInap));
    }
}