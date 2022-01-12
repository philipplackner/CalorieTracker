package com.plcoding.tracker_data.remote.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Product(
    @field:Json(name = "image_front_thumb_url")
    val imageFrontThumbUrl: String?,
    val nutriments: Nutriments,
    @field:Json(name = "product_name")
    val productName: String?
)