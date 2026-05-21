package com.test.interview;


import java.util.*;
import java.util.Arrays;

public class Solution3sum{

public static List<List<Integer>> calculate3sum(int[] arr){
      
     // Arrays.sort(arr);
      

         for (int i = 0; i < arr.length; i++) {
         for (int j = i + 1; j < arr.length; j++) {
             int tmp = 0;
             if (arr[i] > arr[j]) {
                 tmp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = tmp;
             }
         }
     }
List<List<Integer>>  list = new ArrayList();
    for(int i=0 ; i< arr.length -2 ; i++){
if(i > 0 && arr[i]==arr[i-1])   continue ;

if(arr[i]> 0) break ;

      int left = i+1 ;
      int right = arr.length -1  ;
      while(left<right){
         int sum = arr[i]+ arr[left]+arr[right] ;
       if(sum==0){
        list.add(Arrays.asList(arr[i],arr[left],arr[right]));
        while(left< right && arr[left] ==arr[left +1] ) left++;
        while(left<right && arr[right]== arr[right-1]) right--;
        left++;
        right--;
       } else if(sum < 0){
        left++;
       } else{
        right--;
       }

      }

    }

return list ;
}



   public static void main(String[] args){
   int[] arr = {-1,0,1,2,-1,-4} ;
     List<List<Integer>> list1 =calculate3sum(arr);

     System.out.println(list1);

   }


}











