import java.util.InputMismatchException;
import java.util.Scanner;

public class Operatorias_Elementales {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        double numerador=1;
        double denominador=1;
        double base=1;
        double exponente=1;
        double a = 0;
        double b=0;
        double numero=1;
        double porcentaje=1;
        boolean valorvalido=false;

        do {
            System.out.println("Biendevenido/a a el área de las Operatorias Elementales");
            menuOperationAritmetic();
            System.out.println("Ingrese una opción: ");
            String input = sc.next();
            try{
                opcion=Integer.parseInt(input);
            }catch(NumberFormatException e){
                System.err.println("Ingrese un número entero");
                continue;

            } switch (opcion) {
                case 1:
                    do {
                        try {
                            System.out.println("Ingrese el primer número: ");
                            a = sc.nextDouble();
                            System.out.println("Ingrese el segundo número: ");
                            b = sc.nextDouble();
                            valorvalido = true;
                            System.out.println("La suma es: " + suma(a, b));

                        } catch (InputMismatchException e) {
                            System.err.println("Ingrese valores doubles para el método suma");
                            //System.out.println(valorvalido);
                            sc.nextLine();
                        }
                    } while (!valorvalido);
                    valorvalido=false;
                    break;
                case 2:
                    do {
                        try {
                            System.out.println("Ingrese el primer número: ");
                            a = sc.nextDouble();
                            System.out.println("Ingrese el segundo número: ");
                            b = sc.nextDouble();
                            valorvalido = true;
                            System.out.println("La resta es: " + resta(a, b));

                        } catch (InputMismatchException e) {
                            System.err.println("Ingrese valores doubles para el método resta");
                            sc.nextLine();
                        }
                    } while (!valorvalido);
                    valorvalido=false;
                    break;
                case 3:
                    do{
                        try {
                            System.out.println("Ingrese el primer número: ");
                            a = sc.nextDouble();
                            System.out.println("Ingrese el segundo número: ");
                            b = sc.nextDouble();
                            valorvalido = true;
                            System.out.println("La multiplicación es: " + multi(a, b));

                        }catch (InputMismatchException e) {
                            System.err.println("Ingrese valores doubles para el método multiplicación");
                            // System.out.println(valorvalido);
                            sc.nextLine();
                        }
                    } while (!valorvalido);
                    valorvalido=false;
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
                            System.out.println("La división es: " + divi(numerador, denominador));
                        } catch (InputMismatchException e) {
                            System.err.println("Debes ingresar valores doubles para el método división");
                            sc.nextLine();
                        } catch (ArithmeticException e) {
                            System.err.println("El denominador no puede ser 0");
                            sc.nextLine();
                        }
                    }
                    while (!valorvalido);
                    valorvalido=false;
                    break;
                case 5:
                    do {
                        try {
                            System.out.println("Ingrese el primer número: ");
                            a = sc.nextDouble();
                            System.out.println("Ingrese el segundo número: ");
                            b = sc.nextDouble();
                            valorvalido = true;
                            System.out.println("El valor máximo es: " + max(a, b));
                        } catch (InputMismatchException e) {
                            System.err.println("Debes ingresar valores doubles para el método max");
                            sc.nextLine();
                        }
                    } while (!valorvalido);
                    valorvalido=false;
                    break;
                case 6:
                    do {
                        try {
                            System.out.println("Ingrese el primer número: ");
                            a = sc.nextDouble();
                            System.out.println("Ingrese el segundo número: ");
                            b = sc.nextDouble();
                            valorvalido=true;
                            System.out.println("El valor mínimo es: " + min(a, b));
                        } catch (InputMismatchException e) {
                            System.err.println("Debes ingresar valores doubles para el método min");
                            sc.nextLine();
                        }
                    } while (!valorvalido);
                    valorvalido=false;
                    break;
                case 7:
                    do {
                        try {
                            System.out.println("Ingrese el primer número: ");
                            base = sc.nextDouble();
                            System.out.println("Ingrese el segundo número: ");
                            exponente = sc.nextDouble();
                            valorvalido=true;
                            Base0ExponenteNegativo.base0ExponenteNegativo(base, exponente);
                            System.out.println("El resultado de la potencia es: "+power(base,exponente));
                        }catch(InputMismatchException e2){
                            System.err.println("Ingrese valores doubles para el método potencia");
                            System.out.println(valorvalido);
                            sc.nextLine();
                        }catch(ArithmeticException e3) {
                            System.err.println(e3.getMessage());
                            sc.nextLine();
                        }
                    } while (base == 0 && exponente <= 0 || !(valorvalido));
                    valorvalido=false;
                    break;
                case 8:
                    do {
                        try {
                            System.out.println("Ingrese el primer número: ");
                            numero = sc.nextDouble();
                            System.out.println("Ingrese el segundo número: ");
                            porcentaje = sc.nextDouble();
                            validacionporcentaje(porcentaje);
                            valorvalido=true;
                            System.out.println("El porcentaje es: " + percentage(numero, porcentaje));
                        } catch (IllegalArgumentException e) {
                            System.err.println(e.getMessage());
                            sc.nextLine();
                        }catch(InputMismatchException e){
                            System.err.println("Ingrese valores doubles para el método porcentaje");
                            sc.nextLine();
                        }
                    } while (porcentaje < 0 && porcentaje > 100 ||!(valorvalido));
                    valorvalido=false;
                    break;


                case 9:
                    System.out.println("Hasta pronto");
                    break;

                default:
                    System.out.println("Opción incorrecta");


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
        if(b < 0 || b > 100){
            throw new IllegalArgumentException("El porcentaje a calcular no puede ser negativo o mayor al 100%");
        }else {
            return null;
        }
    }




    class Base0ExponenteNegativo extends Exception {
        public static ArithmeticException base0ExponenteNegativo (double base, double exponente) {
            if (base == 0 && exponente <=0){
                throw new ArithmeticException("La base no puede ser 0 ni el exponente menor o igual 0");
            }

            return null;
        }
    }


}