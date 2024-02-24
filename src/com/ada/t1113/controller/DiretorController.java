package com.ada.t1113.controller;

import com.ada.t1113.dto.DiretorDto;
import com.ada.t1113.dto.FilmeDto;
import com.ada.t1113.repository.DiretorRepository;
import com.ada.t1113.repository.FilmeRepository;

public class DiretorController {

    private static DiretorRepository diretorRepository;

    //inicializa construtor
    public DiretorController(DiretorRepository diretorRepository) {
        DiretorController.diretorRepository = diretorRepository;
    }

    public static void executar(String command, DiretorDto dto){
        if ("inserir".equals(command)){
            diretorRepository.inserir(dto.toDiretor());
        } else if ("listar".equals(command)){
            diretorRepository.listarTodos();
        } else if ("excluir".equals(command)){
            diretorRepository.excluir(dto.toDiretor());
        } else if ("4".equals(command)){
            diretorRepository.pesquisarPorNome(dto.nome());
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
