package builder;

public class Main {
    public static void main(String[] args) {
        ComputadorBasico cb = new ComputadorBasico();
        Computador ruim = cb.criar();
        ComputadorGamer cg = new ComputadorGamer();
        Computador BOLADO = cg.criar();
    }
}
