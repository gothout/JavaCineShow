package com.ada.t1113.app;
import com.ada.t1113.controller.FilmeController;
import com.ada.t1113.dto.FilmeDto;
import com.ada.t1113.repository.impl.FilmeRepositoryImpl;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de filmes!\n");
        System.out.println("======= Main Menu =======\n");
        System.out.println("1 - Filmes");
        System.out.println("2 - Diretores");
        System.out.println("3 - Atores");

        String command = scanner.nextLine();
        switch (command){
            case "1":
                menuFilmes(scanner);
                break;
            case "2":
                System.out.println("Diretores");
                break;
            case "3":
                System.out.println("Atores");
                break;
            default:
                System.out.println("Comando inválido");
                try {
                    Thread.sleep(1000); // Pausa de 3 segundos
                    System.out.println(".");
                    Thread.sleep(1000); // Pausa de 3 segundos
                    System.out.println(".");
                    Thread.sleep(1000); // Pausa de 3 segundos
                    System.out.println(".");
                    System.out.println("Retornando ao menu principal\n---------------------------- \n");
                    Thread.sleep(1000); // Pausa de 3 segundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                main(null);
                break;
        }

    }
    public static void menuFilmes(Scanner scanner){
        FilmeController filmeController = new FilmeController(new FilmeRepositoryImpl());
        String command;
        do {
            System.out.println("======= Filmes =======\n");
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Atualizar Filme");
            System.out.println("3 - Excluir Filme");
            System.out.println("4 - Pesquisar Filme");
            System.out.println("5 - Listar Filmes");
            System.out.println("6 - Voltar");
            System.out.println("7 - Sair");
            System.out.println("Digite o comando desejado: ");
            command = scanner.nextLine();
            switch (command){
                case "1":
                    System.out.println("==== Digite o nome do filme ====  \n");
                    String filmeNome = scanner.nextLine();
                    System.out.println("Digite a duração do filme (ex: 127 -> 127 minutos): \n");
                    int filmeDuracao = scanner.nextInt();
                    String diretorDoFilme = "Steven Spielberg"; //Aguardando impl de diretor
                    FilmeDto filmeDto = new FilmeDto(filmeNome, filmeDuracao, diretorDoFilme);
                    filmeController.executar("inserir", new FilmeDto(filmeNome, filmeDuracao, diretorDoFilme));
                    System.out.println("Filme cadastrado com sucesso!\n");
                    break;
                case "2":
                    System.out.println("==== Atualizar Filme ====");
                    break;
                case "3":
                    System.out.println("==== Digite o nome do filme que deseja excluir ====");
                    String filmeParaExcluir = scanner.nextLine();
                    filmeController.executar("excluir", new FilmeDto(filmeParaExcluir, 0, ""));
                    break;
                case "4":
                    System.out.println("Pesquisar Filme");
                    break;
                case "5":
                    System.out.println("Listar Filmes");
                    filmeController.executar("listar", null);
                    break;
                case "6":
                    System.out.println("Voltar");
                    main(null);
                    break;
                case "7":
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Comando inválido");
                    break;
            }
        } while (!command.equals("7"));
    }
}
