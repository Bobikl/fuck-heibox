package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class UcpEditorActivityBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final ConstraintLayout rootView;

    @n0
    public final MaterialToolbar toolbar;

    @n0
    public final ViewPager2 viewpager;

    private UcpEditorActivityBinding(@n0 ConstraintLayout constraintLayout, @n0 MaterialToolbar materialToolbar, @n0 ViewPager2 viewPager2) {
        this.rootView = constraintLayout;
        this.toolbar = materialToolbar;
        this.viewpager = viewPager2;
    }

    @n0
    public static UcpEditorActivityBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49997, new Class[]{View.class}, UcpEditorActivityBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcpEditorActivityBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.toolbar;
        MaterialToolbar materialToolbar = (MaterialToolbar) d.a(view, i10);
        if (materialToolbar != null) {
            i10 = R.id.viewpager;
            ViewPager2 viewPager2 = (ViewPager2) d.a(view, i10);
            if (viewPager2 != null) {
                return new UcpEditorActivityBinding((ConstraintLayout) view, materialToolbar, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static UcpEditorActivityBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49995, new Class[]{LayoutInflater.class}, UcpEditorActivityBinding.class);
        return patchProxyResultProxy.isSupported ? (UcpEditorActivityBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static UcpEditorActivityBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49996, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, UcpEditorActivityBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcpEditorActivityBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.ucp_editor_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49998, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
