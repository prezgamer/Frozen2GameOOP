package Frozen2GameOOP;

public class anna extends frozen2Char{
    
    public anna(int power, int health){
        super(power, health);
    }

    @Override public void introduce(){

    }

    @Override public void useSpecialPower(int amtOfPower){
        power -= amtOfPower;
    }
}
