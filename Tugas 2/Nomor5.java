/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor5 { // mebuat kelas dengan nama yang sesuai dengan nama file
   /**
    * @param args
    */
   public static void main(String[] args) { // membuat fungsi main

      int a; // deklarasi variabel a dengan tipedata integer
      Scanner masukan = new Scanner(System.in);// membuat object inputan

      System.out.print("Contoh IF tiga kasus \n");// menampilkan output
      System.out.print("Ketikkan suatu nilai integer :");// menampilkan output
      a = masukan.nextInt(); // melakukan inputan angka kedalam variabel a
      if (a >= 0) {// menggunakan kondisi yang apabila yang di inputkan pada variabel a diatas atau
         // sama dengan 0 maka akan menampilkan output jika tidak maka akan lanjut ke
         // kondisi selanjutnya
         System.out.println("Nilai a positif " + a); // menampilkan hasil inputan
      } else if (a == 0) { // menggunakan kondisi yang apabila yang di inputkan pada variabel a
         // sama dengan 0 maka akan menampilkan output jika tidak maka akan lanjut ke
         // kondisi selanjutnya
         System.out.println("Nilai Nol " + a); // menampilkan hasil inputan
      } else // menampilkan ouput bila kondisi if tidak terpenuhi
      {
         System.out.println("Nilai a negatif " + a); // menampilkan hasil inputan
      }
   }
}