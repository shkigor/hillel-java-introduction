package academy.learnprogramming.air_ticket;

public enum Drinks {
    YES(0, "С напитками", 50),
    NO(1, "Без напитков", 20);
    private final int var;
    private final String description;
    private final int price;


    Drinks(int var, String description, int price) {
        this.var = var;
        this.description = description;
        this.price = price;
    }

    public int getVar() {
        return var;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "var=" + var +
                ", description='" + description + '\'' +
                ", price=" + price + '$' +
                '}';
    }
}
