
package aplicacion_lacteos;


public class Aplicacion_Lacteos {

    
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al Sistema");
      
        //Empleados
        Cargo cargo1 = new Cargo("Cajero", "Cajero", 2500.0); 
        
        //String nombre, String apellidos, String ci, String contacto, String direccion
        
        Empleado empleado = new Empleado(cargo1, "Rodolfo","Ramirez", "8454545", "6646464 - 7578787", "Calle Olmedo #456");
        
        System.out.println("Cargo: "+empleado.cargo.nombre +"\nNombre:"+empleado.nombre + "\nApellidos:"+empleado.apellidos +"\nDireccion:"+empleado.direccion);
        
    }
    
}
