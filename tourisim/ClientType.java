/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourisim;

import java.io.Serializable;
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
@Table(name = "CLIENT_TYPE")
@NamedQueries({
    @NamedQuery(name = "ClientType.findAll", query = "SELECT c FROM ClientType c"),
    @NamedQuery(name = "ClientType.findByClientsType", query = "SELECT c FROM ClientType c WHERE c.clientsType = :clientsType")})
public class ClientType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLIENTS_TYPE")
    private String clientsType;
    @OneToMany(mappedBy = "clientsType")
    private Collection<RegisterClients> registerClientsCollection;

    public ClientType() {
    }

    public ClientType(String clientsType) {
        this.clientsType = clientsType;
    }

    public String getClientsType() {
        return clientsType;
    }

    public void setClientsType(String clientsType) {
        this.clientsType = clientsType;
    }

    public Collection<RegisterClients> getRegisterClientsCollection() {
        return registerClientsCollection;
    }

    public void setRegisterClientsCollection(Collection<RegisterClients> registerClientsCollection) {
        this.registerClientsCollection = registerClientsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientsType != null ? clientsType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientType)) {
            return false;
        }
        ClientType other = (ClientType) object;
        if ((this.clientsType == null && other.clientsType != null) || (this.clientsType != null && !this.clientsType.equals(other.clientsType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tourisim.ClientType[ clientsType=" + clientsType + " ]";
    }
    
}
