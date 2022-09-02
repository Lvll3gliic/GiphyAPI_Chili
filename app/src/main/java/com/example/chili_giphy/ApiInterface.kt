package com.example.chili_giphy

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("gifs/search?")
    fun getData(
        @Query("q") searchInput: String,
        @Query("api_key") key: String = "SBkZNrj5wc5xubdZgV4XyDxmB6zsYY0t"
    ): retrofit2.Call<DataResult>
}