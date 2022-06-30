/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourisim;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Msys
 */
@Entity
@Table(name = "REGISTER_CLIENTS")
@NamedQueries({
    @NamedQuery(name = "RegisterClients.findAll", query = "SELECT r FROM RegisterClients r"),
    @NamedQuery(name = "RegisterClients.findByRegisteerId", query = "SELECT r FROM RegisterClients r WHERE r.registeerId = :registeerId"),
    @NamedQuery(name = "RegisterClients.findByTotalPrice", query = "SELECT r FROM RegisterClients r WHERE r.totalPrice = :totalPrice")
,@NamedQuery(name = "RegisterClients.findAllorder", query = "SELECT r FROM RegisterClients r order by r.registeerId asc")})
public class RegisterClients implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "REGISTEER_ID")
    private BigDecimal registeerId;
    @Column(name = "TOTAL_PRICE")
    private BigInteger totalPrice;
    @JoinColumn(name = "PASSPORT_ID", referencedColumnName = "PASSPORT_ID")
    @ManyToOne(optional = false)
    private Clients passportId;
    @JoinColumn(name = "CLIENTS_TYPE", referencedColumnName = "CLIENTS_TYPE")
    @ManyToOne
    private ClientType clientsType;

    public RegisterClients() {
    }

    public RegisterClients(BigDecimal registeerId) {
        this.registeerId = registeerId;
    }

    public BigDecimal getRegisteerId() {
        return registeerId;
    }

    public void setRegisteerId(BigDecimal registeerId) {
        this.registeerId = registeerId;
    }

    public BigInteger getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigInteger totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Clients getPassportId() {
        return passportId;
    }

    public void setPassportId(Clients passportId) {
        this.passportId = passportId;
    }

    public ClientType getClientsType() {
        return clientsType;
    }

    public void setClientsType(ClientType clientsType) {
        this.clientsType = clientsType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (registeerId != null ? registeerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegisterClients)) {
            return false;
        }
        RegisterClients other = (RegisterClients) object;
        if ((this.registeerId == null && other.registeerId != null) || (this.registeerId != null && !this.registeerId.equals(other.registeerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.RegisterClients[ registeerId=" + registeerId + " ]";
    }
    
}
