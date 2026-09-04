package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
public final class FragmentTextModuleBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final LinearLayout rootView;

    @n0
    public final RecyclerView rvAdvancedTypeface;

    @n0
    public final RecyclerView rvColor;

    @n0
    public final RecyclerView rvTypeface;

    private FragmentTextModuleBinding(@n0 LinearLayout linearLayout, @n0 RecyclerView recyclerView, @n0 RecyclerView recyclerView2, @n0 RecyclerView recyclerView3) {
        this.rootView = linearLayout;
        this.rvAdvancedTypeface = recyclerView;
        this.rvColor = recyclerView2;
        this.rvTypeface = recyclerView3;
    }

    @n0
    public static FragmentTextModuleBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49937, new Class[]{View.class}, FragmentTextModuleBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentTextModuleBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_advanced_typeface;
        RecyclerView recyclerView = (RecyclerView) d.a(view, i10);
        if (recyclerView != null) {
            i10 = R.id.rv_color;
            RecyclerView recyclerView2 = (RecyclerView) d.a(view, i10);
            if (recyclerView2 != null) {
                i10 = R.id.rv_typeface;
                RecyclerView recyclerView3 = (RecyclerView) d.a(view, i10);
                if (recyclerView3 != null) {
                    return new FragmentTextModuleBinding((LinearLayout) view, recyclerView, recyclerView2, recyclerView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static FragmentTextModuleBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49935, new Class[]{LayoutInflater.class}, FragmentTextModuleBinding.class);
        return patchProxyResultProxy.isSupported ? (FragmentTextModuleBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static FragmentTextModuleBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49936, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, FragmentTextModuleBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentTextModuleBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_text_module, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49938, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
