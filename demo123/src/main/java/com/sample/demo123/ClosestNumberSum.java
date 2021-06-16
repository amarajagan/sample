package com.sample.demo123;

public class ClosestNumberSum {
 public static void main(String[] args) {
	
	 int arr[] =  {12, 13, 42, 41, 42, 48}, x = 54;
     int n = arr.length;
     int res_left_index=0,res_right_index=0;
     
     int left_index=0,right_index=n-1,diff=Integer.MAX_VALUE;
     
     while(left_index<right_index) {
    	 
    	 if( (arr[left_index]+arr[right_index]-x) <diff) {
    		 res_left_index=left_index;
    		 res_right_index=right_index;
    		 diff= (arr[left_index]+arr[right_index])-x;
    	 }
    	 
    	 if(arr[left_index]+arr[right_index]>x) {
    		 right_index--;
    	 }
    	 else {
    		 left_index++;
    	 }
     }
     
     System.out.println("closest number are "+arr[res_left_index]+"and "+arr[res_right_index]);
     
}
	 

}
