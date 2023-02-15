/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Perpustakaan;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Kelompok 4 TIC P2K
 */
public class BtMahasiswa extends AbstractTableModel {
    ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
    String[] headerTable = {"Nama", "NIM", "Prodi", "Judul Buku", "Tanggal Peminjaman", "Tanggal Pengembalian"};
    
    public void setListData(ArrayList<Mahasiswa> mahasiswa){
        this.mahasiswa = mahasiswa;
        fireTableDataChanged();
    }
    
    public void add(Mahasiswa mhs){
        mahasiswa.add(mhs);
        fireTableRowsInserted(mahasiswa.size() - 1, mahasiswa.size() - 1);
    }
    
    public void remove(Mahasiswa mhs){
        mahasiswa.remove(mhs);
        fireTableRowsInserted(mahasiswa.size() - 1, mahasiswa.size() - 1);
    }
    
    public Mahasiswa getMhs(int row){
        return mahasiswa.get(row);
    }
    
    @Override
    public int getRowCount() {
        return mahasiswa.size();
    }

    @Override
    public int getColumnCount() {
        return headerTable.length;
    }

    @Override
        public Object getValueAt(int row, int col) {
            Mahasiswa siswa = mahasiswa.get(row);
            switch(col){
                case 0 :
                    return siswa.getNama();
                case 1 :
                    return siswa.getNim();
                case 2 :
                    return siswa.getProdi();
                case 3 :
                    return siswa.getJudulBuku();
                case 4 :
                    return siswa.getTglPinjam();
                case 5 :
                    return siswa.getTglKembali();
                default :
                    return "";
            }
    }
    
    @Override
        public String getColumnName(int column){
            return headerTable[column];
        }
}
