/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasioop;

/**
 *
 * @author HP
 */
import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private ArrayList<MataKuliah> krs = new ArrayList<>();
    private int totalSks = 0;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public boolean tambahMataKuliah(MataKuliah mk) {
        if (totalSks + mk.getSks() > 24) {
            System.out.println("Gagal menambah MK. Total SKS melebihi 24!");
            return false;
        }
        krs.add(mk);
        totalSks += mk.getSks();
        return true;
    }

    public void cetakKRS() {
        System.out.println("========== KARTU RENCANA STUDI ==========");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("-----------------------------------------");
        System.out.println("Daftar Mata Kuliah:");
        
        for (MataKuliah mk : krs) {
            System.out.println("- " + mk);
        }

        System.out.println("-----------------------------------------");
        System.out.println("Total SKS : " + totalSks);
        System.out.println("\nTtd KPS:");
        System.out.println("Dr. " + nama + ", M.Kom");
        System.out.println("=========================================");
    }
}
