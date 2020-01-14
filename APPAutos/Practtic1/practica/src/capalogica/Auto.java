package capalogica;

public class Auto {
    private String descripcion;
    
    public Auto(String descripcion) {
        this.descripcion = descripcion;
    }
    public String toString(){
        return this.descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
