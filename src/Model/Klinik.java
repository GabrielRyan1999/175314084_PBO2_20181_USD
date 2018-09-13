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
public class Klinik {
    private String idKlinik;
    private String nama;

    /**
     * membuat constuctor Klinik dengan parameter String idKlinik, String Nama
     * @param idKlinik
     * @param nama 
     */
    public Klinik(String idKlinik, String nama) {
         //idKlinik dari variabel global sama dengan idKlinik dari variabel lokal
        this.idKlinik = idKlinik;
         //nama dari variabel global sama dengan nama dari variabel lokal
        this.nama = nama;
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
    public String getNama() {
        //pengembalian nilai dari nama
        return nama;
    }
/**
 * membuat method public void dengan nama setNama()
 * @param nama 
 */
    public void setNama(String nama) {
         //nama dari variabel global sama dengan nama dari variabel lokal
        this.nama = nama;
    }
    
}
