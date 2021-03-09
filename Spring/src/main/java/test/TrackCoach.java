package test;

public class TrackCoach implements Coach {
    private FortuneServices fortuneServices;

   public TrackCoach(FortuneServices fortuneServices)
   {
this.fortuneServices=fortuneServices;
   }

    public TrackCoach() {

    }


    @Override
    public String getDailyWorkout() {
        return "run 5km";
    }
    @Override
    public String bodyBuilder()
    {
        return fortuneServices.getFortune();
    }


}
