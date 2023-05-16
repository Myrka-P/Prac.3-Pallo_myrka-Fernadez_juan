/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica03.Modelo;

/**
 *
 * @author Juan Fernandez
 */
public abstract class Persona {

    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private double salario;

    public Persona() {
    }//constructor vacio

    public Persona(int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {//constructor con parametros
        this.codigo = codigo;//constructor con los parametros de la clase Persona
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.salario = salario;
    }

    //metodos de encapsulamiento get y set 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.nacionalidad = Nacionalidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();

    @Override//Retorna el valor del hashcode
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        /*
    *Compara si la instancia actual de la clase Cantante es igual a otro objeto.
    *retorna  true si la instancia actual de esta clase Cantante es igual al objeto pasado como parametro
         */
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public String toString() {//Metodo toString que devuelve de forma de string los atributos
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre
                + ", apellido=" + apellido + ", edad=" + edad + ", Nacionalidad="
                + nacionalidad + ", salario=" + salario + '}';
    }
}
