package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
public final class FragmentTextBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final EditText editText;

    @n0
    public final ImageView ivClose;

    @n0
    public final ImageView ivConfirm;

    @n0
    private final LinearLayout rootView;

    @n0
    public final TabLayout tab;

    @n0
    public final RelativeLayout vgTab;

    @n0
    public final ViewPager2 vp2;

    private FragmentTextBinding(@n0 LinearLayout linearLayout, @n0 EditText editText, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 TabLayout tabLayout, @n0 RelativeLayout relativeLayout, @n0 ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.editText = editText;
        this.ivClose = imageView;
        this.ivConfirm = imageView2;
        this.tab = tabLayout;
        this.vgTab = relativeLayout;
        this.vp2 = viewPager2;
    }

    @n0
    public static FragmentTextBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49933, new Class[]{View.class}, FragmentTextBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentTextBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.edit_text;
        EditText editText = (EditText) d.a(view, i10);
        if (editText != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_confirm;
                ImageView imageView2 = (ImageView) d.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.tab;
                    TabLayout tabLayout = (TabLayout) d.a(view, i10);
                    if (tabLayout != null) {
                        i10 = R.id.vg_tab;
                        RelativeLayout relativeLayout = (RelativeLayout) d.a(view, i10);
                        if (relativeLayout != null) {
                            i10 = R.id.vp2;
                            ViewPager2 viewPager2 = (ViewPager2) d.a(view, i10);
                            if (viewPager2 != null) {
                                return new FragmentTextBinding((LinearLayout) view, editText, imageView, imageView2, tabLayout, relativeLayout, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static FragmentTextBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49931, new Class[]{LayoutInflater.class}, FragmentTextBinding.class);
        return patchProxyResultProxy.isSupported ? (FragmentTextBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static FragmentTextBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49932, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, FragmentTextBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentTextBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_text, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49934, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
