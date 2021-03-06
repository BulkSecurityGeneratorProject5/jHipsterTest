package com.sid.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A MappingEntity.
 */
@Entity
@Table(name = "mapping_entity")
public class MappingEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "path")
    private String path;

    @Column(name = "jhi_order")
    private Integer order;

    @ManyToOne
    @JsonIgnoreProperties("mappingEntities")
    private AttributEntity attribut3;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public MappingEntity path(String path) {
        this.path = path;
        return this;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getOrder() {
        return order;
    }

    public MappingEntity order(Integer order) {
        this.order = order;
        return this;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public AttributEntity getAttribut3() {
        return attribut3;
    }

    public MappingEntity attribut3(AttributEntity attributEntity) {
        this.attribut3 = attributEntity;
        return this;
    }

    public void setAttribut3(AttributEntity attributEntity) {
        this.attribut3 = attributEntity;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MappingEntity mappingEntity = (MappingEntity) o;
        if (mappingEntity.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), mappingEntity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MappingEntity{" +
            "id=" + getId() +
            ", path='" + getPath() + "'" +
            ", order=" + getOrder() +
            "}";
    }
}
