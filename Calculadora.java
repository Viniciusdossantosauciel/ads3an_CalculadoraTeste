import java.util.Scanner;

public class Operacoes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        int n1;
        int n2;
        
        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextInt();
        
        System.out.println();
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2) );
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2) );

        
        
    }
