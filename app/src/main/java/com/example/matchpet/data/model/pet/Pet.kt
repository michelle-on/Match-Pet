package com.example.matchpet.data.model.pet

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Pet(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    var name: String,
    @ColumnInfo
    var sex: String,
    @ColumnInfo
    var age: String,
    @ColumnInfo
    var breed: String?,
    @ColumnInfo
    var size: String,
    @ColumnInfo
    var description: String,
    @ColumnInfo
    var health: String?,
    @ColumnInfo
    var care: String?,
    @ColumnInfo
    var city: String,
    @ColumnInfo
    var type: String,
)