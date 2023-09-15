import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String [] productos = new String[7];
        productos[0] = "Kingston Pendrive 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3);
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);
        
        
        int[] numeros = new int[4];

        // aquí se están asignando datos
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7"); // es un unboxing convierte este integer a un primitivo
        numeros[2] = 35; // cast con long
        numeros[3] = -1;
      //  numeros[4] = 5;

        // se mandan a llamar
        Arrays.sort(numeros);
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length-1]; // para acceder ultimo elemento es el total de elementos -1

        // se imprimen
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
