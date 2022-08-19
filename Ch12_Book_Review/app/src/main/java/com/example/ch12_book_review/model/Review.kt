package com.example.ch12_book_review.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Review(
    @PrimaryKey val isbn: String,
    @ColumnInfo(name = "review") val review: String?
)