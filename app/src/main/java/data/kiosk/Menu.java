package data.kiosk;

class Menu {
    String name;
    int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "이름 : " + name + ", 가격 : " + price + "원";
    }
}