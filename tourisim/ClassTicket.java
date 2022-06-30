/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourisim;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "CLASS_TICKET")
@NamedQueries({
    @NamedQuery(name = "ClassTicket.findAll", query = "SELECT c FROM ClassTicket c"),
    @NamedQuery(name = "ClassTicket.findByClassType", query = "SELECT c FROM ClassTicket c WHERE c.classType = :classType"),
    @NamedQuery(name = "ClassTicket.findByClassPrice", query = "SELECT c FROM ClassTicket c WHERE c.classPrice = :classPrice")})
public class ClassTicket implements Serializable {

    @OneToMany(mappedBy = "classType")
    private Collection<IssueTicket_1> issueTicket1Collection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLASS_TYPE")
    private String classType;
    @Column(name = "CLASS_PRICE")
    private BigInteger classPrice;

    public ClassTicket() {
    }

    public ClassTicket(String classType) {
        this.classType = classType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public BigInteger getClassPrice() {
        return classPrice;
    }

    public void setClassPrice(BigInteger classPrice) {
        this.classPrice = classPrice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (classType != null ? classType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClassTicket)) {
            return false;
        }
        ClassTicket other = (ClassTicket) object;
        if ((this.classType == null && other.classType != null) || (this.classType != null && !this.classType.equals(other.classType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.ClassTicket[ classType=" + classType + " ]";
    }

    public Collection<IssueTicket_1> getIssueTicket1Collection() {
        return issueTicket1Collection;
    }

    public void setIssueTicket1Collection(Collection<IssueTicket_1> issueTicket1Collection) {
        this.issueTicket1Collection = issueTicket1Collection;
    }
    
}
