package aplicacion_lacteos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacion_Lacteos {

    List<Cliente> clientes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner ingresocliente = new Scanner(System.in);


    public static void main(String[] args) {

        Aplicacion_Lacteos aplicacion = new Aplicacion_Lacteos();
        aplicacion.crearMenu();

        // mascota masc = new mascota(5, "Golden", "Gris", 30, 10);
        // System.out.println("raza:"+masc.raza + "\nEdad:"+masc.edad);
    }

    public void crearMenu() {

        int opcion;
        System.out.println("Elija una opcion");

        do {

            System.out.println("1. Registrar Cliente");
            System.out.println("2. Mostrar Cliente");
            System.out.println("3. Registrar Almacen");
            System.out.println("4. Mostrar Almacen");
            System.out.println("5. Registrar Cargo ");
            System.out.println("6. Mostrar cargo");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            opciones(opcion);

        } while (opcion != 0);

    }

    void opciones(int op) {

        switch (op) {

            case 1:
                RegistrarCliente();

                break;
            case 2:
                MostrarClientes();
                break;
            case 3:
                System.out.println("Se eligion Opcion registrar almacen");
                break;
            case 4:
                System.out.println("Se eligion Opcion mostrar almacen");
                break;
            case 5:
                System.out.println("Se eligion Opcion registrar cargo");
                break;
            case 6:
                System.out.println("Se eligion Opcion mostrar cargo");
                break;
            default:
                break;

        }

    }

    void RegistrarCliente() {

        String nombre_apellidos;
        String CI_NIT;
        String contacto;
        String direccion;

        System.out.println("Ingrese nombre y apellido del cliente");
        nombre_apellidos = ingresocliente.next();

        System.out.println("Ingrese CI o NIT del cliente");
        CI_NIT = ingresocliente.next();

        System.out.println("Ingrese numero de telefono");
        contacto = ingresocliente.next();

        System.out.println("Ingrese direccion del cliente");
        direccion = ingresocliente.next();

        Cliente cliente = new Cliente(nombre_apellidos, CI_NIT, contacto, direccion);
        cliente.ID = cliente.generarID();

        clientes.add(cliente);

    }

    private void MostrarClientes() {

        if (clientes.size() > 0) {

            System.out.println("------------- LISTA DE CLIENTES ----------------\n");

            for (int i = 0; i < clientes.size(); i++) {

                System.out.println(clientes.get(i).toString());

            }
        } else {

            System.out.println("No hay clientes registrados\n");
        }

    }

}
