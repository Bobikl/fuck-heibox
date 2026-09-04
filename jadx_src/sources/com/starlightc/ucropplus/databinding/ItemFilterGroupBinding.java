package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemFilterGroupBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final FrameLayout rootView;

    @n0
    public final TextView tvGroup;

    private ItemFilterGroupBinding(@n0 FrameLayout frameLayout, @n0 TextView textView) {
        this.rootView = frameLayout;
        this.tvGroup = textView;
    }

    @n0
    public static ItemFilterGroupBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49957, new Class[]{View.class}, ItemFilterGroupBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemFilterGroupBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_group;
        TextView textView = (TextView) d.a(view, i10);
        if (textView != null) {
            return new ItemFilterGroupBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static ItemFilterGroupBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49955, new Class[]{LayoutInflater.class}, ItemFilterGroupBinding.class);
        return patchProxyResultProxy.isSupported ? (ItemFilterGroupBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static ItemFilterGroupBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49956, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ItemFilterGroupBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemFilterGroupBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_filter_group, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49958, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
