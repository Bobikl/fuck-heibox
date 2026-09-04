package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
public final class ItemTopicsNewBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final ImageView ivClose;

    @n0
    public final ImageView ivTopicIcon;

    @n0
    private final LinearLayout rootView;

    @n0
    public final TextView tvTopicName;

    private ItemTopicsNewBinding(@n0 LinearLayout linearLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 TextView textView) {
        this.rootView = linearLayout;
        this.ivClose = imageView;
        this.ivTopicIcon = imageView2;
        this.tvTopicName = textView;
    }

    @n0
    public static ItemTopicsNewBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49989, new Class[]{View.class}, ItemTopicsNewBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemTopicsNewBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_close;
        ImageView imageView = (ImageView) d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_topic_icon;
            ImageView imageView2 = (ImageView) d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.tv_topic_name;
                TextView textView = (TextView) d.a(view, i10);
                if (textView != null) {
                    return new ItemTopicsNewBinding((LinearLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static ItemTopicsNewBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49987, new Class[]{LayoutInflater.class}, ItemTopicsNewBinding.class);
        return patchProxyResultProxy.isSupported ? (ItemTopicsNewBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static ItemTopicsNewBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49988, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ItemTopicsNewBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemTopicsNewBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_topics_new, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49990, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
