package ejercicioTiempo;

import java.util.Scanner;

public class PruebaTiempo {

	private static Scanner input;
	public static Tiempo obj = new Tiempo();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		separarTiempo();
		menu();

	}

	/**
	 * 
	 */
	public static void separarTiempo() {

		String tiempo = obj.actualTime();

		String[] tiempoSeparado = tiempo.split(":");

		obj.setHoras(Integer.parseInt(tiempoSeparado[0]));
		obj.setMinutos(Integer.parseInt(tiempoSeparado[1]));
		obj.setSegundos(Integer.parseInt(tiempoSeparado[2]));

	}

	/**
	 * 
	 */
	public static void menu() {
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("Hora actual: " + obj.getHoras() + ":" + obj.getMinutos() + ":" + obj.getSegundos());
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

			break;
		case 2:

			break;
		case 3:

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

}
