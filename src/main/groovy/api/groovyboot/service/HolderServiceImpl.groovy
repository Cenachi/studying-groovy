package api.groovyboot.service

import api.groovyboot.dto.HolderDTO
import api.groovyboot.entities.Holder
import api.groovyboot.repositories.HolderRepository
import org.springframework.stereotype.Service

@Service
class HolderServiceImpl implements HolderService{

    private final HolderRepository holderRepository

    HolderServiceImpl(HolderRepository holderRepository) {
        this.holderRepository = holderRepository
    }

    @Override
    List<HolderDTO> getHolderList() {
        return holderRepository.findAll().collect { new HolderDTO(it) }
    }

    @Override
    HolderDTO getHolder(Long id) {
        return holderRepository.findById(id).orEslseThrow {
            new RuntimeException("Holder not found with ID $id")}
    }

    @Override
    HolderDTO save(HolderDTO holderDto) {
        return holderRepository.save(holderDto.toEntity()).with {
            new HolderDTO(it)
        }
    }

}
