public enum MedioDePago {
    SUBE("Sube", 0.10),
    PASE("Pase", 0.15, 0.12),
    EFECTIVO("Efectivo", 0);

    private final String descripcion;
    private final double descuentoMenos5Dias;
    private final double descuentoMas5Dias;

    private MedioDePago(String descripcion, double descuentoMenos5Dias) {
        this.descripcion = descripcion;
        this.descuentoMenos5Dias = descuentoMenos5Dias;
        this.descuentoMas5Dias = descuentoMenos5Dias;
    }

    private MedioDePago(String descripcion, double descuentoMenos5Dias, double descuentoMas5Dias) {
        this.descripcion = descripcion;
        this.descuentoMenos5Dias = descuentoMenos5Dias;
        this.descuentoMas5Dias = descuentoMas5Dias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getDescuento(int diasDemora) {
        if (diasDemora < 5) {
            return descuentoMenos5Dias;
        } else {
            return descuentoMas5Dias;
        }
    }
}