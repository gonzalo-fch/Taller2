import java.lang.reflect.Array;
import java.util.ArrayList;
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
        System.out.println("[3] Mostrar el producto mayor de los pares de números adyacentes");
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
                    System.out.println("La cantidad de pares actuales son: " );
                    System.out.println("["+pares(rellenarArreglo(creararreglo())).size()+"]");
                    a=true;
                    break;
                case "2":
                    mostrar(pares(rellenarArreglo(creararreglo())));
                    a=true;
                    break;
                case "3":
                    System.out.println("El numero mayor es");
                    System.out.println(buscarNumeroMayor(mayor(rellenarArreglo(creararreglo()))));
                    a=true;
                    break;
                default:
                    System.out.println("Caracter no Valida");
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

    public static ArrayList<String> pares( int[] arr) {
        ArrayList<String> par = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length) {
                int b = random(2000)-999;
                par.add(""+arr[i]+"," + (b));
            }
            if (i<arr.length-1) {
                par.add("" + arr[i] + "," + arr[i + 1]);
            }
        }
        return par;
    }

    public static ArrayList<Integer> mayor( int[] arr) {
        ArrayList<Integer> par = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length) {
                int b = random(2000)-999;
                par.add(arr[i] * (b));
            }
            if (i<arr.length-1) {
                par.add(arr[i]*arr[i + 1]);
            }
        }
        return par;
    }
    public static void mostrar(ArrayList a) {
        System.out.println("Los pares son:");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }


    public static int buscarNumeroMayor(ArrayList<Integer> num) {
        int mayor = num.get(0);
        for (int x = 0; x < num.size(); x++) {
            if (num.get(x) > mayor) {
                mayor = num.get(x);
            }
        }
        return mayor;
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
                case "3":
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
