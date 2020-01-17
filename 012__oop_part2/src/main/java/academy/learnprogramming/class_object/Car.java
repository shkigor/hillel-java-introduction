package academy.learnprogramming.class_object;

public class Car {
    private String marka;
    private String model;

    public Car(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!marka.equals(car.marka)) return false;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result = marka.hashCode();
        result = 31 * result + model.hashCode();
        return result;
    }
}
