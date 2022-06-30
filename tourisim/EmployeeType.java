/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourisim;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Msys
 */
@Entity
@Table(name = "EMPLOYEE_TYPE")
@NamedQueries({
    @NamedQuery(name = "EmployeeType.findAll", query = "SELECT e FROM EmployeeType e"),
    @NamedQuery(name = "EmployeeType.findByEmployeeType", query = "SELECT e FROM EmployeeType e WHERE e.employeeType = :employeeType")})
public class EmployeeType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_TYPE")
    private String employeeType;
    @OneToMany(mappedBy = "employeeType")
    private Collection<Employeee> employeeeCollection;

    public EmployeeType() {
    }

    public EmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public Collection<Employeee> getEmployeeeCollection() {
        return employeeeCollection;
    }

    public void setEmployeeeCollection(Collection<Employeee> employeeeCollection) {
        this.employeeeCollection = employeeeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeType != null ? employeeType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeType)) {
            return false;
        }
        EmployeeType other = (EmployeeType) object;
        if ((this.employeeType == null && other.employeeType != null) || (this.employeeType != null && !this.employeeType.equals(other.employeeType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.EmployeeType[ employeeType=" + employeeType + " ]";
    }
    
}
