package api.groovyboot.service

import api.groovyboot.dto.HolderDTO
import api.groovyboot.entities.Holder

interface HolderService {

    public List<Holder> getHolderList()

    public Holder getHolder(Long id)

    public Holder save(HolderDTO holderDto)

}