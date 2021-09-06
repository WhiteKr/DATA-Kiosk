package data.kiosk;

class Beverage extends Menu {
    boolean ice;

    public Beverage(String name, int price) {
        super(name, price);
        this.ice = false;
    }

    public Beverage(String name, int price, boolean ice) {
        super(name, price);
        this.ice = ice;
    }

    @Override
    public String getDesc() {
        return (super.getDesc()) + ", 얼음 : " + ((this.ice) ? "있음" : "없음");
    }
}
