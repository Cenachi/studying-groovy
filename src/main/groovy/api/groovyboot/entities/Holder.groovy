package api.groovyboot.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Holder extends BaseEntity {

    @Column(nullable = false)
    String name

    @Column(nullable = false, unique = true)
    String cpfCnpj

    @Column(nullable = false)
    Date birthDate

    @Column(nullable = false)
    String email
}
