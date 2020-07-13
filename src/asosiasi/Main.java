/*
 * Project Asosiasi ini sudah dilengkapi beberapa komentar dari saya
 * Tujuan:  membantu kalian untuk memahami cara kerja dari program ini
 *          dan membantu kalian untuk mengerti cara menerapkan relasi kelas
 *          asosiasi pada sebuah program. Semoga berhasil!
 */
package asosiasi;

/**
 *
 * @author ANDO
 */
public class Main {
    public static void main(String[] args) {
        //Instansiasi kelas Perusahaan
        Perusahaan Per = new Perusahaan("Jl. Mawar", "Jogja", "PT.Maju Lancar");
        //Deklarasikan 3 kelas Pegawai lalu instansiasi
        Pegawai peg1, peg2, peg3;
        peg1 = new Pegawai("Andi", "Direktur", 10000); //Nama, Jabatan, Gaji
        peg2 = new Pegawai("Gatot", "Manager", 10000);
        peg3 = new Pegawai("Arie", "Supervisor", 10000);
        //Panggil method asosiasi dari objek peg1 dan isi parameter dengan peg2
        peg1.asosiasi(peg2);
        //Panggil method asosiasi dari objek peg2 dan isi parameter dengan peg3
        peg2.asosiasi(peg3);
        //Method insertPeg dari objek Per, isi parameter dengan setiap objek pegawai
        Per.insertPeg(peg1);
        Per.insertPeg(peg2);
        Per.insertPeg(peg3);
        //Tampilkan info dari Perusahaan
        Per.tampilPer();
        System.out.println("Total Gaji: " + Per.totalGaji());
    }
}
