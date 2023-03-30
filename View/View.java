package org.example.OOP.HW6.View;

import HW6.Model.Car;
import HW6.Presenter.Presenter;

public class View {

    public View() {
    }
    public void menu(){
        String menu = """
                Введите номер запроса для работы со списком автомобилей:
                1 - посмотреть список
                2 - найти
                3 - добавить
                4 - удалить
                0 - выход
                """ ;
        System.out.println(menu);
    }
    public void printList(Presenter presenter) {
        for (Car el : presenter.getCarShope().getCarList()) {
            System.out.println(el);
        }
        System.out.println();
    }

    public void printCat(Car cat){
        System.out.println(cat);
    }


}
