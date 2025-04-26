import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorProducto = 0, valorCompra = 0;
        String nombreCliente = "", opcion = "";
        int cantidadPtroductos = 0, edad = 0;
        System.out.println("Bienvenido a la Tienda Don Andres: Mercancía de dudosa procedencia");
        System.out.println("Selecione: \n1 - Tecnología\n2 - Ropa\n3 - Drogas");
        opcion = sc.nextLine();
        switch (opcion) {
            case "1":
                System.out.println("Categoría Tecnología:\n1 - Televisores\n2 - Celulares\n3 - Computadores");
                opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        System.out.println("Televisores");
                        break;
                    case "2":
                        System.out.println("Celulares");
                        break;
                    case "3":
                        System.out.println("Computadores");
                        break;
                }
                break;
            case "2":
                System.out.println("Categoría Ropa\n1- Jeans\n2 - Zapatos (puma)\n3 - Camisetas");
                opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        System.out.println("Jeans");
                        break;
                    case "2":
                        System.out.println("Zapatos (puma)");
                        break;
                    case "3":
                        System.out.println("Camisetas");
                }
                        break;

                    case "3":
                        System.out.println("Ingrese la edad: ");
                        edad = sc.nextInt();
                        System.out.println("¿Tiene fórmula médica?\n1 - Si\n2 - No");
                        opcion = sc.next();
                        if(edad >= 18 && opcion.equals("1")) {
                            System.out.println(" Drogas\n1 - Omeprazol\n2 - Opioides\n3 - Tramadol");
                            opcion = sc.nextLine();
                            switch (opcion) {
                                case "1":
                                    System.out.println("Omeprazol");
                                    break;
                                case "2":
                                    System.out.println("Opioides");
                                    break;
                                case "3":
                                    System.out.println("Tramadol");
                                    break;
                            }

                        } else {
                            System.out.println("No le puedo vender drogas: Guiño, Guiño...");
                        }

                    break;
                }
        }
    }
