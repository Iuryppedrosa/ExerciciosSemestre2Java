package ProfessorJean.ProfessorMarcus;

public class FuncoesTeste
{
    public static void main(String[] args)
    {
        Funcoes teste = new Funcoes();

        //tetse.mensagem("Teste");
        //Funcoes.mensagem("Teste");
        //teste.outraMensagem();

        //double resultado = teste.soma(5, 15);
        //System.out.println("Soma : " + resultado);

        int[] vetor = Funcoes.vetor();
        int[] w = new int[vetor.length];
        for(int i = 0; i < vetor.length; i++)
        {
            int n = vetor[i];
            w[i] = Funcoes.fatorial(n);
        }
        Funcoes.mostrarVetor(w);
    }
}
