package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
public final class FragmentCropBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final ImageView ivCheck;

    @n0
    public final ImageView ivClose;

    @n0
    private final LinearLayout rootView;

    @n0
    public final RecyclerView rvCropRatio;

    @n0
    public final TextView tvCropTitle;

    @n0
    public final View vDivider;

    @n0
    public final RelativeLayout vgRotate;

    private FragmentCropBinding(@n0 LinearLayout linearLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 RecyclerView recyclerView, @n0 TextView textView, @n0 View view, @n0 RelativeLayout relativeLayout) {
        this.rootView = linearLayout;
        this.ivCheck = imageView;
        this.ivClose = imageView2;
        this.rvCropRatio = recyclerView;
        this.tvCropTitle = textView;
        this.vDivider = view;
        this.vgRotate = relativeLayout;
    }

    @n0
    public static FragmentCropBinding bind(@n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49909, new Class[]{View.class}, FragmentCropBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentCropBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_check;
        ImageView imageView = (ImageView) d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_close;
            ImageView imageView2 = (ImageView) d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.rv_crop_ratio;
                RecyclerView recyclerView = (RecyclerView) d.a(view, i10);
                if (recyclerView != null) {
                    i10 = R.id.tv_crop_title;
                    TextView textView = (TextView) d.a(view, i10);
                    if (textView != null && (viewA = d.a(view, (i10 = R.id.v_divider))) != null) {
                        i10 = R.id.vg_rotate;
                        RelativeLayout relativeLayout = (RelativeLayout) d.a(view, i10);
                        if (relativeLayout != null) {
                            return new FragmentCropBinding((LinearLayout) view, imageView, imageView2, recyclerView, textView, viewA, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static FragmentCropBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49907, new Class[]{LayoutInflater.class}, FragmentCropBinding.class);
        return patchProxyResultProxy.isSupported ? (FragmentCropBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static FragmentCropBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49908, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, FragmentCropBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentCropBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_crop, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49910, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
