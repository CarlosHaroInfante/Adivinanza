 package edu.AdivinaAdivinanza.controladores;

import edu.AdivinaAdivinanza.servicios.MenuImplementacion;
import edu.AdivinaAdivinanza.servicios.MenuInterfaz;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		MenuInterfaz mia = new MenuImplementacion();
		
		
		
		 double numeroRandom =  Math.random()*100;
		 short numeroElegido = (short)numeroRandom;
		
		 
			for (int chance = 1; chance <= 10; chance++) 
			{
				System.out.println("Te quedan " + chance);
				int numeroUsu = mia.numeroUsu();
				
				if (numeroElegido == numeroUsu) {
					
					System.out.println("Has Acertado");
				}
				
				
				if (numeroElegido != numeroUsu) {
					
					if (numeroUsu < numeroElegido) {
						
						
						System.out.println("El numero es Mayor");
					}
					
					
					if (numeroUsu > numeroElegido) {
						
						
						System.out.println("El numero es Menor");
					}
					
				}
				
				
				
			}
	}

}
