package test;

public class HappyFortuneServies implements FortuneServices{
    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
