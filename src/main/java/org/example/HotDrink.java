package org.example;

import java.util.Objects;

public class HotDrink {
    private String name;
    private int volume;

    public HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotDrink hotDrink = (HotDrink) o;
        return volume == hotDrink.volume && Objects.equals(name, hotDrink.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, volume);
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name=" + name +
                ", volume=" + volume +
                '}';
    }
}
