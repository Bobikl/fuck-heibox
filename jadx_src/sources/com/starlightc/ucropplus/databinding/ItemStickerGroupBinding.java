package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemStickerGroupBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final RecyclerView rootView;

    @n0
    public final RecyclerView rvStickerGroup;

    private ItemStickerGroupBinding(@n0 RecyclerView recyclerView, @n0 RecyclerView recyclerView2) {
        this.rootView = recyclerView;
        this.rvStickerGroup = recyclerView2;
    }

    @n0
    public static ItemStickerGroupBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49981, new Class[]{View.class}, ItemStickerGroupBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemStickerGroupBinding) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new ItemStickerGroupBinding(recyclerView, recyclerView);
    }

    @n0
    public static ItemStickerGroupBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49979, new Class[]{LayoutInflater.class}, ItemStickerGroupBinding.class);
        return patchProxyResultProxy.isSupported ? (ItemStickerGroupBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static ItemStickerGroupBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49980, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ItemStickerGroupBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemStickerGroupBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_sticker_group, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49982, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public RecyclerView getRoot() {
        return this.rootView;
    }
}
