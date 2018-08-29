/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Antri;

/**
 *
 * @author Ryan
 */
public class Main {

    public static void main(String[] args) {

        try {
            Pasien pasien = new Pasien("Ryan");
            pasien.setAlamat("Jl.Affandi No 27");
            pasien.setTempatLahir("Yogyakarta");
            pasien.setTanggalLahirPasien(15);
            pasien.setBulanLahirPasien(5);
            pasien.setTahunLahirPasien(1999);
            pasien.setNoRekamMedis(pasien.AturNomorRekamMedis());
            System.out.println("Pasien");
            System.out.println(pasien.getNoRekamMedis());
            System.out.println(pasien.getNamaPasien());
            System.out.println(pasien.getAlamat());
            System.out.println(pasien.getTempatLahir());
            System.out.println(pasien.getTanggalLahirPasien());
            System.out.println(pasien.getBulanLahirPasien());
            System.out.println(pasien.getTahunLahirPasien());
        } catch (Exception ex) {
            
        }
    }
}
