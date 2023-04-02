/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor11 { // membuat kelas dengan nama yang sama dengan nama file
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

      System.out.print("Print i dengan ITERATE : \n");// menampilkan output
      for (;;) {// melakukan looping forever tanpa kondisi dalam parameter
         System.out.println(i);// menampilkan data dalam variabel i

         if (i == N) // jika data dalam i sama dengandata dalam N maka mengeksekusi proses dalam IF
            break; // menghentikan looping jika kondisi terpenuhi
         else {// melakukan proses dalam else jika kondisi if salalah
            i++; // menambahkan angka dalam variabel i dengan 1, i = i+1

         }
      }
   }
}