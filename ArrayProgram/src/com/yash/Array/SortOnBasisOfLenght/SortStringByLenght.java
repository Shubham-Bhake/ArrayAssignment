package com.yash.Array.SortOnBasisOfLenght;

public class SortStringByLenght {
	
		   public static void main(String[] args) {
		        // TODO Auto-generated method stub

		       String[] str = { "bb", "aaa", "c", "dddd" };

		       String str2;

		       for (int i = 0; i < str.length; i++) {

		           for (int j = 0; j < str.length; j++) {

		               // System.out.println(str[i]
		               if (str[i].length() < str[j].length()) {
		                    str2 = str[i];
		                    str[i] = str[j];
		                    str[j] = str2;

		               }

		           }

		       }
		        for (int i = 0; i < str.length; i++) {
		            System.out.println(str[i]);

		       }

		   }
		}
	
