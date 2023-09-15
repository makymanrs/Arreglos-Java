import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String [] productos = new String[7];
        int total = productos.length; // es mejor práctica usar una variable como length

        productos[0] = "Kingston Pendrive 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";
        Arrays.sort(productos);
        System.out.println("Usando for");
        for (int i =0; i<total;i++){
            System.out.println("para indice "+i+" : "+productos[i]);
        }
        System.out.println();

        // usando foreach
        System.out.println("Usando foreach");
        for(String prod: productos){
            System.out.println("prod = " + prod);;
        }

        // usando while
        System.out.println();
        System.out.println("Usando While");
        int i =0;
        while (i<total){
            System.out.println("para indice "+i+" : "+productos[i]);
            i++;
        }

        // usando do while
        System.out.println();
        System.out.println("Usando do While");
        int j =0;
        do {
            System.out.println("para indice "+j+" : "+productos[j]);
            j++;
        }while (j<total);


        System.out.println();
        int[] numeros = new int[16];
        int totalnumeros = numeros.length;
        for (int k = 0; k<totalnumeros;k++){
            numeros[k] = k*3;
        }

        for (int k = 0; k<totalnumeros;k++){
            System.out.println("numeros[k] = " + numeros[k]);
        }

        // aquí se están asignando datos

    }
}
