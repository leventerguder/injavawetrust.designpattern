package ch03.notes.v1;

public class Espresso extends Beverage{

    public  Espresso()
    {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}