package org.example;

import java.util.Objects;

public class Coffe extends HotDrink{
    private int temperature;

    public Coffe(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coffe coffe = (Coffe) o;
        return temperature == coffe.temperature;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temperature);
    }

    @Override
    public String toString() {
        return "Кофе: " +
                super.getName() +
                ", объем: " + super.getVolume() +
                ", температура: " + temperature +
                "\n";
    }
}
