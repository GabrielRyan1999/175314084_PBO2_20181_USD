/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.HeadlessException;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * membuat method MainFrame extends JFrame
 *
 * @author jarkom
 */
public class MainFrame extends JFrame implements ActionListener {

    //mendeklarasikan variabel menuBar bertipe private JMenuBar
    private JMenuBar menuBar;
    //mendeklarasikan variabel fileMenu bertipe private JMenu
    private JMenu fileMenu;
    //mendeklarasikan variabel exitMenuItem bertipe private JMenuItem
    private JMenuItem exitMenuItem;
    private JMenuItem tambahPasienMenuItem;
    private JMenuItem tambahAntrianMenuItem;

    public MainFrame() throws HeadlessException {
        //memanggil method init
        init();
    }

    /**
     * membuat method init bertipe void
     */
    public void init() {
        // membuat  menuBar dari JMenuBar
        menuBar = new JMenuBar();
        //memberi judul "Frame"
        this.setTitle("Frame");
        // membuat  fileMenu dari JMenu diberi nama "File"
        fileMenu = new JMenu("File");
        // membuat  exitMenuItem dari JMenuItem diberi nama "Exit"
        exitMenuItem = new JMenuItem("Exit");
        //menambah exitMenuItem pada fileMenu
        tambahPasienMenuItem = new JMenuItem("TambahPasien");
        tambahAntrianMenuItem = new JMenuItem("TambahAntrian");
        fileMenu.add(tambahAntrianMenuItem);
        fileMenu.add(tambahPasienMenuItem);
        fileMenu.add(exitMenuItem);
        //menambah fileMenu pada menuBar
        menuBar.add(fileMenu);

        exitMenuItem.addActionListener(this);
        tambahPasienMenuItem.addActionListener(this);
        tambahAntrianMenuItem.addActionListener(this);
        //set menuBar
        this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == tambahAntrianMenuItem) {
            DaftarAntrianDialog test = new DaftarAntrianDialog();
            test.setSize(500, 500);
            test.setVisible(true);
        }
        if (e.getSource() == tambahPasienMenuItem) {
            DaftarPasienBaruDialog test = new DaftarPasienBaruDialog();
            test.setSize(500, 500);
            test.setVisible(true);
        }
        
    }
}
