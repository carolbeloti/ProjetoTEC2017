/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import entity.Cliente;
import java.util.List;

/**
 *
 * @author Camila
 */
public interface ClienteDao {
    
    
    
 public void  save(Cliente cliente);
public Cliente getCliente(long id);
public List<Cliente> list();
public void remove(Cliente cliente);
public void update(Cliente cliente);
 
    
}


 


    

