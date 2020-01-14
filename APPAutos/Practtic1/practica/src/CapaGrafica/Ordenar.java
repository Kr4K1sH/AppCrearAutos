package CapaGrafica;

import capalogica.Auto;

import capalogica.AutoArmado;
import capalogica.Extras;
import capalogica.Orden;

import capalogica.TipoPago;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

public class Ordenar extends JPanel {
    private JButton jbtnAgregarExtras = new JButton();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JEditorPane jtxtNorden = new JEditorPane();
    private JRadioButton jrbtnEfectivo = new JRadioButton();
    private JRadioButton jrbntTarjeta = new JRadioButton();
    private JLabel jLabel7 = new JLabel();
    private JEditorPane jtxtFecha = new JEditorPane();
    private JSeparator jSeparator1 = new JSeparator();
    private JComboBox jcmbAuto = new JComboBox();
    private JComboBox jcmbExtras = new JComboBox();
    private JButton jbtnAgregarAutoOrden = new JButton();
    private JButton jbtnNuevoAuto = new JButton();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JList jlistExtras = new JList();
    private JLabel jLabel1 = new JLabel();
    private JButton jbtnLimpiarOrden = new JButton();
    private JButton jbtnSalir = new JButton();
    private JScrollPane jScrollPane2 = new JScrollPane();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private JEditorPane jtxtDescuento = new JEditorPane();
    private JEditorPane jtxtImpuesto = new JEditorPane();
    private JEditorPane jtxtTotalApagar = new JEditorPane();
    private JTable jtabla = new JTable();
    DefaultTableModel modelotabla;
    DefaultListModel modeloLista;
    ButtonGroup botones = new ButtonGroup();
   Auto miauto;
   Orden miOrden = new Orden();
   TipoPago tipopago;
   AutoArmado miautoArmado;
   Extras misextras;
    public Ordenar() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(641, 511));
        this.addAncestorListener(new AncestorListener() {
                public void ancestorAdded(AncestorEvent e) {
                    this_ancestorAdded(e);
                }

                public void ancestorRemoved(AncestorEvent e) {
                }

                public void ancestorMoved(AncestorEvent e) {
                }
            });
        jbtnAgregarExtras.setText("Agregar Extras");
        jbtnAgregarExtras.setBounds(new Rectangle(280, 150, 130, 25));

        jbtnAgregarExtras.setEnabled(false);
        jbtnAgregarExtras.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jbtnAgregarExtras_actionPerformed(e);
                }
            });
        jLabel4.setText("#Orden");
        jLabel4.setBounds(new Rectangle(30, 15, 65, 30));
        jLabel5.setText("Auto");
        jLabel5.setBounds(new Rectangle(20, 95, 115, 30));
        jLabel6.setText("Extras");
        jLabel6.setBounds(new Rectangle(235, 95, 115, 30));
        jtxtNorden.setBounds(new Rectangle(75, 15, 55, 30));
        jtxtNorden.setEditable(false);
        jrbtnEfectivo.setText("Efectivo");
        jrbtnEfectivo.setBounds(new Rectangle(195, 15, 65, 20));
        jrbtnEfectivo.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jrbtnEfectivo_actionPerformed(e);
                }
            });
        jrbntTarjeta.setText("Tarjeta");
        jrbntTarjeta.setBounds(new Rectangle(195, 45, 65, 20));
        jrbntTarjeta.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jrbntTarjeta_actionPerformed(e);
                }
            });
        jLabel7.setText("Fecha");
        jLabel7.setBounds(new Rectangle(355, 25, 115, 30));
        jtxtFecha.setBounds(new Rectangle(395, 25, 200, 25));
        jtxtFecha.setEditable(false);
        jSeparator1.setBounds(new Rectangle(5, 80, 620, 10));
        jcmbAuto.setBounds(new Rectangle(15, 120, 165, 20));
        jcmbAuto.setEnabled(false);
        jcmbExtras.setBounds(new Rectangle(230, 120, 180, 20));
        jcmbExtras.setEnabled(false);
        jbtnAgregarAutoOrden.setText("Agregar Auto a la Orden");
        jbtnAgregarAutoOrden.setBounds(new Rectangle(25, 195, 160, 30));
        jbtnAgregarAutoOrden.setEnabled(false);
        jbtnAgregarAutoOrden.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jbtnAgregarAutoOrden_actionPerformed(e);
                }
            });
        jbtnNuevoAuto.setText("Nuevo Auto");
        jbtnNuevoAuto.setBounds(new Rectangle(240, 195, 170, 30));
        jbtnNuevoAuto.setEnabled(false);
        jbtnNuevoAuto.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jbtnNuevoAuto_actionPerformed(e);
                }
            });
        jScrollPane1.setBounds(new Rectangle(445, 115, 190, 115));
        jlistExtras.setEnabled(false);
        jLabel1.setText("Lista De Extras");
        jLabel1.setBounds(new Rectangle(460, 90, 165, 25));
        jbtnLimpiarOrden.setText("Limpiar Orden");
        jbtnLimpiarOrden.setBounds(new Rectangle(20, 395, 160, 30));
        jbtnLimpiarOrden.setEnabled(false);
        jbtnSalir.setText("Salir");
        jbtnSalir.setBounds(new Rectangle(200, 395, 180, 30));
        jbtnSalir.setEnabled(false);
        jScrollPane2.setBounds(new Rectangle(20, 275, 415, 105));
        jLabel2.setText("Descuento");
        jLabel2.setBounds(new Rectangle(445, 385, 60, 30));
        jLabel3.setText("Impuesto");
        jLabel3.setBounds(new Rectangle(440, 415, 60, 35));
        jLabel8.setText("Total A Pagar");
        jLabel8.setBounds(new Rectangle(430, 460, 70, 30));
        jtxtDescuento.setBounds(new Rectangle(505, 385, 130, 30));
        jtxtDescuento.setEnabled(false);
        jtxtDescuento.setEditable(false);
        jtxtImpuesto.setBounds(new Rectangle(505, 425, 130, 25));
        jtxtImpuesto.setEnabled(false);
        jtxtImpuesto.setEditable(false);
        jtxtTotalApagar.setBounds(new Rectangle(505, 465, 130, 35));
        jtxtTotalApagar.setEditable(false);
        jtxtTotalApagar.setEnabled(false);
        jScrollPane1.getViewport().add(jlistExtras, null);
        this.add(jtxtTotalApagar, null);
        this.add(jtxtImpuesto, null);
        this.add(jtxtDescuento, null);
        this.add(jLabel8, null);
        this.add(jLabel3, null);
        this.add(jLabel2, null);
        jScrollPane2.getViewport().add(jtabla, null);
        this.add(jScrollPane2, null);
        this.add(jbtnSalir, null);
        this.add(jbtnLimpiarOrden, null);
        this.add(jLabel1, null);
        this.add(jScrollPane1, null);
        this.add(jbtnNuevoAuto, null);
        this.add(jbtnAgregarAutoOrden, null);
        this.add(jcmbExtras, null);
        this.add(jcmbAuto, null);
        this.add(jSeparator1, null);
        this.add(jtxtFecha, null);
        this.add(jLabel7, null);
        this.add(jrbntTarjeta, null);
        this.add(jrbtnEfectivo, null);
        this.add(jtxtNorden, null);
        this.add(jLabel6, null);
        this.add(jLabel5, null);
        this.add(jLabel4, null);
        this.add(jbtnAgregarExtras, null);
         this.botones.add(jrbntTarjeta);
        this.botones.add(jrbtnEfectivo);
    }
    private void this_ancestorAdded(AncestorEvent e) {
        titulosTabla();
        llenarComboExtras();
        llenarComboAuto();
        this.jtxtFecha.setText(String.valueOf(new Date()));
        this.jtxtNorden.setText(miOrden.getCantOrdenes()+"");
        this.jlistExtras.setModel(modeloLista);
    }
    private void llenarComboAuto(){
        this.jcmbAuto.removeAllItems();
        this.jcmbAuto.addItem(new Auto("Van"));
        this.jcmbAuto.addItem(new Auto("Camioneta"));
        this.jcmbAuto.addItem(new Auto("SemiCamioneta"));
        this.jcmbAuto.addItem(new Auto("Sedan"));
        this.jcmbAuto.addItem(new Auto("Deportivos"));
        this.jcmbAuto.setSelectedIndex(-1);
    }
    private void llenarComboExtras(){
        this.jcmbExtras.removeAllItems();
        this.jcmbExtras.addItem(new Extras("Alerones",75));
        this.jcmbExtras.addItem(new Extras("Capo",80));
        this.jcmbExtras.addItem(new Extras("Focos LED",75));
        this.jcmbExtras.addItem(new Extras("LLantas de Lujo",80));
        this.jcmbExtras.addItem(new Extras("POlarisado",100));
        this.jcmbExtras.setSelectedIndex(-1);
    }
    private void titulosTabla(){
        String titulos []={"Auto","Extras","Precio Total"};
        modelotabla = new DefaultTableModel(titulos,0);
        this.jtabla.setModel(modelotabla);
        this.jtabla.setRowSelectionAllowed(true);
    }
    private void jbtnAgregarExtras_actionPerformed(ActionEvent e) {
        miautoArmado.agregarExtras((Extras)this.jcmbExtras.getSelectedItem());
        modeloLista.addElement(jcmbExtras.getSelectedItem() );
    }
    private void jrbtnEfectivo_actionPerformed(ActionEvent e) {
        miOrden.setTipopago(TipoPago.EFECTIVO);
        this.jtxtNorden.setEnabled(true);
        this.jtxtFecha.setEnabled(true);
        this.jcmbAuto.setEnabled(true);
        this.jcmbExtras.setEnabled(true);
        this.jbtnAgregarExtras.setEnabled(true);
        this.jbtnAgregarAutoOrden.setEnabled(true);
        this.jbtnNuevoAuto.setEnabled(true);
        this.jlistExtras.setEnabled(true);
        this.jtabla.setEnabled(true);
        this.jbtnLimpiarOrden.setEnabled(true);
        this.jbtnSalir.setEnabled(true);
    }

    private void jrbntTarjeta_actionPerformed(ActionEvent e) {
        miOrden.setTipopago(TipoPago.TARJETA);
        this.jtxtNorden.setEnabled(true);
        this.jtxtFecha.setEnabled(true);
        this.jcmbAuto.setEnabled(true);
        this.jcmbExtras.setEnabled(true);
        this.jbtnAgregarExtras.setEnabled(true);
        this.jbtnAgregarAutoOrden.setEnabled(true);
        this.jbtnNuevoAuto.setEnabled(true);
        this.jlistExtras.setEnabled(true);
        this.jtabla.setEnabled(true);
        this.jbtnLimpiarOrden.setEnabled(true);
        this.jbtnSalir.setEnabled(true);
    }

    private void jbtnNuevoAuto_actionPerformed(ActionEvent e) {
  
        this.jcmbAuto.setSelectedIndex(-1);
        this.jcmbExtras.setSelectedIndex(0);
        this.modeloLista.removeAllElements();
        this.botones.clearSelection();
        this.jtxtNorden.setText(miOrden.getCantOrdenes()+"");
    }

    private void jbtnAgregarAutoOrden_actionPerformed(ActionEvent e) {
        miautoArmado.setMiauto((Auto)this.jcmbAuto.getSelectedItem());
        miOrden.AgregarAutoArmado(miautoArmado);
        
        this.jtxtDescuento.setText(miOrden.CalculaDescuento()+"");
        this.jtxtImpuesto.setText(miOrden.impuesto()+"");
        this.jtxtTotalApagar.setText(miOrden.calculaTotalOrden()+"");
        
        String dat []= new String [3];
        dat[0]= miautoArmado.getMiauto()+"";
        dat[1]= this.miautoArmado.CalculaTotalExtras()+"";
        dat[2]= this.miautoArmado.CalculaTotalPrecioAuto()+"";
        this.modelotabla.addRow(dat);
        
        this.modeloLista.removeAllElements();
        this.jcmbAuto.setSelectedIndex(-1);
        this.jcmbExtras.setSelectedIndex(-1);
    }
    
    
}
