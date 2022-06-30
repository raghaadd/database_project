/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourisim;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Msys
 */
@Entity
@Table(name = "ADMINSTRATOR")
@NamedQueries({
    @NamedQuery(name = "Adminstrator.findAll", query = "SELECT a FROM Adminstrator a"),
    @NamedQuery(name = "Adminstrator.findByAid", query = "SELECT a FROM Adminstrator a WHERE a.aid = :aid"),
    @NamedQuery(name = "Adminstrator.findByApassword", query = "SELECT a FROM Adminstrator a WHERE a.apassword = :apassword")})
public class Adminstrator implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "AID")
    private BigDecimal aid;
    @Basic(optional = false)
    @Column(name = "APASSWORD")
    private String apassword;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aid")
    private Collection<Employeee> employeeeCollection;
    @JoinColumn(name = "PERSONAL_ID", referencedColumnName = "PERSONAL_ID")
    @ManyToOne(optional = false)
    private Person personalId;

    public Adminstrator() {
    }

    public Adminstrator(BigDecimal aid) {
        this.aid = aid;
    }

    public Adminstrator(BigDecimal aid, String apassword) {
        this.aid = aid;
        this.apassword = apassword;
    }

    public BigDecimal getAid() {
        return aid;
    }

    public void setAid(BigDecimal aid) {
        this.aid = aid;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public Collection<Employeee> getEmployeeeCollection() {
        return employeeeCollection;
    }

    public void setEmployeeeCollection(Collection<Employeee> employeeeCollection) {
        this.employeeeCollection = employeeeCollection;
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
        hash += (aid != null ? aid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adminstrator)) {
            return false;
        }
        Adminstrator other = (Adminstrator) object;
        if ((this.aid == null && other.aid != null) || (this.aid != null && !this.aid.equals(other.aid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.Adminstrator[ aid=" + aid + " ]";
    }
    
}
