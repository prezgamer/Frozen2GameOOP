package Frozen2GameOOP;

public class elsa extends frozen2Char {
    
    public elsa(int power, int health){
        super(power, health);
    }

    @Override public void introduce(){

    }

    @Override public void useSpecialPower(int amtOfPower){
        power -= amtOfPower;
    }
}

