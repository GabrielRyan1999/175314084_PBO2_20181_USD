/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jarkom
 */
public class Klinik {
    public static ArrayList<Klinik>daftarKlinik = new ArrayList<Klinik>();
    private String idKlinik;
    private String namaKlinik;

    /**
     * membuat constuctor Klinik dengan parameter String idKlinik, String Nama
     * @param idKlinik
     * @param nama 
     */
    public Klinik(String idKlinik, String nama) {
         //idKlinik dari variabel global sama dengan idKlinik dari variabel lokal
        this.idKlinik = idKlinik;
         //nama dari variabel global sama dengan nama dari variabel lokal
        this.namaKlinik = nama;
    }
    
/**
 * membuat method public int dengan nama getIdKlinik
 * @return 
 */
    public String getIdKlinik() {
        //pengembalian nilai dari idKlinik
        return idKlinik;
    }
/**
 * membuat method public void dengan nama setIdKlinik()
 * @param idKlinik 
 */
    public void setIdKlinik(String idKlinik) {
         //idKlinik dari variabel global sama dengan idKlinik dari variabel lokal
        this.idKlinik = idKlinik;
    }
/**
 * membuat method public int dengan nama getNama
 * @return 
 */
    public String getNamaKlinik() {
        //pengembalian nilai dari nama
        return namaKlinik;
    }
/**
 * membuat method public void dengan nama setNama()
 * @param namaKlinik 
 */
    public void setNamaKlinik(String namaKlinik) {
         //nama dari variabel global sama dengan nama dari variabel lokal
        this.namaKlinik = namaKlinik;
    }
    
    public static void tambahKlinik(Klinik klinik){
        daftarKlinik.add(klinik);
    }
    
    public static Klinik cariKlinik(String namaKlinik){
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNamaKlinik().equalsIgnoreCase(namaKlinik)) {
                
            }
        }
        return null;
    }
}
