package Annotaion_Demo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements FortuneService{
    private String[] data=
            {
                 "Shubham",
                    "Aviral",
                    "Sharma",
                    "Solanki"
            };
    private Random myRandom=new Random();
    @Override
    public String getFortune() {
        int Index=myRandom.nextInt(data.length);
        String theFortune=data[Index];
        return theFortune;
    }
}
