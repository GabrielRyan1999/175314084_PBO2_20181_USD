/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Pasien {

    private String Nama;
    private String Alamat;
    private String tempatLahir;
    private String NoRM;
    private int tanggalLahirPasien;
    private int bulanLahirPasien;
    private int tahunLahirPasien;
    private String nik;
    public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    public Pasien(String namaPasien, String alamatPasien, String tempatLahir, int tanggalLahirPasien, int bulanLahirPasien, int tahunLahirPasien, String nik) {
        this.Nama = namaPasien;
        this.Alamat = alamatPasien;
        this.tempatLahir = tempatLahir;
        this.tanggalLahirPasien = tanggalLahirPasien;
        this.bulanLahirPasien = bulanLahirPasien;
        this.tahunLahirPasien = tahunLahirPasien;
        this.nik = nik;
        this.NoRM = this.nik;
    }

    /**
     * membuat constuctor Pasien dengan parameter String Nama
     *
     * @param namaPasien
     */
    public Pasien(String namaPasien) {
        //namaPasien dari variabel global sama dengan Nama dari variabel lokal
        this.Nama = namaPasien;

    }

    public Pasien() {
    }

    /**
     * membuat method public String dengan nama getNamaPasien()
     *
     * @return
     */
    public String getNama() {
        //pengembalian nilai dari Nama
        return Nama;
    }

    /**
     * membuat method public void dengan nama setNamaPasien()
     *
     * @param Nama
     */
    public void setNama(String Nama) {
        //namaPasien dari variabel global sama dengan Nama dari variabel lokal
        this.Nama = Nama;
    }

    /**
     * membuat method public String dengan nama getAlamat()
     *
     * @return
     */
    public String getAlamat() {
        //pengembalian nilai dari Alamat
        return Alamat;
    }

    /**
     * membuat method public void dengan nama setAlamat()
     *
     * @param Alamat
     */
    public void setAlamat(String Alamat) {
        //alamat dari variabel global sama dengan Alamat dari variabel lokal
        this.Alamat = Alamat;
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
    public String getNoRM() {
        //pengembalian nilai dari NoRM
        return NoRM;
    }

    /**
     * membuat method public void dengan nama setNoRekamMedis()
     *
     * @param NoRM
     */
    public void setNoRM(String NoRM) {
        //membuat kondisi if NoRM.length() >= 6
//        if (NoRM.length() >= 6) {
//            // NoRM dari variabel global sama dengan NoRM dari variabel lokal
        this.NoRM = NoRM;
//        } else {
//            //jika tidak sesuai akan menampilkan "nomor rekam medis salah"
//            throw new Exception("nomor rekam medis salah");
//        }

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

    /**
     * membuat method public String dengan nama getNik()
     *
     * @return
     */
    public String getNik() {
        //nilai variabel nik samadengan variabel NoRM
        nik = NoRM;
        //pengembalian nilai dari nik
        return nik;
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

    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public static void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        Pasien.daftarPasien = daftarPasien;
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
        //nilai dari nomorRekamMedis sama dengan tgl ditambah 3 huruf pertama dari Nama
        nomorRekamMedis = ft.format(tgl) + Nama.substring(0, 3);
        //pengembalian nilai nomorRekamMedis
        return nomorRekamMedis;
    }

    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public static Pasien cariPasien(String NoRM) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (NoRM.equals(daftarPasien.get(i).getNoRM())) {
                return daftarPasien.get(i);
            }
        }
        return null;
    }

    public static void simpanDaftarPasien(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        try {
            boolean isnoRM = false;
            boolean isNama = false;
            boolean isAlamat = false;
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            Pasien temp = new Pasien();
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    if ((char) dataInt != '\t' && isnoRM == false && isNama == false && isAlamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && isnoRM == false && isAlamat == false) {
                        isnoRM = true;
                        temp.setNoRM(hasilBaca);
                        hasilBaca = "";
                    } else if ((char) dataInt != '\t' && isnoRM == true && isNama == false && isAlamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && isnoRM == true && isNama == false && isAlamat == false) {
                        isNama = true;
                        temp.setNama(hasilBaca);
                        hasilBaca = "";
                    } else if ((char) dataInt != '\t' && isnoRM == true && isNama == true && isAlamat == false) {
                        hasilBaca = hasilBaca + (char) dataInt;
                    } else if ((char) dataInt == '\t' && isnoRM == true && isNama == true && isAlamat == false) {
                        isAlamat = true;
                        temp.setAlamat(hasilBaca);
                        hasilBaca = "";
                    }
                } else {
                    isAlamat = true;
                    temp.setAlamat(hasilBaca);
                    hasilBaca = "";
                    tambahPasienBaru(temp);
                    isnoRM = false;
                    isNama = false;
                    isAlamat = false;
                    temp = new Pasien();
                }
            }
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @return
     */
    public String toString() {
        return NoRM + "\t" + Nama + "\t" + Alamat + "\n";
    }
}
