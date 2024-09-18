package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Choose prime numbers up to...");
		int n = in.nextInt();
		boolean[] sieved = new boolean[n+1];
		for(int i = 0; i<sieved.length; i++)
		{
			sieved[i] = true;
			
		}
		for(int j = 2; j<=n; j++)
		{
			for(int k = j+j;k<=n; k=k+j)
			{
				sieved[k] = false;
			}
		}
		
		for(int i = 0; i<sieved.length; i++)
		{
			if(sieved[i]==true)
			{
				System.out.println(i);
			}
		}
	}

}
