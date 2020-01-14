package CapaGrafica;

import UtilitarioVentanas.UtilitarioVentanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ArmarAutos extends JFrame {
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JMenu jMenu1 = new JMenu();
    private JMenuItem jMenuItem1 = new JMenuItem();
    JDesktopPane oEscritorio = new JDesktopPane();
    public ArmarAutos() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setJMenuBar( menuBar );
        
        //this.getContentPane().setLayout( null );
        
        this.setSize( new Dimension(400, 300) );
        this.add(oEscritorio);
        menuFile.setText("Sistema");
        menuFileExit.setText("Salir");
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        jMenu1.setText("Ordenes");
        jMenuItem1.setText("ArmarAutos");
        jMenuItem1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jMenuItem1_actionPerformed(e);
                }
            });
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        jMenu1.add(jMenuItem1);
        menuBar.add(jMenu1);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }


    private void jMenuItem1_actionPerformed(ActionEvent e) {
        Ordenar Panel = new  Ordenar();
        UtilitarioVentanas.centrarVentanaJPanel(this, "Registro de Ordenes", Panel, oEscritorio);
    }
}
