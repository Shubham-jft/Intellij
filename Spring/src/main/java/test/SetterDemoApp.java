package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach theCoach=context.getBean("CricketCoach",CricketCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.bodyBuilder());
        System.out.println(theCoach.getEmailaddress());
        System.out.println(theCoach.getTeam());
        context.close();
    }
}
