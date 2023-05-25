package proyectoED;

public class ProyectoED {
	/**
	 * Metodo el cual utiliza un numero mínimo y otro máximo y devuelve un numero aleatorio entre esos dos números.
	 * @param Min
	 * @param Max
	 * @return Un numero aleatorio entre esos dos.
	 */
	public int numeroRandom(int Min, int Max) {
		return (int) (Math.random() * (Max - Min + 1) + Min);
	}
	
}
