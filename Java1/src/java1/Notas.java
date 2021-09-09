package java1;

public class Notas {
    Estudiante estudiante;
    String materia;
    double parcial1;
    double parcial2;
    double parcial3;
    double parcial4;
    double promedio;
    
    
    public Notas(Estudiante estudiante,String materia, double parcial1,  double parcial2, double parcial3, double parcial4){
    this.estudiante = estudiante;
    this.materia = materia;
    this.parcial1 = parcial1;
    this.parcial2 = parcial2;
    this.parcial3 = parcial3;
    this.parcial4 = parcial4;
           
    }
    
    public double CalcularPromedio(){
    
        promedio = (this.parcial1+this.parcial2+this.parcial3+this.parcial4)/4;
        
        return promedio;
    }
    
}
