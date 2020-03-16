package br.com.preparatorioconcurso.domain.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.preparatorioconcurso.helper.AbstractValidationResult;
import br.com.preparatorioconcurso.helper.GenericValidationHelpers;
import br.com.preparatorioconcurso.helper.ValidationResult;
import br.com.preparatorioconcurso.model.Aluno;
import br.com.preparatorioconcurso.port.AlunoRepositoryPort;
import br.com.preparatorioconcurso.service.AlunoService;


@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class DomainAlunoService implements AlunoService{	
	
	 @Autowired
	 private AlunoRepositoryPort alunoRepositoryPort;
	 
	 @Autowired
	 private GenericValidationHelpers genericValidationHelpers;
	 
	@Override
	public Aluno buscarAlunoAprovadosSimulado() {
		
		Aluno alunoAprovado = alunoRepositoryPort.buscarAlunoAprovadosSimulado();
		
		boolean validaSeMaiorIdade = alunoAprovado.validaSeMaiorIdade( alunoAprovado, genericValidationHelpers);
		
		if(!validaSeMaiorIdade) {
			alunoAprovado.validaSeTemCarteiraHabilitacao( alunoAprovado , genericValidationHelpers);
		}
		
		return alunoAprovado;
	}
	
	public boolean validarAluno(Aluno aluno) {

		
		AbstractValidationResult validar = new AbstractValidationResult().validar(
												   genericValidationHelpers.notNull.and(genericValidationHelpers.between(2, 12)).test(aluno.getNomeAluno()),
												   genericValidationHelpers.notNull.and(genericValidationHelpers.between(4, 30)).test(aluno.getCpfAluno()),
												   genericValidationHelpers.notNull.and(genericValidationHelpers.between(2, 12)).test(aluno.getNomeAluno()),
												   genericValidationHelpers.notNull.and(genericValidationHelpers.between(3, 50)).and(genericValidationHelpers.contains("@")).test(aluno.getEmailAluno()),
												   genericValidationHelpers.intBetween(0, 110).test(aluno.getCodigoAluno().intValue())
												   );
		
		List<ValidationResult> listaValidationResult = validar.getListaValidationResult();
		
		String mensagens = validar.getMensagens();
				
		return Boolean.TRUE;
	}

	@Override
	public boolean validarAlunoNormal(Aluno aluno) {
		// TODO Auto-generated method stub
		return false;
	}
	

	
	/*
	 * public boolean validarAlunoNormal(Aluno aluno) {
	 * 
	 * if(aluno.getNomeAluno() == null) throw new
	 * IllegalArgumentException("firstname : must not be null");
	 * if(aluno.getCodigoAluno() < 2) throw new
	 * IllegalArgumentException("firstname : must have at least 2 characters");
	 * if(aluno.getNomeAluno().length() > 30) throw new
	 * IllegalArgumentException("firstname : must have less than 30 characters");
	 * 
	 * if(aluno.getCpfAluno() == null) throw new
	 * IllegalArgumentException("lastname : must not be null");
	 * if(aluno.getNomeAluno() .length() < 4) throw new
	 * IllegalArgumentException("lastname : must have at least 4 characters");
	 * if(aluno.getCodigoAluno() > 30) throw new
	 * IllegalArgumentException("lastname : must have less than 30 characters");
	 * 
	 * if(aluno.getEmailAluno() == null) throw new
	 * IllegalArgumentException("email : must not be null");
	 * if(aluno.getEmailAluno().length() < 3) throw new
	 * IllegalArgumentException("email : must have at least 3 characters");
	 * if(aluno.getEmailAluno().length() > 50) throw new
	 * IllegalArgumentException("email : must have less than 50 characters");
	 * if(!aluno.getEmailAluno().contains("@")) throw new
	 * IllegalArgumentException("email : must contains @");
	 * 
	 * 
	 * if(aluno.getCodigoAluno() < 0) throw new
	 * IllegalArgumentException("age : must be greater than 0");
	 * if(aluno.getCodigoAluno() > 110) throw new
	 * IllegalArgumentException("age : must be lower than 0");
	 * 
	 * return Boolean.TRUE; }
	 */

}
