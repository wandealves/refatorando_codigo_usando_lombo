package com.wordpress.wandersonalvesdev.cadastroalunos;

/**
 *
 * @author https://wandersonalvesdev.wordpress.com/
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setSobreNome("Silva");
        aluno.setSexo('M');
        aluno.setNumeroMatricula("10000");
        
        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Sobrenome: "+aluno.getSobreNome());
        System.out.println("Sexo: "+aluno.getSexo());
        System.out.println("Nº Matricula: "+aluno.getNumeroMatricula());
    }

}
