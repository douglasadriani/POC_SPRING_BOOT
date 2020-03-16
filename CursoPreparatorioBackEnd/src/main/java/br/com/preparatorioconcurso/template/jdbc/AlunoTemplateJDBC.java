package br.com.preparatorioconcurso.template.jdbc;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.preparatorioconcurso.model.Aluno;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class AlunoTemplateJDBC<T, S> {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String sql;
	
	public int salvarAluno(Aluno aluno) {
		
		return jdbcTemplate.update("insert into aluno(nome_aluno,cpf_aluno,data_nascimento,email_aluno) values(?,?,?,?)",
				aluno.getNomeAluno(), aluno.getCpfAluno(), LocalDateTime.now(), aluno.getEmailAluno());
	}
	
	
	public	Optional<T> salvar(S entity){
		
		
		return null;
	}

	public Aluno atualizarAluno(Aluno aluno) {
		
		jdbcTemplate.update("update aluno set nome_aluno = ?,cpf_aluno = ?,email_aluno = ? where codigo_aluno = ?",
										  aluno.getNomeAluno(), aluno.getCpfAluno(), aluno.getEmailAluno(),aluno.getCodigoAluno());
		
		return buscarAlunoBeanProperty(aluno.getCodigoAluno());
	}
	
	public Aluno buscarAlunoRowMapper(Long codigoAluno) {

		String sql = "select * from aluno where codigo_aluno = ?";

		return jdbcTemplate.queryForObject(sql, new Object[] { codigoAluno }, new CopiaRowMapper());

	}

	public Aluno buscarAlunoBeanProperty(Long codigoAluno) {

		sql = "select * from aluno where codigo_aluno = ?";

		Object[] args = new Object[] { codigoAluno };

		return jdbcTemplate.queryForObject(sql, args, new BeanPropertyRowMapper<Aluno>(Aluno.class));

	}

	public List<Aluno> buscarListaAlunosMap() {

		String sql = "select * from aluno";

		List<Aluno> listaAlunos = new ArrayList<>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

		for (Map row : rows) {
			
			Aluno aluno = new Aluno();

			aluno.setCodigoAluno(((Long) row.get("codigoAluno")).longValue());
			aluno.setNomeAluno((String) row.get("nomeAluno"));
			aluno.setCpfAluno((String) row.get("cpfAluno"));
			aluno.setDataNascimento((Date)row.get("dataNascimento"));
			aluno.setEmailAluno((String) row.get("emailAluno"));

			listaAlunos.add(aluno);
			
		}

		return listaAlunos;
	}

	public List<Aluno> buscarAlunosRowMapper() {

		String sql = "select * from aluno";

		List<Aluno> customers = jdbcTemplate.query(sql, new CopiaRowMapper());

		return customers;
	}

	public List<Aluno> buscarAlunosBeanProperty() {

		String sql = "select * from aluno";

		List<Aluno> alunos = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Aluno>(Aluno.class));

		return alunos;
	}
	
	public List<Aluno> buscarAlunosResultSet() {

		String sql = "select * from aluno";

		return jdbcTemplate.query(sql, (rs, rowNum) -> new Aluno(rs.getLong("codigo_aluno"), rs.getString("nome_aluno"),
				rs.getString("cpf_aluno"), rs.getDate("data_nascimento"), rs.getString("email_aluno")));
	}	


	public String buscarAlunoPorObjeto(Long codigoAluno) {

		String sql = "select nome_aluno from aluno where codigo_aluno = ?";

		return jdbcTemplate.queryForObject(sql, new Object[] { codigoAluno }, String.class);

	}


	public int deletarAluno(Long codigoAluno) {
		
		String sql = "delete from aluno where codigo_aluno = ?";

		return jdbcTemplate.update(sql,new Object[] { codigoAluno });
	}


}
