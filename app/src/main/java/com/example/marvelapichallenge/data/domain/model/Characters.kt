package com.example.marvelapichallenge.data.domain.model

data class Characters(
    val id: Int,
    val name: String,
    val description: String,
    val thumbnail: String,
    val thumbnailExt: String,
    val comics: List<String>
    
)
