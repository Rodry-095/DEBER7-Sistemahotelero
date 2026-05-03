class Suite extends Habitacion{
    private boolean jacuzzi;
    private double servicioPremiun;

    public Suite(String codigo, int noches){
        super(codigo, "Suite", 80, noches, true);
        this.jacuzzi = true;
        this.servicioPremiun = 20;
    }

    //Realizamos sobreescritura
    @Override
    public double calcularHospedaje(){
        return(getTarifaBase()*getNumeroNoches()+servicioPremiun);
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("Suite con servicios premiun");
    }
}
