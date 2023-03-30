package org.example.OOP.HW6.Model;

public class Car {
    private String marka;
    private String model;
    private int num;

    public static Car initCar() {
        return new Car();
    }

    public Car setMarka(String marka) {
        this.marka = marka;
        return this;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public Car setNum(int num) {
        this.num = num;
        return this;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", num=" + num +
                '}';
    }
}

