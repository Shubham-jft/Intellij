package Annotaion_Demo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
     @Value("${foo.emailaddress}")
    private String email;
    @Value("${foo.team}")
    private String team;
    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "swim !km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
