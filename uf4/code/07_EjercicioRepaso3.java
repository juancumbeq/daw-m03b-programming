/*
 * Programa que pide al usuario introducir una cadena de texto y determina si es palíndromo 
 * (es decir, si se lee igual de izquierda a derecha que de derecha a izquierda).
 */

package main;

import java.util.Scanner;

public class EjercicioRepaso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String word;
		boolean isPal = true;
		
		System.out.print("Introduce una cadena de texto para comprobar si es palíndromo: ");
		word = sc.nextLine();
		sc.close();
		
		for(int i = 0; i < (word.length() / 2); i++)
		{
			if(word.charAt(i) != word.charAt(word.length() - 1 - i))
			{
				isPal = false;
				break;
			}
		}
		
		if (isPal) {
      System.out.println("La palabra: " + word + " SÍ es palíndromo.");
    } else {
      System.out.println("La palabra: " + word + " NO es palíndromo.");
    }
	}
}

// Introduce una cadena de texto para comprobar si es palíndromo: holaoh
// La palabra: holaoh NO es palíndromo.
// Introduce una cadena de texto para comprobar si es palíndromo: anna
// La palabra: anna SÍ es palíndromo.