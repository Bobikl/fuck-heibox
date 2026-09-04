package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.view.widget.HBRingProgressBar;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemTypefaceBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final ImageView ivDownload;

    @n0
    public final HBRingProgressBar progress;

    @n0
    private final FrameLayout rootView;

    @n0
    public final TextView tvTypeface;

    private ItemTypefaceBinding(@n0 FrameLayout frameLayout, @n0 ImageView imageView, @n0 HBRingProgressBar hBRingProgressBar, @n0 TextView textView) {
        this.rootView = frameLayout;
        this.ivDownload = imageView;
        this.progress = hBRingProgressBar;
        this.tvTypeface = textView;
    }

    @n0
    public static ItemTypefaceBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49993, new Class[]{View.class}, ItemTypefaceBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemTypefaceBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_download;
        ImageView imageView = (ImageView) d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.progress;
            HBRingProgressBar hBRingProgressBar = (HBRingProgressBar) d.a(view, i10);
            if (hBRingProgressBar != null) {
                i10 = R.id.tv_typeface;
                TextView textView = (TextView) d.a(view, i10);
                if (textView != null) {
                    return new ItemTypefaceBinding((FrameLayout) view, imageView, hBRingProgressBar, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static ItemTypefaceBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49991, new Class[]{LayoutInflater.class}, ItemTypefaceBinding.class);
        return patchProxyResultProxy.isSupported ? (ItemTypefaceBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static ItemTypefaceBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49992, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ItemTypefaceBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemTypefaceBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_typeface, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49994, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
