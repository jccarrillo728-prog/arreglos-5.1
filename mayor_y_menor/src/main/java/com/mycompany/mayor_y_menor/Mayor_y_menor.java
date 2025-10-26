/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mayor_y_menor;

import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class Mayor_y_menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[8];
        
        System.out.println("Ingrese 8 numeros enteros:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int mayor = nums[0];
        int menor = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > mayor) {
                mayor = nums[i];
            }
            if (nums[i] < menor) {
                menor = nums[i];
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
