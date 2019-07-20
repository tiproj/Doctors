package com.doctor.doctors

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.endlesscreator.tiviewlib.view.adapter.TiFragmentPagerAdapter
import com.yinglan.alphatabs.AlphaTabsIndicator

class MainActivity : AppCompatActivity() {

    private val mTabsIndicator by lazy { findViewById<AlphaTabsIndicator>(R.id.main_tabs_indicator) }
    private val mViewPager by lazy { findViewById<ViewPager>(R.id.main_view_pager) }
    private val mFragments by lazy {
        mutableListOf(
                BaseFragment.newInstance(getString(R.string.main_tab_0)),
                BaseFragment.newInstance(getString(R.string.main_tab_1)),
                BaseFragment.newInstance(),
                BaseFragment.newInstance(getString(R.string.main_tab_3)),
                BaseFragment.newInstance(getString(R.string.main_tab_4))
        )
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPager.adapter = TiFragmentPagerAdapter(supportFragmentManager, mFragments)
        mTabsIndicator.setViewPager(mViewPager)
    }


}
