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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Msys
 */
@Entity
@Table(name = "PERSON")
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p"),
    @NamedQuery(name = "Person.findByPersonalId", query = "SELECT p FROM Person p WHERE p.personalId = :personalId"),
    @NamedQuery(name = "Person.findByFirstName", query = "SELECT p FROM Person p WHERE p.firstName = :firstName"),
    @NamedQuery(name = "Person.findByLastName", query = "SELECT p FROM Person p WHERE p.lastName = :lastName"),
    @NamedQuery(name = "Person.findByBdate", query = "SELECT p FROM Person p WHERE p.bdate = :bdate"),
    @NamedQuery(name = "Person.findByAddress", query = "SELECT p FROM Person p WHERE p.address = :address"),
    @NamedQuery(name = "Person.findByEmailAdress", query = "SELECT p FROM Person p WHERE p.emailAdress = :emailAdress")})
public class Person implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personalId")
    private Collection<Clients> clientsCollection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personalId")
   //private Collection<Clients> clientsCollection;

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PERSONAL_ID")
    private BigDecimal personalId;
    @Basic(optional = false)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "BDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bdate;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "EMAIL_ADRESS")
    private String emailAdress;
    @JoinColumn(name = "GENDER_TYPE", referencedColumnName = "GENDER_TYPE")
    @ManyToOne
    private Gender genderType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personalId")
    private Collection<Employeee> employeeeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personalId")
    private Collection<Adminstrator> adminstratorCollection;

    public Person() {
    }

    public Person(BigDecimal personalId) {
        this.personalId = personalId;
    }

    public Person(BigDecimal personalId, String firstName, String lastName) {
        this.personalId = personalId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public BigDecimal getPersonalId() {
        return personalId;
    }

    public void setPersonalId(BigDecimal personalId) {
        this.personalId = personalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public Gender getGenderType() {
        return genderType;
    }

    public void setGenderType(Gender genderType) {
        this.genderType = genderType;
    }

    public Collection<Employeee> getEmployeeeCollection() {
        return employeeeCollection;
    }

    public void setEmployeeeCollection(Collection<Employeee> employeeeCollection) {
        this.employeeeCollection = employeeeCollection;
    }

    public Collection<Adminstrator> getAdminstratorCollection() {
        return adminstratorCollection;
    }

    public void setAdminstratorCollection(Collection<Adminstrator> adminstratorCollection) {
        this.adminstratorCollection = adminstratorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personalId != null ? personalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.personalId == null && other.personalId != null) || (this.personalId != null && !this.personalId.equals(other.personalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.Person[ personalId=" + personalId + " ]";
    }

//    public Collection<Clients> getClientsCollection() {
//        return clientsCollection;
//    }
//
//    public void setClientsCollection(Collection<Clients> clientsCollection) {
//        this.clientsCollection = clientsCollection;
//    }

    public Collection<Clients> getClientsCollection() {
        return clientsCollection;
    }

    public void setClientsCollection(Collection<Clients> clientsCollection) {
        this.clientsCollection = clientsCollection;
    }
    
}
