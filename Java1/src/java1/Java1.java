/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB4-SERVIDOR
 */
public class Java1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        Estudiante estudiante1 = new Estudiante("Bruno", "Lopez", 20, 'M', "Sistemas", "4560255");   
        Estudiante estudiante2 = new Estudiante("maria", "flores", 25, 'F', "derecho", "787878-C");
        
        Notas nota1 = new Notas(estudiante1, "Aplicaciones Moviles", 60,55,70,90);
        Notas nota2 = new Notas(estudiante2, "Constitucional I", 80,60,40,50);

        
        System.out.println(nota1.estudiante.nombre +' '+nota1.estudiante.apellidos +':'+nota1.CalcularPromedio());
        
        System.out.println(nota2.estudiante.nombre +' '+nota2.estudiante.apellidos +':'+nota2.CalcularPromedio());*/
 /*  List<String> gatos = new ArrayList<>();
        gatos.add("Pepito");
        gatos.add("Minino");
        gatos.add("Pelusa");
        gatos.add("Peluchin");
        
        for(int i=0;i<gatos.size();i++){
        
            System.out.println(gatos.get(i));
        }
         */
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Bruno", "Lopez", 20, 'M', "Sistemas", "4560255"));
        estudiantes.add(new Estudiante("Fabio", "Lopez", 25, 'M', "Derecho", "45477"));
        estudiantes.add(new Estudiante("Erick", "Flores", 18, 'M', "Contabilidad", "878787"));
        estudiantes.add(new Estudiante("Luis", "Rodriguez", 26, 'M', "Sistemas", "878787"));
        estudiantes.add(new Estudiante("Angela", "Arias", 19, 'F', "Comercial", "78878"));
        estudiantes.add(new Estudiante("Felipe", "marquina", 20, 'M', "psicologia", "878878"));
        estudiantes.add(new Estudiante("Rodrigo", "Lopez", 23, 'M', "Secretariado", "7444444"));

        List<Notas> notas = new ArrayList<>();

        //asignar notas
        for (int i = 0; i < estudiantes.size(); i++) {

            System.out.println(estudiantes.get(i).toString());
           /* notas.add(new Notas(estudiantes.get(i), "Programacion 1", 80, 60, 40, 58));
            notas.add(new Notas(estudiantes.get(i), "Constitucional", 55, 30, 40, 50));
            notas.add(new Notas(estudiantes.get(i), "Contabilidad 1", 70, 60, 10, 25));
            notas.add(new Notas(estudiantes.get(i), "Apps Moviles", 80, 60, 22, 50));
            notas.add(new Notas(estudiantes.get(i), "Importaciones 1", 45, 60, 40, 50));
            notas.add(new Notas(estudiantes.get(i), "Introduccion a la Psicologia", 80, 88, 40, 12));
            notas.add(new Notas(estudiantes.get(i), "ofimatica I", 80, 30, 40, 50));*/

        }
        
        //imprimir notas
       /* for (int i = 0; i<notas.size();i++){
        
            System.out.println(notas.get(i).estudiante.nombre +' '+notas.get(i).estudiante.apellidos +':'+notas.get(i).CalcularPromedio());
        }
*/
        

    }

}
