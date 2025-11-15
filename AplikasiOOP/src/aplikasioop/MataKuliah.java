/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasioop;

/**
 *
 * @author HP
 */
public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return kode + " - " + nama + " (" + sks + " SKS)";
    }
}
