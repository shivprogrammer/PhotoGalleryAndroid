package com.shivvy.photogallery.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=37ad258064edf0eb34902529b7c0e68c" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos() : Call<FlickrResponse>

    @GET
    fun fetchUrlBytes(@Url url : String) : Call<ResponseBody>
}