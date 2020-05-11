package br.com.gloriadiasm.model.service

import br.com.gloriadiasm.model.entity.Supplier
import br.com.gloriadiasm.model.entity.repository.SupplierRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class SupplierService(@Autowired val supplierRepository: SupplierRepository) {

    @Transactional
    fun save(supplier: Supplier){
        supplierRepository.save(supplier)
    }

    @Transactional
    fun find(supplier: Supplier): Optional<Supplier> {
        return supplierRepository.findOne(Example.of(supplier))
    }

    @Transactional
    fun findAll(): List<Supplier>{
        return supplierRepository.findAll()
    }

    @Transactional
    fun update(supplier: Supplier): Supplier {
        return supplierRepository.save(supplier)
    }

    @Transactional
    fun delete(supplier: Supplier) {
        supplierRepository.delete(supplier)
    }

    @Transactional
    fun findById(id: Long): Supplier {
        return supplierRepository.findById(id).get()
    }

    @Transactional
    fun deleteById(id: Long) {
        supplierRepository.deleteById(id)
    }
}