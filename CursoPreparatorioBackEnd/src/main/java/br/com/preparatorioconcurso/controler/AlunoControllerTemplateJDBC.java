package br.com.preparatorioconcurso.controler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.preparatorioconcurso.exception.ResourceNotFoundException;
import br.com.preparatorioconcurso.model.Aluno;
import br.com.preparatorioconcurso.template.jdbc.AlunoTemplateJDBC;

@RestController
@RequestMapping("/api/v3")
public class AlunoControllerTemplateJDBC {

	@Autowired
	AlunoTemplateJDBC templateJDBC;

	@GetMapping("/buscarAlunosBeanProperty")
	public List<Aluno> buscarAlunosBeanProperty() {
		
		return templateJDBC.buscarAlunosBeanProperty();
		
	}

	@GetMapping("/buscarAlunoRowMapper/{codigoAluno}")
	public ResponseEntity<Aluno> buscarAlunoRowMapper(@PathVariable(value = "codigoAluno") Long codigoAluno) throws ResourceNotFoundException {

		Aluno aluno = templateJDBC.buscarAlunoRowMapper(codigoAluno);

		return ResponseEntity.ok().body(aluno);
	}

	@PostMapping("/salvarAluno")
	public int salvarAluno(@Valid @RequestBody Aluno aluno) {
		
		return templateJDBC.salvarAluno(aluno);
	}

	@PutMapping("/atualizarAluno/{codigoAluno}")
	public ResponseEntity<Aluno> atualizarAluno(@PathVariable(value = "codigoAluno") Long codigoAluno, @Valid @RequestBody Aluno aluno) throws ResourceNotFoundException {

		Aluno buscarAlunoBeanProperty = templateJDBC.buscarAlunoBeanProperty(codigoAluno);
		
		BeanUtils.copyProperties(aluno, buscarAlunoBeanProperty);
		
		Aluno alunoAtualizado = templateJDBC.atualizarAluno(aluno);

		return ResponseEntity.ok(alunoAtualizado);
	}

	@DeleteMapping("/deleteUser/{codigoAluno}")
	public Map<String, Boolean> deletarAluno(@PathVariable(value = "codigoAluno") Long codigoAluno) throws Exception {

		int alunoDeletado = templateJDBC.deletarAluno(codigoAluno);

		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);

		return response;
	}
	
	@GetMapping("/buscarAlunoBeanProperty/{codigoAluno}")
	public ResponseEntity<Aluno> buscarAlunoBeanProperty(@PathVariable(value = "codigoAluno") Long codigoAluno) throws ResourceNotFoundException {

		Aluno aluno = templateJDBC.buscarAlunoBeanProperty(codigoAluno);

		return ResponseEntity.ok().body(aluno);
	}
	
	@GetMapping("/buscarListaAlunosMap/{codigoAluno}")
	public ResponseEntity<List<Aluno>> buscarListaAlunosMap() throws ResourceNotFoundException {

		List<Aluno> aluno = templateJDBC.buscarListaAlunosMap();

		return ResponseEntity.ok().body(aluno);
	}
	
	@GetMapping("/buscarAlunosRowMapper/{codigoAluno}")
	public ResponseEntity<List<Aluno>> buscarAlunosRowMapper() throws ResourceNotFoundException {

		List<Aluno> aluno = templateJDBC.buscarAlunosRowMapper();

		return ResponseEntity.ok().body(aluno);
	}
	
	@GetMapping("/buscarAlunosResultSet/{codigoAluno}")
	public ResponseEntity<List<Aluno>> buscarAlunosResultSet() throws ResourceNotFoundException {

		List<Aluno> aluno = templateJDBC.buscarAlunosResultSet();

		return ResponseEntity.ok().body(aluno);
	}
	
	@GetMapping("/buscarAlunoPorObjeto/{codigoAluno}")
	public ResponseEntity<String> buscarAlunoPorObjeto(@PathVariable(value = "codigoAluno") Long codigoAluno) throws ResourceNotFoundException {

		String aluno = templateJDBC.buscarAlunoPorObjeto(codigoAluno);

		return ResponseEntity.ok().body(aluno);
	}
	
}
