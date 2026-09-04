package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
public final class ItemCropRatioBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final ImageView ivCropRatioImg;

    @n0
    private final RelativeLayout rootView;

    @n0
    public final TextView tvCropRatio;

    @n0
    public final RelativeLayout vgContainer;

    private ItemCropRatioBinding(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 TextView textView, @n0 RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.ivCropRatioImg = imageView;
        this.tvCropRatio = textView;
        this.vgContainer = relativeLayout2;
    }

    @n0
    public static ItemCropRatioBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49953, new Class[]{View.class}, ItemCropRatioBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemCropRatioBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_crop_ratio_img;
        ImageView imageView = (ImageView) d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.tv_crop_ratio;
            TextView textView = (TextView) d.a(view, i10);
            if (textView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                return new ItemCropRatioBinding(relativeLayout, imageView, textView, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static ItemCropRatioBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49951, new Class[]{LayoutInflater.class}, ItemCropRatioBinding.class);
        return patchProxyResultProxy.isSupported ? (ItemCropRatioBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static ItemCropRatioBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49952, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ItemCropRatioBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemCropRatioBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_crop_ratio, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49954, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
