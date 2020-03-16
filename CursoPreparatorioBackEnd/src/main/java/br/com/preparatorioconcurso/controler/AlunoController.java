
package br.com.preparatorioconcurso.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.preparatorioconcurso.model.Aluno;
import br.com.preparatorioconcurso.port.AlunoUIPort;
import br.com.preparatorioconcurso.service.AlunoService;

@RestController
@RequestMapping("/api/v2")
public class AlunoController implements AlunoUIPort{

	@Autowired
	private AlunoService alunoService;

	public Aluno buscarAlunoAprovadosSimulado() {

		return alunoService.buscarAlunoAprovadosSimulado();
	}
	


	/* *//**
			 * Método responsável por lsitar todos os comentários do Usuario (Menu > Meus
			 * Comentários), com controle de paginação na tela
			 * 
			 * @return
			 *//*
				 * @ApiOperation(value="Lista os comentários do Usuario Logado")
				 * 
				 * @RequestMapping(value="/meusComentarios", method=RequestMethod.GET) public
				 * ResponseEntity<Page<ComentarioDTO>>
				 * listarMeusComentariosPage(@Param(value="codUsuarioRsp") Integer
				 * codUsuarioRsp,
				 * 
				 * @RequestParam(value="page", defaultValue="0")Integer page,
				 * 
				 * @RequestParam(value="linesPerPage", defaultValue="24")Integer size,
				 * 
				 * @RequestParam(value="direction", defaultValue="DESC")Sort.Direction
				 * direction,
				 * 
				 * @RequestParam(value="orderBy", defaultValue="datCriacao")String orderBy){
				 * 
				 * Page<Comentario> listaComentario =
				 * serviceComentario.listarMeusComentariosPage(page, size, direction, orderBy,
				 * codUsuarioRsp); Page<ComentarioDTO> listaComentarioDTO =
				 * listaComentario.map(obj -> new ComentarioDTO(obj));
				 * 
				 * return ResponseEntity.ok().body(listaComentarioDTO); }
				 * 
				 * @Repository public interface ComentarioRepository extends
				 * JpaRepository<Comentario, Integer>, QueryByExampleExecutor<Comentario>
				 */

}
