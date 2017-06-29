package crud;

import entity.Cliente;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import crud.HibernateUtil;

/**
 *
 * @author Camila
 */
public class ClienteDaoImp implements ClienteDao{//implemnetar algo

    public void save(Cliente cliente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(cliente);
        t.commit();
    }

    public Cliente getCliente(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Cliente) session.load(Cliente.class, id);
    }

    public List<Cliente> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("from Cliente").list();
        t.commit();
        return lista;
    }

    public void remove(Cliente cliente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(cliente);
        t.commit();
    }

    public void update(Cliente cliente) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(cliente);
        t.commit();
    }

}
