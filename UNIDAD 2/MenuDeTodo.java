import java.util.Scanner;
public class MenuDeTodo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calificaciones");
            System.out.println("2. Tienda de Descuento");
            System.out.println("3. Cajero Automático");
            System.out.println("4. Salir");
            System.out.println("Ingrese el número de la opción:");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    // Código para calificaciones
                    System.out.println("----- CALIFICACIONES -----");
                    int calificacion;

                    while (true) {
                        System.out.println("Introduzca la calificación (o -1 para salir): ");
                        calificacion = entrada.nextInt();

                        if (calificacion == -1) {
                            break;
                        }

                        switch (calificacion) {
                            case 0:
                                System.out.println("MUY MAL");
                                break;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                System.out.println("INSUFICIENTE");
                                break;
                            case 6:
                                System.out.println("SUFICIENTE");
                                break;
                            case 7:
                            case 8:
                                System.out.println("BIEN");
                                break;
                            case 9:
                                System.out.println("NOTABLE");
                                break;
                            case 10:
                                System.out.println("SOBRESALIENTE");
                                break;
                            default:
                                System.out.println("ERROR DE CALIFICACION");
                                break;
                        }
                    }
                    System.out.println("--------------------------");
                    break;

                case 2:
                    // Código para tienda de descuento
                    System.out.println("----- TIENDA DE DESCUENTO -----");
                    double PV = 1000;
                    int descuento = 0;
                    double precioFinal;
                    String codPromocion;

                    while (true) {
                        System.out.println("Su total de compra es: $" + PV);
                        System.out.println("¿Tienes un código de descuento? (S/N)");
                        String respuesta = entrada.next();

                        if (respuesta.equalsIgnoreCase("N")) {
                            break;
                        }

                        System.out.println("Escribe el código de descuento: ");
                        codPromocion = entrada.next();
                        codPromocion = codPromocion.toUpperCase();

                        switch (codPromocion) {
                            case "PLATINOOCTUBRE":
                                descuento = 20;
                                break;
                            case "SILVEROCTUBRE":
                                descuento = 50;
                                break;
                            case "BRONCEOCTUBRE":
                                descuento = 35;
                                break;
                            case "OROOCTUBRE":
                                descuento = 75;
                                break;
                            default:
                                System.out.println("Has introducido un código que no tiene descuento");
                                break;
                        }

                        precioFinal = PV - descuento;
                        System.out.println("Total con descuento: $" + precioFinal);
                    }
                    System.out.println("------------------------------");
                    break;

                case 3:
                    // Código para cajero automático
                    System.out.println("----- CAJERO AUTOMÁTICO -----");
                    final int saldo_inicial = 1000;
                    double saldoActual = saldo_inicial;
                    int opcionCajero;

                    while (true) {
                        System.out.println("1. Ingresar dinero a la cuenta");
                        System.out.println("2. Retirar dinero de la cuenta");
                        System.out.println("3. Salir");
                        System.out.println("Ingresa un número:");

                        opcionCajero = entrada.nextInt();

                        switch (opcionCajero) {
                            case 1:
                                System.out.println("Digite la cantidad que va a ingresar:");
                                double ingreso = entrada.nextDouble();
                                saldoActual += ingreso;
                                System.out.println("El saldo actual es: " + saldoActual);
                                break;
                            case 2:
                                System.out.println("Digite la cantidad que va a retirar:");
                                double retiro = entrada.nextDouble();
                                if (retiro <= saldoActual) {
                                    saldoActual -= retiro;
                                    System.out.println("Dinero en cuenta: " + saldoActual);
                                } else {
                                    System.out.println("No cuenta con el saldo suficiente");
                                }
                                break;
                            case 3:
                                System.out.println("Saliendo del programa...");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Opción inválida");
                                break;
                        }
                    }
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
	}
}
