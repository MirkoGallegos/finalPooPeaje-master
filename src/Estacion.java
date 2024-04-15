import java.util.*;
public class Estacion {
    private int id;
    private String descripcion;
    private Cabina[] cabinas;

    public Estacion(int id, String descripcion, Cabina[] cabinas) {
        this.id = id;
        this.descripcion = descripcion;
        this.cabinas = cabinas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCabinasEfectivo() {
        int count = 0;
        for (Cabina cabina : cabinas) {
            if (cabina.getMedioDePago() == MedioDePago.EFECTIVO) {
                count++;
            }
        }
        return count;
    }

    public int dameHoraActual() {
        return new Random().nextInt(24); // Genera un número aleatorio entre 0 y 23 para la hora actual
    }
}