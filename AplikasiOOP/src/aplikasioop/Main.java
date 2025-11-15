/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasioop;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();

        Mahasiswa mhs = new Mahasiswa(nim, nama);

        while (true) {
            System.out.println("\nTambah Mata Kuliah:");
            System.out.print("Kode MK   : ");
            String kode = sc.nextLine();
            System.out.print("Nama MK   : ");
            String namaMk = sc.nextLine();
            System.out.print("SKS MK    : ");
            int sks = sc.nextInt();
            sc.nextLine(); // clear buffer

            MataKuliah mk = new MataKuliah(kode, namaMk, sks);
            mhs.tambahMataKuliah(mk);

            System.out.print("Tambah MK lagi? (y/n): ");
            String lagi = sc.nextLine();

            if (lagi.equalsIgnoreCase("n")) break;
        }

        System.out.println();
        mhs.cetakKRS();
    }
}

