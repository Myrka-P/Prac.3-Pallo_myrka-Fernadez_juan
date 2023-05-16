/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Practica03.Controlador;

import ec.edu.ups.practica03.Modelo.Cancion;
import ec.edu.ups.practica03.Modelo.Cantante;
import ec.edu.ups.practica03.Modelo.Compositor;
import ec.edu.ups.practica03.Modelo.Disco;
import ec.edu.ups.practica03.Modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Fernandez
 */
public class ControladorPersona {
    private List<Persona> persona;//lista de la clase persona

    public ControladorPersona() {
        persona = new ArrayList<>();//Constructor que inicializa la lista de la clase
    }

    public String imprimir() {
        String retorno = "";
        for (Persona persona : this.persona) {
            if (persona instanceof Compositor) {  //If con la instruccion instanceOf para comprobar si es de la clase hija Compositor
                Compositor compositor = (Compositor) persona;
                retorno += compositor.toString() + " \nSalario Final: " + compositor.calcularSalario() + "\n";
            } else if (persona instanceof Cantante) {

                Cantante cantante = (Cantante) persona;
                retorno += cantante.toString() + " \nSalario Final: " + cantante.calcularSalario() + "\n";;//metodo to string
            }
        }
        return retorno;//Retornamos la variable
    }

    public String buscarPorNombre(String valor) {
        String retorno = "";

        for (Persona persona : persona) {// Bucle para Recorrer la lista persona
            if (persona instanceof Cantante) {//Si la persona es de clase Cantante entonces
                Cantante cantante = (Cantante) persona;//Obtenemos el obj persona y casteamos a clase Cantante
                for (Disco disco : cantante.getDiscografia()) {
                    if (disco.getNombre().equalsIgnoreCase(valor)) { //Si el nombre del disco es igual al nombre del parametro de entrada entocnes corre el codigo
                        retorno += cantante.getNombre() + " " + cantante.getApellido() + "\n";
                        break;
                    }
                }
            }
        }
        return retorno;//retornamos la variable

    }
    public void updateCompositor(Object obj) {
        
        if (obj instanceof Compositor) {
             int codigo = ((Compositor) obj).getCodigo();
            //Recorremos el listado de personas
            for (int i = 0; i < persona.size(); i++) {
                //Obtenemos el objeto persona de la lista personas
                Persona personaV = persona.get(i);
                //Si el codigo del obj persona es igual al codigo de la persona de lista Y este obj es de clase Compositor entonces
                if (personaV.getCodigo() == codigo && personaV instanceof Compositor) {
                    //Actualizamos el obj con el nuevo entrante
                    persona.set(i, (Compositor) obj);
                    break;
                }
            }

        }

    }

    public String buscarPorTitulo(String valor) {
        String retorno = "";

        for (Persona persona : persona) {//Recorremos la lista persona
            if (persona instanceof Compositor) {
                Compositor compositor = (Compositor) persona;
                for (Cancion cancion : compositor.getCancionesTop100Billboard()) {
                    if (cancion.getTitulo().equalsIgnoreCase(valor)) {
                        retorno += compositor.getNombre() + " " + compositor.getApellido() + "\n";
                        break;
                    }
                }
            }
        }
        return retorno;//retornamos la variable

    }
/*
    @Override
    public void list() {
        for (Persona persona1 : persona) {
            System.out.println(persona1.toString());
        }
    }

    @Override
    public void create(Object obj) {
        if (obj instanceof Persona) {
            persona.add((Persona) obj);
        }
    }

    @Override
    public Object read(Object obj) {
        if (obj instanceof Integer) {
            int codigo = (int) obj;
            for (Persona persona : persona) {
                if (persona.getCodigo() == codigo) {
                    return persona;
                }
            }
        }

        return null;
    }

    @Override
    public void update(Object obj) {
        if (obj instanceof Persona) {

            int codigo = ((Persona) obj).getCodigo();
            for (int i = 0; i < persona.size(); i++) {
                Persona pers = persona.get(i);
                if (pers.getCodigo() == codigo) {
                    persona.set(i, (Persona) obj);
                    break;
                }
            }

        }
    }

    @Override
    public void delete(Object obj) {
        if (obj instanceof Persona) {

            for (int i = 0; i < persona.size(); i++) {
                Persona pers = persona.get(i);
                if (pers.equals((Persona) obj)) {
                    persona.remove(i);
                    break;
                }
            }

        }
    }*/

    public Compositor readCompositor(Object obj) {
        if (obj instanceof Integer) {
            int codigo = (int) obj;

            for (Persona personaV : persona) {// Recorremos la lista de personas
                if (personaV.getCodigo() == codigo && personaV instanceof Compositor) {// Si el codigo entrante es igual al codigo de la lista persona Y la persona es de clase Compositor entonces
                    return (Compositor) personaV;//Devolvemos el objeto que se busca

                }
            }
        }

        return null;
    }

    public String buscarCompositorPorNombreDeCancion(String nombreCancion) {
        String retorno = "";
        for (Persona personaV : persona) {  //Recorremos la lista persona
            if (personaV instanceof Compositor) { //Si la persona es de clase Compositor entonces
                Compositor compositor = (Compositor) personaV;
                for (Cancion cancion : compositor.getCancionesTop100Billboard()) {
                    if (cancion.getTitulo().equalsIgnoreCase(nombreCancion)) {//Si el nombre de la cancion que recorremos es igual al nombre del parametro de entrada entocnes
                        retorno += compositor.getNombre() + " " + compositor.getApellido() + "\n";
                        break;
                    }
                }
            }
        }
       return retorno;//retornamos la variable de salida
    }
}
