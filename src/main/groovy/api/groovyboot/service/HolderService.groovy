package api.groovyboot.service

import api.groovyboot.dto.HolderDTO

interface HolderService {

    List<HolderDTO> getHolderList()

    HolderDTO getHolder(Long id)

    HolderDTO save(HolderDTO holderDto)
}