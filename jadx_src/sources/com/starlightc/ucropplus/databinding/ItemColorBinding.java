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
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemColorBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final FrameLayout rootView;

    @n0
    public final View vColorPreview;

    private ItemColorBinding(@n0 FrameLayout frameLayout, @n0 View view) {
        this.rootView = frameLayout;
        this.vColorPreview = view;
    }

    @n0
    public static ItemColorBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49949, new Class[]{View.class}, ItemColorBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemColorBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.v_color_preview;
        View viewA = d.a(view, i10);
        if (viewA != null) {
            return new ItemColorBinding((FrameLayout) view, viewA);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static ItemColorBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49947, new Class[]{LayoutInflater.class}, ItemColorBinding.class);
        return patchProxyResultProxy.isSupported ? (ItemColorBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static ItemColorBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49948, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ItemColorBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemColorBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_color, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49950, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
