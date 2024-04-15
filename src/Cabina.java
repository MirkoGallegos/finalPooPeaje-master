public class Cabina {
    private int id;
    private MedioDePago medioDePago;
    private int diasDemora;

    public Cabina(int id, MedioDePago medioDePago) {
        this.id = id;
        this.medioDePago = medioDePago;
    }

    public int getId() {
        return id;
    }

    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

    public int getDiasDemora() {
        return diasDemora;
    }

    public void setDiasDemora(int diasDemora) {
        this.diasDemora = diasDemora;
    }

    public double calcularImporte(Vehiculo vehiculo, int hora) {
        double tarifaBase = vehiculo.getTipo().getTarifaBase();

        if ((hora >= 6 && hora <= 10) || (hora >= 17 && hora <= 20)) {
            tarifaBase *= 1.08; // Incremento del 8% en horario pico
        }

        double descuento = medioDePago.getDescuento(diasDemora);
        double importe = tarifaBase * (1 - descuento);

        return importe;
    }
}