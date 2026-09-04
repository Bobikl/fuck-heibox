package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.view.UCropView;
import com.tencent.ugc.datereport.UGCDataReportDef;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class UcpItemImageEditorBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final UCropView cropView;

    @n0
    private final RelativeLayout rootView;

    @n0
    public final RelativeLayout vgContainer;

    private UcpItemImageEditorBinding(@n0 RelativeLayout relativeLayout, @n0 UCropView uCropView, @n0 RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.cropView = uCropView;
        this.vgContainer = relativeLayout2;
    }

    @n0
    public static UcpItemImageEditorBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 50001, new Class[]{View.class}, UcpItemImageEditorBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcpItemImageEditorBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.crop_view;
        UCropView uCropView = (UCropView) d.a(view, i10);
        if (uCropView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new UcpItemImageEditorBinding(relativeLayout, uCropView, relativeLayout);
    }

    @n0
    public static UcpItemImageEditorBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, UGCDataReportDef.COMMAND_ID_DAU, new Class[]{LayoutInflater.class}, UcpItemImageEditorBinding.class);
        return patchProxyResultProxy.isSupported ? (UcpItemImageEditorBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static UcpItemImageEditorBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 50000, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, UcpItemImageEditorBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcpItemImageEditorBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.ucp_item_image_editor, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50002, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
