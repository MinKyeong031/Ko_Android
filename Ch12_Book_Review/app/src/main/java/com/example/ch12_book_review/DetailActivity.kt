package com.example.ch12_book_review

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.bumptech.glide.Glide
import com.example.ch12_book_review.databinding.ActivityDetailBinding
import com.example.ch12_book_review.model.Book
import com.example.ch12_book_review.model.Review

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var db: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "historyDB"
        ).build()

        val bookModel = intent.getParcelableExtra<Book>("bookModel")

        binding.titleTextView.text = bookModel?.title.orEmpty()

        Glide
            .with(binding.coverImageView.context)
            .load(bookModel?.coverSmallUrl.orEmpty())
            .into(binding.coverImageView)

        binding.descriptionTextView.text = bookModel?.description.orEmpty()

        Thread {
            val review = db.reviewDao().getOne(bookModel?.id.orEmpty())
            runOnUiThread {
                binding.reviewEditText.setText(review?.review.orEmpty())
            }
        }.start()

        binding.saveButton.setOnClickListener {
            Thread {
                db.reviewDao().saveReview(
                    Review(
                        bookModel?.id.orEmpty(),
                        binding.reviewEditText.text.toString()
                    )
                )

            }.start()
        }
    }
}