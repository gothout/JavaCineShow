/*package com.ada.t1113.app;
import com.ada.t1113.controller.FilmeController;
import com.ada.t1113.dto.DiretorDto;
import com.ada.t1113.dto.FilmeDto;
import com.ada.t1113.model.diretor.Diretor;
import com.ada.t1113.repository.DiretorRepository;
import com.ada.t1113.repository.impl.DiretorRepositoryImpl;
import com.ada.t1113.repository.impl.FilmeRepositoryImpl;
import com.ada.t1113.controller.DiretorController;

import java.util.List;
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
    public static void menuFilmes(Scanner scanner) {
        FilmeController filmeController = new FilmeController(new FilmeRepositoryImpl());
        DiretorController diretorController = new DiretorController(new DiretorRepositoryImpl());
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
            switch (command) {
                case "1":
                    System.out.println("==== Digite o nome do com.ada.t1113.view.filme ====");
                    String filmeNome = scanner.nextLine();
                    System.out.println("Digite a duração do com.ada.t1113.view.filme (ex: 127 -> 127 minutos):");
                    int filmeDuracao = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha pendente
                    System.out.println("Digite o nome do com.ada.t1113.view.diretor:");
                    String diretorDoFilme = scanner.nextLine();
                    System.out.println("Digite a idade do com.ada.t1113.view.diretor:");
                    int diretorIdade = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha pendente
                    System.out.println("Digite a nacionalidade do com.ada.t1113.view.diretor:");
                    String diretorNacionalidade = scanner.nextLine();

                    // Repassando para o controller
                    FilmeDto filmeDto = new FilmeDto(filmeNome, filmeDuracao, diretorDoFilme);
                    filmeController.executar("inserir", filmeDto);
                    DiretorDto diretorDto = new DiretorDto(diretorDoFilme, diretorIdade, diretorNacionalidade);
                    diretorController.executar("inserir", diretorDto);

                    System.out.println("Filme cadastrado com sucesso!\n");
                    break;
                case "2":
                    System.out.println("==== Atualizar Filme ====");
                    break;
                case "3":
                    System.out.println("==== Digite o nome do com.ada.t1113.view.filme que deseja excluir ====");
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
}*/