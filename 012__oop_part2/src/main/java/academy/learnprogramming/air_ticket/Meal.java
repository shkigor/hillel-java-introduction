package academy.learnprogramming.air_ticket;

public class Meal {
    private final Menu menu;
    private final Drinks drinks;


    public Meal(Menu menu, Drinks drinks) {
        this.menu = menu;
        this.drinks = drinks;

    }

    public int getPrice() {
        return this.menu.getPrice() + this.drinks.getPrice();
    }

    public Menu getMenu() {
        return menu;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "menu=" + menu +
                ", drinks=" + drinks + ", total price=" + getPrice() + '$' +
                '}';
    }
}
