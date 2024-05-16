package Merge_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7,9};

        System.out.println("Не отсартированный массив");

        System.out.println(Arrays.toString(arr));
        //Вызов метода сортировки
        Merge.mergeS(arr,0,arr.length-1);

        System.out.println("Отсартированный");
        System.out.println(Arrays.toString(arr));
    }
}
