import java.util.Date;

public class Operacion {
    private static int nextOperacion = 1;
    private int NumeroOperacion;
    private String Tipo;
    private double Valor;
    private Date Fecha;
    
    public Operacion(String tipo, double valor, Date fecha) {
        NumeroOperacion = nextOperacion++;
        Tipo = tipo;
        Valor = valor;
        Fecha = fecha;
    }

    public Operacion() {
    }

    public static int getNextOperacion() {
        return nextOperacion;
    }

    public static void setNextOperacion(int nextOperacion) {
        Operacion.nextOperacion = nextOperacion;
    }
    
    public int getNumeroOperacion() {
        return NumeroOperacion;
    }

    public void setNumeroOperacion(int NumeroOperacion) {
        this.NumeroOperacion = NumeroOperacion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
}
