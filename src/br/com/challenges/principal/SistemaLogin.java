package br.com.challenges.principal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaLogin {
    private static Map<String, String> cadastros = new HashMap<>();

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        cadastros.put("Endrews", "123");
        while (true) {
            System.out.println("Seja bem-vindo(a)");
            System.out.println("Digite seu login, ou 'Sair' para sair do seu Login: ");
            String nomeCadastro = leitura.nextLine();
            if (nomeCadastro.equalsIgnoreCase("sair")) {
                System.out.println("Saindo do programa. Até mais!");
                break;
            }
            if (cadastros.containsKey(nomeCadastro)) {
                System.out.println("Digite sua senha: ");
                String senha = leitura.nextLine();
                if (senha.equals(cadastros.get(nomeCadastro))) {
                    System.out.println("Bem vindo! Login bem-sucedido!");
                    System.out.println("Deseja trocar sua senha?(sim/não)");
                    String trocaSenha = leitura.nextLine();
                    if (trocaSenha.equalsIgnoreCase("sim")) {
                        System.out.println("Digite sua nova senha: ");
                        String novaSenha = leitura.nextLine();
                        cadastros.put(nomeCadastro, novaSenha);
                        System.out.println("Senha alterada com sucesso!");
                    } else {
                        System.out.println("Programa encerrado!");
                    }
                }
            }
        }
    }
}
