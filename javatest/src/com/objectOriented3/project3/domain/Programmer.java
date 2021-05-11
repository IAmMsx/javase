package com.objectOriented3.project3.domain;

import org.junit.Test;

public class Programmer extends Employee {

    private int memberId;//加入团队后mID
    private Equipment equipment;
    private Status status;


    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
        this.status = Status.valueOf("FREE");
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.status = Status.valueOf("FREE");
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
