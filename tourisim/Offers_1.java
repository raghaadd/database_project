/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourisim;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
@Table(name = "OFFERS")
@NamedQueries({
    @NamedQuery(name = "Offers_1.findAll", query = "SELECT o FROM Offers_1 o"),
    @NamedQuery(name = "Offers_1.findByOfferName", query = "SELECT o FROM Offers_1 o WHERE o.offerName = :offerName"),
    @NamedQuery(name = "Offers_1.findByOfferStartDate", query = "SELECT o FROM Offers_1 o WHERE o.offerStartDate = :offerStartDate"),
    @NamedQuery(name = "Offers_1.findByOfferEndDate", query = "SELECT o FROM Offers_1 o WHERE o.offerEndDate = :offerEndDate"),
    @NamedQuery(name = "Offers_1.findByPrice", query = "SELECT o FROM Offers_1 o WHERE o.price = :price"),
    @NamedQuery(name = "Offers_1.findByDescriptions", query = "SELECT o FROM Offers_1 o WHERE o.descriptions = :descriptions"),
    @NamedQuery(name = "Offers_1.findByImages", query = "SELECT o FROM Offers_1 o WHERE o.images = :images")})
public class Offers_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OFFER_NAME")
    private String offerName;
    @Column(name = "OFFER_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date offerStartDate;
    @Column(name = "OFFER_END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date offerEndDate;
    @Column(name = "PRICE")
    private BigInteger price;
    @Column(name = "DESCRIPTIONS")
    private String descriptions;
    @Column(name = "IMAGES")
    private String images;
    @ManyToMany(mappedBy = "offersCollection")
    private Collection<Clients> clientsCollection;
    @JoinColumn(name = "LANGUAGES", referencedColumnName = "LANGUAGES")
    @ManyToOne
    private Languages languages;

    public Offers_1() {
    }

    public Offers_1(String offerName) {
        this.offerName = offerName;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public Date getOfferStartDate() {
        return offerStartDate;
    }

    public void setOfferStartDate(Date offerStartDate) {
        this.offerStartDate = offerStartDate;
    }

    public Date getOfferEndDate() {
        return offerEndDate;
    }

    public void setOfferEndDate(Date offerEndDate) {
        this.offerEndDate = offerEndDate;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Collection<Clients> getClientsCollection() {
        return clientsCollection;
    }

    public void setClientsCollection(Collection<Clients> clientsCollection) {
        this.clientsCollection = clientsCollection;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (offerName != null ? offerName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Offers_1)) {
            return false;
        }
        Offers_1 other = (Offers_1) object;
        if ((this.offerName == null && other.offerName != null) || (this.offerName != null && !this.offerName.equals(other.offerName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.Offers_1[ offerName=" + offerName + " ]";
    }
    
}
