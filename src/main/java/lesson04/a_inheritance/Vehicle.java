package lesson04.a_inheritance;

public abstract class Vehicle {
    private String model;
    private int produceYear;

    public Vehicle(String model, int produceYear) {
        this.model = model;
        this.produceYear = produceYear;
    }

    public void gas(){
        System.out.println(this.getClass().getSimpleName() + "Started to move");
        System.out.println("Driving");
    }

    public void stop(){
        System.out.println("Started to stop");
        System.out.println("Stopped");
    }

    public String getModel() {
        return model;
    }

    public int getProduceYear() {
        return produceYear;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProduceYear(int produceYear) {
        this.produceYear = produceYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", produceYear=" + produceYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;

        Vehicle vehicle = (Vehicle) o;

        if (produceYear != vehicle.produceYear) return false;
        return model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + produceYear;
        return result;
    }
}
