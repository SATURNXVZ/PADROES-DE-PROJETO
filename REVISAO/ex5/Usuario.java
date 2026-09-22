package REVISAO.ex5;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int id;
    private List<Livro> livroEmprestado;

    public Usuario(String nome, int id, List livroEmprestado){
        this.nome = nome;
        this.id = id;
        this.livroEmprestado = new ArrayList<>();
    }
}
