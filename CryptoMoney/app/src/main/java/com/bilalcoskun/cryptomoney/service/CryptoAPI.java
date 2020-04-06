package com.bilalcoskun.cryptomoney.service;

import com.bilalcoskun.cryptomoney.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CryptoAPI {
    //https://api.nomics.com/v1/prices?key=a0a15ba7dd40d6ce499ad2bf9e34edf1

    @GET("prices?key=a0a15ba7dd40d6ce499ad2bf9e34edf1")
    Observable<List<CryptoModel>> getData();
    //Call<List<CryptoModel>> getData();
}
