package com.doux.test;

public class MyTest {
    /**
     * 冒泡排序
     */
    public void bubbleSort(int[] arr) {
        System.out.println("排序之前");
        //遍历输出数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\n" + "排序之后");
        //遍历输出数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }


    public void testBubbleSort() {
        System.out.println("hello git");
        System.out.println("hello git");
        System.out.println("hello git");
        System.out.println("hello git");
        System.out.println("merge");
        System.out.println("master test");
        System.out.println("hot-fix test");
    }
}
