package ar.edu.unju.edm.model;

public class Estudiante {

	private String dni;
    private String nombre;
    private String apellido;
    private float peso;
    private char genero;

    // constructor por defecto
    /*
     * comentario
     */

    /**
     * Documentacion
     */

    public Estudiante() {

    }

    // metodo o accedores de atributos

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

}
