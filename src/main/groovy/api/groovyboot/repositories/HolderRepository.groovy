package api.groovyboot.repositories

import api.groovyboot.entities.Holder
import org.springframework.data.jpa.repository.JpaRepository

interface HolderRepository extends JpaRepository<Holder, Long>{

}