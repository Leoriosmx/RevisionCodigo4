package com.generation;
import java.util.Scanner;

public class Codigo4 {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);

	        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	        String j1 = s.nextLine().toLowerCase(); // Convertir a minúsculas

	        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	        String j2 = s.nextLine().toLowerCase(); // Convertir a minúsculas

	        if (j1.equals(j2)) { // Comparar cadenas
	            System.out.println("Empate");
	        } else {
	            int g = 2; // Asumimos que gana el jugador 2 inicialmente

	            switch (j1) {
	                case "piedra":
	                    if (j2.equals("tijeras")) {
	                        g = 1; // Jugador 1 gana
	                    }
	                    break; // Agregar break para evitar fall-through

	                case "papel":
	                    if (j2.equals("piedra")) {
	                        g = 1; // Jugador 1 gana
	                    }
	                    break; // Agregar break

	                case "tijeras":
	                    if (j2.equals("papel")) {
	                        g = 1; // Jugador 1 gana
	                    }
	                    break; // Agregar break

	                default:
	                    System.out.println("Entrada no válida. Asegúrate de introducir piedra, papel o tijeras.");
	                    return; // Salir si la entrada no es válida
	            }

	            System.out.println("Gana el jugador " + g);
	        }

	        s.close(); // Cerrar el escáner
		

	}//main

}//classCodigo4
