package br.com.gloriadiasm.model.service

import br.com.gloriadiasm.model.entity.Order
import br.com.gloriadiasm.model.entity.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Example
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class OrderService(@Autowired val orderRepository: OrderRepository){


    fun save(order: Order){
        orderRepository.save(order)
    }

    @Transactional
    fun findAll(): List<Order>{
        return orderRepository.findAll()
    }

    @Transactional
    fun update(order: Order): Order{
        return orderRepository.save(order)
    }

    @Transactional
    fun delete(order: Order) {
        orderRepository.delete(order)
    }

    @Transactional
    fun findById(id: Long): Order {
        return orderRepository.findById(id).get()
    }

    @Transactional
    fun deleteById(id: Long) {
        orderRepository.deleteById(id)
    }
}