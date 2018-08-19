package com.sofwena.myAddView

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView

class MyAddView : WebView {
    constructor(context: Context) : super(context) {
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initView(context)
        val ta = context.obtainStyledAttributes(attrs, R.styleable.MyCustomElement, 0, 0)
        try {
            val url = ta.getString(R.styleable.MyCustomElement_test)
            loadAdd(url)
        } finally {
            ta.recycle()
        }
    }

    fun initView(context: Context): MyAddView {
        this.settings.javaScriptEnabled = true
        this.settings.useWideViewPort = true
        this.settings.loadWithOverviewMode = true
        this.settings.domStorageEnabled = true
        return this
    }

    fun loadAdd(url : String){
        this.loadUrl(url)
    }
}