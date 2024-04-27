package main;

import java.util.Scanner;

public class EjemploClase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num, fibo1, fibo2, i;
		boolean exit = false;
		
		while(!exit)
		{
			do {
				System.out.print("Introduce un número mayor que 1: ");
				num = sc.nextInt();
			} while(num <= 1);
			
			System.out.println("Los " + num + " primeros términos de la serie de Fibonacci son: ");
			fibo1 = 1;
			fibo2 = 1;
			
			System.out.println(fibo1 + " ");
			
			for(i = 2; i <= num; i++)
			{
				System.out.print(fibo2 + " ");
				fibo2 = fibo1 + fibo2;
				fibo1 = fibo2 - fibo1;
			}
			
			System.out.println();
			System.out.println("¿Quieres salir? 0 = salir, 1 = continuar");
			
			if(sc.nextInt() == 0)
			{
				exit = true;
			}
		}
	}

}

// Introduce un número mayor que 1: 10
// Los 10 primeros términos de la serie de Fibonacci son: 
// 1 
// 1 2 3 5 8 13 21 34 55 
// ¿Quieres salir? 0 = salir, 1 = continuar