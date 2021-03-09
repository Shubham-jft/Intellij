package test;
public class Baseballcoach implements Coach{
    private  FortuneServices fortuneServices;

    public Baseballcoach(FortuneServices theFortuneServices)
    {
        fortuneServices= theFortuneServices;
    }
    @Override
    public String getDailyWorkout()
    {
        return "Do Workout";
    }
    @Override
    public String bodyBuilder()
    {
        return fortuneServices.getFortune();
    }
}
