import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iniciador();
    }



    private static void menu1() {
        System.out.println("Por favor, seleccione una de las opcíones");
        System.out.println("[1] Contar la cantidad de pares Adyacentes");
        System.out.println("[2] Mostrar Los pares de numeros adyacentes");
        System.out.println("[2] Mostrar el producto mayor de los pares de números adyacentes");
    }

    private static void iniciador() {
        do {
            String b;
            do {
                menu1();
               b = seleccionAcciones();
            }while(validacion(b)==false);
        }while (Salir()==false);
    }

    private static String seleccionAcciones() {
        boolean a = false;
        String b;
        do {
            System.out.println("que desea hacer");
            b = ingresarRespuesta();
            switch (b){
                case "1":
                    a=true;
                    break;
                case "2":
                    mostrar();
                    a=true;
                    break;
                case "3":
                    mayor();
                    a=true;
                    break;
                default:
                    System.out.println("Entrada no Valida");
                    a=false;
                    break;
            }
        } while (a==false);
        return b;
    }

    private static int[] creararreglo() {
        Random rnum = new Random();
        int[] arr = new int[rnum.nextInt(10)];
        return arr;
    }



    private static int[] rellenarArreglo( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=5;
        }
return arr;
    }

    private static void mostrar() {
    }

    private static void mayor() {
    }

    private static boolean Salir() {
        boolean a;
        boolean b = false;
        String opcion;
        do {
            System.out.println("Desea Salir?");
            System.out.println("[1] Si");
            System.out.println("[2] no");
            opcion = ingresarRespuesta();
            switch (opcion){
                case "1":
                    a =true;
                    b =true;
                    break;
                case "2":
                    a = true;
                    b = false;
                    break;
                default:
                    a=false;
                    System.out.println("caracter no valido");
                    break;
            }
        }while (a==false);
        return b;
    }

    private static boolean validacion(String b) {
        boolean a = false;
        do {
            switch (b){
                case "1":
                    a=true;
                    break;
                case "2":
                    a=true;
                    break;
                default:
                    System.out.println("Entrada no Valida");
                    a=false;
                    break;
            }
        } while (a==false);
        return a;
    }

    private static String ingresarRespuesta() {
        Scanner teclado= new Scanner(System.in);
        return teclado.next();
    }


}
