package com.array;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {34, 5, 22, -98, 6, -76, 0, -3};

//        // 1. 冒泡 实现数组的从小到大排序
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if(arr[j]>arr[j+1]) {
//                    int temp;
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//
//            }
//        }
//        System.out.print(Arrays.toString(arr));

        // 快排
//        quickSort(arr, 0, arr.length - 1);
//        System.out.print(Arrays.toString(arr));

        // 2. 反转arr
        // 方法一 单指针
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp;
//            temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
        // 方法二 双指针
//        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

        // 3. 复制上述数组
//        int[] arr_copy = new int[arr.length];
        // 方法一 Arrays.copyOf
//        arr_copy = Arrays.copyOf(arr,arr.length);
        // 方法二 循环赋值
//        for (int i = 0; i < arr.length; i++) {
//            arr_copy[i] = arr[i];
//        }

//        System.out.print(Arrays.toString(arr_copy));

        // 4. 线性查找
        int index = -1, key = 0;
//        index = Arrays.binarySearch(arr,5);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        System.out.println(index);


    }

    public static void quickSort(int[] arr, int low, int high) {
        int i = low, j = high;
        int temp;
        if (i < j) {
            temp = arr[i];
            while (i != j) {
                while (j > i && arr[j] >= temp) --j;
                arr[i] = arr[j];
                while (i < j && arr[i] <= temp) ++i;
                arr[j] = arr[i];
            }
            arr[i] = temp;
            quickSort(arr, low, i - 1);
            quickSort(arr, j + 1, high);

        }

    }
}
