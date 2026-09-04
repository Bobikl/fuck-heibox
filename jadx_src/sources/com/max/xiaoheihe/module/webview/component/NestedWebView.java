package com.max.xiaoheihe.module.webview.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.core.view.q0;
import androidx.viewpager.widget.ViewPager;
import com.max.hbcommon.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes12.dex */
public class NestedWebView extends WebView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f94594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f94595c;

    public interface a {
        void a(int i10, int i11, int i12, int i13);
    }

    public NestedWebView(Context context) {
        super(context);
        this.f94595c = false;
        b();
    }

    public NestedWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f94595c = false;
        b();
    }

    public NestedWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f94595c = false;
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ViewParent a(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 47498, new Class[]{View.class}, ViewParent.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewParent) patchProxyResultProxy.result;
        }
        ViewParent parent = view.getParent();
        return (parent == 0 || (parent instanceof ViewPager) || (parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || (parent instanceof GridView) || !(parent instanceof View)) ? parent : a((View) parent);
    }

    private void b() {
    }

    public a getScrollChangeListener() {
        return this.f94594b;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        ViewParent viewParentA;
        Object[] objArr = {new Integer(i10), new Integer(i11), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47497, new Class[]{cls, cls, cls2, cls2}, Void.TYPE).isSupported) {
            return;
        }
        d.b("zzzzwebtouch", "onOverScrolled");
        if (this.f94595c && z10 && (viewParentA = a(this)) != null) {
            viewParentA.requestDisallowInterceptTouchEvent(false);
            d.b("zzzzwebtouch", "onOverScrolled disallow");
        }
        super.onOverScrolled(i10, i11, z10, z11);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47496, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onScrollChanged(i10, i11, i12, i13);
        a aVar = this.f94594b;
        if (aVar != null) {
            aVar.a(i10, i11, i12, i13);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, 47495, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        d.b("zzzzwebtouch", "onTouchEvent");
        if (q0.c(motionEvent) == 0 && this.f94595c && (viewParentA = a(this)) != null) {
            viewParentA.requestDisallowInterceptTouchEvent(true);
            d.b("zzzzwebtouch", "onTouchEvent disallow");
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setScrollChangeListener(a aVar) {
        this.f94594b = aVar;
    }

    public void setmNestedInViewPager(boolean z10) {
        this.f94595c = z10;
    }
}
