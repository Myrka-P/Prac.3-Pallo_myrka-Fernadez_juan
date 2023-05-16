/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Practica03.dao;

import ec.edu.ups.Practica03.idao.ICompositorDAO;
import ec.edu.ups.practica03.Modelo.Compositor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Juan Fernandez
 */
public class CompositorDAO implements ICompositorDAO {

     private List<Compositor> listaCompositor;

    public CompositorDAO() {
        listaCompositor = new ArrayList<>();
    }
    
    
    @Override
    public void create(Compositor compositor) {
        listaCompositor.add(compositor);
    }

    @Override
    public Compositor read(int id) {
        for (Compositor cantante : listaCompositor) {
            if (cantante.getCodigo()== id) {
                return cantante;
            }
        }
        return null;
    }

    @Override
    public void update(Compositor compositor) {
        for (int i = 0; i < listaCompositor.size(); i++) {
            Compositor c = listaCompositor.get(i);
            if (c.getCodigo() == compositor.getCodigo()) {
                listaCompositor.set(i, compositor);
                break;
            }
        }
    }

    @Override
    public void delete(Compositor compositor) {
       Iterator<Compositor> it = listaCompositor.iterator();
        while (it.hasNext()) {
            Compositor c = it.next();
            if (c.getCodigo() == compositor.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Compositor> findAll() {
         return listaCompositor;
    }
    
}
