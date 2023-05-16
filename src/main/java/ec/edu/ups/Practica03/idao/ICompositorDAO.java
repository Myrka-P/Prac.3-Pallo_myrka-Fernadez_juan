/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.Practica03.idao;
import ec.edu.ups.practica03.Modelo.Compositor;
import java.util.List;

/**
 *
 * @author Juan Fernandez
 */
public interface ICompositorDAO {
     //Métodos CRUD
    public void create(Compositor compositor);
    public Compositor read(int id);
    public void update(Compositor compositor);
    public void delete(Compositor compositor);   
    public List<Compositor> findAll();
}
