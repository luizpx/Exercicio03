import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {

    @Test
    void calculaAprovacao() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luiz");
        Aluno aluno = new Aluno();
        aluno.setNota1(8);
        aluno.setNota2(7);
        aluno.setMatricula(2048);

        AlunoGraduacao alunograduacao = new AlunoGraduacao();
        alunograduacao.CalculaAprovacao(aluno.getNota1(), aluno.getNota2(), pessoa.getNome(), aluno.getMatricula());
    }
}