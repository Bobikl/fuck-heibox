package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.viewpager2.NestedScrollableHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentModuleListBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final NestedScrollableHost rootView;

    @n0
    public final RecyclerView rv;

    private FragmentModuleListBinding(@n0 NestedScrollableHost nestedScrollableHost, @n0 RecyclerView recyclerView) {
        this.rootView = nestedScrollableHost;
        this.rv = recyclerView;
    }

    @n0
    public static FragmentModuleListBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49925, new Class[]{View.class}, FragmentModuleListBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentModuleListBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) d.a(view, i10);
        if (recyclerView != null) {
            return new FragmentModuleListBinding((NestedScrollableHost) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static FragmentModuleListBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49923, new Class[]{LayoutInflater.class}, FragmentModuleListBinding.class);
        return patchProxyResultProxy.isSupported ? (FragmentModuleListBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static FragmentModuleListBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49924, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, FragmentModuleListBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentModuleListBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_module_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49926, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public NestedScrollableHost getRoot() {
        return this.rootView;
    }
}
