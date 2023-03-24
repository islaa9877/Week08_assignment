/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0 ; i<n; i++){
        if (arr[i] == x){
           return i;
        }
    }
    return -1;

// Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
  
    
    }
public static void main(String[] args) {
    int[] arr = {24, 55, 43, 67, 34};
    int x = 43;
    int index = LinearSearch.search(arr, x);
    if (index == -1) {
        System.out.println(x + " not found in the array");
    } else {
        System.out.println(x + " found at index " + index);
    }
}






}

    

