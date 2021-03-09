package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session=factory.getCurrentSession();
        try{
            System.out.println("Creating Student Object");
            Student tempStudent =new Student("Aviral","Gupta","ag@gmail.com");
            session.beginTransaction();
            System.out.println("saving data");
            session.save(tempStudent);
            session.getTransaction().commit();
            System.out.println("Finished");
        }finally {

        }
    }
}
