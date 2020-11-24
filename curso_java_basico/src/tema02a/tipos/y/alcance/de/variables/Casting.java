package tema02a.tipos.y.alcance.de.variables;

/**
* Ejemplo 02.02. Ejemplos de casting
*
* @author JM Serrano
* @version 1.0, 10/11/2020
*/

public class Casting {

	public static void main(String[] args) {
		
	// Casting de variables primitivas. Se distinguen dos clases:
				
		// Casting Impl�cito: 	no se necesita escribir c�digo para que se lleve a cabo. 
		// 						Ocurre cuando se realiza una conversi�n ancha (widening casting), 
		//						es decir, cuando se coloca un valor peque�o en un contenedor grande
		
		int num1 = 100;		// Ocupa 4 bytes
		long num2 = num1;	// num1 encaja autom�ticamente en un contenedor de 8 bytes
		
		// long num3 = 10000000000;		// No compila. Es castin implicito no es posible porque se sale.
										// del rango del int. Da el error: "The literal 10000000000 
										// of type int is out of range". Es necesario un casting impl�cito
		
		
		// Casting Expl�cito:	s� es necesario escribir c�digo. Ocurre cuando se realiza una conversi�n
		// 						estrecha (narrowing casting), es decir, cuando se coloca un valor grande
		// 						en un contenedor peque�o. Son susceptibles de p�rdida de datos. 
		
		int num4 = 100;		// Ocupa 4 bytes
		//short num5 = num4;	// num4 no encaja en un contenedor de 2 bytes. Da el error: "Type mismatch: 
								// cannot convert from int to short". Hace falta un casting expl�cito
	}
}
