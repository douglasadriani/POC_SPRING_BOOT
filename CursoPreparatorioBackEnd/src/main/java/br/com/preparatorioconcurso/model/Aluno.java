// Generated with g9.

package br.com.preparatorioconcurso.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.baidu.unbiz.fluentvalidator.annotation.FluentValid;

import br.com.preparatorioconcurso.helper.GenericValidationHelpers;
import br.com.preparatorioconcurso.helper.ValidationResult;

@Entity
@Table(name = "aluno")
@EntityListeners(AuditingEntityListener.class)
  @NamedQueries({
	  @NamedQuery(name = "Aluno.buscarAlunoAprovadosSimulado", query ="SELECT u FROM Aluno u") 
  })
public class Aluno implements Serializable {

	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "codigo_aluno", length=45)
	private Long codigoAluno;
	
	@Column(name = "nome_aluno", length=45)
	private String nomeAluno;

	@Column(name = "cpf_aluno", length=18)
	private String cpfAluno;
	
	@Column(name = "data_nascimento")
	private Date dataNascimento;
	
	@Column(name = "email_aluno",length=45)
	private String emailAluno;

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "codigoAluno";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }


    /** Default constructor. */
    public Aluno() {
        super();
    }

    
    
    public Aluno(Long codigoAluno, String nomeAluno, String cpfAluno, Date dataNascimento, String emailAluno) {
		super();
		this.codigoAluno = codigoAluno;
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.dataNascimento = dataNascimento;
		this.emailAluno = emailAluno;
	}



	/**
     * Access method for codigoAluno.
     *
     * @return the current value of codigoAluno
     */
    public Long getCodigoAluno() {
        return codigoAluno;
    }

    /**
     * Setter method for codigoAluno.
     *
     * @param aCodigoAluno the new value for codigoAluno
     */
    public void setCodigoAluno(Long aCodigoAluno) {
        codigoAluno = aCodigoAluno;
    }

    /**
     * Access method for nomeAluno.
     *
     * @return the current value of nomeAluno
     */
    public String getNomeAluno() {
        return nomeAluno;
    }

    /**
     * Setter method for nomeAluno.
     *
     * @param aNomeAluno the new value for nomeAluno
     */
    public void setNomeAluno(String aNomeAluno) {
        nomeAluno = aNomeAluno;
    }

    /**
     * Access method for cpfAluno.
     *
     * @return the current value of cpfAluno
     */
    public String getCpfAluno() {
        return cpfAluno;
    }

    /**
     * Setter method for cpfAluno.
     *
     * @param aCpfAluno the new value for cpfAluno
     */
    public void setCpfAluno(String aCpfAluno) {
        cpfAluno = aCpfAluno;
    }

    /**
     * Access method for dataNascimento.
     *
     * @return the current value of dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Setter method for dataNascimento.
     *
     * @param aDataNascimento the new value for dataNascimento
     */
    public void setDataNascimento(Date aDataNascimento) {
        dataNascimento = aDataNascimento;
    }

    /**
     * Access method for emailAluno.
     *
     * @return the current value of emailAluno
     */
    public String getEmailAluno() {
        return emailAluno;
    }

    /**
     * Setter method for emailAluno.
     *
     * @param aEmailAluno the new value for emailAluno
     */
    public void setEmailAluno(String aEmailAluno) {
        emailAluno = aEmailAluno;
    }

    /**
     * Access method for alunoTurmaCursoProfessor.
     *
     * @return the current value of alunoTurmaCursoProfessor
     */
	/*
	 * public Set<AlunoTurmaCursoProfessor> getAlunoTurmaCursoProfessor() { return
	 * alunoTurmaCursoProfessor; }
	 */
    /**
     * Setter method for alunoTurmaCursoProfessor.
     *
     * @param aAlunoTurmaCursoProfessor the new value for alunoTurmaCursoProfessor
     */
	/*
	 * public void setAlunoTurmaCursoProfessor(Set<AlunoTurmaCursoProfessor>
	 * aAlunoTurmaCursoProfessor) { alunoTurmaCursoProfessor =
	 * aAlunoTurmaCursoProfessor; }
	 */


    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoAluno == null) ? 0 : codigoAluno.hashCode());
		result = prime * result + ((cpfAluno == null) ? 0 : cpfAluno.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((emailAluno == null) ? 0 : emailAluno.hashCode());
		result = prime * result + ((lockFlag == null) ? 0 : lockFlag.hashCode());
		result = prime * result + ((nomeAluno == null) ? 0 : nomeAluno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (codigoAluno == null) {
			if (other.codigoAluno != null)
				return false;
		} else if (!codigoAluno.equals(other.codigoAluno))
			return false;
		if (cpfAluno == null) {
			if (other.cpfAluno != null)
				return false;
		} else if (!cpfAluno.equals(other.cpfAluno))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (emailAluno == null) {
			if (other.emailAluno != null)
				return false;
		} else if (!emailAluno.equals(other.emailAluno))
			return false;
		if (lockFlag == null) {
			if (other.lockFlag != null)
				return false;
		} else if (!lockFlag.equals(other.lockFlag))
			return false;
		if (nomeAluno == null) {
			if (other.nomeAluno != null)
				return false;
		} else if (!nomeAluno.equals(other.nomeAluno))
			return false;
		return true;
	}

	/**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("codigoAluno", Long.valueOf(getCodigoAluno()));
        return ret;
    }

	public boolean validaSeMaiorIdade(Aluno alunoAprovado, GenericValidationHelpers genericValidationHelpers) {
		//genericValidationHelpers.notNull.and(null);
		return false;
		
	}

	public boolean validaSeTemCarteiraHabilitacao(Aluno alunoAprovado, GenericValidationHelpers genericValidationHelpers) {
		
		genericValidationHelpers.intBetween(0, 110).test(alunoAprovado.getCodigoAluno().intValue());
		
		
		return false;
	}

}
