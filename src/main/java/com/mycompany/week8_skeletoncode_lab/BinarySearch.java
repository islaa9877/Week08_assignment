/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
public static void main(String args[]){
    int[] arr = {23,44,67,78,97};
    int key1 = 44;
    int key2 = 78;
    int index1 = BinarySearch.runBinarySearchIteratively(arr, key1, 0, arr.length-1);
    int index2 = BinarySearch.runBinarySearchIteratively(arr, key2, 0, arr.length-1); 
    System.out.println("Index of key1: " +index1);
     System.out.println("Index of key2: " +index2);
}
        }

