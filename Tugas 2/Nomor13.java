/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor13 { // membuat kelas dengan nama yang sama dengan nama file
   /**
    * @param args
    */
   public static void main(String[] args) { // membuat fungsi main

      int N; // deklarasi variabel N denga tipedata integer atau angka
      int i; // deklarasi variabel i denga tipedata integer atau angka
      Scanner masukan = new Scanner(System.in); // membuat object inputan

      System.out.print("Nilai N >0 = "); // menampilkan output

      N = masukan.nextInt(); // melakukan inputan kedalam variabel N
      i = 1; // inisialisasi dalam variabel i dengan data 1

      System.out.print("Print i dengan WHILE: \n");// menampilkan output
      while (i <= N) // melakukan perulangan while yang dimana akan mengecek kondisi perulangan
                     // terlebih dahulu kemuadian mengeksekusi perintah didalam

      {
         System.out.println(i); // menampilkan output

         i++; // menambahkan angka dalam variabel i dengan 1, i = i+1

      }
   }
}