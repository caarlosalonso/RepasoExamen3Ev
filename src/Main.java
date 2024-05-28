import ACCEjercicio1.Ejemplar;
import ACCEjercicio1.Libro;
import ACCEjercicio1.Musica;
import ACCEjercicio1.Pelicula;

import javax.imageio.ImageTranscoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        ArrayList <Ejemplar> listaEjemplares = new ArrayList<>();
        ArrayList <Ejemplar> listaEjemplaresAlquilados = new ArrayList<>();

        Libro libro = new Libro("a","b",LocalDate.of(2000,11,11),450);
        Libro libro2 = new Libro("a","b",LocalDate.of(2000,11,11),450);
        Pelicula pelicula = new Pelicula("a","b",LocalDate.of(1900,10,10),160);
        Musica musica = new Musica("a","b",LocalDate.of(2012,9,1),12);

        libro2.alquilar();
        listaEjemplaresAlquilados.add(libro2);

        listaEjemplares.add(libro);
        listaEjemplares.add(pelicula);
        listaEjemplares.add(musica);

        menu(listaEjemplares,listaEjemplaresAlquilados);
    }

    public static void menu(ArrayList<Ejemplar>listaEjemplares,ArrayList<Ejemplar> listaEjemplaresAlquilados){
        Scanner tecloadoLetras = new Scanner(System.in);

        int opcion;
        String opcionString;
        String opcionRegex="[1-5]";

        do {
            do {
                System.out.println("*************************************");
                System.out.println("1-Mostrar listas");
                System.out.println("2-Mostrar listas ampliadas");
                System.out.println("3-Alquilar ejemplar");
                System.out.println("4-Crear nuevos ejemplares");
                System.out.println("5-Salir");
                System.out.println("Elige una de las siguientes opciones:");
                System.out.println("*************************************");

                opcionString = tecloadoLetras.nextLine();

            }while (!Pattern.matches(opcionRegex,opcionString));

            opcion = Integer.parseInt(opcionString);

            switch (opcion){
                case 1:
                    mostrarLista(listaEjemplares,listaEjemplaresAlquilados);
                    break;
                case 2:
                    mostrarListaAmpliada(listaEjemplares,listaEjemplaresAlquilados);
                    break;
                case 3:
                    alquilarEjemplar(listaEjemplares,listaEjemplaresAlquilados);
                    break;
                case 4:
                    crearEjemplar(listaEjemplares);
                    break;
                case 5:
                    break;
            }

        }while (!Pattern.matches(opcionRegex,opcionString)||opcion!=5);
    }

    public static void mostrarLista(ArrayList<Ejemplar> listaEjemplares, ArrayList<Ejemplar> listaEjemplaresAlquilados){
        System.out.println("*****Ejemplares*****");
        for (Ejemplar e : listaEjemplares){
            e.mostrar();
        }
        System.out.println("*****Ejemplares alquilados*****");
        for (Ejemplar a : listaEjemplaresAlquilados){
            a.mostrar();
        }
    }

    public static void mostrarListaAmpliada(ArrayList<Ejemplar> listaEjemplares, ArrayList<Ejemplar> listaEjemplaresAlquilados){
        System.out.println("*****Ejemplares*****");
        for (Ejemplar e : listaEjemplares){
            e.mostrarAmpliado();
        }
        System.out.println("*****Ejemplares alquilados*****");
        for (Ejemplar a : listaEjemplaresAlquilados){
            a.mostrarAmpliado();
        }
    }
    public static void alquilarEjemplar(ArrayList<Ejemplar> listaEjemplares, ArrayList<Ejemplar> listaEjemplaresAlquilados){
        Scanner teclado = new Scanner(System.in);
        String codigoEjemplar;
        String codigoEjemplarRegex="[A-Z]{3}[0-9]{5}";
        do {
            System.out.println("Introduce el codigo del ejemplar a alquilar: ");
            codigoEjemplar = teclado.nextLine().toUpperCase();

        }while (!Pattern.matches(codigoEjemplarRegex,codigoEjemplar));

        //Creamos ejemplar auxiliar
        Ejemplar ejemplarAux = new Ejemplar(codigoEjemplar);

        //Comprobarmos si esta en la lista
        int posicion = listaEjemplares.indexOf(ejemplarAux);

        if (posicion==-1){
            System.out.println("El ejemplar indicado no está en la lista de disponibles");
        }else {
            listaEjemplares.get(posicion).alquilar();
            listaEjemplaresAlquilados.add(listaEjemplares.get(posicion));
            listaEjemplares.remove(listaEjemplares.get(posicion));
            System.out.println("Ha alquilado el ejemplar con codigo:" + codigoEjemplar );
        }
    }
    public static void crearEjemplar(ArrayList<Ejemplar> listaEjemplares){
        Scanner tecladoLetras = new Scanner(System.in);
        Scanner tecladoNumeros = new Scanner(System.in);

        int opcion;
        String opcionString;
        String opcionStringRegex="[1-4]";

        do {
            System.out.println("El ejemplar que va a introducir es un 1-Libro, 2-Pelicula, 3-Musica, 4-Salir: ");
            opcionString = tecladoLetras.nextLine();
        }while (!Pattern.matches(opcionStringRegex,opcionString));

        opcion = Integer.parseInt(opcionString);

        System.out.println("Introduce el Titulo:");
        String titulo = tecladoLetras.nextLine();
        System.out.println("Introduce el autor:");
        String autor = tecladoLetras.nextLine();
        System.out.println("Introduce el año de publicacion(dd/MM/yyyy):");
        LocalDate anyo = LocalDate.parse(tecladoLetras.nextLine(),
                DateTimeFormatter.ofPattern("d/M/yyyy"));

        switch (opcion){
            case 1:
                System.out.println("Introduce el numero de paginas:");
                int numeroPaginas = tecladoNumeros.nextInt();
                Libro nuevoLibro = new Libro(titulo,autor,anyo,numeroPaginas);
                listaEjemplares.add(nuevoLibro);
                break;
            case 2:
                System.out.println("Introduce la duracion de la pelicula(minutos):");
                int duracionPelicula = tecladoNumeros.nextInt();
                Pelicula nuevaPelicula = new Pelicula(titulo,autor,anyo,duracionPelicula);
                listaEjemplares.add(nuevaPelicula);
                break;
            case 3:
                System.out.println("Añade el numero de canciones del album:");
                int numeroCanciones = tecladoNumeros.nextInt();
                Musica nuevaMusica = new Musica(titulo,autor,anyo,numeroCanciones);
                listaEjemplares.add(nuevaMusica);
                break;
            case 4:
                break;
        }
    }
}