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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "CLIENTS")
@NamedQueries({
    @NamedQuery(name = "Clients.findAll", query = "SELECT c FROM Clients c"),
    @NamedQuery(name = "Clients.findByPassportId", query = "SELECT c FROM Clients c WHERE c.passportId = :passportId")
,@NamedQuery(name = "Clients.findAllorder", query = "SELECT c FROM Clients c order by c.passportId desc")})
public class Clients implements Serializable {

    @OneToMany(mappedBy = "passportId")
    private Collection<IssueTicket_1> issueTicket1Collection;

    @JoinTable(name = "CHOOSE_OFFER", joinColumns = {
        @JoinColumn(name = "PASSPORT_ID", referencedColumnName = "PASSPORT_ID")}, inverseJoinColumns = {
        @JoinColumn(name = "OFFER_NAME", referencedColumnName = "OFFER_NAME")})
    @ManyToMany
    private Collection<Offers_1> offersCollection;

    @ManyToMany(mappedBy = "clientsCollection")
    private Collection<Offers_1> offers1Collection;
    @OneToMany(mappedBy = "passportId")
    private Collection<TakeCar> takeCarCollection;
    @OneToMany(mappedBy = "passportId")
    private Collection<BookingRoom> bookingRoomCollection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "passportId")
    private Collection<RegisterClients> registerClientsCollection;

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PASSPORT_ID")
    private BigDecimal passportId;
    @JoinColumn(name = "PERSONAL_ID", referencedColumnName = "PERSONAL_ID")
    @ManyToOne(optional = false)
    private Person personalId;

    public Clients() {
    }

    public Clients(BigDecimal passportId) {
        this.passportId = passportId;
    }

    public BigDecimal getPassportId() {
        return passportId;
    }

    public void setPassportId(BigDecimal passportId) {
        this.passportId = passportId;
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
        hash += (passportId != null ? passportId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clients)) {
            return false;
        }
        Clients other = (Clients) object;
        if ((this.passportId == null && other.passportId != null) || (this.passportId != null && !this.passportId.equals(other.passportId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.Clients[ passportId=" + passportId + " ]";
    }

    public Collection<RegisterClients> getRegisterClientsCollection() {
        return registerClientsCollection;
    }

    public void setRegisterClientsCollection(Collection<RegisterClients> registerClientsCollection) {
        this.registerClientsCollection = registerClientsCollection;
    }

    public Collection<Offers_1> getOffers1Collection() {
        return offers1Collection;
    }

    public void setOffers1Collection(Collection<Offers_1> offers1Collection) {
        this.offers1Collection = offers1Collection;
    }

    public Collection<TakeCar> getTakeCarCollection() {
        return takeCarCollection;
    }

    public void setTakeCarCollection(Collection<TakeCar> takeCarCollection) {
        this.takeCarCollection = takeCarCollection;
    }

    public Collection<BookingRoom> getBookingRoomCollection() {
        return bookingRoomCollection;
    }

    public void setBookingRoomCollection(Collection<BookingRoom> bookingRoomCollection) {
        this.bookingRoomCollection = bookingRoomCollection;
    }

    public Collection<Offers_1> getOffersCollection() {
        return offersCollection;
    }

    public void setOffersCollection(Collection<Offers_1> offersCollection) {
        this.offersCollection = offersCollection;
    }

    public Collection<IssueTicket_1> getIssueTicket1Collection() {
        return issueTicket1Collection;
    }

    public void setIssueTicket1Collection(Collection<IssueTicket_1> issueTicket1Collection) {
        this.issueTicket1Collection = issueTicket1Collection;
    }
    
}
