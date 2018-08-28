/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Antri;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Pasien {
    
    private String nama;
    private Date tgllahir;
    private String alamat;
    private String tempatLahir;
    private String noRekamMedis;
    private int tanggalLahir;
    private int bulanLahir;
    private int TahunLahir;
    

    public static void main(String[] args) {
        
    }
    
    public Pasien(String nama) {
        this.nama = nama;
        
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Date getTgllahir() {
        return tgllahir;
    }
    
    public void setTgllahir(Date tgllahir) {
        this.tgllahir = tgllahir;
    }
    
    public void setTglLahir(int year, int month, int date) {
        tgllahir = new Date(year - 1900, month - 1, date);
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getNoRekamMedis() {
        return noRekamMedis;
    }
    
    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    public int getTahunLahir() {
        return TahunLahir;
    }

    public void setTahunLahir(int TahunLahir) {
        this.TahunLahir = TahunLahir;
    }
    
    
    public int getUsia() {
        Date today = new Date();
        return today.getYear() - tgllahir.getYear();
    }
    
    public void AturNomorRekamMedis() {
        Date tgl = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        System.out.println(ft.format(tgl) + nama.substring(0, 3));
    }
}
