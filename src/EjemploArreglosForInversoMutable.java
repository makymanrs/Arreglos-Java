import java.util.Arrays;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {

      //  String[] productos = new String[7];
        String [] productos = {"Kingston Pendrive 64gb", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};
        int total = productos.length; // es mejor práctica usar una variable como length

        Arrays.sort(productos);
        System.out.println("Usando for");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        for(int i=0; i<total/2; i++){
            String actual = productos[i];
            String inverso = productos[total -1 -i];
            productos[i] = inverso;
            productos[total -1 -i] = actual;
        }

        System.out.println("Usando for");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }



    }
}
