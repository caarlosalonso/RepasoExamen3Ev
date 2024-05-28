import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class VehiculoTransporte {
    //Atributos
    private final String CODIGO_VEHICULO;
    private final String MODELO;
    private LocalDate fechaVenta;
    private Double precioVenta;
    private static int contadorVehiculo=1;
    private static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd 'de' MMMM 'del' yyyy ");

    public VehiculoTransporte(String modelo) {

            this.CODIGO_VEHICULO = "VEH" + String.format("%05d", contadorVehiculo++);
            this.MODELO = modelo;
            this.fechaVenta = null;
            this.precioVenta = null;

    }

    //Metodos
    @Override
    public String toString() {
        if (precioVenta!=null) {
            return "Codigo: " + CODIGO_VEHICULO + "\n" +
                    "Modelo: " + MODELO + "\n" +
                    "Fecha venta: " + fechaVenta.format(formato) + "\n" +
                    "Precio Venta: " + precioVenta;
        }else {
            return  "Codigo: " + CODIGO_VEHICULO + "\n" +
                    "Modelo: " + MODELO + "\n" +
                    "ESTE VEHICULO AUN NO HA SIDO VENDIDO";
        }
    }
    public void vender(){this.fechaVenta = LocalDate.now();}
    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehiculoTransporte)) return false;
        VehiculoTransporte that = (VehiculoTransporte) o;
        return Objects.equals(CODIGO_VEHICULO, that.CODIGO_VEHICULO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CODIGO_VEHICULO);
    }
}
