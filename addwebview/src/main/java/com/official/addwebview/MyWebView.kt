package com.official.addwebview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.webkit.WebView

class MyWebView : WebView {
    constructor(context: Context) : super(context) {
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initView(context)
        val ta = context.obtainStyledAttributes(attrs, R.styleable.MyCustomElement, 0, 0)
        try {
            val test = ta.getString(R.styleable.MyCustomElement_test)
            loadAdd(test)
        } finally {
            ta.recycle()
        }
    }

    fun initView(context: Context): MyWebView {
        val inflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        this.settings.javaScriptEnabled = true
        this.settings.useWideViewPort = true
        this.settings.loadWithOverviewMode = true
        this.settings.domStorageEnabled = true
        return this
    }

    fun loadAdd(test : String){
        this.loadUrl(test)
//        val data = "<a href=\"https://admin4.dist.sofwena.com/delivery/ck.php?oaparams=2__bannerid=13__zoneid=10__source=%7Bobfs%3A%7D__OXLCA=1__cb=69c8785e0b__oadest=http%3A%2F%2Fads.sharesansar.com%2Feverest-bank\" target=\"_blank\" title=\"Everest Bank Ltd\">\n" +
//                "<img src=\"https://www.sharesansar.com/photos/shares/advertisement/1533201053-275x60-GIF.gif?ver=33\" class=\"img-responsive\" alt=\"everest-bank-ltd\">\n" +
//                "<img src=\"https://admin4.dist.sofwena.com/delivery/lg.php?bannerid=13&amp;campaignid=11&amp;zoneid=10&amp;source={obfs:}&amp;loc=http://www.sharesansar.com&amp;cb=7cfd497cb9\" width=\"0\" height=\"0\" alt=\"\" style=\"width: 0px; height: 0px;\">\n" +
//                "</a>"
//        this.loadData(data, "text/html; charset=utf-8", "UTF-8");

    }
}