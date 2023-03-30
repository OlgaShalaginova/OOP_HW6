package org.example.OOP.HW6;

import HW6.Presenter.PresenterService;
import HW6.View.View;

public class Main {
    public static void main(String[] args) {

        PresenterService prService = new PresenterService(new View());
        prService.start(prService);
    }
}