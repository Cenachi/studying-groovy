package api.groovyboot.entities

import groovy.transform.Sortable

import jakarta.annotation.Nullable

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import jakarta.validation.constraints.NotNull


@Sortable
@MappedSuperclass
abstract class BaseEntity implements Comparable<BaseEntity>{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id

    @Nullable
    Date lastUpdated

    @NotNull
    Date dateCreated

    @NotNull
    Boolean deleted = false

    @Override int compareTo(BaseEntity other){
        return this.id <=> other.id
    }
}
