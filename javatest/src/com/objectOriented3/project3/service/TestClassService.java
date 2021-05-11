package com.objectOriented3.project3.service;

import com.objectOriented3.project3.domain.Equipment;
import com.objectOriented3.project3.domain.NoteBook;
import com.objectOriented3.project3.domain.PC;
import com.objectOriented3.project3.domain.Printer;
import org.junit.Test;

import java.util.Arrays;

public class TestClassService {

    @Test
    public void DataEquipmentsTest() {
        System.out.println(Data.EQIPMENTS[0].length);

        Equipment[] equipments = new Equipment[Data.EQIPMENTS.length];
        for (int i = 0; i < Data.EQIPMENTS.length; i++) {
            if (Data.EQIPMENTS[i].length == 0) continue;
            switch (Integer.parseInt(Data.EQIPMENTS[i][0])) {
                case 21:
                    equipments[i] = new PC(Data.EQIPMENTS[i][1], Data.EQIPMENTS[i][2]);
                    break;
                case 22:
                    equipments[i] = new NoteBook(Data.EQIPMENTS[i][1], Double.parseDouble(Data.EQIPMENTS[i][2]));
                    break;
                case 23:
                    equipments[i] = new Printer(Data.EQIPMENTS[i][1], Data.EQIPMENTS[i][2]);
                    break;
            }
        }
//        for (Equipment equipment : equipments) {
//            if (equipment == null) continue;
//            System.out.println(equipment.getDescription());
//        }

//        int index = Arrays.binarySearch(equipments,Data.EQIPMENTS[1]);
//        if (Arrays.asList(equipments).contains(Data.EQIPMENTS[1])){
//            System.out.println("true");
//        }


    }
}
