/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ryan
 */
public class Main {

    public static void main(String[] args) {
        Pasien pasien = new Pasien("Ryan");
        Dokter dokter = new Dokter("Dokter");

        try {
            pasien.setAlamat("Jl.Affandi No 27");
            pasien.setTempatLahir("Yogyakarta");
            pasien.setTanggalLahirPasien(15);
            pasien.setBulanLahirPasien(5);
            pasien.setTahunLahirPasien(1999);
            pasien.setNoRM(pasien.AturNomorRekamMedis());

            dokter.setAlamat("Jl.Merah Putih no 17");
            dokter.setTempatLahir("Jakarta");
            dokter.setTanggalLahirDok(30);
            dokter.setBulanLahirDok(12);
            dokter.setTahunLahirDok(1989);
            dokter.setNomorPegawai("123123");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Pasien");
        System.out.println(pasien.getNoRM());
        System.out.println(pasien.getNama());
        System.out.println(pasien.getAlamat());
        System.out.println(pasien.getTempatLahir());
        System.out.println(pasien.getTanggalLahirPasien());
        System.out.println(pasien.getBulanLahirPasien());
        System.out.println(pasien.getTahunLahirPasien());
        System.out.println("");
        System.out.println("Dokter");
        System.out.println(dokter.getNama());
        System.out.println(dokter.getAlamat());
        System.out.println(dokter.getTempatLahir());
        System.out.println(dokter.getTanggalLahirDok());
        System.out.println(dokter.getBulanLahirDok());
        System.out.println(dokter.getTahunLahirDok());
        System.out.println(dokter.getNomorPegawai());
    }
}
