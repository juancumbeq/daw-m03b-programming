package main;

import java.util.Scanner;

public class EjemploClase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n*********************** EJEMPLO SECUENCIAL *****************************");
		
		Scanner sc = new Scanner(System.in);
		
		int notaEvCont, notaExamen;
		float notaFinal = 0;
		
		System.out.println("Introduce tu la nota de la evaluación continua");
		notaEvCont = sc.nextInt();
		
		System.out.println("Introduce tu nota del exámen");
		notaExamen = sc.nextInt();
		
		System.out.println("Números introducidos" + notaEvCont + " y " + notaExamen);
		System.out.println(notaEvCont + " + " + notaExamen + " = " + (notaEvCont+notaExamen));
		System.out.println(notaEvCont + " - " + notaExamen + " = " + (notaEvCont-notaExamen));
		System.out.println(notaEvCont + " * " + notaExamen + " = " + (notaEvCont*notaExamen));
		
		
		System.out.println("\n*********************** EJEMPLO CONDICIONAL SIMPLE ***********************");
		if(notaExamen >= 5)
		{
			System.out.println("Enhorabuena, hay que calcular la media ponderada con la nota de la \nEvaluación Continua");
		}
		
		
		System.out.println("\n*********************** EJEMPLO CONDICIONAL DOBLE ***********************");
		if(notaExamen >= 5)
		{
			notaFinal = (float)(notaExamen * 0.6 + notaEvCont*0.4);
			
			if(notaFinal >= 5)
				System.out.println("Enhorabuena, tu nota en esta UF es: " + notaFinal);
		}
		else
		{
			System.out.println("Lo siento has suspendido, no se hace media con nota menor a 5 en el examen");
		}
		
		
		
		System.out.println("\n********** EJEMPLO CONDICIONAL MULTIPLE: IF ANIDADOS ***********************");
		if(notaFinal == 10)
		{
			System.out.println("Matrícula de honor");
		}
		else if (notaFinal >= 8.5)
		{
			System.out.println("Sobresaliente");
		}
		else if (notaFinal >= 6.5)
		{
			System.out.println("Notable");
		}
		else if (notaFinal >= 5.5)
		{
			System.out.println("Bien");
		}
		else if (notaFinal >= 5)
		{
			System.out.println("Aprobado");
		}
		else
		{
			System.out.println("Lo siento has suspendido, dale un repaso");
		}
		sc.close();
		
		System.out.println("\n********** EJEMPLO OPERADOR CONDICIONAL (: ? :) ***********************");
		System.out.println("Esta UF está: " + (notaFinal >= 5 ? "Aprobado" : "Suspenso"));
	}

}
