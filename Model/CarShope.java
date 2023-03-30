package org.example.OOP.HW6.Model;

import HW6.View.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarShope {

    Scanner scan = new Scanner(System.in, "Cp866");
    private List<Car> carList;

    public List<Car> getCarList() {
        return carList;
    }

    public void addCar() {
        System.out.println("Введите марку:  ");
        String name = scan.nextLine();
        System.out.println("Введите модель:  ");
        String name2 = scan.nextLine();
        System.out.println("Введите номер:  ");
        int num = scan.nextInt();
        carList.add(Car.initCar().setMarka(name).setModel(name2).setNum(num));
    }

    public CarShope(int n) {
        this.carList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            carList.add(Car.initCar().setMarka(String.format("WV%d", i)).setModel(String.format("mod_%d", i * 2)).setNum(i * 3));

        }
    }

    public void dellCar(String name) {
        for (int i = 0; i < carList.size(); i++) {
            if (name.equalsIgnoreCase(carList.get(i).getModel())) {
                carList.remove(i);
                break;
            }
        }
    }

    public void findCar(String name) {
        View view = new View();
        boolean flag = false;
        for (Car el : carList) {
            if (el.getModel().equalsIgnoreCase(name)) {
                view.printCat(el);
                flag = true;
            }
        }
        if (flag) return;
        System.out.println("Нет такого автомобиля");
        return;
    }

}
