package com.array;
import java.util.Arrays;

public class main {

  public static void main(String[] args) {
   int[] arr = {4,2,3,0,1};
   
   //With sort method
   Arrays.sort(arr);
   System.out.printf("Ascending"+" arr[] : %s\n",
   Arrays.toString(arr)); 
   
   System.out.print("Ascending without sort method :");
   
   //without sort method
   for (int i = 0; i < arr.length; i++)
   {
       for (int j = i + 1; j < arr.length; j++)
       {
           int tmp = 0;  
           if (arr[i] > arr[j])
           {  
           tmp = arr[i];  
           arr[i] = arr[j];  
           arr[j] = tmp;  
           }  
       }  
       System.out.print(arr[i]);
       System.out.print(",");
    }
}
}