import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void profTitulacao() {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Guilherme");

        Professor professor = new Professor();
        professor.setTitulacao("Doutor");
        professor.profTitulacao(pessoa1.getNome());
    }
}