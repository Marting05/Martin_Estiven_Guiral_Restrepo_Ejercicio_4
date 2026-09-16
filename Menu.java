import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Operacion> pila = new Stack<>();
        Metodos m = new Metodos();
        boolean continuar = true;
        while (continuar) { 
            System.out.println("Bienvenidos al Banco de bogota");
            System.out.println("Que desea realizar");
            System.out.println("1) Registrar una operación.");
            System.out.println("2) Deshacer la última operación.");
            System.out.println("3) Consultar la última operación realizada.");
            System.out.println("4) Mostrar todas las operaciones almacenadas.");
            System.out.println("5) Salir ");

            int opt = m.ValidarEntero(sc);
            switch (opt) {
                case 1:
                    pila = m.RegistarOperacion(pila, sc, m);
                    break;
                case 2:
                    pila = m.Deshacer(pila);
                    break;
                case 3:
                    m.ConsultarUltimaOperacion(pila);
                    break;
                case 4:
                    m.MostrarOperaciones(pila);
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;
 
                default:
                    System.out.println("esta opcion no existe");
                    break;
            }            
        }
        sc.close();
    }
}
