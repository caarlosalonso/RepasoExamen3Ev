package ACCEjercicio1;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Ejemplar {
    //Atributos
    private final String CODIGO;
    private final String TITULO;
    private final String AUTOR;
    private final LocalDate FECHA_PUBLICACION;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private static int numeroEjemplares=1;
    private static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");

    //Constructor
    public Ejemplar(String titulo, String autor, LocalDate fechaPublicacion) {
        this.CODIGO = "BIB" + String.format("%05d",numeroEjemplares++);
        this.TITULO = titulo;
        this.AUTOR = autor;
        this.FECHA_PUBLICACION = fechaPublicacion;
    }
    public Ejemplar(String CODIGO){
        this.CODIGO=CODIGO;
        this.TITULO = null;
        this.AUTOR = null;
        this.FECHA_PUBLICACION = null;
    }

    //Metodos
    public void alquilar(){
        this.fechaPrestamo = LocalDate.now();
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void mostrar(){
        System.out.print(
                "Titulo: "+ TITULO  +
                ", Autor: " + AUTOR +
                ", Fue publicado hace: " + ChronoUnit.YEARS.between(FECHA_PUBLICACION,LocalDate.now()) + " años."
        );
    }

    public void mostrarAmpliado(){

        System.out.println(
                "Codigo: " + CODIGO +
                ", Titulo: "+ TITULO +
                ", Autor: " + AUTOR +
                ", Fecha publicacion: " + FECHA_PUBLICACION +
                ", Fecha prestamo: "+ fechaPrestamo +
                ", Fecha devolucion: " + fechaDevolucion
        );
        if (fechaPrestamo==null){
            System.out.println("El ejemplar está disponible para alquilar");
            System.out.println();
        }else{
            System.out.println("El ejemplar se alquilo el: " + fechaPrestamo.format(formato));
            System.out.println("Con fecha de devolucion: " + fechaDevolucion.format(formato));
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ejemplar)) return false;
        Ejemplar ejemplar = (Ejemplar) o;
        return Objects.equals(CODIGO, ejemplar.CODIGO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CODIGO);
    }
}

