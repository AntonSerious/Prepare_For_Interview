package hometask5.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryInitializer {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null) {
            sessionFactory = new Configuration()
                    .configure("configs/hibernate2.cfg.xml")
                    .buildSessionFactory();
            return sessionFactory;
        }
        return sessionFactory;
    }


}
