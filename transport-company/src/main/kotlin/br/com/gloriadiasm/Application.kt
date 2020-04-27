package br.com.gloriadiasm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class TransportCompanyApplication

fun main(args: Array<String>) {
	runApplication<TransportCompanyApplication>(*args)
}
