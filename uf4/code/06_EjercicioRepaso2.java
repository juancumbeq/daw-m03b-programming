// Programa que pide al usuario introducir un número y calcula su factorial utilizando un bucle "for".

package main;

import java.util.Scanner;

public class EjercicioRepaso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 1;
		
		System.out.print("Introduce un número entero para calcular su factorial: ");
		num = sc.nextInt();
		sc.close();
		
		for(int i = num; i > 0; i--)
		{
			sum *= i;
		}
		
		System.out.println("El factorial de " + num + " es: " + sum);
	}
}

// Introduce un número entero para calcular su factorial: 3
// El factorial de 3 es: 6