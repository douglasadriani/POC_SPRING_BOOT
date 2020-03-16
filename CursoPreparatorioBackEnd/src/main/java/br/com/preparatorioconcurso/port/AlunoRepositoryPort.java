package br.com.preparatorioconcurso.port;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.preparatorioconcurso.model.Aluno;

public interface AlunoRepositoryPort extends JpaRepository<Aluno, Long>{

	public Aluno buscarAlunoAprovadosSimulado();
}
