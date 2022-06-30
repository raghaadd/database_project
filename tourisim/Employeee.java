/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourisim;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Msys
 */
@Entity
@Table(name = "EMPLOYEEE")
@NamedQueries({
    @NamedQuery(name = "Employeee.findAll", query = "SELECT e FROM Employeee e"),
    @NamedQuery(name = "Employeee.findByEmploymentId", query = "SELECT e FROM Employeee e WHERE e.employmentId = :employmentId"),
    @NamedQuery(name = "Employeee.findByHireDate", query = "SELECT e FROM Employeee e WHERE e.hireDate = :hireDate"),
    @NamedQuery(name = "Employeee.findByEpassword", query = "SELECT e FROM Employeee e WHERE e.epassword = :epassword"),
    @NamedQuery(name = "Employeee.findByTripStartDate", query = "SELECT e FROM Employeee e WHERE e.tripStartDate = :tripStartDate"),
    @NamedQuery(name = "Employeee.findByTripEndDate", query = "SELECT e FROM Employeee e WHERE e.tripEndDate = :tripEndDate")
,@NamedQuery(name = "Employeee.findAllorder", query = "SELECT e FROM Employeee e order by e.employmentId asc")})
public class Employeee implements Serializable {

    @JoinTable(name = "GUIDE_LANGUAGES", joinColumns = {
        @JoinColumn(name = "EID", referencedColumnName = "EMPLOYMENT_ID")}, inverseJoinColumns = {
        @JoinColumn(name = "LANGUGES", referencedColumnName = "LANGUAGES")})
    @ManyToMany
    private Collection<Languages> languagesCollection;

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "EMPLOYMENT_ID")
    private BigDecimal employmentId;
    @Column(name = "HIRE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hireDate;
    @Column(name = "EPASSWORD")
    private String epassword;
    @Column(name = "TRIP_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tripStartDate;
    @Column(name = "TRIP_END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tripEndDate;
    @JoinColumn(name = "AID", referencedColumnName = "AID")
    @ManyToOne(optional = false)
    private Adminstrator aid;
    @JoinColumn(name = "EMPLOYEE_TYPE", referencedColumnName = "EMPLOYEE_TYPE")
    @ManyToOne
    private EmployeeType employeeType;
    @JoinColumn(name = "PERSONAL_ID", referencedColumnName = "PERSONAL_ID")
    @ManyToOne(optional = false)
    private Person personalId;

    public Employeee() {
    }

    public Employeee(BigDecimal employmentId) {
        this.employmentId = employmentId;
    }

    public BigDecimal getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(BigDecimal employmentId) {
        this.employmentId = employmentId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getEpassword() {
        return epassword;
    }

    public void setEpassword(String epassword) {
        this.epassword = epassword;
    }

    public Date getTripStartDate() {
        return tripStartDate;
    }

    public void setTripStartDate(Date tripStartDate) {
        this.tripStartDate = tripStartDate;
    }

    public Date getTripEndDate() {
        return tripEndDate;
    }

    public void setTripEndDate(Date tripEndDate) {
        this.tripEndDate = tripEndDate;
    }

    public Adminstrator getAid() {
        return aid;
    }

    public void setAid(Adminstrator aid) {
        this.aid = aid;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Person getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Person personalId) {
        this.personalId = personalId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employmentId != null ? employmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employeee)) {
            return false;
        }
        Employeee other = (Employeee) object;
        if ((this.employmentId == null && other.employmentId != null) || (this.employmentId != null && !this.employmentId.equals(other.employmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.Employeee[ employmentId=" + employmentId + " ]";
    }

    public Collection<Languages> getLanguagesCollection() {
        return languagesCollection;
    }

    public void setLanguagesCollection(Collection<Languages> languagesCollection) {
        this.languagesCollection = languagesCollection;
    }
    
}
