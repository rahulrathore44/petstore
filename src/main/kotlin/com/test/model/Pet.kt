package com.test.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Pet(
    @JsonProperty("id")
    val id: Int,

    @JsonProperty("category")
    val category: Category,

    @JsonProperty("name")
    val name: String,

    @JsonProperty("photoUrls")
    val photoUrls: List<String>,

    @JsonProperty("tags")
    val tags: List<Tag>,

    @JsonProperty("status")
    val status: String,
)
