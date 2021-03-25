package com.example.cryptoprice.service

import com.example.cryptoprice.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET
import java.util.*
import io.reactivex.Observable

interface CryptoAPI {
    @GET("prices?key=b27b3ef958fe78e3af34815de07cf35c")

    fun getData(): Observable<List<CryptoModel>>
// fun getData():Call<List<CryptoModel>>
}