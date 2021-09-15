package com.example.base.model

import androidx.room.Entity
import androidx.room.PrimaryKey



sealed class MyObjectForRecyclerView()


data class ObjectDataSample(
    val versionName : String,
    val versionCode : Int,
    val versionImage : String
) : MyObjectForRecyclerView()

data class ObjectDataHeaderSample(
    val headerText : String
) : MyObjectForRecyclerView()


@Entity(tableName = "android_version_object_table")
data class LocalDataObjetSample(
    val name: String,
    val code: Int,
    val image: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}

