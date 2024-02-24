package com.ada.t1113.view;

import com.ada.t1113.controller.DiretorController;
import com.ada.t1113.controller.FilmeController;
import com.ada.t1113.repository.impl.DiretorRepositoryImpl;
import com.ada.t1113.repository.impl.FilmeRepositoryImpl;
import com.ada.t1113.view.diretor.DiretorView;
import com.ada.t1113.view.filme.FilmeView;

import java.util.Scanner;

public class MainMenuView {
    private Scanner scanner;
    private FilmeView filmeView;

    public MainMenuView(Scanner scanner, FilmeView filmeView) {
        this.scanner = scanner;
        this.filmeView = filmeView;
    }

    public void exibirMenu() {
        String command;
        do {
            System.out.println("======= Main Menu =======\n");
            System.out.println("1 - Filmes");
            System.out.println("2 - Diretores");
            System.out.println("3 - Atores");
            System.out.println("4 - Sair");
            System.out.println("Digite o comando desejado: ");
            command = scanner.nextLine();
            switch (command){
                case "1":
                    filmeView.setMainMenuView(this); // Configurar mainMenuView antes de exibirMenu
                    filmeView.exibirMenu();
                    break;
                case "2":
                    exibirMenuDiretores();
                    scanner.close();
                    break;
                case "3":
                    System.out.println("Atores");
                    scanner.close();
                    break;
                case "4":
                    System.out.println("Saindo do sistema. Até mais!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Comando inválido");
                    scanner.close();
                    break;
            }
        } while (!command.equals("4"));
    }


    private void exibirMenuFilmes() {
        FilmeController filmeController = new FilmeController(new FilmeRepositoryImpl());
        FilmeView filmeView = new FilmeView(scanner, filmeController);
        filmeView.exibirMenu();
    }

    private void exibirMenuDiretores() {
        DiretorController diretorController = new DiretorController(new DiretorRepositoryImpl());
        DiretorView diretorView = new DiretorView(scanner, diretorController);
        diretorView.exibirMenu();
    }
}
