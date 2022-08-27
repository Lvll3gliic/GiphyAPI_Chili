package com.example.chili_giphy

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("search?q=cheesburger&api_key=SBkZNrj5wc5xubdZgV4XyDxmB6zsYY0t")
    fun getData(): Call<List<GifData>>
}