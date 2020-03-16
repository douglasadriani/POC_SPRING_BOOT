package br.com.preparatorioconcurso.template.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.preparatorioconcurso.model.Aluno;

public class CopiaRowMapper implements RowMapper<Aluno> {

    @Override
    public Aluno mapRow(ResultSet rs, int rowNum) throws SQLException {

        Aluno aluno = new Aluno();
        aluno.setCodigoAluno(rs.getLong("codigoAluno"));
        aluno.setCpfAluno(rs.getString("cpfAluno"));
        aluno.setDataNascimento(rs.getDate("dataNascimento"));
        aluno.setEmailAluno(rs.getString("emailAluno"));
        aluno.setNomeAluno(rs.getString("nomeAluno"));
        return aluno;

    }
}
