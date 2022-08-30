package hometask5.dao;

import hometask5.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentDao {
    private SessionFactory sessionFactory;
    public StudentDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    public Student findById(Long id){
        try(Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.getTransaction().commit();
            return student;
        }
    }
    public List<Student> findAll(){
        try(Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            List<Student> students = (List<Student>) session.createQuery("from Student").getResultList();
            session.getTransaction().commit();
            return students;
        }
    }

    public void add(Student student){
        try(Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        }
    }
    public void deleteById(Long id){
        try(Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            session.createQuery("delete from Student s where s.id = :id").setParameter("id", id).executeUpdate();
            session.getTransaction().commit();
        }
    }
    public void delete(Student student){
        try(Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            session.delete(student);
            session.getTransaction().commit();
        }
    }
    public void update(Student student){
        try(Session session = sessionFactory.getCurrentSession()){
            session.beginTransaction();
            session.update(student);
            session.getTransaction().commit();
        }
    }

}
