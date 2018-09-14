/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class DaftarPasienBaruDialog extends JDialog implements ActionListener {   
    private JLabel labelNama;
    private JLabel labelAlamat; 
    private JLabel labelNik; 
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField nikText;
    private JButton tambahButton;
    

    public DaftarPasienBaruDialog() {
        this.setTitle("Form Daftar Pasien Baru");
        init();
    }
    
    public void init(){
        this.setLayout(null);
       
        labelNama = new JLabel("Nama");
        labelNama.setBounds(10, 10, 70, 25);
        labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(10, 40, 70, 25);
        
        labelNik = new JLabel("Nik");
        labelNik.setBounds(10, 70, 70, 25);
        
        namaText = new JTextField();
        namaText.setBounds(90, 10, 170, 25);
        alamatText = new JTextField();
        alamatText.setBounds(90, 40, 170, 25);
        
        nikText = new JTextField();
        nikText.setBounds(90, 70, 170, 25);
        
        tambahButton = new JButton("Save");
        tambahButton.setBounds(110, 130, 80, 25);
        
       
        this.add(labelNama);
        this.add(labelAlamat);
        this.add(labelNik);
        this.add(namaText);
        this.add(alamatText);
        this.add(nikText);
        this.add(tambahButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambahButton) {
                Pasien baru = new Pasien();
                baru.setNama(namaText.getText());
                baru.setAlamat(alamatText.getText());

                Pasien.tambahPasienBaru(baru);
    }
}
}