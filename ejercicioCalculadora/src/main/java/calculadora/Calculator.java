package calculadora;

import java.util.logging.Logger;
import java.util.Scanner;
public class Calculator {
    Logger logger = Logger.getLogger("logger");
    Scanner sc = new Scanner(System.in);
    private double numberone;
    private double numbertwo;
     double result;

    public void operation(){
        int op;
        logger.info(()->"ingrese el primer valor ");
        numberone=sc.nextDouble();
        logger.info(()->"ingrese el segundo valor ");
        numbertwo=sc.nextDouble();
        do {
            logger.info(()->"¿Que operacion desea realizar \n 1. suma \n 2. resta \n 3. multiplicacion \n 4. division \n 5. salir" );
             op= sc.nextInt();
             switch (op){
                 case 1:
                     sum();
                     break;
                 case 2:
                     rest();
                     break;
                 default:
                     logger.info(()->"operador no valido");
                     break;
             }
        }while (op!=5);
    }

    public void sum(){
        result=numberone+numbertwo;
        logger.info(()->" la suma de la operacion es " + result);
    }
    public void rest(){
        result=numberone-numbertwo;
        logger.info(()->" la resta de la operacion es " + result);
    }
}
