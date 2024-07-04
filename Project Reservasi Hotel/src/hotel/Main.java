package hotel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahReservasi = 0;
        boolean validInput = false;

        // Input jumlah reservasi dengan error handling
        while (!validInput) {
            try {
                System.out.print("Masukkan jumlah reservasi: ");
                jumlahReservasi = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                
                if (jumlahReservasi <= 0) {
                    throw new IllegalArgumentException("Jumlah reservasi harus lebih dari 0.");
                }
                
                validInput = true;
          
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.nextLine();  // Consume invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("=========================================================");
        }

        // Array untuk menyimpan objek Reservasi
        Reservasi[] reservasis = new Reservasi[jumlahReservasi];

        // Perulangan untuk input data reservasi dengan error handling
        for (int i = 0; i < jumlahReservasi; i++) {
            String nomorKamar = "";
            double hargaPerMalam = 0;
            String namaTamu = "";
            int lamaInap = 0;

            // Input nomor kamar
            System.out.print("Masukkan nomor kamar untuk reservasi " + (i + 1) + ": ");
            nomorKamar = scanner.nextLine();

            // Input harga per malam dengan error handling
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Masukkan harga per malam untuk reservasi " + (i + 1) + ": ");
                    hargaPerMalam = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline

                    if (hargaPerMalam <= 0) {
                        throw new IllegalArgumentException("Harga per malam harus lebih dari 0.");
                    }

                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    scanner.nextLine();  // Consume invalid input
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            // Input nama tamu
            System.out.print("Masukkan nama tamu untuk reservasi " + (i + 1) + ": ");
            namaTamu = scanner.nextLine();

            // Input lama inap dengan error handling
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Masukkan lama inap (malam) untuk reservasi " + (i + 1) + ": ");
                    lamaInap = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    if (lamaInap <= 0) {
                        throw new IllegalArgumentException("Lama inap harus lebih dari 0 malam.");
                    }

                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    scanner.nextLine();  // Consume invalid input
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("---------------------------------------------------------");
            // Membuat objek Reservasi dan memasukkannya ke array
            reservasis[i] = new Reservasi(nomorKamar, hargaPerMalam, namaTamu, lamaInap);
        }

        // Menampilkan semua reservasi dengan pengecekan diskon
        System.out.println("\nSemua Reservasi:");
        System.out.println("---------------------------------------------------------");
        for (Reservasi reservasi : reservasis) {
            reservasi.tampilkanInfo();
            double totalHarga = reservasi.getHargaPerMalam() * reservasi.getLamaInap();
            if (totalHarga > 1000000) {
                double totalHargaSetelahDiskon = totalHarga * 0.9; // Diskon 10%
                System.out.println("Total Harga Setelah Diskon: Rp" + totalHargaSetelahDiskon);
                System.out.println("Catatan: Mendapatkan diskon 10% karena total harga lebih dari Rp1.000.000.");
            }
            System.out.println("______________________________________________________________");
            System.out.println();
        }

        scanner.close();
    }
}
