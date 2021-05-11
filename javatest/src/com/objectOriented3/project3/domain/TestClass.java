package com.objectOriented3.project3.domain;
import com.objectOriented3.project3.service.TeamException;
import org.junit.Test;

public class TestClass {

    @org.junit.Test
    public void statusTest(){

//        Status[] statuses = Status.values();
//        for (Status status1 : statuses) {
//            System.out.println(status1);
//        }
//        // [0,3) int强转 [0,2]
//        int random = (int) (Math.random()*3);
//        switch (statuses[random]){
//            case BUSY :
//                System.out.println("BUSY");
//                break;
//            case FREE:
//                System.out.println("FREE");
//                break;
//            case VOCATION:
//                System.out.println("VOCATION");
//                break;
//        }

        Programmer dd = new Programmer(1, "dd", 22, 200.0);
        dd.setStatus(Status.valueOf("VOCATION"));
        System.out.println(dd.getStatus());
        if (dd.getStatus().toString().equals("VOCATION")){
            System.out.println("ddddd");
        }

    }

    @Test
    public void descriptionTest(){
        NoteBook notetest = new NoteBook("ddd", 1.0);

        System.out.println(notetest.getDescription());
    }
}
