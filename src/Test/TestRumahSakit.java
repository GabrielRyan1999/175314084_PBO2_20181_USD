/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.Pasien;
import Model.RumahSakit;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author jarkom
 */
public class TestRumahSakit {
    public static void main(String[] args) throws IOException{
        Pasien test = new Pasien();
        test.setNama("puspa");
        test.setAlamat("klaten");
        
        Pasien test1 = new Pasien(); 
        test1.setNama("adi");
        test1.setAlamat("klaten");
        
        RumahSakit rs = new RumahSakit("Panti Rapih","Yogyakarta");
        rs.tambahPasienBaru(test);
        rs.tambahPasienBaru(test1);
        
        rs.simpanObjekRumahSakit(new File("rsku.dat"));
    }
}