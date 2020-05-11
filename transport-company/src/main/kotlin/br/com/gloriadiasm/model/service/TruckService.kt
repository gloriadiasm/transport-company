package br.com.gloriadiasm.model.service

import br.com.gloriadiasm.model.entity.Truck
import br.com.gloriadiasm.model.entity.repository.TruckRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class TruckService(@Autowired val truckRepository: TruckRepository) {

    @Transactional
    fun save(truck: Truck){
        truckRepository.save(truck)
    }

    @Transactional
    fun find(truck: Truck): Optional<Truck> {
        return truckRepository.findOne(Example.of(truck))
    }

    @Transactional
    fun findAll(): List<Truck>{
        return truckRepository.findAll()
    }

    @Transactional
    fun update(truck: Truck): Truck {
        return truckRepository.save(truck)
    }

    @Transactional
    fun delete(truck: Truck) {
        truckRepository.delete(truck)
    }

    @Transactional
    fun findById(id: Long): Truck {
        return truckRepository.findById(id).get()
    }

    @Transactional
    fun deleteById(id: Long) {
        truckRepository.deleteById(id)
    }
}