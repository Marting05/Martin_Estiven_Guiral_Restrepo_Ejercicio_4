import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    
    public Stack<Operacion> RegistarOperacion(Stack<Operacion> pila, Scanner sc, Metodos m){
        sc.nextLine();
        System.out.println("Ingrese tipo de operacion a realizar.");
        String TipoOperacion = sc.nextLine();
        System.out.println("Ingrese el valor a realizar.");
        double valorOperacion = sc.nextDouble();
        while(valorOperacion < 0){
            System.out.println("El valor debe ser un número mayor a cero.");
            System.out.println("Ingrese un valor nuevamente.");
            valorOperacion = sc.nextDouble();            
        }
        Operacion operacion = new Operacion(TipoOperacion, valorOperacion, new Date());
        pila.push(operacion);
        System.out.println("Operación realizada correctamente.");
        return pila;
    }

    public Stack<Operacion> Deshacer(Stack<Operacion> pila){
        if(pila.isEmpty()){
            System.out.println("No hay operaciones registradas.");
        } else {
            Operacion operacion = pila.pop();
            System.out.println("Se elimino la siguiente operación: ");
            MostrarDetalle(operacion);
        }
        return pila;
    }

    public void ConsultarUltimaOperacion(Stack<Operacion> pila) {
        if (pila.isEmpty()) {
            System.out.println("No hay operaciones registradas.");
        } else {
            System.out.println("La ultima operación es:");
            MostrarDetalle(pila.peek());
        }
    }
    
    public void MostrarOperaciones(Stack<Operacion> pila) {
        if (pila.isEmpty()) {
            System.out.println("No hay operaciones registradas.");
        } else {
            System.out.println("Listado de operaciones almacenadas:");
            for (Operacion operacion : pila) {
                MostrarDetalle(operacion);
            }
        }
    } 

    public void MostrarDetalle(Operacion operacion) {
        System.out.println("Número de operación: " + operacion.getNumeroOperacion()
                + " | Tipo: " + operacion.getTipo()
                + " | Valor: " + operacion.getValor()
                + " | Fecha: " + operacion.getFecha());
    }

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor tenga en cuenta que se le esta pidiendo un dato númerico ");
            sc.next();
        }
        return sc.nextInt();
    }    
}
