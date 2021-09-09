/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_lacteos;

import java.util.Date;

/**
 *
 * @author LAB4-SERVIDOR
 */
public class Producto {
   int ID;
   Categoria categoria;
   Proveedor proveedor;
   String nombre;
   String descripcion;
   Date fecha_caducidad;
   double precio;
   String numero_lote;

    public Producto(Categoria categoria, Proveedor proveedor, String nombre, String descripcion, Date fecha_caducidad, double precio, String numero_lote) {
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_caducidad = fecha_caducidad;
        this.precio = precio;
        this.numero_lote = numero_lote;
    }
   
   
   
   
 
    
}
