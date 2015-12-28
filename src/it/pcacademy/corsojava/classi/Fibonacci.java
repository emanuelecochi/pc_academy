package it.pcacademy.corsojava.classi;

import java.util.Arrays;

public class Fibonacci {
	
	private int[] seriesFibonacci = new int[10];
	
	public int[] createFibonacci() {
		seriesFibonacci[0]= 0;
		seriesFibonacci[1]= 1;
		seriesFibonacci[2]= 1;
		for (int i = 3; i < seriesFibonacci.length; i++) {
			seriesFibonacci[i] = seriesFibonacci[i-1] + seriesFibonacci [i-2];
		}
		return seriesFibonacci;
	}
	
	public void printFibonacci() {		
		System.out.println(Arrays.toString(createFibonacci()));	
	}
	
	
	public int positionFibonacci(int position) {
		return createFibonacci()[position];
	}

	public static void main(String[] args) {
		
		/*int[] seriesFibonacci = new int[7];
		seriesFibonacci[0] = 0;
		seriesFibonacci[1] = 1;
		seriesFibonacci[2] = 1;
		
		for (int i = 3; i < seriesFibonacci.length; i++) {
			seriesFibonacci[i] = seriesFibonacci[i-1] + seriesFibonacci [i-2];
		}

		System.out.println(Arrays.toString(seriesFibonacci));
		*/
		
		Fibonacci series = new Fibonacci();
		series.printFibonacci();
		System.out.println(series.positionFibonacci(6));		
		
	}

}
