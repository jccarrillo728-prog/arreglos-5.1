/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elementos_invertidos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class Elementos_invertidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];

        System.out.println("Ingrese 6 numeros enteros:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Array original: " + Arrays.toString(nums));

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        System.out.println("Array invertido: " + Arrays.toString(nums));
    }
}
