package capalogica;

public class Extras {
  private String descripcion;
  int precio;
    public Extras(String descripcion , int precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public String toString(){
        return this.descripcion+" "+this.precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}
