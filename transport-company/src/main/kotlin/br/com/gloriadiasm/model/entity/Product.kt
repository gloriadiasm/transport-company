package br.com.gloriadiasm.model.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Product(
        @Id
        var id: Long? = null,
        @Column
        var name: String? = null
)