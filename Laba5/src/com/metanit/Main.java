package com.metanit;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] Moyo = new int[5][5];

        for (int i = 0; i < Moyo.length; i++) {
            for (int j = 0; j < Moyo[i].length; j++) {
                Moyo[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < Moyo.length; i++, System.out.println()) {
            for (int j = 0; j < Moyo[i].length; j++) {
                System.out.print(Moyo[i][j] + " ");
            }
        }
        int q = -1;
        int[] arr = new int[5];
        for (int i = 0; i < Moyo.length; i++) {
            for (int j = 0; j < Moyo[i].length; j++)   //перебор массива
                if (i == j) {
                    q ++;
                        arr[q] = Moyo[i][j];

                    }

                }
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        }
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }

            int swap = nums[i];
            nums[i] = nums[min];
            nums[min] = swap;
        }
    }


    }





































































