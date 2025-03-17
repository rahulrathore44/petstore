package com.test.util

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

object SerDe {
    private val objectMapper = jacksonObjectMapper()

    fun convertToJson(obj: Any): String {
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj)
    }

    fun <T> convertFromJson(json: String, clazz: Class<T>): T {
        return objectMapper.readValue(json, clazz)
    }
}