/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Practica03.Controlador;

import ec.edu.ups.Practica03.Vista.VistaCantante;
import ec.edu.ups.Practica03.Vista.VistaCompositor;
import ec.edu.ups.Practica03.idao.ICantanteDAO;
import ec.edu.ups.Practica03.idao.ICompositorDAO;
import ec.edu.ups.practica03.Modelo.Cantante;
import ec.edu.ups.practica03.Modelo.Compositor;
import java.util.List;

/**
 *
 * @author Juan Fernandez
 */
public class ControladorCantante {
    //objetos vist
    private VistaCantante vistaCantante;
    private VistaCompositor vistaCompositor;
    //objetos modelo
    private Cantante cantante;
    private Compositor compositor;
    //objetos DAO
    private ICantanteDAO cantanteDAO;
    private ICompositorDAO compositorDAO;

    //Constructor

    public ControladorCantante(VistaCantante vistaCantante, VistaCompositor vistaCompositor, Cantante cantante, Compositor compositor, ICantanteDAO cantanteDAO, ICompositorDAO compositorDAO) {
        this.vistaCantante = vistaCantante;
        this.vistaCompositor = vistaCompositor;
        this.cantante = cantante;
        this.compositor = compositor;
        this.cantanteDAO = cantanteDAO;
        this.compositorDAO = compositorDAO;
    }

   
    
    //llama al DAO para guardar un cantante
    public void registrar() {
        cantante = vistaCantante.ingresarCantante();
        cantanteDAO.create(cantante);
    }
    
    //llama al DAO para obtener un cantante por el id y luego los muestra en la vista
    public void verCliente() {
        int id = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(id);
        vistaCantante.verCantante(cantante);
    }

     //llama al DAO para actualizar un cantante
    public void actualizar() {
        cantante = vistaCantante.actualizarCliente();
        cantanteDAO.update(cantante);
    }
    
    
    //llama al DAO para eliminar un cantante
    public void eliminar() {
        cantante = vistaCantante.eliminarCliente();
        cantanteDAO.delete(cantante);
    }

    //llama al DAO para obtener todos los cantantes  y luego los muestra en la vista
    public void verClientes() {
        List<Cantante> cantantes;
        cantantes = cantanteDAO.findAll();
        vistaCantante.verCantantes(cantantes);
    }
    
    
    
}
