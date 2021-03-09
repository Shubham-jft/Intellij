package test;

public class CricketCoach implements Coach{

    private FortuneServices fortuneServices;
    private String emailaddress;
    private String team;

    public void setEmailaddress(String emailaddress) {
        System.out.println("Inside Setter -emailaddress");
        this.emailaddress = emailaddress;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Inside Setter -setteam");
        this.team = team;
    }

    public CricketCoach()
    {
        System.out.println("Inside No-arg Constructor");
    }

    public void setFortuneServices(FortuneServices fortuneServices) {
        System.out.println("Inside Setter -setFortune");
        this.fortuneServices = fortuneServices;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit helicopter Shot";
    }

    @Override
    public String bodyBuilder() {
        return fortuneServices.getFortune();
    }
}
