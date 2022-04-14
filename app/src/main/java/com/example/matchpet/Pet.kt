package com.example.matchpet

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import com.example.matchpet.db.DateConverter

@Entity
class Pet(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var name: String,
    @ColumnInfo
    var sex: String,
    @ColumnInfo
    var age: Int,
    @ColumnInfo
    var breed: String,
    @ColumnInfo
    var size: String,
    @ColumnInfo
    var description: String,
    @ColumnInfo
    var health: String,
    @ColumnInfo
    var care: String,
    @ColumnInfo
    var phone: Long,
    @ColumnInfo
    var city: String,
    @ColumnInfo
    var type: String,
)