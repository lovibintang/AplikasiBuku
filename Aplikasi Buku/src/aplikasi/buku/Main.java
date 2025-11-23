/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi.buku;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan NIM   : ");
        String nim = in.nextLine();

        System.out.print("Masukkan Nama  : ");
        String nama = in.nextLine();

        Mahasiswa mhs = new Mahasiswa(nim, nama);

        System.out.print("Berapa buku yang dipinjam? : ");
        int jumlah = in.nextInt();
        in.nextLine(); 

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Buku ke-" + i);
            System.out.print("Masukkan ISBN  : ");
            String isbn = in.nextLine();
            System.out.print("Masukkan Judul : ");
            String judul = in.nextLine();
            mhs.pinjam(new Buku(isbn, judul));
        }

        System.out.println("\n======================================================");
        System.out.println("NIM   : " + mhs.getNim());
        System.out.println("Nama  : " + mhs.getNama());
        System.out.println("------------------------------------------------------");
        System.out.printf("| %-3s| %-30s| %-50s|\n", "No", "ISBN", "Judul");
        System.out.println("------------------------------------------------------");

        int no = 1;
        for (Buku bk : mhs.getDaftarBuku()) {
            System.out.printf("| %-3d| %-30s| %-50s|\n", no++, bk.getIsbn(), bk.getJudul());
        }

        System.out.println("------------------------------------------------------");
    }
}
