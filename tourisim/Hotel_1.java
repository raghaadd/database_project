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
@Table(name = "HOTEL")
@NamedQueries({
    @NamedQuery(name = "Hotel_1.findAll", query = "SELECT h FROM Hotel_1 h"),
    @NamedQuery(name = "Hotel_1.findByHotelName", query = "SELECT h FROM Hotel_1 h WHERE h.hotelName = :hotelName"),
    @NamedQuery(name = "Hotel_1.findByHotelPrice", query = "SELECT h FROM Hotel_1 h WHERE h.hotelPrice = :hotelPrice")})
public class Hotel_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HOTEL_NAME")
    private String hotelName;
    @Column(name = "HOTEL_PRICE")
    private BigInteger hotelPrice;
    @OneToMany(mappedBy = "hotelName")
    private Collection<BookingRoom> bookingRoomCollection;

    public Hotel_1() {
    }

    public Hotel_1(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public BigInteger getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(BigInteger hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public Collection<BookingRoom> getBookingRoomCollection() {
        return bookingRoomCollection;
    }

    public void setBookingRoomCollection(Collection<BookingRoom> bookingRoomCollection) {
        this.bookingRoomCollection = bookingRoomCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hotelName != null ? hotelName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotel_1)) {
            return false;
        }
        Hotel_1 other = (Hotel_1) object;
        if ((this.hotelName == null && other.hotelName != null) || (this.hotelName != null && !this.hotelName.equals(other.hotelName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.Hotel_1[ hotelName=" + hotelName + " ]";
    }
    
}
