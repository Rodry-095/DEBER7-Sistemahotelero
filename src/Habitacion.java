abstract class Habitacion {
    private String codigo;
    private String tipoHabitacion;
    private double tarifaBase;
    private int numeroNoches;
    private boolean disponible;

    //Constructor
    public Habitacion(String codigo, String tipoHabitacion, double tarifaBase, int numeroNoches, boolean disponible){
        this.codigo = codigo;
        this.tipoHabitacion = tipoHabitacion;
        setTarifaBase(tarifaBase);
        setNumeroNoches(numeroNoches);
        this.disponible = disponible;
    }

    //Getters mas setters con validacion
    public double getTarifaBase(){
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase){
        if(tarifaBase >0){
            this.tarifaBase = tarifaBase;
        }
    }

    public int getNumeroNoches(){
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches){
        if(numeroNoches>0){
            this.numeroNoches = numeroNoches;
        }
    }

    public boolean verificarDisponibilidad(){
        return disponible;
    }

    //Añadimos los metodos abstractos
    public abstract double calcularHospedaje();
    public abstract void mostrarDetalle();
}
