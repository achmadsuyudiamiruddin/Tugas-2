/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.util.Scanner; // menggunakan library input Scanner

public class Nomor18 { // membuat kelas dengan nama yang sama dengan nama file
   /**
    * @param args
    */
   public static int maxab(int a, int b) { // membuat fungsi yang akan mengembalikan nilai dan memiliki 2 buah parameter
                                           // yaitu a dan b dengan tipedata integer
      return ((a >= b) ? a : b); // mengembailkan data ke fungsi dan menggunakan operasi percabangan yang dimana
                                 // akan mengembalikan nilai a jika a lebih besar atau sama dengan b, jika salah
                                 // makan akan mengembalikan nilai b
   }

   public static void tukar(int a, int b) { // membuat fungsi yang tidak akan mengembalikan nilai dan memiliki 2 buah //
                                            // membuat fungsi yang akan mengembalikan nilai dan memiliki 2 buah
                                            // parameter
                                            // yaitu a dan b dengan tipedata integerparameter yaitu a dan b dengan
                                            // tipedata integer
      int temp; // deklarasi variabel temp dengan tipedata integer
      temp = a; // melakukan proses yang dimana data temp sama dengan data a
      a = b; // melakukan proses yang diaman data a sama dengan data b
      b = temp; // melakukan proses yang dimana data b sama dengan temp
      System.out.println("Ke dua bilangan setelah tukar: a = " + a + " b = " + b); // menampilkan data a dan b
   }

   public static void main(String[] args) { // membuat fungsi main
      int a, b; // deklarasi variabel a dan b dengan tipedata integer
      Scanner masukan = new Scanner(System.in); // membuat objek inputan scanner
      System.out.print("Maksimum dua bilangan\n"); // menampilkan output
      System.out.print("Ketikkan dua bilangan, pisahkan dg RETURN : \n");// menampilkan output
      a = masukan.nextInt();// menginput angka kedalam variabel a
      b = masukan.nextInt();// menginput angka kedalam variabel b
      System.out.println("Ke dua bilangan : a =" + a + " b = " + b);// menampilkan output
      System.out.println("Maksimum = " + (maxab(a, b))); // memanggil fungsi maxab yang sudah dibuat sebelumnya
      System.out.print("Tukar kedua bilangan...\n"); // menampilakn output
      tukar(a, b); // memanggil fungsi tukar yang sudah dibuat sebelumnya
   }
}