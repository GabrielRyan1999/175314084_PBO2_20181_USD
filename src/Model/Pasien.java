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
 * @author admin
 */
public class Pasien {

   private String namaPasien;
    private String alamatPasien;
    private String tempatLahir;
    private String noRekamMedis;
    private int tanggalLahirPasien;
    private int bulanLahirPasien;
    private int tahunLahirPasien;
    private String nik;
    private Pasien daftarPasienKlinik[];

    /**
     * membuat constuctor Pasien dengan parameter String namaPasien
     *
     * @param namaPasien
     */
    public Pasien(String namaPasien) {
        //namaPasien dari variabel global sama dengan namaPasien dari variabel lokal
        this.namaPasien = namaPasien;

    }

    /**
     * membuat method public String dengan nama getNamaPasien()
     *
     * @return
     */
    public String getNamaPasien() {
        //pengembalian nilai dari namaPasien
        return namaPasien;
    }

    /**
     * membuat method public void dengan nama setNamaPasien()
     *
     * @param namaPasien
     */
    public void setNamaPasien(String namaPasien) {
        //namaPasien dari variabel global sama dengan namaPasien dari variabel lokal

        this.namaPasien = namaPasien;
    }

    /**
     * membuat method public String dengan nama getAlamat()
     *
     * @return
     */
    public String getAlamatPasien() {
        //pengembalian nilai dari alamatPasien
        return alamatPasien;
    }

    /**
     * membuat method public void dengan nama setAlamat()
     *
     * @param alamatPasien
     */
    public void setAlamatPasien(String alamatPasien) {
        //alamat dari variabel global sama dengan alamatPasien dari variabel lokal

        this.alamatPasien = alamatPasien;
    }

    /**
     * membuat method public String dengan nama getTempatLahir()
     *
     * @return
     */
    public String getTempatLahir() {
        //pengembalian nilai dari tempatLahir
        return tempatLahir;
    }

    /**
     * membuat method public void dengan nama setTempatLahir()
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
        //tempatLahir dari variabel global sama dengan tempatLahir dari variabel lokal

        this.tempatLahir = tempatLahir;
    }

    /**
     * membuat method public String dengan nama getNoRekamMedis()
     *
     * @return
     */
    public String getNoRekamMedis() {
        //pengembalian nilai dari noRekamMedis
        return noRekamMedis;
    }

    /**
     * membuat method public void dengan nama setNoRekamMedis()
     *
     * @param noRekamMedis
     * @throws Exception
     */
    public void setNoRekamMedis(String noRekamMedis) throws Exception {
        //membuat kondisi if noRekamMedis.length() >= 6
        if (noRekamMedis.length() >= 6) {
            // noRekamMedis dari variabel global sama dengan noRekamMedis dari variabel lokal
            this.noRekamMedis = noRekamMedis;
        } else {
            //jika tidak sesuai akan menampilkan "nomor rekam medis salah"
            throw new Exception("nomor rekam medis salah");
        }

    }

    /**
     * membuat method public int dengan nama getTanggalLahirPasien()
     *
     * @return
     */
    public int getTanggalLahirPasien() {
        //pengembalian nilai dari tanggalLahirPasien
        return tanggalLahirPasien;
    }

    /**
     * membuat method public void dengan nama setTanggalLahir()
     *
     * @param tanggalLahirPasien
     * @throws Exception
     */
    public void setTanggalLahirPasien(int tanggalLahirPasien) throws Exception {
        //membuat kondisi if tanggalLahirPasien > 0
        if (tanggalLahirPasien > 0) {
            //membuat kondisi if tanggalLahirPasien <= 31
            if (tanggalLahirPasien <= 31) {
                //tanggalLahirPasien dari variabel global sama dengan tanggalLahirPasien dari variabel lokal
                this.tanggalLahirPasien = tanggalLahirPasien;
            } else {
                //jika tidak sesuai maka akan menampilkan "tanggal lahir lebih dari 31"
                throw new Exception("tanggal lahir lebih dari 31");
            }
        } else {
            //jika tidak sesuai maka akan menampilkan "tanggal lahir kurangdari 1"
            throw new Exception("tanggal lahir kurang dari 1");
        }
    }

    /**
     * membuat method public int dengan nama getBulanLahirPasien()
     *
     * @return
     */
    public int getBulanLahirPasien() {
        //pengembalian nilai dari bulanLahirPasien
        return bulanLahirPasien;
    }

    /**membuat method public String dengan nama getNik()
     * 
     * @return 
     */
    public String getNik() {
        //nilai variabel nik samadengan variabel noRekamMedis
        nik = noRekamMedis;
        //pengembalian nilai dari nik
        return nik;
    }

   
    public Pasien[] getDaftarPasienKlinik() {
        //pengembalian nilai dari nik
        return daftarPasienKlinik;
    }

    public void setDaftarPasienKlinik(Pasien[] daftarPasienKlinik) {
         //daftarPasienKlinik dari variabel global sama dengan daftarPasienKlinik dari variabel lokal
        this.daftarPasienKlinik = daftarPasienKlinik;
    }

    
    
    /**
     * membuat method public void dengan nama setBulanLahirPasien()
     *
     * @param bulanLahirPasien
     * @throws Exception
     */
    
    
    public void setBulanLahirPasien(int bulanLahirPasien) throws Exception {
        // membuat kondisi if bulanLahirPasien lebih dari 0
        if (bulanLahirPasien > 0) {
            // membuat kondisi if bulanLahirPasien <= 12
            if (bulanLahirPasien <= 12) {
                // bulanLahirPasien dari variabel global sama dengan bulanLahirPasien dari variabel lokal
                this.bulanLahirPasien = bulanLahirPasien;
            } else {
                // jika tidak sesuai maka akan menampilkan "bulan lahir kurangdari 1"
                throw new Exception("bulan lahir lebih dari 12");
            }
        } else {
            // jika tidak sesuai maka akan menampilkan "bulan lahir kurang dari 1"
            throw new Exception("bulan lahir kurang dari 1");
        }
    }

    /**
     * membuat method public int dengan nama getTahunLahirPasien()
     *
     * @return
     */
    public int getTahunLahirPasien() {
        //pengembalian nilai dari tahunLahirPasien
        return tahunLahirPasien;
    }

    /**
     * membuat method public void dengan nama setTahunLahirPasien()
     *
     * @param tahunLahirPasien
     * @throws Exception
     */
    public void setTahunLahirPasien(int tahunLahirPasien) throws Exception {
        //membuat kondisi if tahunLahirPasien > 0
        if (tahunLahirPasien > 0) {
            //tahunLahirPasien dari variabel global sama dengan tahunLahirPasien dari variabel lokal
            this.tahunLahirPasien = tahunLahirPasien;
        } else {
            // jika tidak sesuai maka akan menampilkan "tanggal lahir kurang dari 1"
            throw new Exception("tahun lahir kurang dari 1");
        }

    }

    /**
     * membuat method public String dengan nama SturNomorRekamMedis()
     *
     * @return
     */
    public String AturNomorRekamMedis() {
        //mendeklarasikan variabel nomorRekamMedis bertipe String
        String nomorRekamMedis;
        //membuat baru objek tgl dengan tipe Date
        Date tgl = new Date();
        //membuat objek ft bertipe SimpleDateFormat
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        //nilai dari nomorRekamMedis sama dengan tgl ditambah 3 huruf pertama dari namaPasien
        nomorRekamMedis = ft.format(tgl) + namaPasien.substring(0, 3);
        //pengembalian nilai nomorRekamMedis
        return nomorRekamMedis;
    }
}
