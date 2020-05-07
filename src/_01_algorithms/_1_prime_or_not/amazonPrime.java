package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class amazonPrime {

	public static void main(String[] args) {
		
		String num = JOptionPane.showInputDialog("Give me a number between 1 and 100");
		int n = Integer.parseInt(num);
		boolean prime = true;
		for (int i = 2; i< n; i++) {
			if (n % i==0) {
				System.out.println(n + " is not prime");
				prime = false;
				break;
			}
			
		}
		if (prime) {
			System.out.println(n + " is prime");
		}
		
	}
	
}
