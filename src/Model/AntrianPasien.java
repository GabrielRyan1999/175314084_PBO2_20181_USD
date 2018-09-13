/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jarkom
 */
public class AntrianPasien {

    private int nomorAntrian = 0;
    private final int JUMLAH_MAKSIMAL_PASIEN = 50;
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private Pasien daftarPasienKlinik[] = new Pasien[JUMLAH_MAKSIMAL_PASIEN];

    /**
     * membuat method public int dengan nama getTanggalAntrian
     * @return 
     */
    public int getTanggalAntrian() {
        //pengembalian nilai dari tanggalAntrian
        return tanggalAntrian;
    }
/**
 * membuat method public void dengan nama setTanggalAntrian()
 * @param tanggalAntrian 
 */
    public void setTanggalAntrian(int tanggalAntrian) {
        //tanggalAntrian dari variabel global sama dengan tanggalAntrian dari variabel lokal
        this.tanggalAntrian = tanggalAntrian;
    }
/**
 * membuat method public int dengan nama getBulanAntrian
 * @return 
 */
    public int getBulanAntrian() {
        //pengembalian nilai dari bulanAntrian
        return bulanAntrian;
    }
/**
 * membuat method public void dengan nama setBulanAntrian()
 * @param bulanAntrian 
 */
    public void setBulanAntrian(int bulanAntrian) {
        //bulanAntrian dari variabel global sama dengan bulanAntrian dari variabel lokal
        this.bulanAntrian = bulanAntrian;
    }
/**
 * membuat method public int dengan nama getTahunAntrian
 * @return 
 */
    public int getTahunAntrian() {
        //pengembalian nilai dari tahunAntrian
        return tahunAntrian;
    }
/**
 * membuat method public void dengan nama setTahunAntrian()
 * @param tahunAntrian 
 */
    public void setTahunAntrian(int tahunAntrian) {
        //tahunAntrian dari variabel global sama dengan tahunAntrian dari variabel lokal
        this.tahunAntrian = tahunAntrian;
    }
/**
 * membuat method public int dengan nama getKlinik
 * @return 
 */
    public Klinik getKlinik() {
        //pengembalian nilai dari klinik
        return klinik;
    }
/**
 * membuat method public void dengan nama setKlinik()
 * @param klinik 
 */
    public void setKlinik(Klinik klinik) {
        //klinik dari variabel global sama dengan klinik dari variabel lokal
        this.klinik = klinik;
    }
/**
 * membuat method public int dengan nama getNomorAntrian
 * @return 
 */
    public int getNomorAntrian() {
        //pengembalian nilai dari nomorAntrian
        return nomorAntrian;
    }
/**
 * membuat method public void dengan nama setNomorAntrian()
 * @param nomorAntrian 
 */
    public void setNomorAntrian(int nomorAntrian) {
        //nomorAntrian dari variabel global sama dengan nomorAntrian dari variabel lokal
        this.nomorAntrian = nomorAntrian;
    }
/**
 * membuat method public Pasien[] dengan nama getDaftarPasienKlinik()
 * @return 
 */
    public Pasien[] getDaftarPasienKlinik() {
        //pengembalian nilai dari daftarPasienKlinik
        return daftarPasienKlinik;
    }

    /**
     * membuat method public void dengan nama setDaftarPasienKlinik()
     * @param daftarPasienKlinik 
     */
    public void setDaftarPasienKlinik(Pasien[] daftarPasienKlinik) {
        //daftarPasienKlinik dari variabel global sama dengan daftarPasienKlinik dari variabel lokal
        this.daftarPasienKlinik = daftarPasienKlinik;
    }

   
    /**
     * Fungsi ini digunakan untuk mendaftar pasien baru di nomor antrian
     *
     * @param pasien
     * @throws Exception
     */
    public void Mendaftar(Pasien pasien) throws Exception {
        //membandingkan nomorAntrian dengan jumlah maksimal pasien yang dilayani
        if (nomorAntrian < JUMLAH_MAKSIMAL_PASIEN) {
            daftarPasienKlinik[nomorAntrian] = pasien;
            nomorAntrian++;
        } else {
            //antrian sudah penuh
            throw new Exception("antrian penuh");
        }

    }
/**
 * fungsi ini digunakan untuk memanggil Pasien sampai habis
 * @param nomorAntrian
 * @return
 * @throws Exception 
 */
    public Pasien panggilPasien(int nomorAntrian) throws Exception {
        //membandingkan nomorAntrian dengan jumlah maksimal pasien yang dilayani
        if (nomorAntrian < JUMLAH_MAKSIMAL_PASIEN) {
            return daftarPasienKlinik[nomorAntrian];
        } else {
            throw new Exception("Antrian Habis");
        }

    }
}
