package br.com.gloriadiasm.model.entity.repository

import br.com.gloriadiasm.model.entity.TruckDriver
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TruckDriverRepository: JpaRepository<TruckDriver, Long>