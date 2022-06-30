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
@Table(name = "CARS")
@NamedQueries({
    @NamedQuery(name = "Cars.findAll", query = "SELECT c FROM Cars c"),
    @NamedQuery(name = "Cars.findByCarTypr", query = "SELECT c FROM Cars c WHERE c.carTypr = :carTypr"),
    @NamedQuery(name = "Cars.findByPrice", query = "SELECT c FROM Cars c WHERE c.price = :price")})
public class Cars implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CAR_TYPR")
    private String carTypr;
    @Column(name = "PRICE")
    private BigInteger price;
    @OneToMany(mappedBy = "carType")
    private Collection<TakeCar> takeCarCollection;

    public Cars() {
    }

    public Cars(String carTypr) {
        this.carTypr = carTypr;
    }

    public String getCarTypr() {
        return carTypr;
    }

    public void setCarTypr(String carTypr) {
        this.carTypr = carTypr;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public Collection<TakeCar> getTakeCarCollection() {
        return takeCarCollection;
    }

    public void setTakeCarCollection(Collection<TakeCar> takeCarCollection) {
        this.takeCarCollection = takeCarCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carTypr != null ? carTypr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cars)) {
            return false;
        }
        Cars other = (Cars) object;
        if ((this.carTypr == null && other.carTypr != null) || (this.carTypr != null && !this.carTypr.equals(other.carTypr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.Cars[ carTypr=" + carTypr + " ]";
    }
    
}
