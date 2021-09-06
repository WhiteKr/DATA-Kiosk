package data.kiosk;

public class Coffee extends Beverage {
    String beans;

    public Coffee(String name, int price) {
        super(name, price);
        this.beans = "Arabica";
    }

    public Coffee(String name, int price, boolean ice, String beans) {
        super(name, price, ice);
        this.beans = beans;
    }

    @Override
    public String getDesc() {
        return (super.getDesc()) + ", 원두 : " + this.beans;
    }
}
