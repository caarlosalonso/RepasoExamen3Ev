import java.util.Iterator;
import java.util.LinkedList;

public class Cola {
    public static void main(String[] args) {
        /**
         *     - offer(elemento): Añade un elemento al final de la lista, simula a la cola.
         *     - poll(): Borra y devuelve el primer elemento de la lista.
         *     - peek(): Devuelve el primer elemento de la lista sin borrarlo.
         *     - isEmpty(): Verifica si la pila está vacía.
         *
         *
         *
         */

        /*Cola Starbuck*/


        LinkedList<String> colaCafes = new LinkedList();

        colaCafes.add("Pepe1");
        colaCafes.add("Pepe2");
        colaCafes.add("Pepe3");
        colaCafes.offer("Pepe4");
        colaCafes.offer("Pepe5");


        /*Mostramos todos*/
        System.out.println(colaCafes);
        System.out.println();
        for(String cliente:colaCafes){
            System.out.println("El nombre es: "+cliente);
        }

        System.out.println();
        Iterator it = colaCafes.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

       // colaCafes.clear();

        /*pool  =>  get(0) + remove(0) */
        System.out.println("Pool");
        if (colaCafes.isEmpty()){
            System.out.println("listaVacia");
        }
        else {
            String turno = colaCafes.poll();
            System.out.println("Turno actual" + turno);
            System.out.println("Cola: " + colaCafes);
        }

        /*peek*/
        System.out.println("peek");
        if (colaCafes.isEmpty()){
            System.out.println("listaVacia");
        }
        else {
            String turno = colaCafes.peek();
            System.out.println("Turno actual" + turno);
            System.out.println("Cola: " + colaCafes);
        }








    }
}
