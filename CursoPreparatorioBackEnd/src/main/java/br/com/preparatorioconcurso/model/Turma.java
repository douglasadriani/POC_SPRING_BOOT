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
@Table(name = "Turma")
@EntityListeners(AuditingEntityListener.class)
/*
 * @NamedQueries({
 * 
 * @NamedQuery(name = "User.buscaUsuario", query =
 * "SELECT u FROM User u ORDER BY u.id") })
 */
public class Turma implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/** Primary key. */
    protected static final String PK = "codigoTurma";

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
    private int codigoTurma;
    @Column(length=45)
    private String nomeTurma;
    @Column(length=4)
    private String siglaTurma;
    @Column(length=1)
    private String turnoTurma;
    private Date dataInicioTurma;
    private Date dataFinalTurma;

    /** Default constructor. */
    public Turma() {
        super();
    }

    /**
     * Access method for codigoTurma.
     *
     * @return the current value of codigoTurma
     */
    public int getCodigoTurma() {
        return codigoTurma;
    }

    /**
     * Setter method for codigoTurma.
     *
     * @param aCodigoTurma the new value for codigoTurma
     */
    public void setCodigoTurma(int aCodigoTurma) {
        codigoTurma = aCodigoTurma;
    }

    /**
     * Access method for nomeTurma.
     *
     * @return the current value of nomeTurma
     */
    public String getNomeTurma() {
        return nomeTurma;
    }

    /**
     * Setter method for nomeTurma.
     *
     * @param aNomeTurma the new value for nomeTurma
     */
    public void setNomeTurma(String aNomeTurma) {
        nomeTurma = aNomeTurma;
    }

    /**
     * Access method for siglaTurma.
     *
     * @return the current value of siglaTurma
     */
    public String getSiglaTurma() {
        return siglaTurma;
    }

    /**
     * Setter method for siglaTurma.
     *
     * @param aSiglaTurma the new value for siglaTurma
     */
    public void setSiglaTurma(String aSiglaTurma) {
        siglaTurma = aSiglaTurma;
    }

    /**
     * Access method for turnoTurma.
     *
     * @return the current value of turnoTurma
     */
    public String getTurnoTurma() {
        return turnoTurma;
    }

    /**
     * Setter method for turnoTurma.
     *
     * @param aTurnoTurma the new value for turnoTurma
     */
    public void setTurnoTurma(String aTurnoTurma) {
        turnoTurma = aTurnoTurma;
    }

    /**
     * Access method for dataInicioTurma.
     *
     * @return the current value of dataInicioTurma
     */
    public Date getDataInicioTurma() {
        return dataInicioTurma;
    }

    /**
     * Setter method for dataInicioTurma.
     *
     * @param aDataInicioTurma the new value for dataInicioTurma
     */
    public void setDataInicioTurma(Date aDataInicioTurma) {
        dataInicioTurma = aDataInicioTurma;
    }

    /**
     * Access method for dataFinalTurma.
     *
     * @return the current value of dataFinalTurma
     */
    public Date getDataFinalTurma() {
        return dataFinalTurma;
    }

    /**
     * Setter method for dataFinalTurma.
     *
     * @param aDataFinalTurma the new value for dataFinalTurma
     */
    public void setDataFinalTurma(Date aDataFinalTurma) {
        dataFinalTurma = aDataFinalTurma;
    }


    /**
     * Compares the key for this instance with another Turma.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Turma and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Turma)) {
            return false;
        }
        Turma that = (Turma) other;
        if (this.getCodigoTurma() != that.getCodigoTurma()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Turma.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Turma)) return false;
        return this.equalKeys(other) && ((Turma)other).equalKeys(this);
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
        i = getCodigoTurma();
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
        StringBuffer sb = new StringBuffer("[Turma |");
        sb.append(" codigoTurma=").append(getCodigoTurma());
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
        ret.put("codigoTurma", Integer.valueOf(getCodigoTurma()));
        return ret;
    }

}
