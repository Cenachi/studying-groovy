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

    HolderDTO() {}

    HolderDTO(Holder holder) {
        this.name = holder.name
        this.cpfCnpj = holder.cpfCnpj
        this.birthDate = holder.birthDate
        this.email = holder.email
    }

    Holder toEntity() {
        return new Holder(
            name: this.name,
            cpfCnpj: this.cpfCnpj,
            birthDate: this.birthDate,
            email: this.email
        )
    }
}
