import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        
        String nome = scanner.nextLine();
    
        System.out.println("Olá, " + nome + "!");
       
        scanner.close();
    }
}
