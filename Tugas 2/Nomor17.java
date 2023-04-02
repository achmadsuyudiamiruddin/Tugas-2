/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor17 { // membuat kelas dengan nama yang sama dengan nama file
   /**
    * @param args
    */
   public static void main(String[] args) { // membuat fungsi main

      int Sum; // deklarasi variabel Sum dengan tipedata integer
      int x; // deklarasi variabel x dengan tipedata integer
      Scanner masukan = new Scanner(System.in);// membuat objek inputan scanner

      Sum = 0; // memasukkan data angka 0 kedalam variabel Sum

      System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");// menampilkan output
      x = masukan.nextInt(); // melakukan inputan kedalam variabel x
      while (x != 999) { // melakukan perulangan while yang dimana akan mengecek kondisi terlebih dahulu,
                         // jika kondisi bernilai benar maka perintah dalam while dilakukan jika kondisi
                         // salah maka perulangan berhenti
         Sum = Sum + x; // melakukan proses Sum = Sum+x
         System.out.print("Masukkan nilai x (int), akhiri dg 999 : "); // menampilkan output
         x = masukan.nextInt(); // melakukan inputan kedalam variabel x
      }
      System.out.println("Hasil penjumlahan = " + Sum);// menampilkan data Sum
   }
}