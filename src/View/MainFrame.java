/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * membuat method MainFrame extends JFrame
 *
 * @author jarkom
 */
public class MainFrame extends JFrame {

    //mendeklarasikan variabel menuBar bertipe private JMenuBar
    private JMenuBar menuBar;
    //mendeklarasikan variabel fileMenu bertipe private JMenu
    private JMenu fileMenu;
    //mendeklarasikan variabel exitMenuItem bertipe private JMenuItem
    private JMenuItem exitMenuItem;

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
        fileMenu.add(exitMenuItem);
        //menambah fileMenu pada menuBar
        menuBar.add(fileMenu);
        //set menuBar
        this.setJMenuBar(menuBar);
    }
}
