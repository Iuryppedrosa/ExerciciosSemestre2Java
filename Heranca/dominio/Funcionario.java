package ProfessorJeanEMarcos.Heranca.dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa
{
    private String departamento;

    public Funcionario()
    {

    }
    public Funcionario(int codigo, String nome, String departamento)
    {
        this.codigo = codigo;
        this.nome = nome;
        this.departamento = departamento;
    }
    public void listarFuncionario(ArrayList<Pessoa> pessoas)
    {
        System.out.println("Lista de funcionarios");
        for(Pessoa p : pessoas)
        {
            if(p instanceof Funcionario)
            {
                System.out.println(p);
            }
        }
    }

    public void cadastrarFuncionario(Scanner input, ArrayList<Pessoa> pessoas)
    {
        System.out.print("Entre com o codigo do funcionario: ");
        int codigo = input.nextInt();
        input.nextLine();

        System.out.print("Entre com o nome do funcionario: ");
        String nome = input.nextLine();

        System.out.print("Entre com a sala do funcionario: ");
        String departamento = input.nextLine();

        Funcionario funcionario = new Funcionario(codigo, nome, departamento);
        pessoas.add(funcionario);
    }

    public String getDepartamento()
    {
        return departamento;
    }

    public void setDepartamento(String departamento)
    {
        this.departamento = departamento;
    }
    @Override
    public String toString()
    {
        return "Nome: " + nome + "\nDepartamento: " + departamento + "\nCodigo: " + codigo;
    }
}
