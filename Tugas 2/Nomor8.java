/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor8 { // membuat kelas dengan nama yang sama dengan nama file
   /**
    * @param args
    */
   public static void main(String[] args) { // membuat fungsi main

      final float PHI = 3.1415f; // mendeklarasikan variabel PHI dengan tipedata float dan bersifat final yang
                                 // artinya tidak dapat diubah bila program berjalan serta inisialisasi variabel
                                 // dengan angka 3.1415f
      float r; // deklarasi variabel r dengan tipe data float
      Scanner masukan = new Scanner(System.in); // membuat object inputan

      System.out.print("Jari-jari lingkaran ="); // menampilkan output
      r = masukan.nextFloat(); // melakukan inputan

      System.out.print("Luas lingkaran = " + (PHI * r * r) + "\n"); // menampilkan hasil perhitungan luas lingkaran
      System.out.print("Akhir program \n"); // menampilkan output
   }
}