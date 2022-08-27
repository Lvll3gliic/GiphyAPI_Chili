package com.example.chili_giphy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://api.giphy.com/v1/gifs/"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getGif()
        Log.d("TAG", "helooooooo!!@#!#!@#!!!")

    }

    private fun getGif(){
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)
        val retrofitData = retrofitBuilder.getData()
        retrofitData.enqueue(object : Callback<List<GifData>?> {
            override fun onResponse(
                call: Call<List<GifData>?>,
                response: Response<List<GifData>?>
            ) {
                val responseBody = response.body()!!

                val stringBuilder = StringBuilder()
                for (GifData in responseBody){
                    stringBuilder.append(GifData.url)
                }
                var text = findViewById<TextView>(R.id.textId)
                text.text = stringBuilder
                Log.d("TAG", stringBuilder.toString())
                Log.d("TAG", "helooooooo!!@#!#!@#!!!")
                print("hello")
            }

            override fun onFailure(call: Call<List<GifData>?>, t: Throwable) {
                Log.d("WHAT THE FUCK WHY THIS ISNT WORRKING I DONT KNOW BUT WANT TO KNOW", "OnFailure:" +t.message)

            }
        })
    }
}