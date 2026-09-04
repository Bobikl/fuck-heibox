package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.view.widget.HorizontalProgressWheelView;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class UcropLayoutScaleWheelBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final RelativeLayout rootView;

    @n0
    public final HorizontalProgressWheelView scaleScrollWheel;

    @n0
    public final TextView textViewScale;

    private UcropLayoutScaleWheelBinding(@n0 RelativeLayout relativeLayout, @n0 HorizontalProgressWheelView horizontalProgressWheelView, @n0 TextView textView) {
        this.rootView = relativeLayout;
        this.scaleScrollWheel = horizontalProgressWheelView;
        this.textViewScale = textView;
    }

    @n0
    public static UcropLayoutScaleWheelBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 50029, new Class[]{View.class}, UcropLayoutScaleWheelBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcropLayoutScaleWheelBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.scale_scroll_wheel;
        HorizontalProgressWheelView horizontalProgressWheelView = (HorizontalProgressWheelView) d.a(view, i10);
        if (horizontalProgressWheelView != null) {
            i10 = R.id.text_view_scale;
            TextView textView = (TextView) d.a(view, i10);
            if (textView != null) {
                return new UcropLayoutScaleWheelBinding((RelativeLayout) view, horizontalProgressWheelView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static UcropLayoutScaleWheelBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 50027, new Class[]{LayoutInflater.class}, UcropLayoutScaleWheelBinding.class);
        return patchProxyResultProxy.isSupported ? (UcropLayoutScaleWheelBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static UcropLayoutScaleWheelBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 50028, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, UcropLayoutScaleWheelBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcropLayoutScaleWheelBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_layout_scale_wheel, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50030, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
