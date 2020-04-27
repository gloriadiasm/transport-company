package br.com.gloriadiasm.model.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Entity(name = "_Order")
data class Order (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id : Long ? = null,

        @Column(name = "total_weight")
        var totalWeight : Int ? = null,

        @OneToOne
        @JoinColumn
        var supplier : Supplier ? = null,

        @OneToOne
        @JoinColumn(name = "origin")
        var origin : Terminal ? = null,

        @OneToOne
        @JoinColumn(name = "destiny")
        var destiny : Terminal ? = null,

        @Column (name = "created_at")
        @CreationTimestamp
        var createdAt: Timestamp? = null,

        @Column (name = "updated_at")
        @UpdateTimestamp
        var updatedAt: Timestamp? = null
)