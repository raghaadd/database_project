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
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Msys
 */
@Entity
@Table(name = "LANGUAGES")
@NamedQueries({
    @NamedQuery(name = "Languages.findAll", query = "SELECT l FROM Languages l"),
    @NamedQuery(name = "Languages.findByLanguages", query = "SELECT l FROM Languages l WHERE l.languages = :languages")})
public class Languages implements Serializable {

    @OneToMany(mappedBy = "languages")
    private Collection<Offers_1> offersCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LANGUAGES")
    private String languages;
    @ManyToMany(mappedBy = "languagesCollection")
    private Collection<Employeee> employeeeCollection;

    public Languages() {
    }

    public Languages(String languages) {
        this.languages = languages;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
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
        hash += (languages != null ? languages.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Languages)) {
            return false;
        }
        Languages other = (Languages) object;
        if ((this.languages == null && other.languages != null) || (this.languages != null && !this.languages.equals(other.languages))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.Languages[ languages=" + languages + " ]";
    }

    public Collection<Offers_1> getOffersCollection() {
        return offersCollection;
    }

    public void setOffersCollection(Collection<Offers_1> offersCollection) {
        this.offersCollection = offersCollection;
    }
    
}
