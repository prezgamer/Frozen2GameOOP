package Frozen2GameOOP;

public class olaf extends frozen2Char{
    
    public olaf(int power, int health){
        super(power, health);
    }

    @Override public void introduce(){

    }

    @Override public void useSpecialPower(int amtOfPower){
        power -= amtOfPower;
    }
}
