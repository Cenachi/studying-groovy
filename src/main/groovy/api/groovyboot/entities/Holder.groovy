package api.groovyboot.entities


import jakarta.persistence.Entity
import jakarta.validation.constraints.NotNull

@Entity
class Holder extends BaseEntity {

    @NotNull
    String name

    @NotNull
    String cpfCnpj

    @NotNull
    Date birthDate

    @NotNull
    String email

}
