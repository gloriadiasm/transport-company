package br.com.gloriadiasm.model.entity.repository

import br.com.gloriadiasm.model.entity.Supplier
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SupplierRepository: JpaRepository<Supplier, Long>