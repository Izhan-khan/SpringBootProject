// Generated with g9.

package com.innovento.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="college_master")
public class CollegeMaster implements Serializable {

    private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="u_id", unique=true, nullable=false, precision=19)
    private long cId;
    @Column(name="college_id", length=255)
    private String collegeId;
    @Column(name="college_name", length=255)
    private String collegeName;
    @Column(name="college_type", length=255)
    private String collegeType;
    @Column(name="college_address", length=500)
    private String collegeAddress;
    @Column(name="college_website", length=255)
    private String collegeWebsite;
    @Column(name="college_management", length=255)
    private String collegeManagement;
    @Column(name="college_establishment_year", length=255)
    private String collegeEstablishmentYear;
    @Column(name="college_specialized_in", length=255)
    private String collegeSpecializedIn;
    @Column(name="college_location", length=255)
    private String collegeLocation;
    @Column(name="college_upload_year", length=255)
    private String collegeUploadYear;
    @Column(name="college_survey_year", length=255)
    private String collegeSurveyYear;

    /** Default constructor. */
    public CollegeMaster() {
        super();
    }

    /**
     * Access method for cId.
     *
     * @return the current value of cId
     */
    public long getCId() {
        return cId;
    }

    /**
     * Setter method for cId.
     *
     * @param aCId the new value for cId
     */
    public void setCId(long aCId) {
        cId = aCId;
    }

    /**
     * Access method for collegeId.
     *
     * @return the current value of collegeId
     */
    public String getCollegeId() {
        return collegeId;
    }

    /**
     * Setter method for collegeId.
     *
     * @param aCollegeId the new value for collegeId
     */
    public void setCollegeId(String aCollegeId) {
        collegeId = aCollegeId;
    }

    /**
     * Access method for collegeName.
     *
     * @return the current value of collegeName
     */
    public String getCollegeName() {
        return collegeName;
    }

    /**
     * Setter method for collegeName.
     *
     * @param aCollegeName the new value for collegeName
     */
    public void setCollegeName(String aCollegeName) {
        collegeName = aCollegeName;
    }

    /**
     * Access method for collegeType.
     *
     * @return the current value of collegeType
     */
    public String getCollegeType() {
        return collegeType;
    }

    /**
     * Setter method for collegeType.
     *
     * @param aCollegeType the new value for collegeType
     */
    public void setCollegeType(String aCollegeType) {
        collegeType = aCollegeType;
    }

    /**
     * Access method for collegeAddress.
     *
     * @return the current value of collegeAddress
     */
    public String getCollegeAddress() {
        return collegeAddress;
    }

    /**
     * Setter method for collegeAddress.
     *
     * @param aCollegeAddress the new value for collegeAddress
     */
    public void setCollegeAddress(String aCollegeAddress) {
        collegeAddress = aCollegeAddress;
    }

    /**
     * Access method for collegeWebsite.
     *
     * @return the current value of collegeWebsite
     */
    public String getCollegeWebsite() {
        return collegeWebsite;
    }

    /**
     * Setter method for collegeWebsite.
     *
     * @param aCollegeWebsite the new value for collegeWebsite
     */
    public void setCollegeWebsite(String aCollegeWebsite) {
        collegeWebsite = aCollegeWebsite;
    }

    /**
     * Access method for collegeManagement.
     *
     * @return the current value of collegeManagement
     */
    public String getCollegeManagement() {
        return collegeManagement;
    }

    /**
     * Setter method for collegeManagement.
     *
     * @param aCollegeManagement the new value for collegeManagement
     */
    public void setCollegeManagement(String aCollegeManagement) {
        collegeManagement = aCollegeManagement;
    }

    /**
     * Access method for collegeEstablishmentYear.
     *
     * @return the current value of collegeEstablishmentYear
     */
    public String getCollegeEstablishmentYear() {
        return collegeEstablishmentYear;
    }

    /**
     * Setter method for collegeEstablishmentYear.
     *
     * @param aCollegeEstablishmentYear the new value for collegeEstablishmentYear
     */
    public void setCollegeEstablishmentYear(String aCollegeEstablishmentYear) {
        collegeEstablishmentYear = aCollegeEstablishmentYear;
    }

    /**
     * Access method for collegeSpecializedIn.
     *
     * @return the current value of collegeSpecializedIn
     */
    public String getCollegeSpecializedIn() {
        return collegeSpecializedIn;
    }

    /**
     * Setter method for collegeSpecializedIn.
     *
     * @param aCollegeSpecializedIn the new value for collegeSpecializedIn
     */
    public void setCollegeSpecializedIn(String aCollegeSpecializedIn) {
        collegeSpecializedIn = aCollegeSpecializedIn;
    }

    /**
     * Access method for collegeLocation.
     *
     * @return the current value of collegeLocation
     */
    public String getCollegeLocation() {
        return collegeLocation;
    }

    /**
     * Setter method for collegeLocation.
     *
     * @param aCollegeLocation the new value for collegeLocation
     */
    public void setCollegeLocation(String aCollegeLocation) {
        collegeLocation = aCollegeLocation;
    }

    /**
     * Access method for collegeUploadYear.
     *
     * @return the current value of collegeUploadYear
     */
    public String getCollegeUploadYear() {
        return collegeUploadYear;
    }

    /**
     * Setter method for collegeUploadYear.
     *
     * @param aCollegeUploadYear the new value for collegeUploadYear
     */
    public void setCollegeUploadYear(String aCollegeUploadYear) {
        collegeUploadYear = aCollegeUploadYear;
    }

    /**
     * Access method for collegeSurveyYear.
     *
     * @return the current value of collegeSurveyYear
     */
    public String getCollegeSurveyYear() {
        return collegeSurveyYear;
    }

    /**
     * Setter method for collegeSurveyYear.
     *
     * @param aCollegeSurveyYear the new value for collegeSurveyYear
     */
    public void setCollegeSurveyYear(String aCollegeSurveyYear) {
        collegeSurveyYear = aCollegeSurveyYear;
    }

}
