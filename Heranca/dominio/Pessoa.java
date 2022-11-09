package ProfessorJeanEMarcos.Heranca.dominio;

import java.util.ArrayList;

public class Pessoa
{
    protected int codigo;
    protected String nome;

    public Pessoa()
    {

    }
    public Pessoa(int codigo, String nome)
    {
        this.codigo = codigo;
        this.nome = nome;
    }
    public void listarTodasPessoas(ArrayList<Pessoa> pessoas)
    {
        System.out.println("Todas pessoas cadastradas: ");
        for(Pessoa p: pessoas)
        {
            System.out.println(p);
        }
    }
    public void mostrarMenu()
    {
        System.out.println("1 - Cadatrar Aluno");
        System.out.println("2 - Cadatrar Professor");
        System.out.println("3 - Cadatrar Funcionario");
        System.out.println("4 - Listar todos Alunos");
        System.out.println("5 - Listar todos Professores");
        System.out.println("6 - Listar todo Funcionarios");
        System.out.println("7 - Listar todas pessoas");
        System.out.println("8 - Sair\n");
        System.out.print("O que deseja fazer: ");
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
}
