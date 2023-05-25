package proyectoED;

import java.util.Scanner;

public class ProyectoED {
	/**
	 * Metodo el cual utiliza un numero mínimo y otro máximo y devuelve un numero
	 * aleatorio entre esos dos números.
	 * 
	 * @param Min
	 * @param Max
	 * @return Un numero aleatorio entre esos dos.
	 */
	public int numeroRandom(int Min, int Max) {
		return (int) (Math.random() * (Max - Min + 1) + Min);
	}
	/**
	 * Método el cual recibe una persona y dice su nombre y si es mayor o menor de edad.
	 * @param persona
	 * Devuelve su nombre y si es mayor o menor de edad
	 */
	public void imprimirDatosPersona(Persona persona) {

		System.out.println("La persona se llama: " + persona.getNombre());
		System.out.println("Es " + (persona.getEdad() > 18 ? "mayor " : "menor ") + "de edad");
	}
}
