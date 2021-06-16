package com.sample.demo123;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class arraryReverse {
	public static void main(String[] args) {
	int[] a= {1,2,3,4};
    int[] temp=new int[a.length];
    
 
 for(int i=a.length-1,j=0;i>=0&&j<=a.length;i--,j++) {
	 temp[j]=a[i];
 }
 
 System.out.println("Max value is "+Integer.MAX_VALUE);
 
 
 for(int i=0;i<a.length/2;i++) {
    int tempvar=a[i];
    a[i]=a[a.length-1-i];
    a[a.length-1-i]=tempvar;
 }
 
 
long temp1[]=(long[])IntStream.rangeClosed(1, a.length).mapToLong((i)->a[a.length-i]).toArray();
 

for(long i:temp1) {
	System.out.println("value is "+i);
}

 Arrays.stream(a).forEach((i)->System.out.print(i+"\t"));
 System.out.println();
 Arrays.stream(temp).forEach((i)->System.out.print(i+"\t"));
 
 
// Stream.of(temp).forEach(i->System.out.println(i));
//  
// Arrays.stream(temp).
 
}
}