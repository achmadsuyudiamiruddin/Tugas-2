/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor6 { // mebuat kelas dengan nama yang sesuai dengan nama file
   /**
    * @param args
    */
   public static void main(String[] args) { // membuat fungsi main

      boolean bool; // deklarasi variabel bool dengan tipedata bollean atau kondisi

      bool = true; // inisialisasi variabel dengan kondisi true
      if (bool) { // menggunakan kondisi jika kondisi variabel bool true maka akan menampilkan
                  // ouput jika tidak lanjut ke kondisi selanjutnya atau else
         System.out.print("true\n"); // menampilkan output
      } else // menampilkan ouput bila kondisi if salah
         System.out.print("false\n"); // menampilkan output
      if (!bool) {// menggunakan kondisi jika kondisi variabel bool false maka akan menampilkan
         // ouput jika tidak lanjut ke kondisi selanjutnya atau else
         System.out.print("salah\n"); // menampilkan output
      } else // menampilkan ouput bila kondisi if salah
         System.out.print("benar\n");// menampilkan output
   }
}