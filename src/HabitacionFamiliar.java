class HabitacionFamiliar extends Habitacion{
    private int capacidadPersonas;
    private double descuentoFamiliar;

    public HabitacionFamiliar(String codigo, int noches, int personas){
        super(codigo, "Familiar",60, noches, true);
        this.capacidadPersonas = personas;
        this.descuentoFamiliar = 0.1;
    }

    //Realizamos sobreescritura
    @Override
    public double calcularHospedaje(){
        double subtotal = getTarifaBase()*getNumeroNoches();
        return subtotal = (subtotal*descuentoFamiliar);
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("Habitacion familiar");
    }
}
