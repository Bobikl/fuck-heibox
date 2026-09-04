package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemStickerContentBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final LinearLayout rootView;

    @n0
    public final RecyclerView rvStickerGroup;

    @n0
    public final TextView tvGroupName;

    private ItemStickerContentBinding(@n0 LinearLayout linearLayout, @n0 RecyclerView recyclerView, @n0 TextView textView) {
        this.rootView = linearLayout;
        this.rvStickerGroup = recyclerView;
        this.tvGroupName = textView;
    }

    @n0
    public static ItemStickerContentBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49977, new Class[]{View.class}, ItemStickerContentBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemStickerContentBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_sticker_group;
        RecyclerView recyclerView = (RecyclerView) d.a(view, i10);
        if (recyclerView != null) {
            i10 = R.id.tv_group_name;
            TextView textView = (TextView) d.a(view, i10);
            if (textView != null) {
                return new ItemStickerContentBinding((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static ItemStickerContentBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49975, new Class[]{LayoutInflater.class}, ItemStickerContentBinding.class);
        return patchProxyResultProxy.isSupported ? (ItemStickerContentBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static ItemStickerContentBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49976, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ItemStickerContentBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemStickerContentBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_sticker_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49978, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
