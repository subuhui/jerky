package com.subuhui.common.mvvm.bindingadapter.webview;

import android.text.TextUtils;
import android.webkit.WebView;
import androidx.databinding.BindingAdapter;

/**
 * Created by kelin on 16-4-29.
 */
public class ViewBindingAdapter {
    @BindingAdapter({"render"})
    public static void loadHtml(WebView webView, final String html) {
        if (!TextUtils.isEmpty(html)) {
            webView.loadDataWithBaseURL(null, html, "text/html", "UTF-8", null);
        }
    }
}
