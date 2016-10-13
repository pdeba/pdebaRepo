import java.util.Random;


public class NameRandom
{
// method to return name parameter and generated random number between 6 and 15
public String genRandom(String name)
{
    int low=6;
    int high=15;
// Using java.util.Random to generate random number
    Random num=new Random();
// num.nextInt(high-low)+low generates a value less than or equal to 15
    int result=num.nextInt(high-low)+low;
    return name+ " " +result;
}
}
