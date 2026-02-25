package org.aniket.leetcode;

public class PrimeNo 
{
	public static boolean checkPrime(int n)
	{
		if(n == 1) return true;
		
		for(int i = 2; i < n/2; i++)
		{
			if(n % i == 0)  return false;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		int n = 133;
		
		//checking prime no
		if(checkPrime(n))
		{
			System.out.println("Prime No.");
		}else {
			System.out.println("Not A Prime No.");
		}
	}

}
