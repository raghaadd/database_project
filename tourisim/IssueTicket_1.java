/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourisim;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "ISSUE_TICKET")
@NamedQueries({
    @NamedQuery(name = "IssueTicket_1.findAll", query = "SELECT i FROM IssueTicket_1 i"),
    @NamedQuery(name = "IssueTicket_1.findByTicketId", query = "SELECT i FROM IssueTicket_1 i WHERE i.ticketId = :ticketId"),
    @NamedQuery(name = "IssueTicket_1.findByAirportname", query = "SELECT i FROM IssueTicket_1 i WHERE i.airportname = :airportname"),
    @NamedQuery(name = "IssueTicket_1.findByTravelDate", query = "SELECT i FROM IssueTicket_1 i WHERE i.travelDate = :travelDate"),
    @NamedQuery(name = "IssueTicket_1.findByReturnDate", query = "SELECT i FROM IssueTicket_1 i WHERE i.returnDate = :returnDate"),
    @NamedQuery(name = "IssueTicket_1.findByTravelfrom", query = "SELECT i FROM IssueTicket_1 i WHERE i.travelfrom = :travelfrom"),
    @NamedQuery(name = "IssueTicket_1.findByTravelto", query = "SELECT i FROM IssueTicket_1 i WHERE i.travelto = :travelto"),
    @NamedQuery(name = "IssueTicket_1.findByTotalPrice", query = "SELECT i FROM IssueTicket_1 i WHERE i.totalPrice = :totalPrice")
,@NamedQuery(name = "IssueTicket_1.findAllorder", query = "SELECT i FROM IssueTicket_1 i order by i.ticketId asc")})
public class IssueTicket_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TICKET_ID")
    private BigDecimal ticketId;
    @Column(name = "AIRPORTNAME")
    private String airportname;
    @Column(name = "TRAVEL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date travelDate;
    @Column(name = "RETURN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date returnDate;
    @Column(name = "TRAVELFROM")
    private String travelfrom;
    @Column(name = "TRAVELTO")
    private String travelto;
    @Column(name = "TOTAL_PRICE")
    private BigInteger totalPrice;
    @JoinColumn(name = "CLASS_TYPE", referencedColumnName = "CLASS_TYPE")
    @ManyToOne
    private ClassTicket classType;
    @JoinColumn(name = "PASSPORT_ID", referencedColumnName = "PASSPORT_ID")
    @ManyToOne
    private Clients passportId;
    @JoinColumn(name = "PASSENGER_TYPE", referencedColumnName = "PASSENGER_TYPE")
    @ManyToOne
    private Passenger passengerType;

    public IssueTicket_1() {
    }

    public IssueTicket_1(BigDecimal ticketId) {
        this.ticketId = ticketId;
    }

    public BigDecimal getTicketId() {
        return ticketId;
    }

    public void setTicketId(BigDecimal ticketId) {
        this.ticketId = ticketId;
    }

    public String getAirportname() {
        return airportname;
    }

    public void setAirportname(String airportname) {
        this.airportname = airportname;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getTravelfrom() {
        return travelfrom;
    }

    public void setTravelfrom(String travelfrom) {
        this.travelfrom = travelfrom;
    }

    public String getTravelto() {
        return travelto;
    }

    public void setTravelto(String travelto) {
        this.travelto = travelto;
    }

    public BigInteger getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigInteger totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ClassTicket getClassType() {
        return classType;
    }

    public void setClassType(ClassTicket classType) {
        this.classType = classType;
    }

    public Clients getPassportId() {
        return passportId;
    }

    public void setPassportId(Clients passportId) {
        this.passportId = passportId;
    }

    public Passenger getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(Passenger passengerType) {
        this.passengerType = passengerType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ticketId != null ? ticketId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IssueTicket_1)) {
            return false;
        }
        IssueTicket_1 other = (IssueTicket_1) object;
        if ((this.ticketId == null && other.ticketId != null) || (this.ticketId != null && !this.ticketId.equals(other.ticketId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.IssueTicket_1[ ticketId=" + ticketId + " ]";
    }
    
}
