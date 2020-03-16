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
import javax.persistence.Version;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Professores")
@EntityListeners(AuditingEntityListener.class)
/*
 * @NamedQueries({
 * 
 * @NamedQuery(name = "User.buscaUsuario", query =
 * "SELECT u FROM User u ORDER BY u.id") })
 */
public class Professores implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1691992086099382037L;

	/** Primary key. */
    protected static final String PK = "codigoProfessor";

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

    @Id
    @Column(unique=true, nullable=false, precision=10)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigoProfessor;
    @Column(length=45)
    private String nomeProfessor;
    @Column(length=45)
    private String cpfProfessor;
    private Date dataInicioTrabalho;
    private Date dataFinalTrabalho;
   
    /** Default constructor. */
    public Professores() {
        super();
    }

    /**
     * Access method for codigoProfessor.
     *
     * @return the current value of codigoProfessor
     */
    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    /**
     * Setter method for codigoProfessor.
     *
     * @param aCodigoProfessor the new value for codigoProfessor
     */
    public void setCodigoProfessor(int aCodigoProfessor) {
        codigoProfessor = aCodigoProfessor;
    }

    /**
     * Access method for nomeProfessor.
     *
     * @return the current value of nomeProfessor
     */
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    /**
     * Setter method for nomeProfessor.
     *
     * @param aNomeProfessor the new value for nomeProfessor
     */
    public void setNomeProfessor(String aNomeProfessor) {
        nomeProfessor = aNomeProfessor;
    }

    /**
     * Access method for cpfProfessor.
     *
     * @return the current value of cpfProfessor
     */
    public String getCpfProfessor() {
        return cpfProfessor;
    }

    /**
     * Setter method for cpfProfessor.
     *
     * @param aCpfProfessor the new value for cpfProfessor
     */
    public void setCpfProfessor(String aCpfProfessor) {
        cpfProfessor = aCpfProfessor;
    }

    /**
     * Access method for dataInicioTrabalho.
     *
     * @return the current value of dataInicioTrabalho
     */
    public Date getDataInicioTrabalho() {
        return dataInicioTrabalho;
    }

    /**
     * Setter method for dataInicioTrabalho.
     *
     * @param aDataInicioTrabalho the new value for dataInicioTrabalho
     */
    public void setDataInicioTrabalho(Date aDataInicioTrabalho) {
        dataInicioTrabalho = aDataInicioTrabalho;
    }

    /**
     * Access method for dataFinalTrabalho.
     *
     * @return the current value of dataFinalTrabalho
     */
    public Date getDataFinalTrabalho() {
        return dataFinalTrabalho;
    }

    /**
     * Setter method for dataFinalTrabalho.
     *
     * @param aDataFinalTrabalho the new value for dataFinalTrabalho
     */
    public void setDataFinalTrabalho(Date aDataFinalTrabalho) {
        dataFinalTrabalho = aDataFinalTrabalho;
    }

    /**
     * Compares the key for this instance with another Professores.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Professores and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Professores)) {
            return false;
        }
        Professores that = (Professores) other;
        if (this.getCodigoProfessor() != that.getCodigoProfessor()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Professores.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Professores)) return false;
        return this.equalKeys(other) && ((Professores)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getCodigoProfessor();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Professores |");
        sb.append(" codigoProfessor=").append(getCodigoProfessor());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("codigoProfessor", Integer.valueOf(getCodigoProfessor()));
        return ret;
    }

}
