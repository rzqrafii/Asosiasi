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
public class Pegawai {
    private String nama;
    private String jabatan;
    private double gaji;
    private Pegawai direktur;
    private Pegawai manager;
    private Pegawai supervisor;
    public Pegawai() {
    }
    //Setiap pegawai perlu memiliki nama, jabatan, dan gaji
    public Pegawai(String _nama, String _jabatan, double _gaji){
        setNama(_nama);
        setJabatan(_jabatan);
        setGaji(_gaji);
        direktur = new Pegawai();
        manager = new Pegawai();
        supervisor = new Pegawai();
        direktur = null;
        manager = null;
        supervisor = null;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getGaji() {
        return gaji;
    }
    public String getJabatan() {
        return jabatan;
    }
    public String getNama() {
        return nama;
    }
    
    /*Method asosiasi berfungsi untuk mengasosiasikan pegawai yang di-inputkan sebagai
    parameter untuk menjadi bawahannya dan menjadikan objek pegawai yang memanggil
    method ini sebagai atasan dari objek pegawai yang di-inputkan sebagai parameter*/
    public void asosiasi(Pegawai peg){
        if(peg.getJabatan().equalsIgnoreCase("manager")){
            this.manager = peg;
            peg.direktur = this;
        }
        else if(peg.getJabatan().equalsIgnoreCase("supervisor")){
            this.supervisor = peg;
            peg.manager = this;
        }
    }
    
    //tampilPeg berfungsi untuk menampilkan setiap informasi dari objek pegawai
    //termasuk atasan dan bawahan yang sudah dinyatakan
    public void tampilPeg(){
        System.out.println("Nama Pegawai: " + getNama());
        System.out.println("Jabatan Pegawai: " + getJabatan());
        System.out.println("Gaji Pegawai: " + getGaji());
        if(direktur != null){
            System.out.println("direktur : " + direktur.nama);
        }
        if(manager != null){
            System.out.println("manager : " + manager.nama);
        }
        if(supervisor != null){
            System.out.println("supervisor : " + supervisor.nama);
        }
        System.out.println("\n");
    }
}