/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class DaftarPasienBaruDialog extends JDialog {   
    private JLabel labelNama;
    private JLabel labelAlamat; 
    private JTextField textFieldNama;
    private JTextField textFieldAlamat;
    private JButton buttonSave;

    public DaftarPasienBaruDialog() {
        this.setTitle("Form Daftar Pasien Baru");
        init();
    }
    
    public void init(){
        this.setLayout(null);
       
        labelNama = new JLabel("Nama");
        labelNama.setBounds(10, 10, 70, 25);
        labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(10, 60, 70, 25);
        
        textFieldNama = new JTextField();
        textFieldNama.setBounds(90, 10, 170, 25);
        textFieldAlamat = new JTextField();
        textFieldAlamat.setBounds(90, 60, 170, 25);
        
        buttonSave = new JButton("Save");
        buttonSave.setBounds(110, 110, 80, 25);
        
       
        this.add(labelNama);
        this.add(labelAlamat);
      
        this.add(textFieldNama);
        this.add(textFieldAlamat);
        this.add(buttonSave);
    }
}
