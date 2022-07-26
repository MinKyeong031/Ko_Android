package com.example.ch12_book_review.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.ch12_book_review.model.History
import com.example.ch12_book_review.model.Review

@Dao
interface ReviewDao {

    @Query("SELECT * FROM review WHERE isbn = :isbn")
    fun getOne(isbn: String): Review

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveReview(review: Review)

}