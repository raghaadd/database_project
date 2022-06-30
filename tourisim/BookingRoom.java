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
@Table(name = "BOOKING_ROOM")
@NamedQueries({
    @NamedQuery(name = "BookingRoom.findAll", query = "SELECT b FROM BookingRoom b"),
    @NamedQuery(name = "BookingRoom.findByCheckinDate", query = "SELECT b FROM BookingRoom b WHERE b.checkinDate = :checkinDate"),
    @NamedQuery(name = "BookingRoom.findByCheckoutDate", query = "SELECT b FROM BookingRoom b WHERE b.checkoutDate = :checkoutDate"),
    @NamedQuery(name = "BookingRoom.findByTotalPrice", query = "SELECT b FROM BookingRoom b WHERE b.totalPrice = :totalPrice"),
    @NamedQuery(name = "BookingRoom.findByNumberOfRooms", query = "SELECT b FROM BookingRoom b WHERE b.numberOfRooms = :numberOfRooms"),
    @NamedQuery(name = "BookingRoom.findByRawCount", query = "SELECT b FROM BookingRoom b WHERE b.rawCount = :rawCount")
   ,@NamedQuery(name = "BookingRoom.findAllorder", query = "SELECT b FROM BookingRoom b order by b.rawCount asc")})
public class BookingRoom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CHECKIN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkinDate;
    @Column(name = "CHECKOUT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkoutDate;
    @Column(name = "TOTAL_PRICE")
    private BigInteger totalPrice;
    @Column(name = "NUMBER_OF_ROOMS")
    private BigInteger numberOfRooms;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "RAW_COUNT")
    private BigDecimal rawCount;
    @JoinColumn(name = "PASSPORT_ID", referencedColumnName = "PASSPORT_ID")
    @ManyToOne
    private Clients passportId;
    @JoinColumn(name = "HOTEL_NAME", referencedColumnName = "HOTEL_NAME")
    @ManyToOne
    private Hotel_1 hotelName;

    public BookingRoom() {
    }

    public BookingRoom(BigDecimal rawCount) {
        this.rawCount = rawCount;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public BigInteger getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigInteger totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigInteger getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(BigInteger numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public BigDecimal getRawCount() {
        return rawCount;
    }

    public void setRawCount(BigDecimal rawCount) {
        this.rawCount = rawCount;
    }

    public Clients getPassportId() {
        return passportId;
    }

    public void setPassportId(Clients passportId) {
        this.passportId = passportId;
    }

    public Hotel_1 getHotelName() {
        return hotelName;
    }

    public void setHotelName(Hotel_1 hotelName) {
        this.hotelName = hotelName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rawCount != null ? rawCount.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookingRoom)) {
            return false;
        }
        BookingRoom other = (BookingRoom) object;
        if ((this.rawCount == null && other.rawCount != null) || (this.rawCount != null && !this.rawCount.equals(other.rawCount))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.BookingRoom[ rawCount=" + rawCount + " ]";
    }
    
}
