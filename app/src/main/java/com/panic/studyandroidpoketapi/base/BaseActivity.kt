package com.panic.studyandroidpoketapi.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import dagger.hilt.android.HiltAndroidApp

abstract class BaseActivity<T : ViewDataBinding, R : BaseViewModel> :AppCompatActivity() {

    abstract fun setInit()
    abstract fun setViewBinding()
    abstract fun setViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setInit()
        setViewBinding()
        setViewModel()
    }

}