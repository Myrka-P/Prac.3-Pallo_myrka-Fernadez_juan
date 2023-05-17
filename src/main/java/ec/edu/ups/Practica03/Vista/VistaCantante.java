/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Practica03.Vista;

import ec.edu.ups.practica03.Modelo.Cantante;
import ec.edu.ups.practica03.Modelo.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Juan Fernandez
 */
public class VistaCantante {

    /*private Scanner entrada;

    public VistaCantante() {
        entrada = new Scanner(System.in);
    }*/
    private List<Cantante> cantantes;//lista de la clase persona

    public VistaCantante() {
        cantantes = new ArrayList<>();//Constructor que inicializa la lista de la clase
    }

    public Cantante ingresarCantante() {

        Scanner sc = new Scanner(System.in);//Instancia de la clase Scanner para leer la entrada de teclado

        System.out.println("Ingrese el codigo del cantante: ");//muestra en consola lo que desea ser ingresado
        int codigo = sc.nextInt();//Leemos del teclado y guardamos en una variable 
        sc.nextLine();

        System.out.println("Ingrese el nombre del cantante: ");//muestra en consola lo que desea ser ingresado
        String nombre = sc.nextLine();//Leemos del teclado y guardamos en una variable 

        System.out.println("Ingrese el apellido del cantante: ");//muestra en consola lo que desea ser ingresado
        String apellido = sc.nextLine();//Leemos del teclado y guardamos en una variable 

        System.out.println("Ingrese la edad del cantante: ");//muestra en consola lo que desea ser ingresado
        int edad = sc.nextInt();//Leemos del teclado y guardamos en una variable 
        sc.nextLine();

        System.out.println("Ingrese la nacionalidad del cantante: ");//muestra en consola lo que desea ser ingresado
        String nacionalidad = sc.nextLine();//Leemos del teclado y guardamos en una variable 

        System.out.println("Ingrese el salario del cantante: ");//muestra en consola lo que desea ser ingresado
        double salario = sc.nextDouble();//Leemos del teclado y guardamos en una variable 
        sc.nextLine();

        System.out.println("Ingrese el nombre artistico del cantante: ");//muestra en consola lo que desea ser ingresado
        String nombreArtistico = sc.nextLine();//Leemos del teclado y guardamos en una variable 

        System.out.println("Ingrese el genero musical del cantante: ");//muestra en consola lo que desea ser ingresado
        String generoMusical = sc.nextLine();//Leemos del teclado y guardamos en una variable 

        System.out.println("Ingrese el numero de sencillos del cantante: ");//muestra en consola lo que desea ser ingresado
        int numeroDeSencillos = sc.nextInt();//Leemos del teclado y guardamos en una variable 
        sc.nextLine();

        System.out.println("Ingrese el numero de conciertos del cantante: ");//muestra en consola lo que desea ser ingresado
        int numeroDeConciertos = sc.nextInt();//Leemos del teclado y guardamos en una variable 
        sc.nextLine();

        System.out.println("Ingrese el numero de giras del cantante: ");//muestra en consola lo que desea ser ingresado
        int numeroDeGiras = sc.nextInt();//Leemos del teclado y guardamos en una variable 
        sc.nextLine();

        Cantante cantantes = new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, nacionalidad, salario);// Isntanciamos la clase cantante con el constructor y mandamos las variables guardas para inicializar la clase Cantante

        boolean continuar = true;//Variable booleana para controlar si desea o no ingresar

        while (continuar) {//Bucle infinito para el ingreso de mas discos

            System.out.println("¿Desea ingresar un disco? (si/no)");//Mostramos en consola 
            String respuesta = sc.nextLine();//Leemos del teclado y guardamos en una variable para comparar si desea o no

            if (respuesta.equalsIgnoreCase("si")) {//comparamos respuesta si es se ejecuta

                System.out.println("Ingrese el codigo del disco: ");
                int codigoDisco = sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese el nombre del disco: ");
                String nombreDisco = sc.nextLine();

                System.out.println("Ingrese el año de lanzamiento del disco: ");
                int anioDeLanzamiento = sc.nextInt();
                sc.nextLine();

                cantantes.agregarDisco(codigoDisco, nombreDisco, anioDeLanzamiento);//Utilizamos el metodo agregarDisco de la clase cantante para guardar los datos de entrada

            } else {

                continuar = false; //Continuar false para salir del bucle
            }
        }
        return cantantes;//Retornamos el objeto cantante ya creada e inicializada

    }

    public Cantante buscarCantante(String nombre) {
        for (Cantante cantante : cantantes) {
            if (cantante.getNombre().equalsIgnoreCase(nombre)) {
                return cantante;
            }
        }
    }

    public void verCantante(Cantante cantante) {
        System.out.println("Datos de cantante: " + cantante);
    }

    public Cantante actualizarCantante(Object retorno) {
        if (retorno instanceof Cantante) {

            int codigo = ((Cantante) retorno).getCodigo();
            for (int i = 0; i < cantantes.size(); i++) {
                Cantante pers = cantantes.get(i);
                if (pers.getCodigo() == codigo) {
                    cantantes.set(i, (Cantante) retorno);
                    break;
                }
            }

        }

    }

    public Cantante eliminarCantante(Object obj) {
        if (obj instanceof Persona) {

            for (int i = 0; i < cantantes.size(); i++) {
                Persona pers = cantantes.get(i);
                if (pers.equals((Persona) obj)) {
                    cantantes.remove(i);
                    break;
                }
            }

        }
    }

    public void verCantantes(List<Cantante> cantantes) {
        System.out.println("Lista de cantantes : " + cantantes);
    }

}
