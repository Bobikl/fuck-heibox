package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.seekbar.FloatValueSeekBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentFilterBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final View layer;

    @n0
    private final ConstraintLayout rootView;

    @n0
    public final RecyclerView rvFilter;

    @n0
    public final RecyclerView rvFilterGroup;

    @n0
    public final FloatValueSeekBar sbFv;

    @n0
    public final TextView tvFilterTitle;

    private FragmentFilterBinding(@n0 ConstraintLayout constraintLayout, @n0 View view, @n0 RecyclerView recyclerView, @n0 RecyclerView recyclerView2, @n0 FloatValueSeekBar floatValueSeekBar, @n0 TextView textView) {
        this.rootView = constraintLayout;
        this.layer = view;
        this.rvFilter = recyclerView;
        this.rvFilterGroup = recyclerView2;
        this.sbFv = floatValueSeekBar;
        this.tvFilterTitle = textView;
    }

    @n0
    public static FragmentFilterBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49913, new Class[]{View.class}, FragmentFilterBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentFilterBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.layer;
        View viewA = d.a(view, i10);
        if (viewA != null) {
            i10 = R.id.rv_filter;
            RecyclerView recyclerView = (RecyclerView) d.a(view, i10);
            if (recyclerView != null) {
                i10 = R.id.rv_filter_group;
                RecyclerView recyclerView2 = (RecyclerView) d.a(view, i10);
                if (recyclerView2 != null) {
                    i10 = R.id.sb_fv;
                    FloatValueSeekBar floatValueSeekBar = (FloatValueSeekBar) d.a(view, i10);
                    if (floatValueSeekBar != null) {
                        i10 = R.id.tv_filter_title;
                        TextView textView = (TextView) d.a(view, i10);
                        if (textView != null) {
                            return new FragmentFilterBinding((ConstraintLayout) view, viewA, recyclerView, recyclerView2, floatValueSeekBar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static FragmentFilterBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49911, new Class[]{LayoutInflater.class}, FragmentFilterBinding.class);
        return patchProxyResultProxy.isSupported ? (FragmentFilterBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static FragmentFilterBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49912, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, FragmentFilterBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentFilterBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_filter, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49914, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
