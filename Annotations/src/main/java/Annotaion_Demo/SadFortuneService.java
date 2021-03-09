package Annotaion_Demo;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "So Sad Very Bad";
    }
}
