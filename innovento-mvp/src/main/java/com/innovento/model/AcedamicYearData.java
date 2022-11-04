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

@Entity(name="acedamic_year_data")
public class AcedamicYearData implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(name="2020_21_count", precision=10)
    private int _2020_21_Count;
    @Column(name="2019_20_count", precision=10)
    private int _2019_20_Count;
    @Column(name="2018_19_count", precision=10)
    private int _2018_19_Count;
    @Column(name="2017_18_count", precision=10)
    private int _2017_18_Count;
    @Column(name="2016_17_count", precision=10)
    private int _2016_17_Count;
    @Column(name="2015_16_count", precision=10)
    private int _2015_16_Count;

    /** Default constructor. */
    public AcedamicYearData() {
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
     * Access method for _2020_21_Count.
     *
     * @return the current value of _2020_21_Count
     */
    public int get_2020_21_Count() {
        return _2020_21_Count;
    }

    /**
     * Setter method for _2020_21_Count.
     *
     * @param a_202021Count the new value for _2020_21_Count
     */
    public void set_2020_21_Count(int a_202021Count) {
        _2020_21_Count = a_202021Count;
    }

    /**
     * Access method for _2019_20_Count.
     *
     * @return the current value of _2019_20_Count
     */
    public int get_2019_20_Count() {
        return _2019_20_Count;
    }

    /**
     * Setter method for _2019_20_Count.
     *
     * @param a_201920Count the new value for _2019_20_Count
     */
    public void set_2019_20_Count(int a_201920Count) {
        _2019_20_Count = a_201920Count;
    }

    /**
     * Access method for _2018_19_Count.
     *
     * @return the current value of _2018_19_Count
     */
    public int get_2018_19_Count() {
        return _2018_19_Count;
    }

    /**
     * Setter method for _2018_19_Count.
     *
     * @param a_201819Count the new value for _2018_19_Count
     */
    public void set_2018_19_Count(int a_201819Count) {
        _2018_19_Count = a_201819Count;
    }

    /**
     * Access method for _2017_18_Count.
     *
     * @return the current value of _2017_18_Count
     */
    public int get_2017_18_Count() {
        return _2017_18_Count;
    }

    /**
     * Setter method for _2017_18_Count.
     *
     * @param a_201718Count the new value for _2017_18_Count
     */
    public void set_2017_18_Count(int a_201718Count) {
        _2017_18_Count = a_201718Count;
    }

    /**
     * Access method for _2016_17_Count.
     *
     * @return the current value of _2016_17_Count
     */
    public int get_2016_17_Count() {
        return _2016_17_Count;
    }

    /**
     * Setter method for _2016_17_Count.
     *
     * @param a_201617Count the new value for _2016_17_Count
     */
    public void set_2016_17_Count(int a_201617Count) {
        _2016_17_Count = a_201617Count;
    }

    /**
     * Access method for _2015_16_Count.
     *
     * @return the current value of _2015_16_Count
     */
    public int get_2015_16_Count() {
        return _2015_16_Count;
    }

    /**
     * Setter method for _2015_16_Count.
     *
     * @param a_201516Count the new value for _2015_16_Count
     */
    public void set_2015_16_Count(int a_201516Count) {
        _2015_16_Count = a_201516Count;
    }

}
