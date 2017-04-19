package lab7;
import lab7.PersistHib;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

        
public class DAO {
    public void create(PersistHib Pers){
        SessionFactory factory= HibernateUtil.getSessionFactory();
        Session session= factory.openSession(); 
        
        //For starting the transaction
        Transaction t= session.beginTransaction();
        
        session.persist(Pers);
        t.commit();
        
        //For Closing the session
        session.close();
    }
    
}
