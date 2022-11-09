package ProfessorJeanEMarcos.Heranca.dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Pessoa
{
    private String sala;

    public Professor()
    {

    }
    public Professor(int codigo, String nome, String sala)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.sala = sala;
    }
    public void listarProfessores(ArrayList<Pessoa> pessoas)
    {
        System.out.println("Lista de professores cadastrados: ");
        for(Pessoa p : pessoas)
        {
            if(p instanceof Professor)
            {
                System.out.println(p);
            }
        }

    }
    public void cadastrarProfessor(Scanner input, ArrayList<Pessoa> pessoas)
    {
        System.out.print("Entre com o codigo do professor: ");
        int codigo = input.nextInt();
        input.nextLine();

        System.out.print("Entre com o nome do professor: ");
        String nome = input.nextLine();

        System.out.print("Entre com a sala do professor: ");
        String sala = input.nextLine();

        Professor professor = new Professor(codigo, nome, sala);
        pessoas.add(professor);
    }

    public String getSala()
    {
        return sala;
    }

    public void setSala(String sala)
    {
        this.sala = sala;
    }
    @Override
    public String toString()
    {
        return "Nome: " + nome + "\nSala: " + sala + "\nCodigo: " + codigo;
    }
}
