/*
 * Nama        : Achmad Suyudi Amiruddin
 * Stambuk     : 13020180294
 * Waktu kerja : 13:38
 */

import java.io.BufferedReader; // memasukkan library untuk inputan yaitu BufferedReader
import java.io.IOException; // memasukkan library untuk inputan yaitu IOException
import java.io.InputStreamReader; // memasukkan library untuk inputan yaitu InputStreamReader
import javax.swing.*; //memasukkan semua dalam library java.swing

public class Nomor1 { // membuat kelas dengan nama yang sesuai dengan nama file
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {/// membuat fungsi main yang akan di jalankan lebih dulu
                                                               /// oleh komputer
        String str; // deklarasi variabel str dengan tipe data string
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in)); // membuat objek inputan dengan
                                                                                      // nama datAIn
        System.out.print("\nBaca string dan Integer: \n");// mencetak yang ingin ditampilkan
        System.out.print("masukkan sebuah string: "); // mencetak yang ingin ditampilkan
        str = datAIn.readLine(); // menginput kata ke dalam variabel datAIn
        System.out.print("String yang dibaca : " + str); // mencetak hasil yang telah di input kedalam datAIn
    }
}