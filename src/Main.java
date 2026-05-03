import java.util.Scanner;

public class Main{
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del huésped: ");
        String nombre = sc.nextLine();

        System.out.print("Número de noches: ");
        int noches = sc.nextInt();

        System.out.println("Tipo de habitación (1.Simple 2.Suite 3.Familiar): ");
        int tipo = sc.nextInt();

        Habitacion hab = null;

        switch (tipo) {
            case 1:
                hab = new HabitacionSimple("H1", noches);
                break;
            case 2:
                hab = new Suite("H2", noches);
                break;
            case 3:
                System.out.print("Cantidad de personas: ");
                int personas = sc.nextInt();
                hab = new HabitacionFamiliar("H3", noches, personas);
                break;
        }

        if (hab != null && hab.verificarDisponibilidad()) {

            double subtotal = hab.calcularHospedaje();

            //Descuento
            double descuento = 0;
            if (noches > 5) {
                descuento = subtotal * 0.10;
            }

            //IVA
            double iva = (subtotal - descuento) * 0.15;

            double total = subtotal - descuento + iva;

            //Factura
            System.out.println("\n----FACTURA----");
            System.out.println("Huésped: " + nombre);
            hab.mostrarDetalle();
            System.out.println("Noches: " + noches);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("IVA: $" + iva);
            System.out.println("TOTAL: $" + total);
        } else {
            System.out.println("Habitación no disponible");
        }

        sc.close();
    }
}
