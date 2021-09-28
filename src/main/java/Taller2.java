import java.util.Scanner;

public class Taller2 {

    public static void menu() {
        System.out.println(".........{Ingresa Una Opccion }........");
        System.out.println("[1] Mostrar pares adyacentes ");
        System.out.println("[2] Mostrar el mayor valor de producto");
        System.out.println("[3] SALIR");


    }

    public static int selecionOpciones(int cantOP) {
        int opcion = 0;
        do {
            try {
                menu();
                opcion = pedirDatoNumerico();
                if (opcion <= 0 || opcion >= cantOP + 1) {
                    System.out.println("No existe esa opcion");
                    System.out.println("Selecione una correcta");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("No es una exprecion numerica");
                System.out.println("Por favor intentelo denuevo");


            }

        } while (opcion <= 0 || opcion >= cantOP + 1);

        return opcion;

    }
    public static int validarRangodeNumero(int numero1) {
        if (numero1 < 0) {
            System.out.println("No se admiten numeros negativos");
        } else if (numero1 > 100) {  // recordar definir un limite
            System.out.println("No se admiten numeros mayores a 100");
            numero1 = -1;

        }
        return numero1;
    }
    public static int pedirDatoNumerico() {
        Scanner teclado = new Scanner(System.in);
        System.out.println(".......[INGRESE UNA ENTRADA VALIDA]......");

        return  teclado.nextInt();
    }
    public static void resolucionOpciones(double[] arreglo) {
        switch (selecionOpciones(3)) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                salirDelPrograma();
                break;

            default:
                System.out.println("ingrese una opcion valida");
        }


    }
    public static void salirDelPrograma() {
        System.exit(0);


    }
    public static void mostrarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);

        }
    }
}
