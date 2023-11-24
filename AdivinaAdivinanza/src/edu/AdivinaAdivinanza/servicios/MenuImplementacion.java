package edu.AdivinaAdivinanza.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	
	public int numeroUsu() {
		
		
		System.out.println("Introduzca un Valor");
		
		Scanner mi = new Scanner (System.in);
		
		int numeroUsu = mi.nextInt();
		
		return numeroUsu;
		
		
	}
	
	
	
}
