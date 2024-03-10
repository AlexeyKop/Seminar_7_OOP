package Seminar_7_OOP.src;



public class BottleOfWatter extends Product {
    private double volume;  // добавим новый параметр volume
    public BottleOfWatter(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWatter{" +
                 "name = " + super.getName() +
                ";volume = " + volume +
                ";cost = " + super.getCost() +
                '}';
    }
}
