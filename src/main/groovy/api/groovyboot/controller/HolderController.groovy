package api.groovyboot.controller

import api.groovyboot.dto.HolderDTO
import api.groovyboot.service.HolderService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/holders")
class HolderController {

    private final HolderService holderService

    HolderController(HolderService holderService) {
        this.holderService = holderService
    }

    @GetMapping
    List<HolderDTO> getHolderList() {
        return holderService.getHolderList()
    }

    @GetMapping("/{id}")
    HolderDTO getHolder(@PathVariable Long id) {
        return holderService.getHolder(id)
    }

    @PostMapping
    ResponseEntity<HolderDTO> save(@Valid @RequestBody HolderDTO holderDto) {
        def savedHolder = holderService.save(holderDto)
        return ResponseEntity.status(HttpStatus.CREATED).body(savedHolder)
    }

}
