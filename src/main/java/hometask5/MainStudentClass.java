package hometask5;

import hometask5.dao.StudentDao;
import hometask5.model.Student;
import hometask5.util.SessionFactoryInitializer;
import org.hibernate.SessionFactory;

import java.util.List;


public class MainStudentClass {

    public static void main(String[] args) {
        try(SessionFactory sessionFactory = SessionFactoryInitializer.getSessionFactory()) {
            StudentDao studentDao = new StudentDao(sessionFactory);

            //-----------------task6
//            for (int i = 1; i <= 1000; i++){
//                studentDao.add(new Student("Student" + i,(int)(Math.random() * 10 + 1)));
//            }

            //------------------task7
            System.out.println(studentDao.findById(5L)); //после 22 строчки, тут будет null

            //studentDao.deleteById(5L);

            //studentDao.update(new Student(6L,"Student666", 10));
            List<Student> students = studentDao.findAll();
            for (Student s: students
                 ) {
                System.out.println(s);

            }
        }
    }
}
