package com.example.wallday.domain.model

data class Wallpaper(
    val id: String,
    val uri: String,
    val author: String? = null
)