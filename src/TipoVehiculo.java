public enum TipoVehiculo {
        AUTO("Auto", 10.0),
        MOTO("Moto", 8.0),
        CAMION("Camión", 20.0);

        private final String descripcion;
        private double tarifaBase;

        private TipoVehiculo(String descripcion, double tarifaBase) {
                this.descripcion = descripcion;
                this.tarifaBase = tarifaBase;
        }

        public String getDescripcion() {
                return descripcion;
        }

        public double getTarifaBase() {
                return tarifaBase;
        }
}