/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;

/**
 *
 * @author Yahir
 */
public class profesor extends persona{
    public String especialidad;
    public String horario;
    public int idProfesor;
    public int clasesAlDia;
    public String sueldo;
    
    
    public profesor() {
    }

    public profesor(String especialidad, String horario, int idProfesor, int clasesAlDia, String sueldo, String nombre, int edad, String genero, String apellidos, String correo) {
        super(nombre, edad, genero, apellidos, correo);
        this.especialidad = especialidad;
        this.horario = horario;
        this.idProfesor = idProfesor;
        this.clasesAlDia = clasesAlDia;
        this.sueldo = sueldo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getClasesAlDia() {
        return clasesAlDia;
    }

    public void setClasesAlDia(int clasesAlDia) {
        this.clasesAlDia = clasesAlDia;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos(); 
        System.out.println("Especialidad: "+getEspecialidad());
        System.out.println("Horario: "+getHorario());
        System.out.println("Id de profesor: "+getIdProfesor());
        System.out.println("clases al dia: "+getClasesAlDia());
        System.out.println("sueldo: "+getSueldo());

    }
    
    
    
}
