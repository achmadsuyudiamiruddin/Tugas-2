/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor15 { // membuat kelas dengan nama yang sama dengan nama file
   /**
    * @param args
    */
   public static void main(String[] args) {// membuat fungsi main

      int Sum = 0; // deklarasi variabel Sum dengan tipedata integer dan inisialisasi isi data 0
      int x; // dekklarasi variabel x dengan tipedata integer
      Scanner masukan = new Scanner(System.in); // membuat objek inputan scanner

      System.out.print("Masukkan nilai x (int), akhiri dg 999: "); // menampilkat output
      x = masukan.nextInt(); // menginput angka kedalam variabel x

      if (x == 999) { // mengecek jika yang diinputkan sama dengan 999 jika benar melakukan perintah
                      // dalam if jika tidak lompat ke perintah else
         System.out.print("Kasus kosong \n"); // menampilkan output
      } else { // melakukan perintah dalam else jika kondisi if bernilai salah
         Sum = x; // inisialisasi variabel Sum dengan variabel x, apapun yang diinputkan ke dalam
                  // x maka akan masuk juga ke variabel Sum

         for (;;) {// melakukan looping tanpa kondisi dalam parameter
            System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");// menampilkan output
            x = masukan.nextInt(); // menginput angka kedalam variabel x

            if (x == 999) // memberi kondisi ke looping jika nilai x sama dengan 999 maka looping berhenti
               break; // menghentikan looping
            else { // melakukan perintah dalam else jika kondisi if bernilai salah
               Sum = Sum + x; // melakukaan proses Sum = Sum+x

            }
         }
      }
      System.out.println("Hasil penjumlahan = " + Sum);// menampilkan data Sum
   }
}