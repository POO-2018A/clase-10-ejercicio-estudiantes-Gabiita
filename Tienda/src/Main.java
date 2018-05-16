

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int nproductos = 0;
        int opcion = 0;
        int productosant=0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese los datos de su tienda");
        System.out.print("Nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Direccion: ");
        String direccion = scan.nextLine();
        System.out.print("RUC: ");
        String ruc = scan.nextLine();



        System.out.println("\t\t##Ingresar nuevo producto##");
        System.out.println("Ingrese la cantidad de productos ");
        nproductos = scan.nextInt();
        productosant=nproductos;
        Productos[] caracteristicas= new Productos[50];
        String[] productos = new String[50];

        for (int i = 0; i < nproductos; i++) {
            System.out.println("Ingrese el nuevo producto " + (i + 1) + ": ");
            productos[i] = scan.next();
            scan.nextLine();
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
            System.out.println("Marca: ");
            String marca = scan.nextLine();
            System.out.println("Codigo: ");
            String codigo = scan.nextLine();
            System.out.println("Tipo: ");
            String tipo = scan.nextLine();
            System.out.println("Precio: ");
            double precio = scan.nextInt();
            caracteristicas[i] = new Productos(marca, codigo, tipo, precio);
        }

            do {
                System.out.println("\t\t##BIENVENIDO##");
                System.out.println("Ingrese una opcion \n");
                System.out.println("1. Ingresar nuevo producto");
                System.out.println("2. Visualizar lista de productos");
                System.out.println("3. Salir");
                opcion = scan.nextInt();

                switch (opcion) {

                    case 1: {
                        almacenar(nproductos,caracteristicas,productos,productosant);

                        break;
                    }

                    case 2: {

                            System.out.println("\t\t##LISTADO DE PRODUCTOS##");

                            for (int i = 0; i< nproductos; i++) {
                                System.out.println("Producto: " + (i + 1) + productos[i]);
                                System.out.println("Marca: " + caracteristicas[i].getMarca());
                                System.out.println("Código: " + caracteristicas[i].getCodigo());
                                System.out.println("Tipo: " + caracteristicas[i].getTipo());
                                System.out.println("Precio: " + caracteristicas[i].getPrecio());
                                System.out.println();

                            }
                            break;


                    }

                    case 3: {

                        System.out.println("Gracias pos usar nuestros servicios");
                        break;
                    }

                    default: {
                        System.out.println("Ingrese una opcion correcta, por favor.");
                    }
                }
            } while (opcion != 3);
         }



    public static void almacenar(int nproductos, Productos[] caracteristicas, String [] productos, int productosant ) {

        Scanner scan= new Scanner(System.in);
        System.out.println("\n");



        System.out.println("\t\t##Nuevos productos##");


        for(int i=productosant ; i<nproductos; i++){
            System.out.print("Ingrese el nombre del producto "+ (i+1)+ " : ");
            productos[i]=scan.next();
            scan.nextLine();
            System.out.println("\n");
            System.out.println("Producto " + (i+1) + ": " + productos[i]);
            System.out.print("Marca: ");
            String marca = scan.nextLine();
            System.out.print("Codigo: ");
            String codigo = scan.nextLine();
            System.out.print("Tipo: ");
            String tipo = scan.nextLine();
            System.out.print("Precio: ");
            double precio = scan.nextInt();
            caracteristicas [i]= new Productos(marca,codigo,tipo,precio);
     }
   }
}


