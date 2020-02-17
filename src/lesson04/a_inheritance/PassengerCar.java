package lesson04.a_inheritance;

public class PassengerCar extends Vehicle{
    public PassengerCar(String model, int produceYear) {
        super(model, produceYear);
    }

    @Override
    public String toString() {
        return "PassengerCar{} extends" + super.toString();
    }
}
}
