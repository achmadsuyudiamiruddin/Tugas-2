/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor7 { // membuat kelas dengan nama yang sama dengan nama file
   /**
    * @param args
    */
   public static void main(String[] args) { // membuat fungsi main

      char cc; // deklarasi variabel cc dengan tipedata char atau karakter
      Scanner masukan = new Scanner(System.in); // membuat objek inputan

      System.out.print("Ketikkan sebuah huruf, akhiri dengan RETURN \n"); // menampilan output
      cc = masukan.next().charAt(0); // melakukan inputan
      switch (cc) { // menggunakan kondisi switch yang akan menampilkan ouput dari case berdasarkan
                    // inputan yang dilakukan
         case 'a': {// jika yang diinput karakter a akan menampilkan output a
            System.out.print(" Yang anda ketik adalah a\n"); // menampilkan output
            break;// mencegah untuk tidak menampilkan ouput dari case dibawah
         }
         case 'u': { // jika yang diinput karakter u akan menampilkan output u
            System.out.print(" Yang anda ketik adalah u\n");// menampilkan output
            break;// mencegah untuk tidak menampilkan ouput dari case dibawah
         }
         case 'e': {// jika yang diinput karakter e akan menampilkan output e
            System.out.print(" Yang anda ketik adalah e\n");// menampilkan output
            break;// mencegah untuk tidak menampilkan ouput dari case dibawah
         }
         case 'i': {// jika yang diinput karakter i akan menampilkan output i
            System.out.print(" Yang anda ketik adalah i\n");// menampilkan output
            break;// mencegah untuk tidak menampilkan ouput dari case dibawah
         }
         case 'o': {// jika yang diinput karakter o akan menampilkan output o
            System.out.print(" Yang anda ketik adalah o\n");// menampilkan output
            break;// mencegah untuk tidak menampilkan ouput dari case dibawah
         }
         default: // menampilkan ouput jika inputan tidak ada yang sesuai dari case
            System.out.print(" Yang anda ketik adalah huruf mati\n");// menampilkan output
      }
   }
}