package br.com.gloriadiasm.model.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Entity
data class TruckDriver (

        @Id@JoinColumn(name = "truck_id", unique = true)
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id : Long ? = null,

        @Column
        var name : String ? = null,

        @OneToOne
        @JoinColumn
        var truck : Truck ? = null,

        @Column (name = "created_at")
        @CreationTimestamp
        var createdAt: Timestamp? = null,

        @Column (name = "updated_at")
        @UpdateTimestamp
        var updatedAt: Timestamp? = null
)