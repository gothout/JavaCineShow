// FilmeView.java
package com.ada.t1113.view.filme;

import com.ada.t1113.controller.FilmeController;
import com.ada.t1113.dto.FilmeDto;
import com.ada.t1113.view.MainMenuView;

import java.util.Scanner;

public class FilmeView {
    private Scanner scanner;
    private FilmeController filmeController;
    private MainMenuView mainMenuView;

    public FilmeView(Scanner scanner, FilmeController filmeController) {
        this.scanner = scanner;
        this.filmeController = filmeController;
    }

    public void setMainMenuView(MainMenuView mainMenuView) {
        this.mainMenuView = mainMenuView;
    }

    public void exibirMenu() {
        String command;
        do {
            System.out.println("======= Filmes =======\n");
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Atualizar Filme");
            System.out.println("3 - Excluir Filme");
            System.out.println("4 - Pesquisar Filme");
            System.out.println("5 - Listar Filmes");
            System.out.println("6 - Voltar");
            System.out.println("Digite o comando desejado: ");
            command = scanner.nextLine();
            switch (command) {
                case "1":
                    cadastrarFilme();
                    break;
                case "2":
                    atualizarFilme();
                    break;
                case "3":
                    excluirFilme();
                    break;
                case "4":
                    pesquisarFilme();
                    break;
                case "5":
                    listarFilmes();
                    break;
                case "6":
                    System.out.println("Voltar");
                    mainMenuView.exibirMenu();
                    break;
                default:
                    System.out.println("Comando inválido");
                    break;
            }
        } while (!command.equals("6"));
    }

    private void cadastrarFilme() {
        System.out.println("==== Digite o nome do filme ====");
        String filmeNome = scanner.nextLine();
        System.out.println("Digite a duração do filme (ex: 127 -> 127 minutos):");
        int filmeDuracao = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha pendente
        System.out.println("Digite o nome do diretor:");
        String diretorDoFilme = scanner.nextLine();
        System.out.println("Digite a idade do diretor:");
        int diretorIdade = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha pendente
        System.out.println("Digite a nacionalidade do diretor:");
        String diretorNacionalidade = scanner.nextLine();

        // Repassando para o controller
        FilmeDto filmeDto = new FilmeDto(filmeNome, filmeDuracao, diretorDoFilme);
        filmeController.executar("inserir", filmeDto);
    }

    private void atualizarFilme() {
        System.out.println("==== Atualizar Filme ====");
        // Implementar lógica de atualização usando o controller
    }

    private void excluirFilme() {
        System.out.println("==== Digite o nome do filme que deseja excluir ====");
        String filmeParaExcluir = scanner.nextLine();
        filmeController.executar("excluir", new FilmeDto(filmeParaExcluir, 0, ""));
    }

    private void pesquisarFilme() {
        System.out.println("==== Pesquisar Filme ====");
        // Implementar lógica de pesquisa usando o controller
    }

    private void listarFilmes() {
        System.out.println("Listar Filmes");
        filmeController.executar("listar", null);
    }
}
