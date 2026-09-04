package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.view.TextRenderPreview;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemAdvancedTypefaceBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final TextRenderPreview atpPreview;

    @n0
    private final FrameLayout rootView;

    private ItemAdvancedTypefaceBinding(@n0 FrameLayout frameLayout, @n0 TextRenderPreview textRenderPreview) {
        this.rootView = frameLayout;
        this.atpPreview = textRenderPreview;
    }

    @n0
    public static ItemAdvancedTypefaceBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49945, new Class[]{View.class}, ItemAdvancedTypefaceBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemAdvancedTypefaceBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.atp_preview;
        TextRenderPreview textRenderPreview = (TextRenderPreview) d.a(view, i10);
        if (textRenderPreview != null) {
            return new ItemAdvancedTypefaceBinding((FrameLayout) view, textRenderPreview);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static ItemAdvancedTypefaceBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49943, new Class[]{LayoutInflater.class}, ItemAdvancedTypefaceBinding.class);
        return patchProxyResultProxy.isSupported ? (ItemAdvancedTypefaceBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static ItemAdvancedTypefaceBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49944, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ItemAdvancedTypefaceBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (ItemAdvancedTypefaceBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_advanced_typeface, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49946, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
