package br.com.gloriadiasm.model.entity.repository

import br.com.gloriadiasm.model.entity.Truck
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TruckRepository: JpaRepository<Truck, Long>