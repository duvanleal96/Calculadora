package calculadora;

import java.util.logging.Logger;
import java.util.Scanner;
public class Calculator {
    Logger logger = Logger.getLogger("logger");
    Scanner sc = new Scanner(System.in);
    private double numberone;
    private double numbertwo;
    double result;

    public void operation() {

    }
        public void multiplicacion(){
            result = numberone * numbertwo;
            logger.info(() -> " la multiplicacion de la operacion es " + result);
        }
        public void division(){
            result = numberone / numbertwo;
            logger.info(() -> " la multiplicacion de la operacion es " + result);
        }


}
