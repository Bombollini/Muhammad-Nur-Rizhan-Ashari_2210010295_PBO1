# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi reservasi hotel menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa berapa banyak jumlah reservasi, nomor kamar, harga per malam, nama tamu dan lama inap output berupa informasi detail dari reservasi tersebut seperti total biaya dan lain sebagainya.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kamar`, `Reservasi` dan `Main` adalah contoh dari class.

```bash
public class Kamar {
    ...
}

public class Reservasi extends Kamar {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `  Reservasi[] reservasis = new Reservasi[jumlahReservasi];`adalah contoh pembuatan object.

```bash
Reservasi[] reservasis = new Reservasi[jumlahReservasi];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nomorKamar`,`hargaPerMalam`,`namaTamu`,`lamaInap`,`jumlahReservasi`,`validInput` dan `totalHarga` adalah contoh atribut.

```bash
String nomorKamar;
double hargaPerMalam;
private String namaTamu;
private int lamaInap;; 
int jumlahReservasi = 0;
boolean validInput = false;
double totalHarga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kamar` dan `Reservasi`.

```bash
 public Kamar(String nomorKamar, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        this.hargaPerMalam = hargaPerMalam;
    }

  public Reservasi(String nomorKamar, double hargaPerMalam, String namaTamu, int lamaInap) {
        super(nomorKamar, hargaPerMalam); // Memanggil constructor superclass
        this.namaTamu = namaTamu;
        this.lamaInap = lamaInap;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNomorKamar`,`setHargaPerMalam`,`setNamaTamu`dan`setLamaInap` adalah contoh method mutator.

```bash
 public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }
  public void setHargaPerMalam(double hargaPerMalam) {
        this.hargaPerMalam = hargaPerMalam;
    }

   public void setNamaTamu(String namaTamu) {
        this.namaTamu = namaTamu;
    }
       public void setLamaInap(int lamaInap) {
        this.lamaInap = lamaInap;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini`getNomorKamar`,`getHargaPerMalam`,`getNamaTamu`dan`getLamaInap`  adalah contoh method accessor.

```bash
    public String getNomorKamar() {
        return nomorKamar;
    }
   public double getHargaPerMalam() {
        return hargaPerMalam;
    }
    public String getNamaTamu() {
        return namaTamu;
    }

 public int getLamaInap() {
        return lamaInap;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nomorKamar`,`hargaPerMalam`,`namaTamu`,`lamaInap` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 private String nomorKamar;
private double hargaPerMalam;
 private String namaTamu;
 private int lamaInap;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Reservasi` mewarisi `Kamar` dengan sintaks `extends`.

```bash
public class Reservasi extends Kamar {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo()` di `Kamar` merupakan overloading `tampilkanInfo()` di `Reservasi` merupakan override dari method `tampilkanInfo()` di `Kamar`.

```bash
   public void tampilkanInfo() {
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Harga Per Malam: Rp" + hargaPerMalam);
    }

  @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Tamu: " + namaTamu);
        System.out.println("Lama Inap: " + lamaInap + " malam");
        System.out.println("Total Harga: Rp" + (super.getHargaPerMalam() * lamaInap));
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if` di Main untuk menentukan jika total harga reservasi melebihi Rp. 1.000.000 maka mendapat potongan 10%.
```bash
 if (totalHarga > 1000000) {
                double totalHargaSetelahDiskon = totalHarga * 0.9; // Diskon 10%
                System.out.println("Total Harga Setelah Diskon: Rp" + totalHargaSetelahDiskon);
                System.out.println("Catatan: Mendapatkan diskon 10% karena total harga lebih dari Rp1.000.000.");
            }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahReservasi; i++) {
    ...
}

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
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
 System.out.print("Masukkan jumlah reservasi: ");
                jumlahReservasi = scanner.nextInt();
System.out.print("Masukkan nomor kamar untuk reservasi " + (i + 1) + ": ");
            nomorKamar = scanner.nextLine();
System.out.print("Masukkan harga per malam untuk reservasi " + (i + 1) + ": ");
                    hargaPerMalam = scanner.nextDouble();
 System.out.print("Masukkan nama tamu untuk reservasi " + (i + 1) + ": ");
            namaTamu = scanner.nextLine();
 System.out.print("Masukkan lama inap (malam) untuk reservasi " + (i + 1) + ": ");
                    lamaInap = scanner.nextInt();

scanner.close();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, ` reservasis[i] = new Reservasi(nomorKamar, hargaPerMalam, namaTamu, lamaInap);` adalah contoh penggunaan array.

```bash
 reservasis[i] = new Reservasi(nomorKamar, hargaPerMalam, namaTamu, lamaInap);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini `while` dan `try catch` untuk menangani error.

```bash
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
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Nur Rizhan Ashari
NPM: 2210010295
