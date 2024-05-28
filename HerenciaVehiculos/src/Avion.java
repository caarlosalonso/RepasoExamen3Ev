public class Avion extends VehiculoTransporte{
    private boolean conTripulacion;
    private static double precioBaseAvion = 200000;

    public Avion(String modelo, boolean conTripulacion) {
        super(modelo);
        this.conTripulacion = conTripulacion;
    }
    public Avion (String CODIGO_VEHICULO){
        super(CODIGO_VEHICULO);

    }

    @Override
    public String toString() {
        return "Avion: " +
                "conTripulacion=" + conTripulacion +
                super.toString() + ' ';
    }

    @Override
    public void vender() {
        super.vender();
        if (!conTripulacion){
            super.setPrecioVenta(Avion.precioBaseAvion+100000);
            System.out.println("Precio venta: " + super.getPrecioVenta());
        }else {
            super.setPrecioVenta(Avion.precioBaseAvion+300000);
            System.out.println("Precio venta: " + super.getPrecioVenta());
        }
    }
}
