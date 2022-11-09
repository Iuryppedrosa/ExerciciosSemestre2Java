package ProfessorJeanEMarcos.Heranca;
import ProfessorJeanEMarcos.Heranca.dominio.Aluno;
import ProfessorJeanEMarcos.Heranca.dominio.Funcionario;
import ProfessorJeanEMarcos.Heranca.dominio.Pessoa;
import ProfessorJeanEMarcos.Heranca.dominio.Professor;


import java.util.ArrayList;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int operacao = 0;
        while (operacao != 8)
        {
            pessoa.mostrarMenu();
            operacao = input.nextInt();

            switch (operacao)
            {
                case 1: aluno.cadastrarAluno(input, pessoas);
                break;
                case 2: professor.cadastrarProfessor(input, pessoas);
                break;
                case 3: funcionario.cadastrarFuncionario(input, pessoas);
                break;
                case 4: aluno.listarAlunos(pessoas);
                break;
                case 5: professor.listarProfessores(pessoas);
                break;
                case 6: funcionario.listarFuncionario(pessoas);
                break;
                case 7: pessoa.listarTodasPessoas(pessoas);
                break;
                case 8:
                    System.out.println("Programa encerrado!!");
                    return;
            }
        }
        //object
        // pessoa
        // aluno
    }
}
