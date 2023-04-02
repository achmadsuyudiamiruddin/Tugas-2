/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor16 { // membuat kelas dengan nama yang sama dengan nama file
   /**
    * @param args
    */
   public static void main(String[] args) { // membuat fungsi main

      int Sum; // deklarasi variabel Sum dengan tipedata integer
      int x; // deklarasi variabel x dengan tipedata integer
      Scanner masukan = new Scanner(System.in); // membuat objek inputan scanner

      System.out.print("Masukkan nilai x (int), akhiri dg 999 : "); // menampilkan output
      x = masukan.nextInt(); // menginput angka ke dalam variabel x selain angka maka error

      if (x == 999) { // mengecek data x jika sama dengan 999 maka menjalankan perintah dalam if jika
                      // tidak perintah dalam if tidak di eksekusi
         System.out.print("Kasus kosong \n"); // menampilkan output
      } else { // melakukan perintah dalam else jika kondisi if bernilai salah
         Sum = 0; // inisialisasi data Sum dengan 0
         do { // melakukan proses perulangan do-while yang dimana akan melakukan perintah
              // dalam do kemudian akan memeriksa kondisi pada while
            Sum = Sum + x; // melakukan proses Sum=Sum+x
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");// menampilkan output
            x = masukan.nextInt();// menginput angka ke dalam variabel x selain angka maka error
         } while (x != 999); // jika x tidak sama dengan 999 maka akan melakukan perintah dalam do tetapi
                             // jika x sama dengan 999 maka perulangan berhenti

         System.out.println("Hasil penjumlahan = " + Sum); // menampilkan data Sum
      }
   }
}