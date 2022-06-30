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
@Table(name = "PASSENGER")
@NamedQueries({
    @NamedQuery(name = "Passenger.findAll", query = "SELECT p FROM Passenger p"),
    @NamedQuery(name = "Passenger.findByPassengerType", query = "SELECT p FROM Passenger p WHERE p.passengerType = :passengerType"),
    @NamedQuery(name = "Passenger.findByPassengerPrice", query = "SELECT p FROM Passenger p WHERE p.passengerPrice = :passengerPrice")})
public class Passenger implements Serializable {

    @OneToMany(mappedBy = "passengerType")
    private Collection<IssueTicket_1> issueTicket1Collection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PASSENGER_TYPE")
    private String passengerType;
    @Column(name = "PASSENGER_PRICE")
    private BigInteger passengerPrice;

    public Passenger() {
    }

    public Passenger(String passengerType) {
        this.passengerType = passengerType;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public BigInteger getPassengerPrice() {
        return passengerPrice;
    }

    public void setPassengerPrice(BigInteger passengerPrice) {
        this.passengerPrice = passengerPrice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (passengerType != null ? passengerType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passenger)) {
            return false;
        }
        Passenger other = (Passenger) object;
        if ((this.passengerType == null && other.passengerType != null) || (this.passengerType != null && !this.passengerType.equals(other.passengerType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.Passenger[ passengerType=" + passengerType + " ]";
    }

    public Collection<IssueTicket_1> getIssueTicket1Collection() {
        return issueTicket1Collection;
    }

    public void setIssueTicket1Collection(Collection<IssueTicket_1> issueTicket1Collection) {
        this.issueTicket1Collection = issueTicket1Collection;
    }
    
}
