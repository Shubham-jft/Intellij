package Annotaion_Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    private FortuneService fortuneService;
//    @Autowired
//    public TennisCoach(FortuneService theFortuneService)
//    {
//        fortuneService=theFortuneService;
//    }

    public TennisCoach() {
        System.out.println("Inside Default Constructor ");
    }
@Autowired
@Qualifier("randomService")
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("inside Setter method");
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run atlest 10 Km";
   }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
