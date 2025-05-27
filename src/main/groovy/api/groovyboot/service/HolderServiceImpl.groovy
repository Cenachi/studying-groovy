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
    List<Holder> getHolderList() {
        return holderRepository.findAll()
    }

    @Override
    Holder getHolder(Long id) {
        return holderRepository.findById(id).orEslseThrow {
            new RuntimeException("Holder not found with ID $id")}
    }

    @Override
    Holder save(HolderDTO holderDto) {
        return holderRepository.save(holderDto.toEntity())
    }

}
