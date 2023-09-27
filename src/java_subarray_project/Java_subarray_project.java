/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_subarray_project;

import java.util.Scanner;

/**
 *
 * @author payal
 */
public class Java_subarray_project {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] arr = new int[n]; 
        
        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        
        int neg_subarr = 0;
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int current_sum = 0;
                    for(int k=i; k<=j; k++){
                        current_sum += arr[k]; 
                        
                    }
                    
                    if(current_sum < 0) {
                        neg_subarr++;
                    }
                    
            }
        }
        System.out.println(neg_subarr);    
    }
}