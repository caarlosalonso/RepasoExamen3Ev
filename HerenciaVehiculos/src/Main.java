import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <VehiculoTransporte> listaVehiculos = new ArrayList<>();
        VehiculoTransporte v1 = new VehiculoTransporte("a");
        Avion a1 = new Avion("Boeing 747",true);

        a1.vender();

        listaVehiculos.add(v1);
        listaVehiculos.add(a1);
        System.out.println(v1);
        System.out.println(a1);

        Scanner teclado = new Scanner(System.in);





        int opcion=1;

        try {
            System.out.println("Quieres comprar un vehiculo? 1-Avion, 2-Coche 3-Salir: ");
            opcion = teclado.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Tienes que introducir un numero!! " + e.getMessage());
        }

        switch (opcion){
            case 1:
                System.out.println("Comprando avion...");
                break;
            case 2:
                System.out.println("Comprando coche...");
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
        }

    }
    public static void getPrecio(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce codigo: ");
        int codigo = teclado.nextInt();

        VehiculoTransporte vAux = new VehiculoTransporte("");
    }

}