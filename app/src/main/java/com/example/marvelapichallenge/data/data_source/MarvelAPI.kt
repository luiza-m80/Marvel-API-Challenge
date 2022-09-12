package com.example.marvelapichallenge.data.data_source

import com.example.marvelapichallenge.data.data_source.dto.CharactersDTO
import com.example.marvelapichallenge.util.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelAPI {

    @GET("/v1/public/characters")
    suspend fun getAllCharacters(
        @Query("apikey")apikey: String = Constants.API_KEY,
        @Query("ts")ts: String = Constants.timeStamp,
        @Query("hash")hash: String = Constants.hash(),
        @Query("offset")offset: String
    ): CharactersDTO
}