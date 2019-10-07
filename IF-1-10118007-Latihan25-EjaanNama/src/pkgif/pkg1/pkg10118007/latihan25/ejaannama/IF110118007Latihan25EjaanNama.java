/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118007.latihan25.ejaannama;
import java.util.Scanner;

/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Mengeja Nama
 * @author Rama
 */
public class IF110118007Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = masuk.nextLine();
        System.out.println("\nEjaan untuk \"" + nama + "\" adalah :");
        char ejaan[] = nama.toCharArray();

        for (int i = 0; i <= (ejaan.length - 1); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + ejaan[i]);
        }
        System.out.println("");
    }
    
}
