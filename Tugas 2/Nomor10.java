/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor10 { // membuat kelas dengan nama yang sama dengan nama file
   /**
    * @param args
    */
   public static void main(String[] args) { // membuat fungsi main

      int i, N; // deklarasi variabel i dan N dengan tipe data integer atau angka
      Scanner masukan = new Scanner(System.in); // mebuat objek inputtan scanner

      System.out.print("Baca N, print 1 s/d N "); // menampilkan ouput
      System.out.print("N = "); // menampilkan output
      N = masukan.nextInt(); // melakukan inputan angka kedalam variabel N
      for (i = 1; i <= N; i++) { // melakukan perulangan dengan isi variabel i adalah 1 dan kondisi i kurang dari
                                 // atau sama dengan N jika kondisi salah makan perulangan akan berhenti
         System.out.println(i); // menampilkan isi varabel i
      }
      System.out.println("Akhir program \n");// menampilkan output
   }
}