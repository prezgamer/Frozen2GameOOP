package Frozen2GameOOP;

public class kristof extends frozen2Char{
    
    public kristof(int power, int health){
        super(power, health);
    }

    @Override public void introduce(){

    }

    @Override public void useSpecialPower(int amtOfPower){
        power -= amtOfPower;
    }
}
