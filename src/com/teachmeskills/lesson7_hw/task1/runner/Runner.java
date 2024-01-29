package com.teachmeskills.lesson7_hw.task1.runner;

import com.teachmeskills.lesson7_hw.task1.employee.Accountant;
import com.teachmeskills.lesson7_hw.task1.employee.BaseEmployee;
import com.teachmeskills.lesson7_hw.task1.employee.Director;
import com.teachmeskills.lesson7_hw.task1.employee.Worker;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        BaseEmployee baseEmployee1 = new Director("Semen", "Ivanov", "Director", 1);
        BaseEmployee baseEmployee2 = new Accountant("Marina", "Matveeva", "Accountant", 2);
        BaseEmployee baseEmployee3 = new Worker("Alexey", "Tihonov", "Worker", 3);
        BaseEmployee[] employees = {baseEmployee1, baseEmployee2, baseEmployee3};

        getPosition(employees);
        getPositionById(employees);
    }

    public static void getPosition(BaseEmployee[] employees) {
        for (BaseEmployee employee : employees) {
            employee.getPosition();
        }
    }

    public static void getPositionById(BaseEmployee[] employees) {
        System.out.println("Enter position id: ");
        Scanner scanner = new Scanner(System.in);
        int positionId;
        if (scanner.hasNextInt()) {
            positionId = scanner.nextInt();
        } else {
            System.out.println("Wrong type of position id!");
            return;
        }
        scanner.close();

        for (BaseEmployee employee : employees) {
            if (employee.getPositionId() == positionId) {
                employee.getPosition();
                return;
            }
        }
        System.out.println("Wrong position id!");
    }

}
