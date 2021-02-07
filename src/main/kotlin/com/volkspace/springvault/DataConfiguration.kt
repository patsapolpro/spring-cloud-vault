package com.volkspace.springvault

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("data")
class DataConfiguration {
        var key1: String? = null
        var key2: String? = null
}