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
public final class ItemImageFilterBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final ImageView ivFilterPreview;

    @n0
    private final RelativeLayout rootView;

    @n0
    public final TextView tvFilterName;

    @n0
    public final RelativeLayout vgFilterItem;

    private ItemImageFilterBinding(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 TextView textView, @n0 RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.ivFilterPreview = imageView;
        this.tvFilterName = textView;
        this.vgFilterItem = relativeLayout2;
    }

    @n0
    public static ItemImageFilterBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49961, new Class[]{View.class}, ItemImageFilterBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemImageFilterBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_filter_preview;
        ImageView imageView = (ImageView) d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.tv_filter_name;
            TextView textView = (TextView) d.a(view, i10);
            if (textView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                return new ItemImageFilterBinding(relativeLayout, imageView, textView, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static ItemImageFilterBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49959, new Class[]{LayoutInflater.class}, ItemImageFilterBinding.class);
        return patchProxyResultProxy.isSupported ? (ItemImageFilterBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static ItemImageFilterBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49960, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ItemImageFilterBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemImageFilterBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_image_filter, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49962, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
