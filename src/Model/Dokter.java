/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ryan
 */
public class Dokter {

    private String nomorPegawai;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahirDok;
    private int bulanLahirDok;
    private int tahunLahirDok;

    public Dokter() {
    }

    public Dokter(String nama) {
        this.nama = nama;
    }

 
    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai)throws Exception {
        if (nomorPegawai.length() == 6) {
        this.nomorPegawai = nomorPegawai;    
        }else{
         throw new Exception("nomor pegawai salah");    
        }
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahirDok() {
        return tanggalLahirDok;
    }

    public void setTanggalLahirDok(int tanggalLahir) throws Exception {
        if (tanggalLahir > 1) {
            if (tanggalLahir <= 31) {
                this.tanggalLahirDok = tanggalLahir;
            } else {
                throw new Exception("tanggal lahir lebih dari 31");
            }
        } else {
            throw new Exception("tanggal lahir kurang dari 1");
        }
    }

    public int getBulanLahirDok() {
        return bulanLahirDok;
    }

    public void setBulanLahirDok(int bulanLahirDok) throws Exception {
        if (bulanLahirDok > 1) {
            if (bulanLahirDok <= 12) {
                this.bulanLahirDok = bulanLahirDok;
            } else {
                throw new Exception("bulan lahir lebih dari 12");
            }
        } else {
            throw new Exception("bulan lahir kurang dari 1");
        }
    }

    public int getTahunLahirDok() {
        return tahunLahirDok;
    }

    public void setTahunLahirDok(int tahunLahirDok) throws Exception {
        if (tahunLahirDok > 1) {

            this.tahunLahirDok = tahunLahirDok;
        } else {
            throw new Exception("tahun lahir kurang dari 1");
        }

        this.tahunLahirDok = tahunLahirDok;
    }

    public void aturNomorPegawai() {
        Date tgl = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        System.out.println(ft.format(tgl) + nama.substring(0, 3));
    }
  
}
