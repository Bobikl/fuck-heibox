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
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.starlightc.ucropplus.R;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentTextStyleBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final SmartRefreshLayout rootView;

    @n0
    public final RecyclerView rv;

    @n0
    public final SmartRefreshLayout srl;

    private FragmentTextStyleBinding(@n0 SmartRefreshLayout smartRefreshLayout, @n0 RecyclerView recyclerView, @n0 SmartRefreshLayout smartRefreshLayout2) {
        this.rootView = smartRefreshLayout;
        this.rv = recyclerView;
        this.srl = smartRefreshLayout2;
    }

    @n0
    public static FragmentTextStyleBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49941, new Class[]{View.class}, FragmentTextStyleBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentTextStyleBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) d.a(view, i10);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
        return new FragmentTextStyleBinding(smartRefreshLayout, recyclerView, smartRefreshLayout);
    }

    @n0
    public static FragmentTextStyleBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49939, new Class[]{LayoutInflater.class}, FragmentTextStyleBinding.class);
        return patchProxyResultProxy.isSupported ? (FragmentTextStyleBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static FragmentTextStyleBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49940, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, FragmentTextStyleBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentTextStyleBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_text_style, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49942, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public SmartRefreshLayout getRoot() {
        return this.rootView;
    }
}
