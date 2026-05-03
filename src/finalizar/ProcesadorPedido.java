package finalizar;

public class ProcesadorPedido {
    public double p; // Campo público (mal diseño)

    public void c(double precioBase) {
        // Cálculo del IVA
        double i = precioBase * 0.21;
        // Suma total
        p = precioBase + i;
        System.out.println("El total es: " + p);
    }
}
