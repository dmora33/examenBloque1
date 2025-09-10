package daniel.moraMartinez.examen;

public class Main {

	public static void main(String[] args) {

		int opcion = 0;
		do {
			
			Utilidades.dile(
					"\n1.Par/Impar/Negativo.\n2.Estadísticos.\n3.Análisis de texto.\n4.Operaciones con array.\n5.Comparar primo.\n6.Salir");
			opcion = Utilidades.pedirNumero();
			switch (opcion) {
			case 1 -> {
				Utilidades.dile("que número quieres");
				Utilidades.parImparNegativo(Utilidades.pedirNumero());
			}
			case 2 -> {
				Utilidades.sumaTotal();
			}
			case 3 -> {
				Utilidades.vocalesTexto();
			}
			case 4 -> {
				Utilidades.numerosArray();
			}
			case 5 -> {
				System.out.println("el primo no esta heco, escoge otro");
			}
			}

		} while (opcion == 6);
	}

}
