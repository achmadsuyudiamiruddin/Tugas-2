/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor9 { // membuat kelas dengan nama yang sama dengan nama file
   /**
    * @param args
    */
   public static void main(String[] args) { // membuat fungsi main

      int a, b; // deklarasi variabel a dan b dengan tipedata integer atau angka
      Scanner masukan = new Scanner(System.in); // membuat objek inputan scanner

      System.out.print("Maksimum dua bilangan : \n"); // menampilkan output
      System.out.print("Ketikkan dua bilangan, pisahkan dg RETURN :\n"); // menampilkan output
      a = masukan.nextInt(); // melakukan inputan kedalam variabel a
      b = masukan.nextInt();// melakukan inputan kedalam variabel b
      System.out.println("Ke dua bilangan : a = " + a + " b = " + b); // menampilkan hasil inputan a dan b
      if (a >= b) { // melakukan pemeriksaan dengan kondisi jika benar a lebih besar atau sama
                    // dengan b makan akan menmpilkan output
         System.out.println("Nilai a yang maksimum " + a); // menampilkan output a
      } else { // menampilkan ouput bila kondisi dari if salah
         System.out.println("Nilai b yang maksimum: " + b); // menampilkan output b
      }
   }
}