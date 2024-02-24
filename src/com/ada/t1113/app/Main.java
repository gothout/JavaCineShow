package com.ada.t1113.app;

import com.ada.t1113.controller.FilmeController;
import com.ada.t1113.repository.impl.FilmeRepositoryImpl;
import com.ada.t1113.view.filme.FilmeView;
import com.ada.t1113.view.MainMenuView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de filmes!\n");

        FilmeController filmeController = new FilmeController(new FilmeRepositoryImpl());
        FilmeView filmeView = new FilmeView(scanner, filmeController);

        MainMenuView mainMenuView = new MainMenuView(scanner, filmeView);
        mainMenuView.exibirMenu();
    }
}