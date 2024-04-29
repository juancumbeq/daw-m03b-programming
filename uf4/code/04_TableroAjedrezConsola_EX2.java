  // - Realizar la clase TableroAjedrezConsola que muestra un tablero de ajedrez por consola. Los requisitos son:
  //   - La clase se llama TableroAjedrezConsola.
  //   - Realizarlo dentro del métod main de la clase.
  //   - No permitido crear funciones, métodos ni procedimientos.
  //   - 64 casillas, colores blanco y negro. Casilla blanca abajo derecha.
  //   - Para el cuadro negro hay que utilizar el carácter ASCII.
  //   - Obligatorio imprimir las casillas de dos en dos (casilla blanca y casilla negra, o viceversa).

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