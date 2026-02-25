package org.aniket.leetcode;

import java.util.Arrays;

public class SortIntByNoOfBits 
{
	public static int[] getSortedByBits(int arr[])
	{
		Integer[] boxed = new Integer[arr.length];
		
		for(int i = 0; i < arr.length; i++)
		{
			boxed[i] = arr[i];
		}
		
		Arrays.sort(boxed, (a,b)->{
			int bitCompare = Integer.bitCount(a) - Integer.bitCount(b);
			return bitCompare != 0?bitCompare:a-b;
		});
		
		for(int i = 0;i < arr.length; i++)
		{
			arr[i] = boxed[i];
		}
		
		return arr;
	}

	public static void main(String[] args) 
	{
		int arr[]= {0,1,2,3,4,5,6,7,8};
		int res[] = getSortedByBits(arr);
		
		for(int i : res)
		{
			System.out.print(i + " ");
		}
	}

}
