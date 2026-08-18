class Pizza {
    String size;

    Pizza(String size) {
        this.size = size;
    }

    void makePizza(String size) {
        this.size = size;
        System.out.println("Field value  (this.size): " + this.size);
        System.out.println("Parameter value (size):    " + size);
    }
}

class CheesePizza extends Pizza {
    String topping;

    CheesePizza(String size, String topping) {
        super(size);
        this.topping = topping;
    }

    void makePizza(String topping) {
        this.topping = topping;
        System.out.println("Field value  (this.topping): " + this.topping);
        System.out.println("Parameter value (topping):    " + topping);
    }
}

class PizzaShop {
    public static void main(String[] args) {
        CheesePizza pizza = new CheesePizza("Medium", "Mozzarella");
        pizza.makePizza("Cheddar");
    }
}