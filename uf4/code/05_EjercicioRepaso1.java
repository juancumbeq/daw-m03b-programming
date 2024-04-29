// Programa que pide al usuario introducir un número y determina si es par o impar.

package main;

import java.util.Scanner;

public class EjercicioRepaso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.print("Introduce un número para determinar si es par o no: ");
		num =  sc.nextDouble();
		sc.close();

		if(num % 2 == 0)
		{
			System.out.println("Se trata de un número par");
		}
		else
		{
			System.out.println("Se trata de un número impar");
		}
	}

}

// Introduce un número para determinar si es par o no: 10.00
// Se trata de un número par
// Introduce un número para determinar si es par o no: 5
// Se trata de un número impar
