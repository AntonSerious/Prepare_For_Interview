package hometask5.drafts;

import hometask5.model.Film;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class MainClass {

    private static SessionFactory factory;

    public static void init(){
        factory = new Configuration()
                .configure("configs/hibernate.cfg.xml")
                .buildSessionFactory();
    }


    public static void main(String[] args) {
        try{
            init();

            showManyItems();

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            shutdown();
        }
    }

    public static void shutdown() {
        factory.close();
    }

    public static void insertEntity(){
        try(Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Film film = new Film("Back to the future", 120);
            System.out.println(film);
            session.save(film);
            System.out.println(film);
            session.getTransaction().commit();
            System.out.println(film);
        }
    }
    public static void readEntity(){
        try(Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Film film = session.get(Film.class, 3L);
            System.out.println(film);
            session.getTransaction().commit();
        }
    }

    public static void updateEntity(){
        try(Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Film film = session.get(Film.class, 3L);
            film.setDuration(90);
            session.getTransaction().commit();
        }
    }
    public static void showManyItems(){
        try(Session session = factory.getCurrentSession()) {
            session.beginTransaction();


            Film film1 = session.createQuery("select f from Film f where f.id = 4", Film.class).getSingleResult();


            List<Film> films =  session.createQuery("from Film").getResultList();
            session.getTransaction().commit();
            for (Film f: films
                 ) {
                System.out.println(f);
            }
            System.out.println(film1);
        }
    }

}
