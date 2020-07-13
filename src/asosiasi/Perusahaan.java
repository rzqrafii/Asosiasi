/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asosiasi;

/**
 *
 * @author ANDO
 */
public class Perusahaan {
    private String alamat;
    private String kota;
    private String namaPerusahaan;
    private Pegawai daftarPegawai[];
    private int counter;
    public Perusahaan() {}
    public Perusahaan(String _alamat, String _kota, String _namaPerusahaan){
        setAlamat(_alamat);
        setKota(_kota);
        setNamaPerusahaan(_namaPerusahaan);
        daftarPegawai = new Pegawai[3];
        counter = 0;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setDaftarPegawai(Pegawai[] daftarPegawai) {
        this.daftarPegawai = daftarPegawai;
    }
    public void setKota(String kota) {
        this.kota = kota;
    }
    public String getAlamat() {
        return alamat;
    }
    public Pegawai[] getDaftarPegawai() {
        return daftarPegawai;
    }
    public String getKota() {
        return kota;
    }
    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
    public void insertPeg(Pegawai p){
        getDaftarPegawai()[counter] = p;
        counter++;
    }
    public void tampilPer(){
        System.out.println("Nama perusahaan : " + getNamaPerusahaan());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Kota: " + getKota());
        for(int i = 0; i < counter; i++){
            getDaftarPegawai()[i].tampilPeg();
        }
    }
    public double totalGaji(){
        double jumlah=0;
        for(int i = 0; i < counter; i++){
            jumlah = jumlah + getDaftarPegawai()[i].getGaji();
        }
        return jumlah;
    }
}

