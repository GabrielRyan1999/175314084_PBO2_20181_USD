/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class DaftarAntrianDialog extends JDialog {

    String lelakiString = "Lelaki";
    String perempuanString = "Perempuan";
    private JLabel labelNoRM;
    private JLabel labelNama;
    private JLabel labelAlamat;
    private JLabel labelJenisKelamin;
    private JLabel labelTanggalLahir;
    private JTextField textFieldNoRM;
    private JTextField textFieldNama;
    private JTextArea textAreaAlamat;
    private JComboBox boxTanggal;
    private JComboBox boxBulan;
    private JComboBox boxTahun;
    private JButton buttonSave;
    private JRadioButton lelakiButton;
    private JRadioButton perempuanButton;

    

    /**
     * membuat constuctor kosong dengan nama DaftarAntrianDialog()
     *
     */
    public DaftarAntrianDialog() {
        // mengisi title dengan "Form Daftar Antrian"

        this.setTitle("Form Daftar Antrian");
        //menjalankan method init()

        init();
    }

    public void init() {
        this.setLayout(null);
        
        //membuat labelNoRM dari JLabel diberi nama "NoRM" 
        labelNoRM = new JLabel("NoRM");
        //mengatur ukuran labelNoRM dengan ukuran 10,10,70,25
        labelNoRM.setBounds(20, 10, 70, 25);
        //membuat labelNama dari JLabel diberi nama "Nama"
        labelNama = new JLabel("Nama");
        //mengatur ukuran labelNama dengan ukuran 20,10,70,25
        labelNama.setBounds(20, 50, 70, 25);
        //membuat labelTanggalLahir dari JLabel diberi nama "Tanggal Lahir"
        labelTanggalLahir = new JLabel("Tanggal Lahir");
        //mengatur ukuran labelTanggalLahir dengan ukuran 20,90,100,25
        labelTanggalLahir.setBounds(20, 90, 100, 25);
        //membuat labelJenisKelamin dari JLabel diberi nama "Jenis Kelamin"
        labelJenisKelamin = new JLabel("Jenis Kelamin");
        //mengatur ukuran labelJenisKelamin dengan ukuran 20,130,100,25
        labelJenisKelamin.setBounds(20, 130, 100, 25);
        //membuat labelAlamat dari JLabel diberi nama "Alamat"
        labelAlamat = new JLabel("Alamat");
        //mengatur ukuran labelAlamat dengan ukuran 20,170,70,25
        labelAlamat.setBounds(20, 170, 70, 25);
        
        //membuat textFieldNoRM dari JTextField
        textFieldNoRM = new JTextField();
        //mengatur ukuran textFieldNoRM dengan ukuran 110,10,170,25
        textFieldNoRM.setBounds(110, 10, 170, 25);
         //membuat textFieldNama dari JTextField
        textFieldNama = new JTextField();
        //mengatur ukuran textFieldNama dengan ukuran 110,50,170,25
        textFieldNama.setBounds(110, 50, 170, 25);

        boxTanggal = new JComboBox();
        boxTanggal.setBounds(110, 93, 60, 20);
        boxBulan = new JComboBox();
        boxBulan.setBounds(180, 93, 100, 20);
        boxTahun = new JComboBox();
        boxTahun.setBounds(300, 93, 70, 20);
        
        //membuat lelakiButton dari JRadioButton lalu mengisinya dengan lelakiString
        lelakiButton = new JRadioButton(lelakiString);
        //mengatur ukuran lelakiButton dengan ukuran 110,125,170,35
        lelakiButton.setBounds(110, 125, 170, 35);
        //membuat perempuanButton dari JRadioButton lalu mengisinya dengan perempuanString
        perempuanButton = new JRadioButton(perempuanString);
        //mengatur ukuran perempuanButton dengan ukuran 180,125,170,35
        perempuanButton.setBounds(180, 125, 170, 35);

        //membuat textAreaAlamat dari JTextArea
        textAreaAlamat = new JTextArea();
        //mengatur ukuran textAreaAlamat dengan ukuran 110,180,300,200
        textAreaAlamat.setBounds(110, 180, 300, 200);
        
        //membuat buttonSave dari JButton diberi nama "Save"
        buttonSave = new JButton("Save");
        //mengatur ukuran buttonSave dengan ukuran 190,400,100,30
        buttonSave.setBounds(190, 400, 100, 30);

        this.add(labelNoRM);
        this.add(labelNama);
        this.add(labelJenisKelamin);
        this.add(labelTanggalLahir);
        this.add(labelAlamat);
        
        this.add(boxTanggal);
        boxTanggal.addItem(1);
        boxTanggal.addItem(2);
        boxTanggal.addItem(3);
        boxTanggal.addItem(4);
        boxTanggal.addItem(5);
        boxTanggal.addItem(6);
        boxTanggal.addItem(7);
        this.add(boxBulan);
        boxBulan.addItem("January");
        boxBulan.addItem("Febuary");
        boxBulan.addItem("March");
        boxBulan.addItem("April");
        boxBulan.addItem("May");
        this.add(boxTahun);
        boxTahun.addItem(1990);
        boxTahun.addItem(1991);
        boxTahun.addItem(1992);
        boxTahun.addItem(1993);
        boxTahun.addItem(1994);
        boxTahun.addItem(1995);
        boxTahun.addItem(1996);
        this.add(textFieldNoRM);
        this.add(textFieldNama);
        this.add(lelakiButton);
        this.add(perempuanButton);
        this.add(textAreaAlamat);
        this.add(buttonSave);

    }
}
