package LISTAREVISAOJAVA;
import java.util.Scanner;

public class GestaoSubmarino {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nValor do repasse anual: ");
        double valor = Double.parseDouble(entrada.nextLine());
        
        if (valor < 0.5) {
            System.out.println("\nALERTA: Risco de paralição total. Data estimada: 2045");

        } 
        else if (valor >= 0.5 && valor <= 1.0) {
            System.out.println("\nRitmo lento: Finalização prevista para 2037.");
            
        }
        else {
            System.out.println("\nProjeto acelerado: Possibilidade de antecipação da entrega.");

        }

        System.out.print("\nNível de acesso: ");
        String nivel = entrada.nextLine();

        System.out.print("\ninforme o país: ");
        String pais = entrada.nextLine();

        if (nivel.equalsIgnoreCase("TOTAL") && !pais.equalsIgnoreCase("Brasil")){
           System.out.println("\nACESSO NEGADO: Soberania Nacional preservada. Dados criptografados.");
        }
        else if(pais.equalsIgnoreCase("Brasil")){
            System.out.println("Acesso autorizado ao Almirantado.");
        }

        System.out.print("Informe a temperatura atual do reator (ºC): ");
        double temperatura = entrada.nextDouble();

        System.out.print("Status: ");

        if (temperatura < 280.0) {
            System.out.println("Aumentar potência do reator");
        }
        else if (temperatura >= 280.0 && temperatura <= 350.0) {
            System.out.println("Operação Normal - Cruzeiro");
        }
        else {
            System.out.println("EMERGÊNCIA: Acionar sistema de resfriamente e emergência");
        }
        entrada.close();

        }
    }
