import java.util.LinkedList;

public class Colas {
    /**
     *     - offer(elemento): Añade un elemento al final de la lista, simula a la cola.
     *     - poll(): Borra y devuelve el primer elemento de la lista.
     *     - peek(): Devuelve el primer elemento de la lista sin borrarlo.
     *     - isEmpty(): Verifica si la pila está vacía.
     */
    public static void main(String[] args) {
        LinkedList <String> colaCafes = new LinkedList<>();

        colaCafes.add("cafe1");
        colaCafes.add("cafe2");
        colaCafes.add("cafe3");
        colaCafes.add("cafe4");
        colaCafes.add("cafe5");

        //Muestra todos los elementos
        colaCafes.forEach(arg -> System.out.println("Turno: " + arg));
        System.out.println(colaCafes);

        //Vacia la lista
        //colaCafes.clear();

        //Si la lista esta vacia, añade un nuevo elemento, si no muestra el primer elemento
        if (colaCafes.isEmpty()){
            colaCafes.offer("cafe6");
        }else {
            colaCafes.peek();
        }

        for (int i=colaCafes.size();i!=0;i--){
            System.out.println(colaCafes.poll());
        }
        System.out.println(colaCafes);
        System.out.println(colaCafes.isEmpty());

    }
}
