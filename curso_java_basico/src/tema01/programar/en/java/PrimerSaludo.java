package tema01.programar.en.java;

/**
* Primer ejemplo del tema 01. Escribimos tres l�neas, una de las cuales se 
* imprime a trav�s del m�todo mostrarMensaje()
*
* @author JM Serrano
* @version 1.0, 01/09/2020
*/

public class PrimerSaludo {

	public static void main(String[] args) {
		System.out.println("Hola Jose Maria");
		PrimerSaludo ps = new PrimerSaludo();
		ps.mostrarMensaje();
		System.out.println("FIN DEL PROGRAMA");
	}

	void mostrarMensaje() {
		System.out.println("Primera clase del curso de Java");
	}

}
