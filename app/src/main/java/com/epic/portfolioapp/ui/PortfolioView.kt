package com.epic.portfolioapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.epic.core.data.Profile
import com.epic.portfolioapp.R
import com.epic.portfolioapp.framework.PortFolioViewModel
import com.google.android.material.tabs.TabLayout
import kotlinx.coroutines.launch

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AboutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
private const val NUM_PAGES = 4
class portfolioView : Fragment() {



    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
   // private val viewModel = ViewModelProvider(this).get(portfolioView::class.java)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portfolio_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager = view.findViewById<ViewPager>(R.id.viewPager)
        val pagerAdapter = PortfolioPagerAdapter(childFragmentManager)
        viewPager.adapter = pagerAdapter


        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayoutId)
        tabLayout.setupWithViewPager(viewPager)
        val viewModel  = ViewModelProvider(this).get(PortFolioViewModel::class.java)
        viewModel.saveProfile(Profile("Pubudu","Software Engineer","Working","Coding","epic","0715564552","pubudurana@gmail.com",10L))

    }



    private inner class PortfolioPagerAdapter(fa : FragmentManager): FragmentPagerAdapter(fa, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


        override fun getCount():  Int = NUM_PAGES

        override fun getItem(position: Int): Fragment {
            when (position) {
                0 -> return AboutFragment()
                1 -> return WorkFragment()
                2 -> return SkillsFragment()
                3 -> return ContactFragment()
            }
            return AboutFragment()
        }

        override fun getPageTitle(position: Int): CharSequence? {
            when (position) {
                0 -> return "ABOUT"
                1 -> return "WORK"
                2 -> return "SKILLS"
                3 -> return "CONTACT"
            }
            return null
        }

    }


}