/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;

/**
 *
 * @author Yahir
 */
public class estudiante extends persona{
    
    public int numeroEstudiante;
    public String domicilio;
    public String turno;
    public String grado;
    public double calificacion;

    public estudiante() {
    }
    
    public estudiante(int numeroEstudiante, String domicilio, String turno, String grado, double calificacion, String nombre, int edad, String genero, String apellidos, String correo) {
        super(nombre, edad, genero, apellidos, correo);
        this.numeroEstudiante = numeroEstudiante;
        this.domicilio = domicilio;
        this.turno = turno;
        this.grado = grado;
        this.calificacion = calificacion;
    }

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(int numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }


    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public void estatus(){
        
        if (calificacion >= 6) {
            System.out.println("ACTUALMENTE EL ALUMNO SE ENCUNTRA APROBADO");
        } else{
            System.out.println("ACTUALMENTE EL ALUMNO SE ENCUNTRA REPOBADO");
        }
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos(); 
        System.out.println("Numero de estudiante: "+getNumeroEstudiante());
        System.out.println("Direccion: " +getDomicilio());
        System.out.println("Turno: " +getTurno());
        System.out.println("Calificacion: " +getCalificacion());
        System.out.println("Grado actual: " +getGrado());
    }
    
    


    
    
    
}
