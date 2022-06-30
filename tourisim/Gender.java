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
@Table(name = "GENDER")
@NamedQueries({
    @NamedQuery(name = "Gender.findAll", query = "SELECT g FROM Gender g"),
    @NamedQuery(name = "Gender.findByGenderType", query = "SELECT g FROM Gender g WHERE g.genderType = :genderType")})
public class Gender implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GENDER_TYPE")
    private String genderType;
    @OneToMany(mappedBy = "genderType")
    private Collection<Person> personCollection;

    public Gender() {
    }

    public Gender(String genderType) {
        this.genderType = genderType;
    }

    public String getGenderType() {
        return genderType;
    }

    public void setGenderType(String genderType) {
        this.genderType = genderType;
    }

    public Collection<Person> getPersonCollection() {
        return personCollection;
    }

    public void setPersonCollection(Collection<Person> personCollection) {
        this.personCollection = personCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (genderType != null ? genderType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gender)) {
            return false;
        }
        Gender other = (Gender) object;
        if ((this.genderType == null && other.genderType != null) || (this.genderType != null && !this.genderType.equals(other.genderType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.Gender[ genderType=" + genderType + " ]";
    }
    
}
