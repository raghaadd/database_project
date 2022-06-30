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
@Table(name = "TAKE_CAR")
@NamedQueries({
    @NamedQuery(name = "TakeCar.findAll", query = "SELECT t FROM TakeCar t"),
    @NamedQuery(name = "TakeCar.findByCheckinDate", query = "SELECT t FROM TakeCar t WHERE t.checkinDate = :checkinDate"),
    @NamedQuery(name = "TakeCar.findByCheckoutDate", query = "SELECT t FROM TakeCar t WHERE t.checkoutDate = :checkoutDate"),
    @NamedQuery(name = "TakeCar.findByPrice", query = "SELECT t FROM TakeCar t WHERE t.price = :price"),
    @NamedQuery(name = "TakeCar.findByRawCount", query = "SELECT t FROM TakeCar t WHERE t.rawCount = :rawCount")
,@NamedQuery(name = "TakeCar.findAllorder", query = "SELECT t FROM TakeCar t order by t.rawCount asc")})
public class TakeCar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CHECKIN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkinDate;
    @Column(name = "CHECKOUT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkoutDate;
    @Column(name = "PRICE")
    private BigInteger price;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "RAW_COUNT")
    private BigDecimal rawCount;
    @JoinColumn(name = "CAR_TYPE", referencedColumnName = "CAR_TYPR")
    @ManyToOne
    private Cars carType;
    @JoinColumn(name = "PASSPORT_ID", referencedColumnName = "PASSPORT_ID")
    @ManyToOne
    private Clients passportId;

    public TakeCar() {
    }

    public TakeCar(BigDecimal rawCount) {
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

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public BigDecimal getRawCount() {
        return rawCount;
    }

    public void setRawCount(BigDecimal rawCount) {
        this.rawCount = rawCount;
    }

    public Cars getCarType() {
        return carType;
    }

    public void setCarType(Cars carType) {
        this.carType = carType;
    }

    public Clients getPassportId() {
        return passportId;
    }

    public void setPassportId(Clients passportId) {
        this.passportId = passportId;
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
        if (!(object instanceof TakeCar)) {
            return false;
        }
        TakeCar other = (TakeCar) object;
        if ((this.rawCount == null && other.rawCount != null) || (this.rawCount != null && !this.rawCount.equals(other.rawCount))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.TakeCar[ rawCount=" + rawCount + " ]";
    }
    
}
