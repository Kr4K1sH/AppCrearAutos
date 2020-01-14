package capalogica;

import java.util.ArrayList;
import java.util.Date;

public class Orden {
    private double IV;
    private double DESC;
    private int CantOrdenes=1;
    private Date Fecha;
    private TipoPago tipopago;
    
    private ArrayList<AutoArmado> arrayAutoArmado;
    
    public Orden() {
        this.CantOrdenes = this.CantOrdenes++;
        this.Fecha = new Date();
        this.tipopago = null;
        this.arrayAutoArmado = new ArrayList<AutoArmado>();
    }
    public void AgregarAutoArmado(AutoArmado miautoarmado){
        this.arrayAutoArmado.add(miautoarmado);
    }
    public double CalcularSubTotalOrden(){
     double total =0;
     for(AutoArmado auto : this.arrayAutoArmado ){
         total += auto.CalculaTotalPrecioAuto();
     }
     return total;
        }
    public double CalculaDescuento(){
        double total =0;
        if(tipopago == TipoPago.EFECTIVO)
            total = this.CalcularSubTotalOrden()*0.5;
        return total;   
    }
    
    public double impuesto(){
        double impuesto=0;
        impuesto = this.CalcularSubTotalOrden()-this.CalculaDescuento();
        return impuesto*0.13;
    }
    public double calculaTotalOrden(){
        double total=0;
        total = CalcularSubTotalOrden()-CalculaDescuento()+impuesto();
        return total;
    }

    public void setDESC(double DESC) {
        this.DESC = DESC;
    }

    public double getDESC() {
        return DESC;
    }

    public void setCantOrdenes(int CantOrdenes) {
        this.CantOrdenes = CantOrdenes;
    }

    public int getCantOrdenes() {
        return CantOrdenes;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setTipopago(TipoPago tipopago) {
        this.tipopago = tipopago;
    }

    public TipoPago getTipopago() {
        return tipopago;
    }

    public void setArrayAutoArmado(ArrayList<AutoArmado> arrayAutoArmado) {
        this.arrayAutoArmado = arrayAutoArmado;
    }

    public ArrayList<AutoArmado> getArrayAutoArmado() {
        return arrayAutoArmado;
    }
}
