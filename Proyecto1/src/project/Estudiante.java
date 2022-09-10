package project;

public class Estudiante extends Persona{
    private String programaAcademico;
    private double promedio;


    public Estudiante() {
    }

    public Estudiante(int id, String nombre, String programaAcademico, double promedio) {
        super(id, nombre);
        this.programaAcademico = programaAcademico;
        this.promedio = promedio;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Id: "+ id +" -Nombre: " + nombre + " -Programa: " + programaAcademico +" -Promedio: "+ promedio;
    }
}

