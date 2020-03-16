package br.com.preparatorioconcurso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.preparatorioconcurso.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	public Aluno buscarAlunoAprovadosSimulado();

}
