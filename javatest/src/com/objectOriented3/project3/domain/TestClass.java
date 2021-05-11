package com.objectOriented3.project3.domain;
import org.junit.Test;

public class TestClass {

    @org.junit.Test
    public void statusTest(){

        Status[] statuses = Status.values();
        for (Status status1 : statuses) {
            System.out.println(status1);
        }
        // [0,3) int强转 [0,2]
        int random = (int) (Math.random()*3);
        switch (statuses[random]){
            case BUSY :
                System.out.println("BUSY");
                break;
            case FREE:
                System.out.println("FREE");
                break;
            case VOCATION:
                System.out.println("VOCATION");
                break;
        }



    }
}
