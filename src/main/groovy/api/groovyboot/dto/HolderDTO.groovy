package api.groovyboot.dto

import api.groovyboot.entities.Holder
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class HolderDTO {

    @NotBlank
    String name

    @NotBlank
    String cpfCnpj

    @NotNull
    Date birthDate

    @NotBlank
    String email

    Holder toEntity() {
        return new Holder(
            name: this.name,
            cpfCnpj: this.cpfCnpj,
            birthDate: this.birthDate,
            email: this.email
        )
    }
}
