package fr.elph.oplayner.service

import retrofit2.Call

import android.util.Log
import retrofit2.http.*

interface oplaynerApi {

    //creation d'une
    @FormUrlEncoded
    @POST("wrapper.php")
    fun postData (
        @Field("post") post: String,
        @Field("name") name: String,
        @Field("time") time: String,
        @Field("table") table: String,
        @Field("password") password: String,
        @Field("description") description: String,
        @Field("adresse") adresse: String,
        @Field("telephone") telephone: String
    ): Call<post>
}

data class post(
    val code:Int
)