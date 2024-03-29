// Generated with g9.

package com.innovento.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="total_student_strength")
public class TotalStudentStrength implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "id";

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(name="program_id",length=45)
    private int programId;
    public int getProgramId() {
		return programId;
	}

	public void setProgramId(int programId) {
		this.programId = programId;
	}

	@Column(name="no_of_male_students", precision=10)
    private int noOfMaleStudents;
    @Column(name="no_of_female_students", precision=10)
    private int noOfFemaleStudents;
    @Column(name="total_students", precision=10)
    private int totalStudents;
    @Column(name="within_state", precision=10)
    private int withinState;
    @Column(name="outside_state", precision=10)
    private int outsideState;
    @Column(name="outside_country", precision=10)
    private int outsideCountry;
    @Column(name="economically_backward", precision=10)
    private int economicallyBackward;
    @Column(name="socially_challenged", precision=10)
    private int sociallyChallenged;
    @Column(name="recieved_fee_state_and_central_government", precision=10)
    private int recievedFeeStateAndCentralGovernment;
    @Column(name="recieved_fee_from_institutional_funds", precision=10)
    private int recievedFeeFromInstitutionalFunds;
    @Column(name="recieved_fee_from_private_bodies", precision=10)
    private int recievedFeeFromPrivateBodies;
    @Column(name="not_recieved_fee_reimbursement", precision=10)
    private int notRecievedFeeReimbursement;
    @Column(name="college_id", precision=10)
    private String collegeId;
    @Column(name="university_id", precision=10)
    private String universityId;

    /** Default constructor. */
    public TotalStudentStrength() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

  
    /**
     * Access method for noOfMaleStudents.
     *
     * @return the current value of noOfMaleStudents
     */
    public int getNoOfMaleStudents() {
        return noOfMaleStudents;
    }

    /**
     * Setter method for noOfMaleStudents.
     *
     * @param aNoOfMaleStudents the new value for noOfMaleStudents
     */
    public void setNoOfMaleStudents(int aNoOfMaleStudents) {
        noOfMaleStudents = aNoOfMaleStudents;
    }

    /**
     * Access method for noOfFemaleStudents.
     *
     * @return the current value of noOfFemaleStudents
     */
    public int getNoOfFemaleStudents() {
        return noOfFemaleStudents;
    }

    /**
     * Setter method for noOfFemaleStudents.
     *
     * @param aNoOfFemaleStudents the new value for noOfFemaleStudents
     */
    public void setNoOfFemaleStudents(int aNoOfFemaleStudents) {
        noOfFemaleStudents = aNoOfFemaleStudents;
    }

    /**
     * Access method for totalStudents.
     *
     * @return the current value of totalStudents
     */
    public int getTotalStudents() {
        return noOfMaleStudents+noOfFemaleStudents;
    }

    /**
     * Setter method for totalStudents.
     *
     * @param aTotalStudents the new value for totalStudents
     */
    public void setTotalStudents(int aTotalStudents) {
        totalStudents = noOfMaleStudents+noOfFemaleStudents;
    }

    /**
     * Access method for withinState.
     *
     * @return the current value of withinState
     */
    public int getWithinState() {
        return withinState;
    }

    /**
     * Setter method for withinState.
     *
     * @param aWithinState the new value for withinState
     */
    public void setWithinState(int aWithinState) {
        withinState = aWithinState;
    }

    /**
     * Access method for outsideState.
     *
     * @return the current value of outsideState
     */
    public int getOutsideState() {
        return outsideState;
    }

    /**
     * Setter method for outsideState.
     *
     * @param aOutsideState the new value for outsideState
     */
    public void setOutsideState(int aOutsideState) {
        outsideState = aOutsideState;
    }

    /**
     * Access method for outsideCountry.
     *
     * @return the current value of outsideCountry
     */
    public int getOutsideCountry() {
        return outsideCountry;
    }

    /**
     * Setter method for outsideCountry.
     *
     * @param aOutsideCountry the new value for outsideCountry
     */
    public void setOutsideCountry(int aOutsideCountry) {
        outsideCountry = aOutsideCountry;
    }

    /**
     * Access method for economicallyBackward.
     *
     * @return the current value of economicallyBackward
     */
    public int getEconomicallyBackward() {
        return economicallyBackward;
    }

    /**
     * Setter method for economicallyBackward.
     *
     * @param aEconomicallyBackward the new value for economicallyBackward
     */
    public void setEconomicallyBackward(int aEconomicallyBackward) {
        economicallyBackward = aEconomicallyBackward;
    }

    /**
     * Access method for sociallyChallenged.
     *
     * @return the current value of sociallyChallenged
     */
    public int getSociallyChallenged() {
        return sociallyChallenged;
    }

    /**
     * Setter method for sociallyChallenged.
     *
     * @param aSociallyChallenged the new value for sociallyChallenged
     */
    public void setSociallyChallenged(int aSociallyChallenged) {
        sociallyChallenged = aSociallyChallenged;
    }

    /**
     * Access method for recievedFeeStateAndCentralGovernment.
     *
     * @return the current value of recievedFeeStateAndCentralGovernment
     */
    public int getRecievedFeeStateAndCentralGovernment() {
        return recievedFeeStateAndCentralGovernment;
    }

    /**
     * Setter method for recievedFeeStateAndCentralGovernment.
     *
     * @param aRecievedFeeStateAndCentralGovernment the new value for recievedFeeStateAndCentralGovernment
     */
    public void setRecievedFeeStateAndCentralGovernment(int aRecievedFeeStateAndCentralGovernment) {
        recievedFeeStateAndCentralGovernment = aRecievedFeeStateAndCentralGovernment;
    }

    /**
     * Access method for recievedFeeFromInstitutionalFunds.
     *
     * @return the current value of recievedFeeFromInstitutionalFunds
     */
    public int getRecievedFeeFromInstitutionalFunds() {
        return recievedFeeFromInstitutionalFunds;
    }

    /**
     * Setter method for recievedFeeFromInstitutionalFunds.
     *
     * @param aRecievedFeeFromInstitutionalFunds the new value for recievedFeeFromInstitutionalFunds
     */
    public void setRecievedFeeFromInstitutionalFunds(int aRecievedFeeFromInstitutionalFunds) {
        recievedFeeFromInstitutionalFunds = aRecievedFeeFromInstitutionalFunds;
    }

    /**
     * Access method for recievedFeeFromPrivateBodies.
     *
     * @return the current value of recievedFeeFromPrivateBodies
     */
    public int getRecievedFeeFromPrivateBodies() {
        return recievedFeeFromPrivateBodies;
    }

    /**
     * Setter method for recievedFeeFromPrivateBodies.
     *
     * @param aRecievedFeeFromPrivateBodies the new value for recievedFeeFromPrivateBodies
     */
    public void setRecievedFeeFromPrivateBodies(int aRecievedFeeFromPrivateBodies) {
        recievedFeeFromPrivateBodies = aRecievedFeeFromPrivateBodies;
    }

    /**
     * Access method for notRecievedFeeReimbursement.
     *
     * @return the current value of notRecievedFeeReimbursement
     */
    public int getNotRecievedFeeReimbursement() {
        return notRecievedFeeReimbursement;
    }

    /**
     * Setter method for notRecievedFeeReimbursement.
     *
     * @param aNotRecievedFeeReimbursement the new value for notRecievedFeeReimbursement
     */
    public void setNotRecievedFeeReimbursement(int aNotRecievedFeeReimbursement) {
        notRecievedFeeReimbursement = aNotRecievedFeeReimbursement;
    }

	public String getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public String getUniversityId() {
		return universityId;
	}

	public void setUniversityId(String universityId) {
		this.universityId = universityId;
	}

	
    
    

  
}
