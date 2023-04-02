/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor19 { // membuat kelas dengan nama yang sama dengan nama file
   /**
    * @param args
    */

   public static void main(String[] args) { // membuat fungsi main

      int T; // deklarasi variabel T dengan tipedata integer
      Scanner masukan = new Scanner(System.in); // membuat object inputan scanner

      System.out.print("Contoh IF tiga kasus \n"); // menampilkan output
      System.out.print("Temperatur (der. C) = "); // menampilkan output
      T = masukan.nextInt(); // melakukaan inputan angka kedalam variabel T
      if (T < 0) { // melakukan percabangan dengan mengecek kondisi apabila data T sama dengan 0
                   // maka perintah dalam fungsi IF akan dieksekusi jika tidak maka perintah di
                   // dalamnya tidak akan dieksekusi
         System.out.print("Wujud air beku \n" + T); // menampilkan data T
      } else if ((0 <= T) && (T <= 100)) { // mengecek nilai T jika fungsi IF diatas salah yang dimana kondisinya adala
                                           // jika
                                           // data T lebih besar atau sama dengan o dan data T lebih kecil atau sama
                                           // dengan 100 jika kondisi salah perintah dalam else if tidak akan dieksekusi
                                           // jika benar maka akan dieksekusi
         System.out.print("Wujud air cair \n" + T); // menampilkan data T
      } else if (T > 100) { // mengecek nilai T jika fungsi IF diatas salah yang dimana kondisinya adala
                            // jika data T lebih besar dari 100 jika kondisi salah perintah dalam else if
                            // tidak akan dieksekusi jika benar maka akan dieksekusi
         System.out.print("Wujud air uap/gas \n" + T); // menampilkan data T
      }
      ;
   }
}