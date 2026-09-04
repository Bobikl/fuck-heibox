package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemStickerBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final ImageView ivSticker;

    @n0
    private final FrameLayout rootView;

    private ItemStickerBinding(@n0 FrameLayout frameLayout, @n0 ImageView imageView) {
        this.rootView = frameLayout;
        this.ivSticker = imageView;
    }

    @n0
    public static ItemStickerBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49973, new Class[]{View.class}, ItemStickerBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemStickerBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_sticker;
        ImageView imageView = (ImageView) d.a(view, i10);
        if (imageView != null) {
            return new ItemStickerBinding((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static ItemStickerBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49971, new Class[]{LayoutInflater.class}, ItemStickerBinding.class);
        return patchProxyResultProxy.isSupported ? (ItemStickerBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static ItemStickerBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49972, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ItemStickerBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemStickerBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_sticker, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49974, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
