import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iniciador();
    }



    public static void menu1() {
        System.out.println("Por favor, seleccione una de las opcíones");
        System.out.println("[1] Contar la cantidad de pares Adyacentes");
        System.out.println("[2] Mostrar Los pares de numeros adyacentes");
        System.out.println("[2] Mostrar el producto mayor de los pares de números adyacentes");
    }

    public static void iniciador() {
        do {
            String b;
            do {
                menu1();
               b = seleccionAcciones();
            }while(validacion(b)==false);
        }while (Salir()==false);
    }

    public static String seleccionAcciones() {
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

    public static int[] creararreglo() {
        int[] arr = new int[random(10)];
        return arr;
    }

    public static int random(int a){
        Random rnum = new Random();
        return rnum.nextInt(a);
    }


    public static int[] rellenarArreglo( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random(2000)-999;
        }
        return arr;
    }

    public static int[] pares( int[] arr) {


        return arr;
    }
    public static void mostrar() {
    }

    public static void mayor() {
    }

    public static boolean Salir() {
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

    public static boolean validacion(String b) {
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

    public static String ingresarRespuesta() {
        Scanner teclado= new Scanner(System.in);
        return teclado.next();
    }


}
