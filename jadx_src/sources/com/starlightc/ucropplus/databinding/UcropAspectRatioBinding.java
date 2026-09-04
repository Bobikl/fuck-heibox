package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;

/* JADX INFO: loaded from: classes4.dex */
public final class UcropAspectRatioBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final FrameLayout rootView;

    private UcropAspectRatioBinding(@n0 FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @n0
    public static UcropAspectRatioBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 50013, new Class[]{View.class}, UcropAspectRatioBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcropAspectRatioBinding) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new UcropAspectRatioBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @n0
    public static UcropAspectRatioBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 50011, new Class[]{LayoutInflater.class}, UcropAspectRatioBinding.class);
        return patchProxyResultProxy.isSupported ? (UcropAspectRatioBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static UcropAspectRatioBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 50012, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, UcropAspectRatioBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcropAspectRatioBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_aspect_ratio, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50014, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
