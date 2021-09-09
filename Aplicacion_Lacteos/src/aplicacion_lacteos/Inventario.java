
package aplicacion_lacteos;


public class Inventario {
    int ID;
    Producto producto;
    Almacen almacen;
    int cantidad; 

    public Inventario(Producto producto, Almacen almacen, int cantidad) {
        this.producto = producto;
        this.almacen = almacen;
        this.cantidad = cantidad;
    }
    
      
    
}
