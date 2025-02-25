// 1. Criar classes auxiliares para manipular comandos (CommandHandler),
// arquivos (FileManager) e diretórios (DirectoryManager).
// 2. Utilizar herança e polimorfismo para gerenciar diferentes comandos.
// 3. Implementar persistência simples (salvar histórico em .txt).


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;


abstract class Terminal {
    private String comando;

    public void setComando(String comando) {
        this.comando = comando;
    }

    public String getComando() {
        return comando;
    }
}

abstract class CommandHandler extends Terminal {
    
}

abstract class FileManager extends Terminal {
    
}

abstract class DirectoryManager extends Terminal{
    
}

public class Sistema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Insira o comando:");  
        String userInput = console.nextLine(); 

        // System.out.println("O comando solicitado foi: " + userInput);

        if (userInput.equals("ls")) {

            System.out.println("Aqui a listagem do sistema");
        }

        console.close();
    }
}
