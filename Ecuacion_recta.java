public class Ecuacion_recta {
    public static void main() {
    }
    public static void ecuacionRecta ( double[] a, double[] b){
        double m = (b[1] - a[1]) / (b[0] - a[0]);
        double coeficiente = m * (-a[0]) + a[1];
        System.out.println("La ecuación de la recta es: Y = " + m + "x" + coeficiente);

    }
}
