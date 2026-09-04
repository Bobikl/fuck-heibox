package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentModuleBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final LinearLayout rootView;

    @n0
    public final TabLayout tab;

    @n0
    public final ViewPager2 vp2;

    private FragmentModuleBinding(@n0 LinearLayout linearLayout, @n0 TabLayout tabLayout, @n0 ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.tab = tabLayout;
        this.vp2 = viewPager2;
    }

    @n0
    public static FragmentModuleBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49921, new Class[]{View.class}, FragmentModuleBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentModuleBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.tab;
        TabLayout tabLayout = (TabLayout) d.a(view, i10);
        if (tabLayout != null) {
            i10 = R.id.vp2;
            ViewPager2 viewPager2 = (ViewPager2) d.a(view, i10);
            if (viewPager2 != null) {
                return new FragmentModuleBinding((LinearLayout) view, tabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static FragmentModuleBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49919, new Class[]{LayoutInflater.class}, FragmentModuleBinding.class);
        return patchProxyResultProxy.isSupported ? (FragmentModuleBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static FragmentModuleBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49920, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, FragmentModuleBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentModuleBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_module, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49922, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
