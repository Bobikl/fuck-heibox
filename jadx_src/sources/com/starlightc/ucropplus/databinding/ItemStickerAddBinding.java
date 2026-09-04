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
public final class ItemStickerAddBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final FrameLayout rootView;

    private ItemStickerAddBinding(@n0 FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @n0
    public static ItemStickerAddBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49969, new Class[]{View.class}, ItemStickerAddBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemStickerAddBinding) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new ItemStickerAddBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @n0
    public static ItemStickerAddBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49967, new Class[]{LayoutInflater.class}, ItemStickerAddBinding.class);
        return patchProxyResultProxy.isSupported ? (ItemStickerAddBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static ItemStickerAddBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49968, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ItemStickerAddBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemStickerAddBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_sticker_add, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49970, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
