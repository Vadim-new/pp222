package web.Model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;  //  модель автомобиля
    private String color;  //  цвет автомобиля
    private int fuelReserve;  //  запас топлива

    public Car() {
    }

    public Car(String model, String color, int fuelReserve) {
        this.model = model;
        this.color = color;
        this.fuelReserve = fuelReserve;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelReserve() {
        return fuelReserve;
    }

    public void setFuelReserve(int fuelReserve) {
        this.fuelReserve = fuelReserve;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", fuelReserve=" + fuelReserve +
                '}';
    }
}
