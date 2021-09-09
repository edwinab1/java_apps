/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_lacteos;

/**
 *
 * @author LAB4-SERVIDOR
 */
public class Proveedor {
    int ID;
    String nombre_apellidos;
    String contacto;
    String direccion;
    String ci;
    String nit;

    public Proveedor(String nombre_apellidos, String contacto, String direccion, String ci, String nit) {
        this.nombre_apellidos = nombre_apellidos;
        this.contacto = contacto;
        this.direccion = direccion;
        this.ci = ci;
        this.nit = nit;
    }
    
    
    
}
