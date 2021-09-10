
package aplicacion_lacteos;

import java.util.Date;


public class Cliente {
    int ID;
    String nombre_apellidos;
    String CI_NIT;
    String contacto;
    String direccion;

    public Cliente(String nombre_apellidos, String CI_NIT, String contacto, String direccion) {
        this.nombre_apellidos = nombre_apellidos;
        this.CI_NIT = CI_NIT;
        this.contacto = contacto;
        this.direccion = direccion;
    }
    
    public Cliente(){
    
    }
    
    public int generarID(){  
     Date date = new Date();
     return date.getSeconds(); 
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre_apellidos=" + nombre_apellidos + ", CI_NIT=" + CI_NIT + ", contacto=" + contacto + ", direccion=" + direccion + '}';
    }
    
    
   
    
    
    
    
}
