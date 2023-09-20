import java.awt.datatransfer.SystemFlavorMap;
import java.awt.geom.Arc2D;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora2 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        double numerador=1;
        double denominador=1;
        double a = 0;
        double b=0;
        double base, exponente;
        double numero,porcentaje;
        boolean valorvalido=false;

        do {
            try {
                menuOperationAritmetic();
                System.out.println("Ingrese una opción: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        do {
                            try {
                                System.out.println("Ingrese el primer número: ");
                                a = sc.nextDouble();
                                System.out.println("Ingrese el segundo número: ");
                                b = sc.nextDouble();
                                valorvalido = true;

                            } catch (InputMismatchException e) {
                                System.err.println("Ingrese valores doubles para el método suma");
                                sc.nextLine();
                            }
                        } while (!valorvalido);
                        System.out.println("La suma es: " + suma(a, b));
                        break;
                    case 2:
                        do {
                            try {
                                System.out.println("Ingrese el primer número: ");
                                a = sc.nextDouble();
                                System.out.println("Ingrese el segundo número: ");
                                b = sc.nextDouble();
                                valorvalido = true;

                            } catch (InputMismatchException e) {
                                System.err.println("Ingrese valores doubles para el método resta");
                                sc.nextLine();
                            }
                        } while (!valorvalido);
                        System.out.println("La resta es: " + resta(a, b));
                        break;
                    case 3:
                        do{
                            try {
                                System.out.println("Ingrese el primer número: ");
                                a = sc.nextDouble();
                                System.out.println("Ingrese el segundo número: ");
                                b = sc.nextDouble();
                                valorvalido = true;
                            }catch (InputMismatchException e) {
                                System.err.println("Ingrese valores doubles para el método multiplicación");
                                sc.nextLine();
                            }
                        } while (!valorvalido);
                        System.out.println("La multiplicación es: " + multi(a, b));

                        break;
                    case 4:

                        do {
                            try {
                                System.out.println("Ingrese el primer número: ");
                                numerador = sc.nextDouble();
                                System.out.println("Ingrese el segundo número: ");
                                denominador = sc.nextDouble();
                                validaciondenominador(denominador);
                                valorvalido = true;

                            } catch (InputMismatchException e) {
                                System.err.println("Debes ingresar valores doubles para el método división");
                                sc.nextLine();
                            } catch (ArithmeticException e) {
                                System.err.println("El denominador no puede ser 0");
                                sc.nextLine();
                            }
                        }
                        while (!valorvalido);
                        System.out.println("La división es: " + divi(numerador, denominador));
                        break;
                    case 5:
                        do {
                            try {
                                System.out.println("Ingrese el primer número: ");
                                a = sc.nextDouble();
                                System.out.println("Ingrese el segundo número: ");
                                b = sc.nextDouble();

                                valorvalido = true;
                            } catch (InputMismatchException e) {
                                System.err.println("Debes ingresar valores doubles para el método max");
                                sc.nextLine();
                            }


                        } while (!valorvalido);
                        System.out.println("El valor máximo es: " + max(a, b));
                        break;
                    case 6:
                        do {
                            try {
                                System.out.println("Ingrese el primer número: ");
                                a = sc.nextDouble();
                                System.out.println("Ingrese el segundo número: ");
                                b = sc.nextDouble();
                                System.out.println("El mínimo es: " + min(a, b));
                            } catch (InputMismatchException e) {
                                System.err.println("Debes ingresar valores doubles para el método min");
                                sc.nextLine();
                            }
                        } while (!valorvalido);
                        System.out.println("El valor mínimo es: " + min(a, b));
                        break;
                    case 7:
                        do {
                            System.out.println("Ingrese el primer número: ");
                            base = sc.nextDouble();
                            System.out.println("Ingrese el segundo número: ");
                            exponente = sc.nextDouble();
                            try {
                                validacionBaseExponente(base, exponente);
                                System.out.println("La potencia es: " + power(base, exponente));
                            } catch (IllegalArgumentException e) {
                                System.err.println(e.getMessage());
                            }
                        } while (base == 0 && exponente == 0);
                        break;
                    case 8:
                        do {
                            System.out.println("Ingrese el primer número: ");
                            numero = sc.nextDouble();
                            System.out.println("Ingrese el segundo número: ");
                            porcentaje = sc.nextDouble();
                            try {
                                validacionporcentaje(porcentaje);
                                System.out.println("El porcentaje es: " + percentage(numero, porcentaje));
                            } catch (IllegalArgumentException e) {
                                System.err.println(e.getMessage());
                            }
                        } while (porcentaje < 0);
                        break;


                    case 9:
                        System.out.println("Hasta pronto");
                        break;

                    default:
                        System.out.println("Opción incorrecta");


                }

            }catch (InputMismatchException e) {
                System.err.println("La opción ingresada no es válida");
                sc.nextLine();
            }


        }while (opcion != 9) ;




    }
    public static void menuOperationAritmetic () {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Máximo");
            System.out.println("6. Mínimo");
            System.out.println("7. Potencia");
            System.out.println("8. Porcentaje");
            System.out.println("9. Salir");
        }

        public static double suma ( double a, double b){

            return a + b;
        }


        public static double resta ( double a, double b){
            return a - b;
        }
        public static double multi ( double a, double b) {
            return a * b;
        }
        public static double divi ( double a, double b){

            return a / b;

        }
        public static ArithmeticException validaciondenominador ( double b) {
            if (b == 0) {
                throw new ArithmeticException("El denominador no puede ser 0");
            } else {
                return null;
            }
        }
        public static double max ( double a, double b){

                if (a >= b) {
                    return a;

                } else {
                    return b;

                }

        }
        public static double min ( double a, double b){
            if (a <= b) {
                return a;
            } else {
                return b;
            }

        }
        public static double power ( double a, double b){
            return Math.pow(a, b);

        }


        public static IllegalArgumentException validacionBaseExponente ( double a, double b){
            if (a == 0 && b == 0) {
                throw new IllegalArgumentException("La base y el exponenete no pueden ser 0 simultaneamente");

            } else {
                return null;
            }
        }
        public static double percentage ( double a, double b){
            return a * (b / 100);

        }
        public static IllegalArgumentException validacionporcentaje(double b){
        if(b < 0){
            throw new IllegalArgumentException("El porcentaje a calcular no puede ser negativo");
        }else {
            return null;
            }
        }



       /* public static boolean aNoEsCero ( double a){
            if (a == 0) {
                return false;
            } else {
                return true;
            }
        }*/
        /*public static boolean determinanteNegativo ( double b, double a, double c){

            double determinante = Math.pow(b, 2) - 4 * a * c;
            if (determinante < 0) {
                return false;
            } else {
                return true;
            }
        }*/

        /*public static double[] solucionCuadratica ( double a, double b, double c){
            double determinante = Math.pow(b, 2) - 4 * a * c;
            double x1 = (-b + Math.sqrt(determinante)) / (2 * a);
            double x2 = (-b - Math.sqrt(determinante)) / (2 * a);
            return new double[]{x1, x2};*/
        //}


    public static boolean esDouble ( Object n){
        return n instanceof Double;
    }
    }
    class ValorNoDoubleException extends Exception {
    public ValorNoDoubleException(String mensaje){
        super(mensaje);
    }


}
