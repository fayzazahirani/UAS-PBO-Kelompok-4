/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Perpustakaan;

/**
 *
 * @author Kelompok 4 TIC P2K
 */
public class Buku {
    String kode;
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
    int halaman;

    public Buku(String kode, String judul, String pengarang, String penerbit, int tahun, int halaman) {
        this.kode = kode;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.halaman = halaman;
    }
}
