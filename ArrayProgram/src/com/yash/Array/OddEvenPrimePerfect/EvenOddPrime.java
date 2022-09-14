package com.yash.Array.OddEvenPrimePerfect;

public class EvenOddPrime {
	
//	public static void oddEvenPrimePerfect(int arr[], int arrsize){
//		
//		int evenCount =0;
//		int oddCount= 0;
//		
//		
//		
//		for(int i=0;i<arrsize;i++) {
//			
//			if ((arr[i] & 1) == 1)
//				oddCount++;
//			 else
//				 evenCount++;
//			 }
//		 System.out.println("Number of even"
//				 + " elements = " + evenCount
//				 + " Number of odd elements = "
//				 + oddCount);
//			
//			
//		}
//		 
//
//
//
//		
//		public static void main(String[] args) {
//			
//			int arr[]= {1,2,3,4,5,6,7,8,9,10,11};
//			
//			int n=arr.length;
//			
//			oddEvenPrimePerfect(arr,n);
				
					//}
			
	   public static void main(String[] args) {
	        // TODO Auto-generated method stub
	         int[] a= {2,4,6,8,11,17,19,21,28};
	         int count = 0;
	         int count1 = 0;
	         int count2=0;
	         int p=0;
	                
	        for (int i = 0; i < a.length; i++) {
	            
	            if(a[i]%2==0)
	            {
	                count++;
	            }
	            if(a[i]%2 != 0)
	            {
	                count1++;
	            }
	            int prime = 1;
	            for (int j = 2; j <= a.length-1; j++) {

	               if (a[i] % j  == 0) {
	                    prime++;
	                }

	           }

	           if (prime == 1) {

	               count2++;

	           }
	            
	            int sum=0;
	            int t=a[i];
	            for (int k = 1; k < t; k++) {
	                
	                if (t % k  == 0) {
	                     sum=sum+k;
	                      
	                }

	           }
	            
	            if (sum == t) {

	               p++;

	           }
	            
	        }
	 
	        System.out.println("even no :"+ count);
	        System.out.println("odd no :"+ count1);
	        System.out.println("prime no :"+ count2);
	        System.out.println("perfect no :"+ p);
	    }
			
}
