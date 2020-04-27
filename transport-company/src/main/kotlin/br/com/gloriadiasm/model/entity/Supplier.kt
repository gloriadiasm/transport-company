package br.com.gloriadiasm.model.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Entity
data class Supplier(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id : Long ? = null,

        @Column
        var name : String ? = null,

        @OneToOne
        @JoinColumn
        var product: Product ? = null,

        @Column (name = "created_at")
        @CreationTimestamp
        var createdAt: Timestamp? = null,

        @Column (name = "updated_at")
        @UpdateTimestamp
        var updatedAt: Timestamp? = null,

        @OneToOne(mappedBy = "supplier", cascade = [CascadeType.ALL], fetch = FetchType.LAZY, optional = false)
        var order: Order
)