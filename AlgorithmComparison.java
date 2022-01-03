package chapter04;

import java.util.Date;

public class AlgorithmComparison 
	

	{
	public static void main(String[] args)
	 

	{ 
	

	Date current = new Date(); // Get current time
		long startTime = current.getTime();
		//Algorithm A
				long sum = 0;
			 	long n = 40000;
				for (long i = 1; i <= n; i++);
				{
					long i = 0;
					sum = sum + i;
			

			}
			

		current = new Date(); // Get current time
		long stopTime = current.getTime();
		long elapsedTime = stopTime - startTime; // Milliseconds	
	

	

		Date current1 = new Date(); // Get current time
		long startTime1 = current1.getTime();
		//Algorithm B
		sum = 0;
		long n1 = 40000;
		for (long i1 = 1; i1 <= n1; i1++)
		{
			for (long j = i1; j <= i1; j++)
			{
				sum = sum + 1 ;
			}
		}
		current1 = new Date(); // Get current time
		long stopTime1 = current1.getTime();
		long elapsedTime1 = stopTime1 - startTime1; // Milliseconds
		


		

		Date current2 = new Date(); // Get current time
		long startTime2 = current2.getTime();
	    int n2 = 40000;
		//Algorithm C
		sum = n2 * (n2 + 1 ) / 2;
		

		current2 = new Date(); // Get current time
		long stopTime2 = current2.getTime();
		long elapsedTime2 = stopTime2 - startTime2; // Milliseconds
	

	

		

		Date current3 = new Date(); // Get current time
		long startTime3 = current.getTime();
		//Algorithm A
				long sum3 = 0;
			 	long n3 = 50000;
				for (long i3 = 1; i3 <= n3; i3++);
				{
					long i3 = 0;
					sum = sum + i3;
			

			}
			

		current3 = new Date(); // Get current time
		long stopTime3 = current3.getTime();
		long elapsedTime3 = stopTime3 - startTime3; // Milliseconds	
	

	

		Date current4 = new Date(); // Get current time
		long startTime4 = current4.getTime();
		//Algorithm B
		sum = 0;
		long n4 = 50000;
		for (long i4 = 1; i4 <= n4; i4++)
		{
			for (long j = i4; j <= i4; j++)
			{
				sum = sum + 1 ;
			}
		}
		current4 = new Date(); // Get current time
		long stopTime4 = current4.getTime();
		long elapsedTime4 = stopTime4 - startTime4; // Milliseconds
		


		

		Date current5 = new Date(); // Get current time
		long startTime5 = current5.getTime();
	    int n5 = 50000;
		//Algorithm C
		sum = n5 * (n5 + 1 ) / 2;
		current5 = new Date(); // Get current time
		long stopTime5 = current5.getTime();
		long elapsedTime5 = stopTime5 - startTime5; // Milliseconds	
	

		

		

		Date current6 = new Date(); // Get current time
		long startTime6 = current6.getTime();
		//Algorithm A
				long sum6 = 0;
			 	long n6 = 60000;
				for (long i6 = 1; i6 <= n3; i6++);
				{
					long i6 = 0;
					sum = sum + i6;
			

			}
			

		current6 = new Date(); // Get current time
		long stopTime6 = current6.getTime();
		long elapsedTime6 = stopTime6 - startTime6; // Milliseconds	
	

	

		Date current7 = new Date(); // Get current time
		long startTime7 = current4.getTime();
		//Algorithm B
		sum = 0;
		long n7 = 60000;
		for (long i7 = 1; i7 <= n4; i7++)
		{
			for (long j = i7; j <= i7; j++)
			{
				sum = sum + 1 ;
			}
		}
		current7 = new Date(); // Get current time
		long stopTime7 = current7.getTime();
		long elapsedTime7 = stopTime7 - startTime7; // Milliseconds
		


		

		Date current8 = new Date(); // Get current time
		long startTime8 = current8.getTime();
	    int n8 = 60000;
		//Algorithm C
		sum = n8 * (n8 + 1 ) / 2;
		

		current8 = new Date(); // Get current time
		long stopTime8 = current8.getTime();
		long elapsedTime8 = stopTime8 - startTime8; // Milliseconds
		

		

		int b =40000;
		int c =50000;
		int d=60000;
		System.out.println("n "+ "     "+ "A (msec)"+ "     " + "B (msec)"+ "     " + "C (msec)");
		System.out.println( b + "   "+ elapsedTime+ "           " +elapsedTime1+ "            " +elapsedTime2);
		System.out.println( c + "   "+ elapsedTime3+ "           " +elapsedTime4+ "            " +elapsedTime5);
		System.out.println( d + "   "+ elapsedTime6+ "           " +elapsedTime7+ "            " +elapsedTime8);
	

	}}
