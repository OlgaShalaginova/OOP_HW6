package org.example.OOP.HW6.Presenter;

import HW6.Model.Car;
import HW6.Model.CarShope;
import HW6.View.View;

public class Presenter {
    protected View view;
    protected Car car;
    protected CarShope carShope;

    public Presenter(View view) {
        this.view = view;
        this.carShope = new CarShope(5);
    }
    public View getView() {
        return view;
    }
    public Car getCar() {
        return car;
    }
    public CarShope getCarShope() {
        return carShope;
    }

}
