package com.volkspace.springvault

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import java.lang.Exception


@SpringBootApplication
@EnableConfigurationProperties(DataConfiguration::class)
class SpringVaultApplication(
		val configuration: DataConfiguration
)  : CommandLineRunner{
	@Throws(Exception::class)
	override fun run(vararg args: String) {
		val logger = LoggerFactory.getLogger(SpringVaultApplication::class.java)
		logger.info("----------------------------------------")
		logger.info("Configuration properties")
		logger.info("key1 = {}", configuration.key1)
		logger.info("key2 = {}", configuration.key2)
		logger.info("----------------------------------------")
	}
}

fun main(args: Array<String>) {
	runApplication<SpringVaultApplication>(*args)
}

