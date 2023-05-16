/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica03.Modelo;

import java.util.Objects;

/**
 *
 * @author Juan Fernandez
 */
public class Disco {
    
    private int codigo;
    private String nombre;
    private int anioDeLanza;

    public Disco() {//constructor vacio
    }

    public Disco(int codigo, String nombre, int anioDeLanza) {
        this.codigo = codigo;//constructor con los parametros de la clase Disco
        this.nombre = nombre;
        this.anioDeLanza = anioDeLanza;
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

    public int getAnioDeLanza() {
        return anioDeLanza;
    }

    public void setAnioDeLanza(int anioDeLanza) {
        this.anioDeLanza = anioDeLanza;
    }

    @Override
    public int hashCode() {//Retorna el valor del hashcode
        int hash = 3;
        hash = 29 * hash + this.codigo;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + this.anioDeLanza;
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
        final Disco other = (Disco) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.anioDeLanza != other.anioDeLanza) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Disco{" + "codigo=" + codigo + ", nombre=" + nombre + ", anioDeLanza=" + anioDeLanza + '}';
    }
    
    
    
           
}

