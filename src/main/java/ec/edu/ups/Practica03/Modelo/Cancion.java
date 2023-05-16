/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica03.Modelo;

/**
 *
 * @author Juan Fernandez
 */
public class Cancion {
    private int codigo;
    private String titulo;
    private String letra;
    private double tiempoEnMinu;

    public Cancion() {//constructor vacio
    }

    public Cancion(int codigo, String titulo, String letra, double tiempoEnMinu) {//constructor con los parametros de la clase Cancion
        this.codigo = codigo;
        this.titulo = titulo;
        this.letra = letra;
        this.tiempoEnMinu = tiempoEnMinu;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public double getTiempoEnMinu() {
        return tiempoEnMinu;
    }

    public void setTiempoEnMinu(double tiempoEnMinu) {
        this.tiempoEnMinu = tiempoEnMinu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.codigo;
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
        final Cancion other = (Cancion) obj;
        return true;
    }

      
 //Metodo toString que devuelve de forma de string los atributos
    @Override
    public String toString() {
        return "Cancion{" + "codigo=" + codigo + ", titulo=" + titulo +
                ", letra=" + letra + ", tiempoEnMinu=" + tiempoEnMinu + '}';
    }
    
    
   
    
    
    
} 
