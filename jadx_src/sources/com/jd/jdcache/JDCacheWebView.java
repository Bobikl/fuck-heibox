package com.jd.jdcache;

import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.Keep;
import dl.d;
import dl.e;

/* JADX INFO: compiled from: JDCacheWebView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public interface JDCacheWebView {
    void addJavascriptInterface(@d Object obj, @d String str);

    void evaluateJavascript(@d String str, @e ValueCallback<String> valueCallback);

    @e
    View getView();

    void reload();
}
