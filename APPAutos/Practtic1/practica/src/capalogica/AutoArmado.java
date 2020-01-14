package capalogica;

import java.util.ArrayList;

public class AutoArmado {
   private final double PRECIO = 1000;
   private Auto miauto;
   private ArrayList<Extras> arrayExtras;
    
    
    public AutoArmado() {
    this.miauto = null;
    this.arrayExtras = new ArrayList<Extras>();
    }
    public AutoArmado(Auto miauto){
        this.miauto = miauto;
        this.arrayExtras = new ArrayList<Extras>();
    }
    public void agregarExtras (Extras extra){
        this.arrayExtras.add(extra);
    }
    public double CalculaPrecioAuto(){
        return this.PRECIO;
    }
    public double CalculaTotalExtras(){
        double monto =0;
        for(Extras extra : this.arrayExtras){
            monto += extra.getPrecio();
        }
        return monto;
    }
    public double CalculaTotalPrecioAuto(){
        return this.CalculaPrecioAuto()+this.CalculaTotalExtras();
    }


    public void setMiauto(Auto miauto) {
        this.miauto = miauto;
    }

    public Auto getMiauto() {
        return miauto;
    }

    public void setArrayExtras(ArrayList<Extras> arrayExtras) {
        this.arrayExtras = arrayExtras;
    }

    public ArrayList<Extras> getArrayExtras() {
        return arrayExtras;
    }
}
