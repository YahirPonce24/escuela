/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuela;

/**
 *
 * @author Yahir
 */
public class persona {
    public String nombre;
    public String apellidos;
    public int edad;
    public String genero;
    public String correo;

    public persona() {
    }

    public persona(String nombre, int edad, String genero, String apellidos, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    public void imprimirDatos (){

        
        System.out.println("Nombre completo "+getNombre()+" "+getApellidos());
        System.out.println("Edad "+getEdad());
        System.out.println("Genero "+getGenero());
        System.out.println("Correo electronico "+getCorreo());
        
        
    }
    
    
}
