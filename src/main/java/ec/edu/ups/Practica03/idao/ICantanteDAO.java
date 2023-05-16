/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.Practica03.idao;

import ec.edu.ups.practica03.Modelo.Cantante;
import java.util.List;

/**
 *
 * @author Juan Fernandez
 */
public interface ICantanteDAO {
    //Métodos CRUD
    public void create(Cantante cantante);
    public Cantante read(int id);
    public void update(Cantante cantante);
    public void delete(Cantante cantante);   
    public List<Cantante> findAll();
}
