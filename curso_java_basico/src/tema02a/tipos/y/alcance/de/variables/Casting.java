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
				
		// Casting Implícito: 	no se necesita escribir código para que se lleve a cabo. 
		// 						Ocurre cuando se realiza una conversión ancha (widening casting), 
		//						es decir, cuando se coloca un valor pequeño en un contenedor grande
		
		int num1 = 100;		// Ocupa 4 bytes
		long num2 = num1;	// num1 encaja automáticamente en un contenedor de 8 bytes
		
		// long num3 = 10000000000;		// No compila. Es castin implicito no es posible porque se sale.
										// del rango del int. Da el error: "The literal 10000000000 
										// of type int is out of range". Es necesario un casting implícito
		
		
		// Casting Explícito:	sí es necesario escribir código. Ocurre cuando se realiza una conversión
		// 						estrecha (narrowing casting), es decir, cuando se coloca un valor grande
		// 						en un contenedor pequeño. Son susceptibles de pérdida de datos. 
		
		int num4 = 100;		// Ocupa 4 bytes
		//short num5 = num4;	// num4 no encaja en un contenedor de 2 bytes. Da el error: "Type mismatch: 
								// cannot convert from int to short". Hace falta un casting explícito
	}
}
