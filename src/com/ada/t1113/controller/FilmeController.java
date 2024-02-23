package com.ada.t1113.controller;

import com.ada.t1113.dto.FilmeDto;
import com.ada.t1113.repository.FilmeRepository;

public class FilmeController {

    private FilmeRepository filmeRepository;

    //inicializa construtor
    public FilmeController(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public void executar(String command, FilmeDto dto){
        if ("inserir".equals(command)){
            filmeRepository.inserir(dto.toFilme());
        } else if ("listar".equals(command)){
            filmeRepository.listarTodos();
        } else if ("excluir".equals(command)){
            filmeRepository.excluir(dto.toFilme());
        } else if ("4".equals(command)){
            filmeRepository.pesquisarPorNome(dto.nome());
        } else {
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
        }
    }
}
