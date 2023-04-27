package calculadora;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kadu
 */
public class Calculadora {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Double valor1;
        Double valor2;
        String op;
        boolean continuar;
        
       try {
            do {
                System.out.print("Digite o primeiro valor:      ");
                valor1 = sc.nextDouble();
                System.out.print("Qual tipo de operacao sera ( + , - , / *):      ");
                op = sc.next();
                System.out.print("Digite o segundo valor:      ");
                valor2 = sc.nextDouble();
                
                System.out.print("Resultado:  " + RealCal(valor1, valor2, op));
                continuar = VerificarNewOp();
            } while (continuar);
        } catch (InputMismatchException ex) {
            System.out.print("Os valores devem ser numeros");
        }
    }
        
    public static boolean VerificarNewOp() {
        Scanner Scan = new Scanner(System.in);
        System.out.println("\nDeseja fazer nova operacao?  (S ou N)     ");
        return !Scan.nextLine().toUpperCase(Locale.ROOT).equals("N");
        
    }
    
    public static Double RealCal(Double valor1, Double valor2, String op) {
        
        Double RespCal = 0.0;
        
        switch (op) {
            case "+":
                RespCal = valor1 + valor2;
                break;
            case "-":
                RespCal = valor1 - valor2;
                break;
            case "/":
                RespCal = valor1 / valor2;
                break;
            case "*":
                RespCal = valor1 * valor2;
                break;
            
            default:
                System.out.println("\nOperacao e invalida");
                return null;
            
        }
        return RespCal;
    }
}
