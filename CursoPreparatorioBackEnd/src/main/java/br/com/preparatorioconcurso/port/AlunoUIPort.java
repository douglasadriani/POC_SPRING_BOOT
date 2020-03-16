package br.com.preparatorioconcurso.port;

import org.springframework.web.bind.annotation.GetMapping;

import br.com.preparatorioconcurso.model.Aluno;

public interface AlunoUIPort {

	@GetMapping("/buscarAlunoAprovadosSimulado")
	public Aluno buscarAlunoAprovadosSimulado(); 

}
