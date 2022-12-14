// Generated with g9.

package com.innovento.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="university_master")
public class UniversityMaster implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="u_id", unique=true, nullable=false, precision=19)
    private long uId;
    @Column(name="university_id", length=255)
    private String universityId;
    @Column(name="university_name", length=255)
    private String universityName;
    @Column(name="university_type", length=255)
    private String universityType;
    @Column(name="university_state", length=255)
    private String universityState;
    @Column(name="university_district", length=255)
    private String universityDistrict;
    @Column(name="university_address", length=255)
    private String universityAddress;
    @Column(name="year_university_declared", length=255)
    private String yearUniversityDeclared;
    @Column(name="university_specialized_in", length=255)
    private String universitySpecializedIn;
    @Column(name="university_location", length=255)
    private String universityLocation;
    @Column(name="university_upload_year", length=255)
    private String universityUploadYear;
    @Column(name="institute_added_survey_year", length=255)
    private String instituteAddedSurveyYear;

    /**
     * Access method for uId.
     *
     * @return the current value of uId
     */
    public long getUId() {
        return uId;
    }

    /**
     * Setter method for uId.
     *
     * @param aUId the new value for uId
     */
    public void setUId(long aUId) {
        uId = aUId;
    }

    /**
     * Access method for universityId.
     *
     * @return the current value of universityId
     */
    public String getUniversityId() {
        return universityId;
    }

    /**
     * Setter method for universityId.
     *
     * @param aUniversityId the new value for universityId
     */
    public void setUniversityId(String aUniversityId) {
        universityId = aUniversityId;
    }

    /**
     * Access method for universityName.
     *
     * @return the current value of universityName
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * Setter method for universityName.
     *
     * @param aUniversityName the new value for universityName
     */
    public void setUniversityName(String aUniversityName) {
        universityName = aUniversityName;
    }

    /**
     * Access method for universityType.
     *
     * @return the current value of universityType
     */
    public String getUniversityType() {
        return universityType;
    }

    /**
     * Setter method for universityType.
     *
     * @param aUniversityType the new value for universityType
     */
    public void setUniversityType(String aUniversityType) {
        universityType = aUniversityType;
    }

    /**
     * Access method for universityState.
     *
     * @return the current value of universityState
     */
    public String getUniversityState() {
        return universityState;
    }

    /**
     * Setter method for universityState.
     *
     * @param aUniversityState the new value for universityState
     */
    public void setUniversityState(String aUniversityState) {
        universityState = aUniversityState;
    }

    /**
     * Access method for universityDistrict.
     *
     * @return the current value of universityDistrict
     */
    public String getUniversityDistrict() {
        return universityDistrict;
    }

    /**
     * Setter method for universityDistrict.
     *
     * @param aUniversityDistrict the new value for universityDistrict
     */
    public void setUniversityDistrict(String aUniversityDistrict) {
        universityDistrict = aUniversityDistrict;
    }

    /**
     * Access method for universityAddress.
     *
     * @return the current value of universityAddress
     */
    public String getUniversityAddress() {
        return universityAddress;
    }

    /**
     * Setter method for universityAddress.
     *
     * @param aUniversityAddress the new value for universityAddress
     */
    public void setUniversityAddress(String aUniversityAddress) {
        universityAddress = aUniversityAddress;
    }

    /**
     * Access method for yearUniversityDeclared.
     *
     * @return the current value of yearUniversityDeclared
     */
    public String getYearUniversityDeclared() {
        return yearUniversityDeclared;
    }

    /**
     * Setter method for yearUniversityDeclared.
     *
     * @param aYearUniversityDeclared the new value for yearUniversityDeclared
     */
    public void setYearUniversityDeclared(String aYearUniversityDeclared) {
        yearUniversityDeclared = aYearUniversityDeclared;
    }

    /**
     * Access method for universitySpecializedIn.
     *
     * @return the current value of universitySpecializedIn
     */
    public String getUniversitySpecializedIn() {
        return universitySpecializedIn;
    }

    /**
     * Setter method for universitySpecializedIn.
     *
     * @param aUniversitySpecializedIn the new value for universitySpecializedIn
     */
    public void setUniversitySpecializedIn(String aUniversitySpecializedIn) {
        universitySpecializedIn = aUniversitySpecializedIn;
    }

    /**
     * Access method for universityLocation.
     *
     * @return the current value of universityLocation
     */
    public String getUniversityLocation() {
        return universityLocation;
    }

    /**
     * Setter method for universityLocation.
     *
     * @param aUniversityLocation the new value for universityLocation
     */
    public void setUniversityLocation(String aUniversityLocation) {
        universityLocation = aUniversityLocation;
    }

    /**
     * Access method for universityUploadYear.
     *
     * @return the current value of universityUploadYear
     */
    public String getUniversityUploadYear() {
        return universityUploadYear;
    }

    /**
     * Setter method for universityUploadYear.
     *
     * @param aUniversityUploadYear the new value for universityUploadYear
     */
    public void setUniversityUploadYear(String aUniversityUploadYear) {
        universityUploadYear = aUniversityUploadYear;
    }

    /**
     * Access method for instituteAddedSurveyYear.
     *
     * @return the current value of instituteAddedSurveyYear
     */
    public String getInstituteAddedSurveyYear() {
        return instituteAddedSurveyYear;
    }

    /**
     * Setter method for instituteAddedSurveyYear.
     *
     * @param aInstituteAddedSurveyYear the new value for instituteAddedSurveyYear
     */
    public void setInstituteAddedSurveyYear(String aInstituteAddedSurveyYear) {
        instituteAddedSurveyYear = aInstituteAddedSurveyYear;
    }

    /**
     * Compares the key for this instance with another UniversityMaster.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UniversityMaster and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UniversityMaster)) {
            return false;
        }
        UniversityMaster that = (UniversityMaster) other;
        if (this.getUId() != that.getUId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UniversityMaster.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UniversityMaster)) return false;
        return this.equalKeys(other) && ((UniversityMaster)other).equalKeys(this);
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
        i = (int)(getUId() ^ (getUId()>>>32));
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
        StringBuffer sb = new StringBuffer("[UniversityMaster |");
        sb.append(" uId=").append(getUId());
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
        ret.put("uId", Long.valueOf(getUId()));
        return ret;
    }

}
