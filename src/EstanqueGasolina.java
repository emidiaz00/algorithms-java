import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la capacidad de litros: ");
        int capacidad = scanner.nextInt();

        if (capacidad == 70) {
            System.out.println("Estanque lleno");
        } else if (capacidad >= 60 && capacidad < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidad >= 40 && capacidad < 60)  {
            System.out.println("Estanque 3/4");
        } else if (capacidad >= 35 && capacidad < 40) {
            System.out.println("Medio estanque");
        } else if (capacidad >= 20 && capacidad < 35) {
            System.out.println("Suficiente");
        } else if (capacidad >= 1 && capacidad < 25) {
            System.out.println("Insuficiente");
        }
    }
}
