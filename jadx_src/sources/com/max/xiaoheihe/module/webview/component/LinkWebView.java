package com.max.xiaoheihe.module.webview.component;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes12.dex */
public class LinkWebView extends NestedWebView {
    public static ChangeQuickRedirect changeQuickRedirect;

    public LinkWebView(Context context) {
        super(context);
        c();
    }

    public LinkWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public LinkWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
    }

    private void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47494, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        setmNestedInViewPager(true);
    }
}
