package br.com.gloriadiasm.model.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Entity
data class Terminal (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id : Long ? = null,

        @Column
        var name : String ? = null,

        @Column (name = "created_at")
        @CreationTimestamp
        var createdAt: Timestamp? = null,

        @Column (name = "updated_at")
        @UpdateTimestamp
        var updatedAt: Timestamp? = null,

        @OneToOne(mappedBy = "origin", cascade = [CascadeType.ALL], fetch = FetchType.LAZY, optional = false)
        var origin: Order,

        @OneToOne(mappedBy = "destiny", cascade = [CascadeType.ALL], fetch = FetchType.LAZY, optional = false)
        var destiny: Order
)