package ACCEjercicio1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Libro extends Ejemplar{
    //Atributos
    private final int NUMERO_PAGINAS;

    public Libro(String titulo, String autor, LocalDate fechaPublicacion, int NUMERO_PAGINAS) {
        super(titulo, autor, fechaPublicacion);
        this.NUMERO_PAGINAS = NUMERO_PAGINAS;
    }

    //Metodos
    @Override
    public void alquilar() {
        super.alquilar();
        setFechaDevolucion(LocalDate.now().plusMonths(1));
    }

    @Override
    public void mostrar() {
        System.out.print("Libro: ");
        super.mostrar();
        System.out.println(" Tiene: "+ NUMERO_PAGINAS + " paginas.");

    }
}


