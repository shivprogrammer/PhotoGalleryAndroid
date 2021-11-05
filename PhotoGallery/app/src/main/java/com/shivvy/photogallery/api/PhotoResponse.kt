package com.shivvy.photogallery.api

import com.google.gson.annotations.SerializedName
import com.shivvy.photogallery.GalleryItem

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems : List<GalleryItem>
}