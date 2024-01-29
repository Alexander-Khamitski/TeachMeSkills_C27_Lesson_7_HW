package com.teachmeskills.lesson7_hw.task1.employee;

import com.teachmeskills.lesson7_hw.task1.employee.IPosition;

public abstract class BaseEmployee implements IPosition {

    String firstName;
    String lastName;
    String position;
    int positionId;

    public BaseEmployee(String firstName, String lastName, String position, int positionId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.positionId = positionId;
    }

    @Override
    public void getPosition() {
        System.out.println("Position is: " + position);
    }

    @Override
    public int getPositionId() {
        return positionId;
    }
}
