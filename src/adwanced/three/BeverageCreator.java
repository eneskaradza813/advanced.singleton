package adwanced.three;

public class BeverageCreator {

    public static void main(String[] args) {
        Beverage bosnianCaffe = new BosnianCoffe();
        drinkBeverage(bosnianCaffe);
        
        Beverage esspresso = new Espresso();
        drinkBeverage(esspresso);
        
        Beverage cocaCola = new CocaCola();
        drinkBeverage(cocaCola);
        System.out.println("Kemal pije: ");
        Beverage bosnianCaffeWithMilk = new MilkDecorator(new BosnianCoffe());
        drinkBeverage(bosnianCaffeWithMilk);
        System.out.println("Fadil pije: ");
        Beverage espressoWithMilk = new MilkDecorator(new Espresso());
        drinkBeverage(espressoWithMilk);
        
        Beverage beverage = new BeverageDecorator(new Espresso(), 0.4, " s rumom");
        drinkBeverage(beverage);
        
        Espresso espresso1 = new Espresso();
        Beverage caffeWithCream = new CreamDecorator(espresso1);
        drinkBeverage(caffeWithCream);
    }
    static void drinkBeverage(Beverage beverage){
        System.out.println("Pijem: " + beverage.getName() + " i to me košta = " + beverage.cost());
    }
}