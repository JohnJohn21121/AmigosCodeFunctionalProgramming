package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        //Conditions:
        //Given an array of integers [nums] nd an integer [target], return indices of the
        //two numbers such that they add up to target.
        //You may assume that each input would have exactly one solution, and you may not use the same element twice.
        int[] nums = {3,2,4};
        int target1 = 6;
        int[] result = twoSum(nums, target1);
        if (validation(target1, result)){
            System.out.println("Everything is working fine ");
        }

    }

    private static boolean validation(int target1, int[] result) {
        if (result.length == 2) {
            System.out.println("Los índices de los números que suman el objetivo son: " + result[0] + ", "
                    + result[1] + ", dando por lo tanto " + target1);
            return true;
        } else {
            System.out.println("No se encontraron dos números que sumen el objetivo.");
            return false;
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        // Crear un mapa para almacenar los valores y sus índices
        Map<Integer, Integer> map = new HashMap<>();

        // Recorrer el arreglo
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Verificar si el complemento existe en el mapa
            if (map.containsKey(complement)) {
                // Si existe, retornar los índices
                return new int[] { map.get(complement), i };
            }

            // Si no existe, agregar el valor actual al mapa
            map.put(nums[i], i);
        }

        // Si no se encuentra ninguna pareja, retornar un arreglo vacío o null
        return new int[0];
    }

}