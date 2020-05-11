package br.com.gloriadiasm.model.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Entity
data class Order (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id : Long ? = null,

        @Column(name = "total_weight")
        var totalWeight : Int ? = null,

        @Column
        var supplier : Long ? = null,

        @Column(name = "truck_driver")
        var truckDriver: Long ? = null,

        @Column
        var origin : Long ? = null,

        @Column
        var destiny : Long ? = null,

        @Column (name = "created_at")
        @CreationTimestamp
        var createdAt: Timestamp? = null,

        @Column (name = "updated_at")
        @UpdateTimestamp
        var updatedAt: Timestamp? = null
)