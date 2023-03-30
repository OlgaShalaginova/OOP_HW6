package org.example.OOP.HW6.Presenter;

import HW6.View.View;

import java.util.Scanner;

public class PresenterService extends Presenter {
    public PresenterService(View view) {
        super(view);
    }

    public void start(Presenter presenter) {
        presenter.getView().menu();
        Scanner scan = new Scanner(System.in, "Cp866");
        String enter = scan.nextLine();
        if (enter.equalsIgnoreCase("1")) {
            presenter.getView().printList(presenter);
        } else if (enter.equalsIgnoreCase("2")) {
            System.out.println("Введите модель: ");
            String enter2 = scan.nextLine();
            presenter.getCarShope().findCar(enter2);
        } else if (enter.equalsIgnoreCase("3")) {
            presenter.getCarShope().addCar();
        } else if (enter.equalsIgnoreCase("4")) {
            System.out.println("Введите модель: ");
            String enter2 = scan.nextLine();
            presenter.getCarShope().dellCar(enter2);
        } else if (enter.equalsIgnoreCase("0")) {
            return;
        }
        System.out.println();
        start(presenter);
    }
}
