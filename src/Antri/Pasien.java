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

    private String namaPasien;

    private String alamat;
    private String tempatLahir;
    private String noRekamMedis;
    private int tanggalLahirPasien;
    private int bulanLahirPasien;
    private int tahunLahirPasien;

    public Pasien(String nama) {
        this.namaPasien = nama;

    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
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

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) throws Exception {
        if (noRekamMedis.length() >= 6) {
            this.noRekamMedis = noRekamMedis;
        } else {
            throw new Exception("nomor rekam medis salah");
        }

    }

    public int getTanggalLahirPasien() {
        return tanggalLahirPasien;
    }

    public void setTanggalLahirPasien(int tanggalLahirPasien) throws Exception {
        if (tanggalLahirPasien > 0) {
            if (tanggalLahirPasien <= 31) {
                this.tanggalLahirPasien = tanggalLahirPasien;
            } else {
                throw new Exception("tanggal lahir lebih dari 31");
            }
        } else {
            throw new Exception("tanggal lahir kurang dari 1");
        }
    }

    public int getBulanLahirPasien() {
        return bulanLahirPasien;
    }

    public void setBulanLahirPasien(int bulanLahirPasien) throws Exception {
        if (bulanLahirPasien > 0) {
            if (bulanLahirPasien <= 12) {
                this.bulanLahirPasien = bulanLahirPasien;
            } else {
                throw new Exception("bulan lahir lebih dari 12");
            }
        } else {
            throw new Exception("bulan lahir kurang dari 0");
        }
    }

    public int getTahunLahirPasien() {
        return tahunLahirPasien;
    }

    public void setTahunLahirPasien(int tahunLahirPasien) throws Exception {
        if (tahunLahirPasien > 0) {

            this.tahunLahirPasien = tahunLahirPasien;
        } else {
            throw new Exception("tahun lahir kurang dari 1");
        }

    }

    public String AturNomorRekamMedis() {
        String nomorRekamMedis;
        Date tgl = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        nomorRekamMedis = ft.format(tgl) + namaPasien.substring(0, 3);
        return nomorRekamMedis;
    }
}
