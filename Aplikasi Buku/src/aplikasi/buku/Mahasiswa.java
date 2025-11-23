/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi.buku;

/**
 *
 * @author HP
 */
import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private ArrayList<Buku> daftarBuku;  

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();  
    }

    public void pinjam(Buku buku) {
        daftarBuku.add(buku);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }
}
