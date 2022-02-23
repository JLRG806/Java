package ejercicioCoche;

import java.util.Scanner;

public class PruebaCoche {

	private static Scanner input;
	private static Coche[] obj;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		menu();

	}

	public static void menu() {

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("Que desea hacer?");
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("1) Registrar nuevos coches");
		System.out.println("2) Ver todos los coches");
		System.out.println("3) Cambiar el color a un coche");
		System.out.println("4) Salir del sistema");

		System.out.println("Ingrese la opcion literal:");
		int opcionMenu = input.nextInt();

		switch (opcionMenu) {
		case 1:

			registrarCoches();

			break;
		case 2:

			verCoches();

			break;
		case 3:

			cambiarColorCoche();

			break;
		case 4:

			System.exit(0);

			break;
		default:
			System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			System.out.println("Opcion Incorrecta");
			menu();
		}

	}

	public static void registrarCoches() {

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("<Reistrar nuevos coches>");
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("Ingrese cantidad de coches");
		int cantidadCoches = input.nextInt();

		input.nextLine();

		obj = new Coche[cantidadCoches];

		for (int i = 0; i < obj.length; i++) {
			obj[i] = new Coche();

			System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			System.out.println("Coche #" + (i + 1));

			System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			System.out.println("Ingrese la matricula:");
			obj[i].setMatricula(input.nextLine());

			System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			System.out.println("Ingrese la marca:");
			obj[i].setMarca(input.nextLine());

			System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			System.out.println("Ingrese el modelo:");
			obj[i].setModelo(input.nextLine());

			System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			System.out.println("Ingrese el color:");
			obj[i].setColor(input.nextLine());

			System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			System.out.println("Ingrese catidad de puertas:");
			obj[i].setPuertas(input.nextInt());

			System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			System.out.println("Ingrese catidad de caballos de fuerza:");
			obj[i].setCaballos(input.nextInt());

			System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

		}

		menu();
	}

	public static void verCoches() {

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("<Ver todos los coches>");
		if (obj != null) {

			for (int i = 0; i < obj.length; i++) {
				System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
				System.out.println("Coche #" + (i + 1));

				System.out.println("Matricula:		" + obj[i].getMatricula());

				System.out.println("Marca:			" + obj[i].getMarca());

				System.out.println("Modelo: 		" + obj[i].getModelo());

				System.out.println("Color:			" + obj[i].getColor());

				System.out.println("Numero dePuertas:	" + obj[i].getPuertas());

				System.out.println("Caballos de fuerza:	" + obj[i].getCaballos());
				System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

			}
		} else {
			System.out.println("No se han registrado coches :(");
		}

		menu();
	}

	public static void cambiarColorCoche() {
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("<Cambiar el color a un coche>");

		if (obj != null) {

			for (int i = 0; i < obj.length; i++) {
				System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
				System.out.println("Coche #" + (i + 1));
				System.out.println("Color:			" + obj[i].getColor());
				System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			}

			System.out.println("Ingrese el numero del coche:");
			int cocheSeleccionado = input.nextInt();
			input.nextLine();
			if (obj[(cocheSeleccionado - 1)] != null) {
				System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
				System.out.println("Coche #" + (cocheSeleccionado));
				System.out.println("Color:			" + obj[cocheSeleccionado - 1].getColor());

				System.out.println("Ingrese el nuevo color del coche:");
				obj[cocheSeleccionado - 1].setColor(input.nextLine());

			} else {
				System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
				System.out.println("Coche inexixtente");
			}

		} else {
			System.out.println("No se han registrado coches :(");
		}

		menu();
	}

}
