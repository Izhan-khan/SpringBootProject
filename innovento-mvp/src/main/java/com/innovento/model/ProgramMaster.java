// Generated with g9.

package com.innovento.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="program_master")
public class ProgramMaster implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", unique=true, nullable=false, precision=10)
    private long id;
    @Column(name="program_name", length=45)
    private String programName;

    /** Default constructor. */
   

    /**
     * Access method for programName.
     *
     * @return the current value of programName
     */
    public String getProgramName() {
        return programName;
    }

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/**
     * Setter method for programName.
     *
     * @param aProgramName the new value for programName
     */
    public void setProgramName(String aProgramName) {
        programName = aProgramName;
    }

   
 

}
