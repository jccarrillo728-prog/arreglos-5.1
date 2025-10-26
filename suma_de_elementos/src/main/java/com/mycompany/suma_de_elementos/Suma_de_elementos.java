/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suma_de_elementos;

import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class Suma_de_elementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        int suma = 0;

        System.out.println("Ingrese 5 numeros enteros:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            suma += nums[i];
        }

        System.out.println("La suma de todos los elementos es: " + suma);
    }
}
