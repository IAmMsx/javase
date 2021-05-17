package com.collection;

import org.junit.Test;

import java.util.*;

public class CollectionTest {

    @Test
    public void test1() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ins = new ArrayList<>();
//        int temp ;
        String line = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
//            temp = scanner.nextInt();
//            ins.add(temp);
            System.out.println(line);
        }
        scanner.close();
//        System.out.println(ins);
    }

    @Test
    public void test2() {
        TreeSet<person> personList = new TreeSet<>(Comparator.comparingInt(person::getScore));
        personList.add(new person("ll", 89, 1));
        personList.add(new person("mm", 8, 5));
        personList.add(new person("zz", 18, 3));
        personList.add(new person("kk", 91, 2));
        personList.add(new person("hh", 36, 4));

        Iterator<person> iterator = personList.iterator();
        for (int i = 0; i < 3; i++) {
            System.out.println(iterator.next().getName());
        }
    }
}
