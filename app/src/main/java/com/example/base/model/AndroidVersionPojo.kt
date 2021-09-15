package com.example.base.model

sealed class MyObjectForRecyclerView()



data class ObjectDataSample(
    val versionName : String,
    val versionCode : Int,
    val versionImage : String
) : MyObjectForRecyclerView()



data class ObjectDataHeaderSample(
    val headerText : String
) : MyObjectForRecyclerView()


