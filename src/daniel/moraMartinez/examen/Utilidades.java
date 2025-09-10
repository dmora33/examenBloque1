package daniel.moraMartinez.examen;

import java.util.Arrays;
import java.util.Scanner;

public class Utilidades {
	public static void dile(String dile) {
		System.out.println(dile);
	}

	public static String pedirTexto() {
		dile("dime un texto");

		String mensajeError;
		String texto = "";
		// no me ha valido para nada añadir un control de error,o no me acuerdo de como
		// se hace q es más probable.
		do {
			mensajeError = "";
			Scanner scan = new Scanner(System.in);
			texto = scan.next();

			// utilizo normalizaEspacios
			texto = normalizaEspacios(texto);
			if (texto.isEmpty()) {
				mensajeError += "error repite";
				continue;
			}

		} while (!mensajeError.isEmpty());
		return texto;

	}

	public static int pedirNumero() {
		int numeroEntero = 0;
		dile("escribe un número");
		Scanner scan = new Scanner(System.in);
		numeroEntero = scan.nextInt();
		return numeroEntero;
	}

	public static void parImparNegativo(int numero) {
		String respuesta = "";
		if (numero % 2 == 0) {
			respuesta += "el número " + numero + " es par";
			if (numero < 0) {
				respuesta += " Negativo";
			}
		} else {
			respuesta += "el número " + numero + " es impra";
			if (numero < 0) {
				respuesta += " Negativo";
			}
		}
		dile(respuesta);
	}

	public static void sumaTotal() {
		dile("Cuantos números vas a introducir?");
		int numero = pedirNumero();
		int sumaNumero = 0;
		int numeroMenor = 1000;
		int numeroMayor = 0;
		int[] numeros = new int[numero];
		for (int i = 0; i < numeros.length; i++) {
			dile("dime que número quieres introducir en la posición" + i);
			int numeroIntroducir = pedirNumero();
			numeros[i] = numeroIntroducir;
			sumaNumero += numeroIntroducir;
			if (numeroIntroducir < numeroMenor) {
				numeroMenor = numeroIntroducir;
			} else if (numeroIntroducir > numeroMayor) {
				numeroMayor = numeroIntroducir;
			}
		}
		dile("Suma=" + sumaNumero + "\tMax=" + numeroMayor + "\tMin=" + numeroMenor);

	}

	public static void vocalesTexto() {
		String texto = "";
		texto = pedirTexto();

		// Utilizo el metodo normaliza espacios
		texto = normalizaEspacios(texto);

		int contadorVocales = 0;
		if (texto.toLowerCase().contains("a") || texto.toLowerCase().contains("e") || texto.toLowerCase().contains("i")
				|| texto.toLowerCase().contains("o") || texto.toLowerCase().contains("u")) {
			contadorVocales++;
		}
		dile("número de vocales=" + contadorVocales);
		// contar palabras de forma robusta con el split ("\\s+") debuelve un array de
		// palabras coge como separadores espacios, y da igual si hay dos seguidos y
		// tabuladores, y luego las cuentas...esta funcion la sacado de mi libro de
		// programción y a demas creo que se menciono en clase.
		String[] palabras = texto.split("\\s+");
		int numeroPalabras = palabras.length;
		dile("el número de palabras" + numeroPalabras);
	}

//TODO falta por acabar duplicados y indices que no lo entiendo lo que pides.
	public static void numerosArray() {
		dile("dime el número de posiciones del array");
		int[] numeros = new int[Utilidades.pedirNumero()];
		dile("m=" + numeros.length + Arrays.toString(numeros));
		// SIN DUPLICADOS
		int vidaExtra = 0;
		for (int i = 0; i < numeros.length; i++) {

		}
	}

//utilizado en el metodo vocales de texto pedriTexto() y vocalesTexto().
	public static String normalizaEspacios(String s) {
		String espaciosNormalizados = s.strip();
		return espaciosNormalizados;
	}

}
