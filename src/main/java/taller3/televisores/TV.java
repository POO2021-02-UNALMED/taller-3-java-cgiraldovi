package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV = 0;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        numTV += 1;
    }

    public Marca getMarca() {
        return marca;
    }

    public int getCanal() {
        return canal;
    }

    public int getPrecio() {
        return precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }







    public void canalUp(){
        if(getEstado()){
            if(getCanal() >= 1 || getCanal() <= 120){
                setCanal(getCanal()+1);
            }
        }
    }

    public void canalDown(){
        if(getEstado()){
            if(getCanal() >= 1 || getCanal() <= 120){
                setCanal(getCanal()-1);
            }
        }
    }

    public void volumenUp(){
        if(getEstado()){
            if(getVolumen() >= 0 || getVolumen() <= 7){
                setVolumen(getVolumen()+1);
            }
        }
    }

    public void volumenDown(){
        if(getEstado()){
            if(getVolumen() >= 0 || getVolumen() <= 7){
                setVolumen(getVolumen()-1);
            }
        }
    }


}
