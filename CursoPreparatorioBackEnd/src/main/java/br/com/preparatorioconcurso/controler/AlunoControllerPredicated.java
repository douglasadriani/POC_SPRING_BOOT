
package br.com.preparatorioconcurso.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.preparatorioconcurso.model.Aluno;
import br.com.preparatorioconcurso.service.AlunoService;

@RestController
@RequestMapping("/api/v4")
public class AlunoControllerPredicated {

  @Autowired
  private AlunoService alunoService;

  @GetMapping("/validarAlunoNormal")
  public boolean validarAlunoNormal(Aluno aluno) {
	
    return alunoService.validarAlunoNormal(aluno);
  }
  
  @GetMapping("/validarAluno")
  public boolean validarAluno(Aluno aluno) {
	
    return alunoService.validarAluno(aluno);
  }
  
}
