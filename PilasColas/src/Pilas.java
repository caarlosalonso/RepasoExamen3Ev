import java.util.LinkedList;

public class Pilas {
    public static void main(String[] args) {

/*
     Operaciones especiales:
    - push(elemento): Añade un elemento a la pila.
    - pop(): Borra y devuelve el elemento superior de la pila.
    - peek(): Devuelve el elemento superior de la pila sin retirarlo.
    - isEmpty(): Verifica si la pila está vacía.
*/

        LinkedList <String> carritosCompra = new LinkedList<>();

        carritosCompra.add("carrito1");
        carritosCompra.add("carrito2");
        carritosCompra.add("carrito3");
        carritosCompra.add("carrito4");
        carritosCompra.add("carrito5");

        carritosCompra.push("carritoPrueba");

        //Muestra todos los elementos
        carritosCompra.forEach(arg -> System.out.println("Numero: " + arg));

        //Vaciamos la lista
        //carritosCompra.clear();

        //Verifica si la pila esta vacia, en caso de estarlo, añade 1 elemento, si no muestra el elemento superior
        if (carritosCompra.isEmpty()){
            carritosCompra.push("carrito6");
        }else{
            System.out.println(carritosCompra.peek());
        }
        System.out.println(carritosCompra);

        System.out.println("Muestra y elimina");
        for (int i=carritosCompra.size();i!=0;i--){
            System.out.println(carritosCompra.pop());
        }
        System.out.println(carritosCompra);
        System.out.println(carritosCompra.isEmpty());
    }
}
