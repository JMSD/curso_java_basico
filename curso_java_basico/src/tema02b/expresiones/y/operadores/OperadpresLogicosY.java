package tema02b.expresiones.y.operadores;

/**
 * Ejemplo 02.06 Operadores logicos Y
 *
 * @author JM Serrano
 * @version 1.0, 24/11/2020
 */
public class OperadpresLogicosY {


	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		// x > 5 devuelve true
		// y < 50 devuelve true
		// Ambas expresiones unidas por && hacen que z almacene un valor true
		// Los parentesis no son necesarios, aunque conviene ponerlos para 
		// interpretar mejor el código
		boolean z = (x>5) && (y<50);
		
		System.out.println("\nOperadores logicos Y:");
		System.out.println("\nValor de z: " + z);
		System.out.println("\nFin del programa");
	}
}
