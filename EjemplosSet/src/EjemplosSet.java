import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class EjemplosSet {
    public static void main(String[] args) {


        //SET => No acepta repetidos (los detecta con equals).
        //Se guardan en el orden que mejor interesa. No se accede por indice, sino con iterator

        //HashSet<String> ciudades = new HashSet(); //Orden impredecible. De esta forma, el acceso aleatorio es más rápido
        //LinkedHashSet<String> ciudades = new LinkedHashSet(); //Inserta en orden de inserción
        TreeSet<String> ciudades = new TreeSet(); //Inserta ordenando los elementos, segun compareTo(Object).
        // En este caso, como usamos String, usa el orden alfabético que está definido previamente en JAVA

        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Malaga");
        ciudades.add("Vigo");
        ciudades.add("Sevilla");
        ciudades.add("Madrid");

        ciudades.forEach(arg -> System.out.println("Ciudad: " + arg));
        //ciudades.forEach(System.out::println);
    }
}
