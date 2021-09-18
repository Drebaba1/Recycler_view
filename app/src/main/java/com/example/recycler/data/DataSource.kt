package com.example.recycler.data

import com.example.recycler.R
import com.example.recycler.model.Motivation

class DataSource {

    fun LoadMotivation(): List<Motivation> {
        return listOf<Motivation>(
            Motivation(R.string.Motivate1, R.drawable.motivation),
            Motivation(R.string.Motivate2, R.drawable.motivation2),
            Motivation(R.string.Motivate3, R.drawable.motivation3),
            Motivation(R.string.Motivate4, R.drawable.motivation4),
            Motivation(R.string.Motivate5, R.drawable.motivation5),
            Motivation(R.string.Motivate6, R.drawable.motivation),
            Motivation(R.string.Motivate7, R.drawable.motivation2),
            Motivation(R.string.Motivate8, R.drawable.motivation3),
            Motivation(R.string.Motivate9, R.drawable.motivation4),
            Motivation(R.string.Motivate10, R.drawable.motivation5),
            Motivation(R.string.Motivate11, R.drawable.motivation2),
            Motivation(R.string.Motivate12, R.drawable.motivation3),
            Motivation(R.string.Motivate13, R.drawable.motivation4),
            Motivation(R.string.Motivate14, R.drawable.motivation5),
            Motivation(R.string.Motivate15, R.drawable.motivation)

        )

    }
}
