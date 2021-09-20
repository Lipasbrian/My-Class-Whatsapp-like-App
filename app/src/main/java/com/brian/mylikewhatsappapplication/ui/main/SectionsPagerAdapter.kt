package com.brian.mylikewhatsappapplication.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.brian.mylikewhatsappapplication.CallsFragment
import com.brian.mylikewhatsappapplication.ChatsFragment
import com.brian.mylikewhatsappapplication.R
import com.brian.mylikewhatsappapplication.StatusFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
            R.string.tab_text_2,
            R.string.tab_text_3
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager):
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //return PlaceholderFragment.newInstance(position + 1)
        when(position){
            0 -> return ChatsFragment()
            1 -> return StatusFragment()
            else ->return CallsFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 3
    }
}