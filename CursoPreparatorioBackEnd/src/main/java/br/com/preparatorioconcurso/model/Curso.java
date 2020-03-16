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
import javax.validation.Valid;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Curso")
@EntityListeners(AuditingEntityListener.class)
/*
 * @NamedQueries({
 * 
 * @NamedQuery(name = "User.buscaUsuario", query =
 * "SELECT u FROM User u ORDER BY u.id") })
 */
public class Curso implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4434279729702104006L;

	/** Primary key. */
    protected static final String PK = "codigoCurso";

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
    private int codigoCurso;
    @Column(length=45)
    private String nomeCurso;
    @Column(length=4)
    private String siglaCurso;
    private Date dataInicioCurso;
    private Date dataFimCurso;
   
    /** Default constructor. */
    public Curso() {
        super();
    }

    /**
     * Access method for codigoCurso.
     *
     * @return the current value of codigoCurso
     */
    public int getCodigoCurso() {
        return codigoCurso;
    }

    /**
     * Setter method for codigoCurso.
     *
     * @param aCodigoCurso the new value for codigoCurso
     */
    public void setCodigoCurso(int aCodigoCurso) {
        codigoCurso = aCodigoCurso;
    }

    /**
     * Access method for nomeCurso.
     *
     * @return the current value of nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * Setter method for nomeCurso.
     *
     * @param aNomeCurso the new value for nomeCurso
     */
    public void setNomeCurso(String aNomeCurso) {
        nomeCurso = aNomeCurso;
    }

    /**
     * Access method for siglaCurso.
     *
     * @return the current value of siglaCurso
     */
    public String getSiglaCurso() {
        return siglaCurso;
    }

    /**
     * Setter method for siglaCurso.
     *
     * @param aSiglaCurso the new value for siglaCurso
     */
    public void setSiglaCurso(String aSiglaCurso) {
        siglaCurso = aSiglaCurso;
    }

    /**
     * Access method for dataInicioCurso.
     *
     * @return the current value of dataInicioCurso
     */
    public Date getDataInicioCurso() {
        return dataInicioCurso;
    }

    /**
     * Setter method for dataInicioCurso.
     *
     * @param aDataInicioCurso the new value for dataInicioCurso
     */
    public void setDataInicioCurso(Date aDataInicioCurso) {
        dataInicioCurso = aDataInicioCurso;
    }

    /**
     * Access method for dataFimCurso.
     *
     * @return the current value of dataFimCurso
     */
    public Date getDataFimCurso() {
        return dataFimCurso;
    }

    /**
     * Setter method for dataFimCurso.
     *
     * @param aDataFimCurso the new value for dataFimCurso
     */
    public void setDataFimCurso(Date aDataFimCurso) {
        dataFimCurso = aDataFimCurso;
    }

    /**
     * Compares the key for this instance with another Curso.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Curso and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Curso)) {
            return false;
        }
        Curso that = (Curso) other;
        if (this.getCodigoCurso() != that.getCodigoCurso()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Curso.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Curso)) return false;
        return this.equalKeys(other) && ((Curso)other).equalKeys(this);
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
        i = getCodigoCurso();
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
        StringBuffer sb = new StringBuffer("[Curso |");
        sb.append(" codigoCurso=").append(getCodigoCurso());
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
        ret.put("codigoCurso", Integer.valueOf(getCodigoCurso()));
        return ret;
    }

}
