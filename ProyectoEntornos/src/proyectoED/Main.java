package proyectoED;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	 int edad, minimo, maximo;
	 String nombre;
	 
	 System.out.println("Indica el mínimo");
	 minimo = Integer.parseInt(teclado.nextLine());
	 
	 System.out.println("Indica el máximo");
	 maximo = Integer.parseInt(teclado.nextLine());
	 
	 ProyectoED n = new ProyectoED();
	 System.out.println( n.numeroRandom(minimo, maximo));
	 
	 
	 System.out.println("¿Cómo te llamas?");
	 nombre = teclado.nextLine();
	 System.out.println("¿Cuántos años tienes?");
	 edad = teclado.nextInt();
	
	 Persona unaPersona = new Persona(nombre, edad);
	 ProyectoED p = new ProyectoED ();
	 p.imprimirDatosPersona(unaPersona);
	 
	 
	}
}
