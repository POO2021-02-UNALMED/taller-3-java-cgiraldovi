package compras;

public class Producto {
 private final int codigo;
 private String nombre;
 public String tipo;
 public static int totalProductosPedidos;

 public Producto(int codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }
 public void imprimirNombre() {
        System.out.print(nombre);
    }
    public void setCodigo(int codigo) {

    }
    public int getCodigo() {
        return codigo;
    }
    public static int getTotalProductosPedidos() {
        return totalProductosPedidos;
    }
}