package adwanced.three;

public class BosnianCoffe extends Beverage{

    public BosnianCoffe() {
        super("Bosanska kahva");
        System.out.println("Konobar pravi bosansku kahvu");
    }

    
    @Override
    public double cost() {
        return 0.99;
        }

    
}
