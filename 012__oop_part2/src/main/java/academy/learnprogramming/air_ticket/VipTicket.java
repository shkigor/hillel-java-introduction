package academy.learnprogramming.air_ticket;

public class VipTicket extends Ticket {
    private final Meal meal;
    private final Baggage baggage;

    public VipTicket(int sitNumber, FlightInfo flightInfo, Passenger passenger, Meal meal, Baggage baggage) {
        super(sitNumber, flightInfo, passenger);
        this.meal = meal;
        this.baggage = baggage;
    }

    @Override
    public int getCost() {
        return this.meal.getPrice() + this.baggage.getFee() + super.getCost();
    }

    @Override
    public String toString() {
        return "VipTicket{" +
                "sitNumber=" + getSitNumber() +
                ", meal=" + meal +
                ", baggage=" + baggage + ", ticket price=" + getCost() + " $ " +
                '}';
    }
}
