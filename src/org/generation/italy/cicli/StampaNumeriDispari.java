package org.generation.italy.cicli;

import java.util.Random;
import java.util.Scanner;

public class StampaNumeriDispari {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lun = scanner.nextInt();
		int[] n  = new int[lun];
		
		Random r = new Random();
		int max = 100;
		
		int numUneven = 0;
		int numEven = 0;
		int sumTenToFifty = 0;
		
		for (int i=0; i < n.length; i++) {
			int numGen = r.nextInt(max);
			n[i] = numGen;
			if(n[i]%2 == 0) {
				numEven+= 1;
			}
				else {
					numUneven+=1;
					System.out.println(n[i]);
				}
					if(n[i]> 10 && n[i]<50) {
						sumTenToFifty+=n[i];
					}
		}
		
		scanner.close();
		
		System.out.println(numUneven);
		System.out.println(numEven);
		System.out.println(sumTenToFifty);
		
		
	}

}
