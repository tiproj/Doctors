package com.doctor.doctors.base

import com.endlesscreator.tibaselib.frame.TiApp
import com.endlesscreator.titoollib.utils.LogUtil

class App : TiApp() {

    override fun onCreate() {
        super.onCreate()
        LogUtil.isOutShow = true
    }
}
