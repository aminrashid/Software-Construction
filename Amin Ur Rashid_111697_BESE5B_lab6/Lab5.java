package lab5;

import java.io.*;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
import org.hibernate.service.ServiceRegistry;

public class Lab5 {  
	public static void main(String[] args) {  
		//creating configuration object  
		Configuration cfg=new Configuration();  
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
		//creating seession factory object  
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()). build();
		SessionFactory factory=cfg.buildSessionFactory(serviceRegistry);
		//creating session object  
		Session session=factory.openSession();  
                
			//creating transaction object  
			Transaction t=session.beginTransaction();  
			City c1=new City();  
			c1.setLocId(115);  
			c1.setCountry("Fahad");  
			c1.setRegion("Satti");  
			session.persist(c1);//persisting the object  
			t.commit();//transaction is commited  
		session.close();  
	}  
} 

