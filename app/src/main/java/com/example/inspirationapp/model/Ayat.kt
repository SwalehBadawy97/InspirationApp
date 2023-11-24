package com.example.inspirationapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.inspirationapp.R

data class Ayat(
    @StringRes val day:Int,
    @StringRes val title: Int,
    @DrawableRes val imageResource: Int,
    @StringRes val verse: Int
) {

}

val ayats = listOf<Ayat>(
    Ayat(R.string.day1,R.string.title1,R.drawable.ayat1,R.string.verse1),
    Ayat(R.string.day2, R.string.title2, R.drawable.ayat2, R.string.verse2),
    Ayat(R.string.day3, R.string.title3, R.drawable.ayat3, R.string.verse3),
    Ayat(R.string.day4,R.string.title4,R.drawable.ayat4,R.string.verse4),
    Ayat(R.string.day5, R.string.title5, R.drawable.ayat5, R.string.verse5),
    Ayat(R.string.day6, R.string.title6, R.drawable.ayat6, R.string.verse6),
    Ayat(R.string.day7,R.string.title7,R.drawable.ayat7,R.string.verse7),
    Ayat(R.string.day8, R.string.title8, R.drawable.ayat8, R.string.verse8),
    Ayat(R.string.day9, R.string.title9, R.drawable.ayat9, R.string.verse9),
    Ayat(R.string.day10,R.string.title10,R.drawable.ayat10,R.string.verse10),
    Ayat(R.string.day11, R.string.title11, R.drawable.ayat11, R.string.verse11),
    Ayat(R.string.day12, R.string.title12, R.drawable.ayat12, R.string.verse12),
    Ayat(R.string.day13,R.string.title13,R.drawable.ayat13,R.string.verse13),
    Ayat(R.string.day14, R.string.title14, R.drawable.ayat14, R.string.verse14),
    Ayat(R.string.day15, R.string.title15, R.drawable.ayat15, R.string.verse15),
    Ayat(R.string.day16,R.string.title16,R.drawable.ayat16,R.string.verse16),
    Ayat(R.string.day17, R.string.title17, R.drawable.ayat17, R.string.verse17),
    Ayat(R.string.day18, R.string.title18, R.drawable.ayat18, R.string.verse18),
    Ayat(R.string.day19,R.string.title19,R.drawable.ayat19,R.string.verse19),
    Ayat(R.string.day20, R.string.title20, R.drawable.ayat20, R.string.verse20),
    Ayat(R.string.day21, R.string.title21, R.drawable.ayat21, R.string.verse21),
    Ayat(R.string.day22,R.string.title22,R.drawable.ayat22,R.string.verse22),
    Ayat(R.string.day23, R.string.title23, R.drawable.ayat23, R.string.verse23),
    Ayat(R.string.day24, R.string.title24, R.drawable.ayat24, R.string.verse24),
    Ayat(R.string.day25,R.string.title25,R.drawable.ayat25,R.string.verse25),
    Ayat(R.string.day26, R.string.title26, R.drawable.ayat26, R.string.verse26),
    Ayat(R.string.day27, R.string.title27, R.drawable.ayat27, R.string.verse27),
    Ayat(R.string.day28,R.string.title28,R.drawable.ayat28,R.string.verse28),
    Ayat(R.string.day29, R.string.title29, R.drawable.ayat29, R.string.verse29),
    Ayat(R.string.day30, R.string.title30, R.drawable.ayat30, R.string.verse30),

)
