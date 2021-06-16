/**
 *
 */
public class AlunoEnsinoMedio extends Aluno {

    public void CalculaAprovacao(float n1, float n2, String nome, int matricula){
        if((n1+n2) / 2 >= 6){
            System.out.println("Nome: ");
            System.out.println(nome);
            System.out.println("Matricula: ");
            System.out.println(matricula);
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Nome: ");
            System.out.println(nome);
            System.out.println("Matricula: ");
            System.out.println(matricula);
            System.out.println("Reprovado");
        }

    }
}