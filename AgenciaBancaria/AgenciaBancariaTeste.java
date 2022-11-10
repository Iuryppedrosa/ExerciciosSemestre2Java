package ProfessorJeanEMarcos.AgenciaBancaria;
import javax.swing.*;
import java.util.ArrayList;

public class AgenciaBancariaTeste
{
    static ArrayList<Conta> contasBancarias = new ArrayList<>();
    //static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    private static void operacoes()
    {
        int operacao =
                Integer.parseInt(JOptionPane.showInputDialog(
                        "--- Selecione uma operacao ---\n" +
                        "Opcao 1 - Criar conta.\n" +
                        "Opcao 2 - Depositar.\n" +
                        "Opcao 3 - Sacar.\n" +
                        "Opcao 4 - Transferir.\n" +
                        "Opcao 5 - Listar.\n" +
                        "Opcao 6 - Sair."
                ));
        /*System.out.println("Opcao 1 - Criar conta.");
        System.out.println("Opcao 2 - Depositar.");
        System.out.println("Opcao 3 - Sacar.");
        System.out.println("Opcao 4 - Transferir.");
        System.out.println("Opcao 5 - Listar.");
        System.out.println("Opcao 6 - Sair.");*/

        //int operacao = input.nextInt();

        switch (operacao)
        {
            case 1:
                criarConta();
                break;
            case 2:
                depositar();
                break;
            case 3:
                sacar();
                break;
            case 4:
                transferir();
                break;
            case 5:
                listar();
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Obrigado por usar esta agencia!!");
                //System.out.println("Obrigado por usar esta agencia!!");
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Opcao inválida");
                //System.out.println("Opcao inválida");
                operacoes();
                break;
        }
    }

    private static void listar()
    {
        if(contasBancarias.size() > 0)
        {
            for(Conta c: contasBancarias)
            {

                JOptionPane.showMessageDialog(null, c);
                //System.out.println(c);
            }

        } else
            JOptionPane.showMessageDialog(null, "Nao ha contas cadastradas!");
            //System.out.println("Nao ha contas cadastradas!");
        operacoes();
    }

    private static void transferir()
    {
        int numeroContaRemente = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta de saida do saldo: "));
        //System.out.print("Numero da conta de saida do saldo: ");
        //int numeroContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemente);
        if(contaRemetente != null)
        {
            int numeroContaDestinatario = Integer.parseInt("Numero da conta de envio: ");

            //System.out.print("Numero da conta de envio: ");
            //int numeroContaDestinatario = input.nextInt();
            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);

            if(contaDestinatario != null)
            {
                Double valorTransferencia = Double.parseDouble(JOptionPane.showInputDialog("Qual valor da sua transferencia: "));
                //System.out.print("Qual valor da sua transferencia: ");
                //Double valorTransferencia = input.nextDouble();

                contaRemetente.transferir(contaDestinatario, valorTransferencia);
            }else
                JOptionPane.showMessageDialog(null, "Conta para deposito nao encontrada.");
            JOptionPane.showMessageDialog(null,"Transferencia realizada com sucesso!!");
        }
        operacoes();
    }

    private static void sacar()
    {
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta para deposito: "));
        //System.out.print("Numero da conta que deseja sacar:");
        //int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if(conta != null)
        {
            Double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja sacar: "));
            //System.out.print("Qual valor deseja sacar: ");
            //Double valorSaque = input.nextDouble();
            conta.sacar(valorSaque);

            JOptionPane.showMessageDialog(null, "Valor depositado com sucesso!!");
            //System.out.println("Valor sacado com sucesso!!");
        } else
            JOptionPane.showMessageDialog(null, "A conta nao foi encontrada!!");
            //System.out.println("Conta nao encontrada!!");
        operacoes();
    }

    private static void depositar()
    {
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Qual o numero da conta para deposito: "));
        //System.out.print("Qual o numero da conta para deposito: ");
        //int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if(conta != null)
        {
            //System.out.println("Qual valor deseja depositar: ");

            double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja depositar: "));
            //Double valorDeposito = input.nextDouble();
            conta.depositar(valorDeposito);

            JOptionPane.showMessageDialog(null, "Valor depositado com sucesso!!");
            //System.out.println("Valor depositado com sucesso!!");
        }else
            JOptionPane.showMessageDialog(null, "A conta nao foi encontrada!!");
            //System.out.println("A conta nao foi encontrada!!");

        operacoes();
    }

    private static void criarConta()
    {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(JOptionPane.showInputDialog("Nome: "));
        pessoa.setCpf(JOptionPane.showInputDialog("Cpf: "));
        pessoa.setEmail(JOptionPane.showInputDialog("Email: "));




        //System.out.println("\nNome: ");
        //String nome = input.next();

        //System.out.println("Cpf: ");
        //String cpf = input.next();

        //System.out.println("Email: ");
        //String email = input.next();

        //Pessoa pessoa = new Pessoa(nome, cpf, email);
        Conta conta = new Conta(pessoa);

        contasBancarias.add(conta);
        JOptionPane.showMessageDialog(null, "Conta criada com sucesso!!");
        //System.out.println("Conta criada com sucesso!!");
        operacoes();
    }

    private static Conta encontrarConta(int numeroConta)
    {
        Conta conta = null;
        if(contasBancarias.size() > 0)
        {
            for(Conta c: contasBancarias)
            {
                if(c.getNumeroConta() == numeroConta)
                    conta = c;
            }
        }
        return conta;
    }
}
