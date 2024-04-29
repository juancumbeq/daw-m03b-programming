package main;

public class MostrarTableroConsola_EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("  A B C D E F G H");
		for(int fila = 0; fila < 8; fila++)
		{
			System.out.print((8 - fila) + " ");
			
			for(int columna = 0; columna < 8; columna++)
			{
				if((fila + columna) % 2 == 0)
				{
					System.out.print("  ");
				}
				else
				{
					System.out.print("\u2588\u2588");
				}
			}
			System.out.print(" " + (8 - fila));
			System.out.println();
		}
		System.out.println("  A B C D E F G H");
	}

}

//   A B C D E F G H
// 8   ██  ██  ██  ██ 8
// 7 ██  ██  ██  ██   7
// 6   ██  ██  ██  ██ 6
// 5 ██  ██  ██  ██   5
// 4   ██  ██  ██  ██ 4
// 3 ██  ██  ██  ██   3
// 2   ██  ██  ██  ██ 2
// 1 ██  ██  ██  ██   1
//   A B C D E F G H
