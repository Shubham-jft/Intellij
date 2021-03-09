package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session=factory.getCurrentSession();
        try{
            System.out.println("Creating Student Object");
            Student tempStudent =new Student("Shubham","Kumar","sk@gmail.com");
            Student tempStudent2 =new Student("Adarsh","Pal","ap@gmail.com");
            Student tempStudent3 =new Student("T","Sharma","ts@gmail.com");
            session.beginTransaction();
            System.out.println("saving data");
            session.save(tempStudent);
            session.save(tempStudent2);
            session.save(tempStudent3);
            session.getTransaction().commit();
            System.out.println("Finished");
        }finally {

        }
    }
}
