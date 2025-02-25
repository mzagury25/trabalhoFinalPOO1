import java.util.Scanner;

abstract class Terminal {
    private String comando;

    public void setComando(String comando) {
        this.comando = comando;
    }

    public String getComando() {
        return comando;
    }
}

public class Sistema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Insira o comando:");  
        String blablabla = console.nextLine(); 

        System.out.println("O comando solicitado foi: " + blablabla);

        // Exemplo de verificação do comando digitado
        if (blablabla.equalsIgnoreCase("sair")) {
            System.out.println("Encerrando o sistema...");
        } else {
            System.out.println("Comando desconhecido.");
        }

        console.close();
    }
}
