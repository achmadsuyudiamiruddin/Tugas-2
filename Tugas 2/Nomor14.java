/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor14 { // membuat kelas dengan nama yang sama dengan nama file
   /**
    * @param args
    */
   public static void main(String[] args) {// membuat fungsi main

      int N; // deklarasi variabel N dengan tipe data integer atau angka
      int i = 1; // deklarasi variabel i dengan tipe data integer dan inisialisasi dengan isi
                 // data i adalah 1
      Scanner masukan = new Scanner(System.in); // membuat objek inputan scanner

      System.out.print("Nilai N >0 = "); // menampilkan output
      N = masukan.nextInt();// melakukan inputan kedalam variabel N
      System.out.print("Print i dengan WHILE (ringkas): \n"); // menampilkan output
      while (i <= N) { // melakukan perulangan while yang dimana akan mengecek kondisi perulangan
                       // terlebih dahulu kemuadian mengeksekusi perintah didalam
         System.out.println(i++);// menampilkan data i ditambah dengan 1
      }
   }
}