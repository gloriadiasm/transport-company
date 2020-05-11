package br.com.gloriadiasm.model.service

import br.com.gloriadiasm.model.entity.TruckDriver
import br.com.gloriadiasm.model.entity.repository.TruckDriverRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class TruckDriverService(@Autowired val truckDriverRepository: TruckDriverRepository){

    @Transactional
    fun save(truckDriver: TruckDriver){
        truckDriverRepository.save(truckDriver)
    }

    @Transactional
    fun find(truckDriver: TruckDriver): Optional<TruckDriver> {
        return truckDriverRepository.findOne(Example.of(truckDriver))
    }

    @Transactional
    fun findAll(): List<TruckDriver>{
        return truckDriverRepository.findAll()
    }

    @Transactional
    fun update(truckDriver: TruckDriver): TruckDriver {
        return truckDriverRepository.save(truckDriver)
    }

    @Transactional
    fun delete(truckDriver: TruckDriver) {
        truckDriverRepository.delete(truckDriver)
    }

    @Transactional
    fun findById(id: Long): TruckDriver {
        return truckDriverRepository.findById(id).get()
    }

    @Transactional
    fun deleteById(id: Long) {
        truckDriverRepository.deleteById(id)
    }
}