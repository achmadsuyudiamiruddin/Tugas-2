/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor3 { // mebuat kelas dengan nama yang sesuai dengan nama file
   /**
    * @param args
    */
   public static void main(String[] args) { // membuat fungsi main

      Scanner masukan = new Scanner(System.in); // membuat object inputan
      int a; // deklarasi variabel a dengan tipedata integer

      System.out.print("Contoh IF satu kasus \n"); // menampilkan output
      System.out.print("Ketikkan suatu nilai integer : "); // menampilkan output
      a = masukan.nextInt(); // melakukan inputan angka kedalam variabel a
      if (a >= 0) // menggunakan kondisi yang apabila yang di inputkan pada variabel a diatas atau
                  // sama dengan 0 maka akan menampilkan output jika tidak maka program selesai
                  // atau lanjut ke kondisi else
         System.out.print("\nNilai a positif " + a); // mencetak angka yang telah diinput
   }
}