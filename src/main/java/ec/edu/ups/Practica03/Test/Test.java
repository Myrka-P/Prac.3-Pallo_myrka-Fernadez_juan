/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ec.edu.ups.Practica03.Test;

import java.util.Scanner;

/**
 *
 * @author Juan Fernandez
 */
public class Test {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        PersonaControlador controlador = new PersonaControlador();
        int opcion = 8;
        do {//Comando do para crear un bucle que ejecuta un bloque de código al menos una vez y luego repite la ejecución del bloque mientras se cumpla una condición específica.
            System.out.println("1. Ingreso de cantante");//Imprimimos el menu
            System.out.println("2. Ingreso de compositor");
            System.out.println("3. Agregar clientes");
            System.out.println("4. Imprimir persona");
            System.out.println("5. Búsqueda de cantante por nombre de disco");
            System.out.println("6. Búsqueda de compositor por nombre de canción");
            System.out.println("7. Salir");
            opcion = scaner.nextInt();
            scaner.nextLine();
            switch (opcion) {
                case 1:
                    Cantante cantante = agregarCantante();
                    controlador.create(cantante);
                    break;
                case 2:
                    Compositor compositores = agregarCompositor();
                    controlador.create(compositores);
                    break;
                case 3:
                    System.out.println("Ingrese el codigo del compositor para agregar clientes: ");
                    int codigo = scaner.nextInt();
                    scaner.nextLine();
                    Compositor leerCompositor = controlador.readCompositor(codigo);
                    if (leerCompositor == null) {
                        System.out.println("Compositor no encontrado ");
                    } else {
                        leerCompositor = agregarClientes(leerCompositor);
                        controlador.updateCompositor(leerCompositor);
                    }
                    break;
                case 4:
                    System.out.println(controlador.imprimir());
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del disco");
                    String nombreDeDisco = scaner.nextLine();
                    System.out.println(controlador.buscarCompositorPorNombreDeCancion(nombreDeDisco));
                    break;
                case 6:
                    System.out.println("Ingrese el nombre de la cancion");
                    String nombreDeCancion = scaner.nextLine();
                    System.out.println(controlador.buscarCompositorPorNombreDeCancion(nombreDeCancion));
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        } while (opcion != 7);
    }

    public static Cantante agregarCantante() {

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

        Cantante cantante = new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, nacionalidad, salario);// Isntanciamos la clase cantante con el constructor y mandamos las variables guardas para inicializar la clase Cantante

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

                cantante.agregarDisco(codigoDisco, nombreDisco, anioDeLanzamiento);//Utilizamos el metodo agregarDisco de la clase cantante para guardar los datos de entrada

            } else {

                continuar = false; //Continuar false para salir del bucle
            }
        }
        return cantante;//Retornamos el objeto cantante ya creada e inicializada
    }

    public static Compositor agregarCompositor() {

        Scanner scaner = new Scanner(System.in);//Instancia de la clase Scanner para leer la entrada de teclado

        System.out.println("Ingrese el codigo del compositor: ");//Imprime lo que pide ingresar 
        int codigo = scaner.nextInt();//Leemos y guardamos en una variable
        scaner.nextLine();// Limpiar el buffer de entrada

        System.out.println("Ingrese el nombre del compositor: ");//Imprime lo que pide ingresar 
        String nombre = scaner.nextLine();//Leemos y guardamos en una variable

        System.out.println("Ingrese el apellido del compositor: ");//Imprime lo que pide ingresar 
        String apellido = scaner.nextLine();//Leemos y guardamos en una variable

        System.out.println("Ingrese la edad del compositor: ");//Imprime lo que pide ingresar 
        int edad = scaner.nextInt();//Leemos y guardamos en una variable
        scaner.nextLine();// Limpiar el buffer de entrada

        System.out.println("Ingrese la nacionalidad del compositor: ");//Imprime lo que pide ingresar 
        String nacionalidad = scaner.nextLine();//Leemos y guardamos en una variable

        System.out.println("Ingrese el salario del compositor: ");
        double salario = scaner.nextDouble();//Leemos y guardamos en una variable
        scaner.nextLine();// Limpiar el buffer de entrada

        System.out.print("Ingrese el número de composiciones: ");//Imprime lo que pide ingresar 
        int numeroDeComposiciones = scaner.nextInt();//Leemos y guardamos en una variable
        scaner.nextLine(); // Limpiar el buffer de entrada

        Compositor compositor = new Compositor(numeroDeComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);//Isntanciamos la clase compositor con el constructor y mandamos las variables 

        boolean continuar = true;

        do { //Bucle infinito hasta que el usuario decida ya no ingresar mas canciones
            System.out.println("¿Desea ingresar una canción en el top 100 de Billboard? (si/no)");//Mostramos en consola si el usuario decide ingresar más canciones
            String respuesta = scaner.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {//Si la respuesta es sí, se ejecuta el codigo

                System.out.print("Ingrese el Código: ");//Imprime lo que pide ingresar 
                int codigoCancion = scaner.nextInt();//Leemos y guardamos en una variable
                scaner.nextLine(); // Limpiar el buffer de entrada

                System.out.print("Ingrese el título: ");//Imprime lo que pide ingresar 
                String tituloCancion = scaner.nextLine();//Leemos y guardamos en una variable

                System.out.print("Ingrese letra: ");//Imprime lo que pide ingresar 
                String letra = scaner.nextLine();//Leemos y guardamos en una variable

                System.out.print("Ingrese el tiempo en minutos: ");//Imprime lo que pide ingresar 
                double tiempoEnMinutos = scaner.nextDouble();
                scaner.nextLine(); // Limpiar el buffer de entrada
                compositor.agregarCancion(codigoCancion, tituloCancion, letra, tiempoEnMinutos);//Utilizamos el método agregarCancion de la clase compositor para guardar los datos de entrada
            } else {
                continuar = false; //Continuar false para salir del bucle
            }
        } while (continuar);

        return compositor;//Retornamos el objeto compositor ya creado e inicializado

    }

    public static Compositor agregarClientes(Compositor compositor) {

        Scanner sc = new Scanner(System.in); //Variable para controlar el ingreso de clientes        
        boolean continuar = true;
        do {//bucle hasta que sea ingresado por consola que no se ingresar mas clientes 
            System.out.println("¿Desea ingresar un cantante cliente? (si/no)");      //Mostramos en consola si el usuario decide ingresar más clientes

            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
                Cantante cantante = agregarCantante();
                compositor.agregarCliente(cantante);
            } else {
                continuar = false;
            }
        } while (continuar);

        return compositor;

    }

}
