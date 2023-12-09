package com.example.tugas_hadiah.Adapter

import android.content.Context

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tugas_hadiah.fragment.Home
import com.example.tugas_hadiah.fragment.Musik
import com.example.tugas_hadiah.fragment.Video

internal class MyAdapter(var context: Context, fm:FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {

        var fragment = Fragment()
        return when (position){
            0 -> {
                Home()
            }
            1 -> {
                Musik()
            }
            2 ->{
               Video()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
       return totalTabs
    }

}