package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class DialogLoadingBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final CircularProgressIndicator imgProgress;

    @n0
    private final LinearLayout rootView;

    @n0
    public final TextView tvMsg;

    private DialogLoadingBinding(@n0 LinearLayout linearLayout, @n0 CircularProgressIndicator circularProgressIndicator, @n0 TextView textView) {
        this.rootView = linearLayout;
        this.imgProgress = circularProgressIndicator;
        this.tvMsg = textView;
    }

    @n0
    public static DialogLoadingBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49905, new Class[]{View.class}, DialogLoadingBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (DialogLoadingBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.img_progress;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) d.a(view, i10);
        if (circularProgressIndicator != null) {
            i10 = R.id.tv_msg;
            TextView textView = (TextView) d.a(view, i10);
            if (textView != null) {
                return new DialogLoadingBinding((LinearLayout) view, circularProgressIndicator, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static DialogLoadingBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49903, new Class[]{LayoutInflater.class}, DialogLoadingBinding.class);
        return patchProxyResultProxy.isSupported ? (DialogLoadingBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static DialogLoadingBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49904, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, DialogLoadingBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (DialogLoadingBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_loading, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49906, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
