package ACCEjercicio1;

import java.time.LocalDate;

public class Pelicula extends Ejemplar{
    //Atributos
    private final int DURACION_PELICULA;

    //Constructor
    public Pelicula(String titulo, String autor, LocalDate fechaPublicacion, int duracionPelicula) {
        super(titulo, autor, fechaPublicacion);
        this.DURACION_PELICULA = duracionPelicula;
    }

    //Metodos
    @Override
    public void alquilar() {
        super.alquilar();
        setFechaDevolucion(LocalDate.now().plusWeeks(2));
    }

    @Override
    public void mostrar() {
        System.out.print("Pelicula: ");
        super.mostrar();
        System.out.println(" Dura: " + DURACION_PELICULA + " minutos.");
    }
}
