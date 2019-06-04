package fr.elph.oplayner.service

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//retrofit import
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class oplaynerRepo {
    val api: oplaynerApi
    //val url= "http://app.elph.fr"
    val url ="http://sandbox.francoisxaviermanceau.fr/oplayner/"
    init{
        val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(oplaynerApi::class.java)
    }
}