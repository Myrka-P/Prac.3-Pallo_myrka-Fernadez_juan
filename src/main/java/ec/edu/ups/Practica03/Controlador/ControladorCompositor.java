/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Practica03.Controlador;

import ec.edu.ups.Practica03.Vista.VistaCompositor;
import ec.edu.ups.Practica03.idao.ICompositorDAO;
import ec.edu.ups.practica03.Modelo.Compositor;
import java.util.List;

/**
 *
 * @author Juan Fernandez
 */
public class ControladorCompositor {
    //objetos vist
    private VistaCompositor vistaCompositor;
    //objetos modelo
    private Compositor compositor;
    //objetos DAO  
    private ICompositorDAO compositorDAO;

    //Constructor

    public ControladorCompositor(VistaCompositor vistaCompositor, ICompositorDAO compositorDAO) {
        this.vistaCompositor = vistaCompositor;
        this.compositorDAO = compositorDAO;
    }        
    //llama al DAO para guardar un compositor
    public void registrar() {
        compositor = vistaCompositor.ingresarCompositor();
        compositorDAO.create(compositor);
    }
    
    //llama al DAO para obtener un compositor por el id y luego los muestra en la vista
    public void verCompositor() {
        int id = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(id);
        vistaCompositor.verCompositor((List<Compositor>) compositor);
    }

     //llama al DAO para actualizar un compositor
    public void actualizar() {
        compositor = vistaCompositor.actualizarCompositor();
        compositorDAO.update(compositor);
    }
    
    
    //llama al DAO para eliminar un compositor
    public void eliminar() {
        compositor = vistaCompositor.eliminarCompositor();
        compositorDAO.delete(compositor);
    }

    //llama al DAO para obtener todos los compositor  y luego los muestra en la vista
    public void verCompositors() {
        List<Compositor> compositores;
        compositores = compositorDAO.findAll();
        vistaCompositor.verCompositor(compositores);
    }
    
    
    
}
