import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.lion.entity.PersonInfo;


public class HIbernateTest {
	public static void main(String[] args) throws Exception{
		PersonInfo p=new PersonInfo();
		p.setName("name");
		p.setAge("20");
		Configuration configuration=new Configuration().configure();
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		SessionFactory sf=configuration.buildSessionFactory(builder.build());
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
