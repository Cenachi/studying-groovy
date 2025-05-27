package api.groovyboot.entities


import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull


@Entity
@Table(name = "card")
class Card  extends BaseEntity{

    @NotNull
    String maskedNumber

    @NotNull
    Integer expirationMonth

    @NotNull
    Integer expirationYear

    @ManyToOne
    @JoinColumn(name = "holder_id", referencedColumnName = "id", nullable = false)
    Holder holder
}
