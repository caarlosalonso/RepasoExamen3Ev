package ACCEjercicio1;

import java.time.LocalDate;

public class Musica extends Ejemplar{
    //Atributos
    private final int NUMERO_CANCIONES;

    //Constructor
    public Musica(String titulo, String autor, LocalDate fechaPublicacion, int NUMERO_CANCIONES) {
        super(titulo, autor, fechaPublicacion);
        this.NUMERO_CANCIONES = NUMERO_CANCIONES;
    }

    @Override
    public void alquilar() {
        super.alquilar();
        setFechaDevolucion(LocalDate.now().plusDays(5));
    }

    @Override
    public void mostrar() {
        System.out.print("Musica: ");
        super.mostrar();
        System.out.println(" Tiene: " +NUMERO_CANCIONES+ " canciones en el album.");
    }
}
