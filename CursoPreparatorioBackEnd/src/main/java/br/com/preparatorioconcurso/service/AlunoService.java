package br.com.preparatorioconcurso.service;

import br.com.preparatorioconcurso.model.Aluno;

public interface AlunoService{

	Aluno buscarAlunoAprovadosSimulado();
	
	boolean validarAluno(Aluno aluno);
	
	boolean validarAlunoNormal(Aluno aluno); 
}
