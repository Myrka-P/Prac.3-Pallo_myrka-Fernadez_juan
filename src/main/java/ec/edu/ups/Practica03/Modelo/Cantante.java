/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica03.Modelo;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Juan Fernandez
 */
public class Cantante extends Persona {

    private String nombreArtistico;
    private String generoMusical;
    private int numeroDeSencillos;
    private int numeroDeConciertos;
    private int numeroDeGiras;
    private List<Disco> discografia;

    public Cantante() {//constructor vacio
    }

    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConciertos, int numeroDeGiras, List<Disco> discografia, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);//constructor con los parametros de la clase Cantante
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
        this.discografia = discografia;
    }

    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConciertos, int numeroDeGiras, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);//constructor con 5 parametros de la clase Cantante
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
    }
  //metodos de encapsulamiento get y set 
    
    public Cantante(List<Disco> discografia) {
        this.discografia = discografia;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getNumeroDeSencillos() {
        return numeroDeSencillos;
    }

    public void setNumeroDeSencillos(int numeroDeSencillos) {
        this.numeroDeSencillos = numeroDeSencillos;
    }

    public int getNumeroDeConciertos() {
        return numeroDeConciertos;
    }

    public void setNumeroDeConciertos(int numeroDeConciertos) {
        this.numeroDeConciertos = numeroDeConciertos;
    }

    public int getNumeroDeGiras() {
        return numeroDeGiras;
    }

    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras;
    }

    public List<Disco> getDiscografia() {
        return discografia;
    }

    public void setDiscografia(List<Disco> discografia) {
        this.discografia = discografia;
    }

    @Override
    public int hashCode() {//Retorna el valor del hashcode
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombreArtistico);
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
        final Cantante other = (Cantante) obj;
        return Objects.equals(this.nombreArtistico, other.nombreArtistico);
    }

    

    @Override
    public String toString() {//Metodo toString que devuelve de forma de string los atributos
        return "Cantante{" + "nombreArtistico=" + nombreArtistico
                + ", generoMusical=" + generoMusical + ", numeroDeSencillos=" + numeroDeSencillos
                + ", numeroDeConciertos=" + numeroDeConciertos + ", numeroDeGiras=" + numeroDeGiras
                + ", discografia=" + discografia + '}';
    }



    public void agregarDisco(int codigo, String nombre, int anioDeLanza) {

        Disco disco = new Disco(codigo, nombre, anioDeLanza);
        this.discografia.add(disco);//Se agrega los discos  a la lista discografia
    }

    @Override
    public double calcularSalario() {
        double salarioBase = 1000.0;
        if (numeroDeSencillos > 10 && numeroDeGiras > 3) {
            salarioBase += 1000.0;
        } else if (numeroDeSencillos >= 1 && numeroDeSencillos <= 10) {
            salarioBase += salarioBase * 0.05;
        }

        if (numeroDeGiras >= 1 && numeroDeGiras <= 3) {
            salarioBase += salarioBase * 0.03;
        }

        if (discografia.size() >= 5) {
            salarioBase += 2000.0;
        }
        return salarioBase;
    }

}