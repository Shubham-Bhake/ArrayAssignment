package com.yash.Array.RemoveString;

public class RemoveStringWhichNotPalindrome {

		static String str[]= {"nayan","ssad","akscfd"};

		public static void main(String[] args) {
			RemoveStringWhichNotPalindrome t= new RemoveStringWhichNotPalindrome();

		for(String st:str)
		{
		t.checkPalindrom(st);

		}
		}
		public void checkPalindrom(String s)
		{
		char chArr[]=s.toCharArray();

		int n =chArr.length;
		int count=0;
		for(int i=0,j=chArr.length-1;i<chArr.length;i++,j--)
		{


		if(chArr[i]==chArr[j])
		{
		count++;
		}

		}
		if(count==n)
		{
		System.out.println("palindrom: "+s);
		}
		}


		}



