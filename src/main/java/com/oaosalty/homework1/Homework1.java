
package com.oaosalty.homework1;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        System.out.println("Белин Георгий Алексеевич, РИБО-01-22, Вариант 1");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название автомобиля: ");
        String name = scan.nextLine();
        
        Car car = new Car(name);
        car.modify();
        System.out.println(car.toString());
    }
}
