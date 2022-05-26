package calculadora;

import java.util.logging.Logger;
import java.util.Scanner;

/**
 * Clase Calculator
 * Esta clase permite realizar las operaciones basicas de suma, resta , multiplicación y División
 *
 * @Author: Duvan Leal - John Acevedo
 * @Version: v1-25/05/22
 */
public class Calculator {

    Logger logger = Logger.getLogger("logger");
    Scanner sc = new Scanner(System.in);
    /**
     * @Param numberone
     * Representa el primer valor de la operación
     */
    private double numberone;

    /**
     * @Param numbertwo
     * Representa el segundo valor de la operación
     */
    private double numbertwo;
    /**
     * @Param result
     * Representa el primer valor del resultado luego de realziada la operación
     */
    double result;

    /**
     * Método operation()
     * Este método es el encargado de pedir los valores y realizar el respectivo llamado a las operaciones
     */
    public void operation() {
        int op;
        do {
            logger.info(() -> "--- CALCULADORA - SIGA LAS INSTRUCCIONES POR FAVOR ---");
            logger.info(() -> "ingrese el primer valor: ");
            numberone = sc.nextDouble();
            logger.info(() -> "ingrese el segundo valor: ");
            numbertwo = sc.nextDouble();
            logger.info(() -> "¿Que operacion desea realizar o Salir? \n 1. suma \n 2. resta \n 3. multiplicacion \n 4. division \n 5. salir ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    sum();
                    break;
                case 2:
                    rest();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                default:
                    logger.info(() -> "operador no valido");
                    break;
            }
        } while (op != 5);
    }

    /**
     * Método sum()
     * Este método permite realizar la operación suma con los valores ingresados por el usuario
     */
    public void sum() {
        result = numberone + numbertwo;
        logger.info(() -> " la suma de la operacion es " + result);
    }

    /**
     * Método rest()
     * Este método permite realizar la operación resta con los valores ingresados por el usuario
     */
    public void rest() {
        result = numberone - numbertwo;
        logger.info(() -> " la resta de la operacion es " + result);
    }

    /**
     * Método multiplication()
     * Este método permite realizar la operación multiplicación con los valores ingresados por el usuario
     */
    public void multiplication() {
        result = numberone * numbertwo;
        logger.info(() -> " la multiplicacion de la operacion es " + result);
    }

    /**
     * Método division()
     * Este método permite realizar la operación división con los valores ingresados por el usuario
     */
    public void division() {
        result = numberone / numbertwo;
        logger.info(() -> " la multiplicacion de la operacion es " + result);
    }

}
