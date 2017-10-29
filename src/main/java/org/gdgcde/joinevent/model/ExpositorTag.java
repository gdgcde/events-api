
package org.gdgcde.joinevent.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "expositores_tags")
@NamedQueries({
    @NamedQuery(name = "ExpositorTag.findAll", query = "SELECT et FROM ExpositorTag et")})
public class ExpositorTag implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Size(max = 10)
    @Column(name = "expositor_id")
    @NotNull
    private Object expositor;
    
    @Size(max = 10)
    @Column(name = "tag_id")
    @NotNull
    private Object tag;
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ExpositorTag)) {
            return false;
        }
        ExpositorTag other = (ExpositorTag) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
   
}
