package ProfessorJeanEMarcos.Heranca.dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoa
{
    private String curso;

    public Aluno()
    {

    }
    public Aluno(int codigo, String nome, String curso)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
    }
    public void listarAlunos(ArrayList<Pessoa> pessoas)
    {
        System.out.println("Alunos cadastrados: ");
        for(Pessoa p: pessoas)
        {
            if(p instanceof Aluno)
            {
                System.out.println(p);
            }
        }
    }
    public void cadastrarAluno(Scanner input, ArrayList<Pessoa> pessoas)
    {
        System.out.print("Entre com o codigo do aluno: ");
        int codigo = input.nextInt();
        input.nextLine();

        System.out.print("Entre com o nome do aluno: ");
        String nome = input.nextLine();

        System.out.print("Entre com o curso do aluno: ");
        String curso = input.nextLine();

        Aluno aluno = new Aluno(codigo, nome, curso);
        pessoas.add(aluno);
    }
    public String getCurso()
    {
        return curso;
    }
    public void setCurso(String curso)
    {
        this.curso = curso;
    }

    @Override
    public String toString()
    {
        return "Nome: " + nome + "\ncodigo: " + codigo + "\nCurso: " + curso;
    }
}
