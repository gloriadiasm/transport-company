package br.com.gloriadiasm.model.entity.repository

import br.com.gloriadiasm.model.entity.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository: JpaRepository<Order, Long>