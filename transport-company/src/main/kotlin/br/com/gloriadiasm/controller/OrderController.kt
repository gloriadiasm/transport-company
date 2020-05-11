package br.com.gloriadiasm.controller

import br.com.gloriadiasm.model.entity.Order
import br.com.gloriadiasm.model.service.OrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("order")
class OrderController(@Autowired var orderService: OrderService) {

    @PostMapping
    fun save(@RequestBody order: Order) {
        orderService.save(order)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id:Long): Order {
        return orderService.findById(id)
    }
    @GetMapping
    fun findAll(): List<Order> {
        return orderService.findAll()
    }
    @PutMapping
    fun update(@RequestBody order: Order): Order {
        return orderService.update(order)
    }
    @DeleteMapping
    fun delete (@RequestBody order: Order){
        orderService.delete(order)
    }
    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long){
        orderService.deleteById(id)
    }
}