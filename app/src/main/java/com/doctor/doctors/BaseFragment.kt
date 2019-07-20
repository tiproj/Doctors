package com.doctor.doctors

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class BaseFragment : Fragment() {

    companion object {
        const val BUNDLE_TITLE = "title"

        fun newInstance(title: String? = null): BaseFragment {
            val bundle = Bundle()
            title.let { bundle.putString(BUNDLE_TITLE, it) }
            val fragment = BaseFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    private val mTitle by lazy {
        arguments?.getString(BUNDLE_TITLE)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val tv = TextView(activity)
        tv.text = mTitle ?: "DefTitle"
        tv.textSize = 30f
        tv.setPadding(50, 50, 50, 50)
        tv.gravity = Gravity.CENTER

        return tv
    }

}
