public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luiz");
        Aluno aluno = new Aluno();
        aluno.setNota1(8);
        aluno.setNota2(7);
        aluno.setMatricula(2048);

        AlunoEnsinoMedio alunoensinomedio = new AlunoEnsinoMedio();
        alunoensinomedio.CalculaAprovacao(aluno.getNota1(), aluno.getNota2(), pessoa.getNome(), aluno.getMatricula());

        AlunoGraduacao alunograduacao = new AlunoGraduacao();
        alunograduacao.CalculaAprovacao(aluno.getNota1(), aluno.getNota2(), pessoa.getNome(), aluno.getMatricula());

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Guilherme");

        Professor professor = new Professor();
        professor.setTitulacao("Doutor");
        professor.profTitulacao(pessoa1.getNome());

    }
}
