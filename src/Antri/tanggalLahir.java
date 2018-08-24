/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Antri;

/**
 *
 * @author admin
 */
public class tanggalLahir {
    public static void main(String[] args) {
        Pasien pasien = new Pasien("Ryan");
        pasien.setTglLahir(1999, 5, 15);
        
        System.out.println("usia = " +pasien.getUsia());
    }
}
