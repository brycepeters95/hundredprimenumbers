package com.example.primenumbers;

public class HundredPrimeNumbers {
	public static void main(String args[]) {
	
		 int flag=0,primeCounter=0,start=2;
	        while(primeCounter<100){
//	        	looping till mathsqrt start is less than j
	            for(int j=2;j<=Math.sqrt(start);j++){
	            	
//	            	System.out.println(start + ": " + j);
	                if((start%j)==0){

	                    flag=1;
	                    break;
	                }
	            }
	            if (flag==0) {

                System.out.println(primeCounter+1+": "+start + " ");
	                primeCounter++;
	            }
	            start++;
	            flag = 0;
	        }
	    }
}