package com.express.android.guessword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ScoreViewModel(finalScore: Int) : ViewModel() {

    private lateinit var scoreViewModel: ScoreViewModel

    var score = finalScore

    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}

    class ScoreViewModelFactory(
        private val finalScore: Int) :
        ViewModelProvider.Factory {

        override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return ScoreViewModel(finalScore) as T
        }
    }