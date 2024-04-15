import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cabina cabina1 = new Cabina(1, MedioDePago.SUBE);
        Cabina cabina2 = new Cabina(2, MedioDePago.PASE);
        Cabina cabina3 = new Cabina(3, MedioDePago.EFECTIVO);
        Cabina cabina4 = new Cabina(4, MedioDePago.EFECTIVO);

        Cabina[] cabinas = {cabina1, cabina2, cabina3, cabina4};

        Estacion estacion = new Estacion(1, "Estacion Panamericana / RUTA 202", cabinas);

        Autopista autopista = new Autopista(new Estacion[]{estacion});

        int horaActual = estacion.dameHoraActual();

        System.out.println("Bienvenido a la " + estacion.getDescripcion());
        System.out.println("Hora actual: " + horaActual);

        Vehiculo vehiculoCabina1 = new Vehiculo("AB123CD", TipoVehiculo.MOTO);
        Vehiculo vehiculoCabina2 = new Vehiculo("XY456ZW", TipoVehiculo.AUTO);
        Vehiculo vehiculoCabina3 = new Vehiculo("KL789MN", TipoVehiculo.CAMION);
        Vehiculo vehiculoCabina4 = new Vehiculo("ZA856NB", TipoVehiculo.MOTO);


        for(int i = 0; i<cabinas.length; i++){
            if(cabinas[i].getMedioDePago().getDescripcion().equals("Pase")){
                // Genera un número aleatorio entre 1 y 10 para los días de demora
                int diasDemoraPase = new Random().nextInt(10) + 1;
                cabinas[i].setDiasDemora(diasDemoraPase);
            }
        }

        double importeCabina1 = cabina1.calcularImporte(vehiculoCabina1, horaActual);
        double importeCabina2 = cabina2.calcularImporte(vehiculoCabina2, horaActual);
        double importeCabina3 = cabina3.calcularImporte(vehiculoCabina3, horaActual);
        double importeCabina4 = cabina4.calcularImporte(vehiculoCabina4, horaActual);

        System.out.println("Cabina " + cabina1.getId() + "- Metodo de pago: " + cabina1.getMedioDePago().getDescripcion()
            + " - Vehículo " + vehiculoCabina1.getTipo().getDescripcion() + " - patente: "+ vehiculoCabina1.getPatente()
            +" - Importe a pagar: $" + importeCabina1);

        System.out.println("Cabina " + cabina2.getId() + "- Metodo de pago: " + cabina2.getMedioDePago().getDescripcion()
            + " - Vehículo " + vehiculoCabina2.getTipo().getDescripcion() + " - Patente: "+ vehiculoCabina2.getPatente()
            +" - Importe a pagar: $" + importeCabina2 + " - Días de demora para el Pase: " + cabina2.getDiasDemora());

        System.out.println("Cabina " + cabina3.getId() + "- Metodo de pago: " + cabina3.getMedioDePago().getDescripcion()
            + " - Vehículo " + vehiculoCabina3.getTipo().getDescripcion() + "- patente: "+ vehiculoCabina3.getPatente()
            +" - Importe a pagar: $" + importeCabina3);

        System.out.println("Cabina " + cabina4.getId() + "- Metodo de pago: " + cabina4.getMedioDePago().getDescripcion()
            + " - Vehículo " + vehiculoCabina4.getTipo().getDescripcion() + "- patente: "+ vehiculoCabina4.getPatente()
            +" - Importe a pagar: $" + importeCabina4);

        int cabinasEfectivo = estacion.getCabinasEfectivo();
        System.out.println("Número de cabinas que aceptan efectivo: " + cabinasEfectivo);
    }
}