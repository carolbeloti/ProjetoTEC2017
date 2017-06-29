package crud;


import entity.Cliente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Camila
 */
@ManagedBean
@SessionScoped
public class Controller {

   
    private Cliente cliente;
    private DataModel listaClientes;

    public DataModel getListarCliente() {
        List<Cliente> lista = new ClienteDaoImp().list();
        listaClientes = new ListDataModel(lista);
        return listaClientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String prepararAdicionarClientes() {
        cliente = new Cliente();
        return "gerenciarCliente";
    }

    public String prepararAlterarClientes() {
        cliente = (Cliente) (listaClientes.getRowData());
        return "gerenciarCliente";
    }

    public String excluirClientes() {
       Cliente clienteTemp = (Cliente) (listaClientes.getRowData());
        ClienteDao dao = (ClienteDao) new ClienteDaoImp();
        dao.remove(clienteTemp);
        return "index";
    }

    public String adicionarClientes() {
        cliente = new Cliente();
        ClienteDao dao = (ClienteDao) new ClienteDaoImp();
        dao.save(cliente);
        return "index";
    }

    public String alterarClientes() {
        ClienteDao dao = (ClienteDao) new ClienteDaoImp();
        dao.update(cliente);
        return "index";
    }
}
