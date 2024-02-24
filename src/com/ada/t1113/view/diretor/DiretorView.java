package com.ada.t1113.view.diretor;

import com.ada.t1113.controller.DiretorController;
import com.ada.t1113.dto.DiretorDto;
import com.ada.t1113.view.MainMenuView;

import java.util.Scanner;

public class DiretorView {
    private Scanner scanner;
    private DiretorController diretorController;
    private MainMenuView mainMenuView;

    public DiretorView(Scanner scanner, DiretorController diretorController) {
        this.scanner = scanner;
        this.diretorController = diretorController;
    }

    public void exibirMenu() {
        String command;
        do {
            System.out.println("======= Diretores =======\n");
            System.out.println("1 - Listar Diretores");
            System.out.println("2 - Voltar");
            System.out.println("3 - Sair");
            System.out.println("Digite o comando desejado: ");
            command = scanner.nextLine();
            switch (command) {
                case "1":
                    listarDiretores();
                    break;
                case "2":
                    System.out.println("Voltar");
                    mainMenuView.exibirMenu();
                    break;
                case "3":
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Comando inválido");
                    break;
            }
        } while (!command.equals("3"));
    }

    private void listarDiretores() {
        System.out.println("Listar Diretores");
        diretorController.executar("listar", null);
    }
}
