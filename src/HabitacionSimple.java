class HabitacionSimple extends Habitacion{
    private boolean desayunoInlcuido;
    private double costoServicioBasico;

    public HabitacionSimple(String codigo, int noches){
        super(codigo, "Simple",35, noches, true);
        this.desayunoInlcuido = true;
        this.costoServicioBasico = 5;
    }

    //Realizamos sobreescritura
    @Override
    public double calcularHospedaje(){
        return(getTarifaBase()*getNumeroNoches()+costoServicioBasico);
    }

    //Realizamos otra sobreescritura
    @Override
    public void mostrarDetalle(){
        System.out.println("Habitacion simple");
    }
}


