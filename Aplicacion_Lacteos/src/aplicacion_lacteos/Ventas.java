package aplicacion_lacteos;

import java.util.ArrayList;
import java.util.List;

public class Ventas {
    int ID;
    Cliente cliente;
    int cantidad;
    List<Producto> productos = new ArrayList<>();
    double descuento;
    double total;
    String metodo_pago;

    public Ventas(Cliente cliente, int cantidad, double descuento, String metodo_pago) {
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.metodo_pago = metodo_pago;
    }
    
    
    
}
