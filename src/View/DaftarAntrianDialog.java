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
public class DaftarAntrianDialog extends JDialog {
    
    private JLabel labelNoRM;
    private JLabel labelNama;
    private JLabel labelAlamat;
    private JTextField textFieldNoRM;
    private JTextField textFieldNama;
    private JTextField textFieldAlamat;
    private JButton buttonSave;
    
   
/** membuat constuctor kosong dengan nama DaftarAntrianDialog()
 * 
 */
    public DaftarAntrianDialog() {
        /** mengisi title dengan "Form Daftar Antrian"
         * 
         */
        this.setTitle("Form Daftar Antrian");
        /** menjalankan method init()
         * 
         */
        init();
    }
    
    public void init(){
        this.setLayout(null);
        labelNoRM = new JLabel("NoRM");
        labelNoRM.setBounds(10, 10, 70, 25);
        labelNama = new JLabel("Nama");
        labelNama.setBounds(10, 50, 70, 25);
        labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(10, 90, 70, 25);
        
        textFieldNoRM = new JTextField();
        textFieldNoRM.setBounds(90, 10, 170, 25);
        textFieldNama = new JTextField();
        textFieldNama.setBounds(90, 50, 170, 25);
        textFieldAlamat = new JTextField();
        textFieldAlamat.setBounds(90, 90, 170, 25);
        
        buttonSave = new JButton("Save");
        buttonSave.setBounds(110, 140, 70, 25);
        
        this.add(labelNoRM);
        this.add(labelNama);
        this.add(labelAlamat);
        this.add(textFieldNoRM);
        this.add(textFieldNama);
        this.add(textFieldAlamat);
        this.add(buttonSave);
       
    }
}
