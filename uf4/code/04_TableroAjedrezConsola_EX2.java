package main;

public class TableroAjedrezConsola_EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int filas;
		int columnas;
		
		for(columnas = 1; columnas <= 4; columnas++)
		{
			for(filas = 1; filas <= 4; filas++)
			{
				System.out.print(" ");
				System.out.print("█");
			}
			System.out.println();
			
			for(filas = 1; filas <= 4; filas++)
			{
				System.out.print("█");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

// █ █ █ █
// █ █ █ █ 
// █ █ █ █
// █ █ █ █ 
// █ █ █ █
// █ █ █ █ 
// █ █ █ █
// █ █ █ █ 