public class Vehiculo {
    private String patente;
    private TipoVehiculo tipo;

    public Vehiculo(String patente, TipoVehiculo tipo) {
        this.patente = patente;
        this.tipo = tipo;
    }

    public String getPatente() {
        return patente;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }
}