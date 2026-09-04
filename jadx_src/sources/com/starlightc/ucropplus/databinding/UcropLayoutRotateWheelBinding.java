package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public final class UcropLayoutRotateWheelBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final RelativeLayout rootView;

    @n0
    public final HorizontalProgressWheelView rotateScrollWheel;

    @n0
    public final TextView textViewRotate;

    @n0
    public final FrameLayout wrapperResetRotate;

    @n0
    public final FrameLayout wrapperRotateByAngle;

    private UcropLayoutRotateWheelBinding(@n0 RelativeLayout relativeLayout, @n0 HorizontalProgressWheelView horizontalProgressWheelView, @n0 TextView textView, @n0 FrameLayout frameLayout, @n0 FrameLayout frameLayout2) {
        this.rootView = relativeLayout;
        this.rotateScrollWheel = horizontalProgressWheelView;
        this.textViewRotate = textView;
        this.wrapperResetRotate = frameLayout;
        this.wrapperRotateByAngle = frameLayout2;
    }

    @n0
    public static UcropLayoutRotateWheelBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 50025, new Class[]{View.class}, UcropLayoutRotateWheelBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcropLayoutRotateWheelBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.rotate_scroll_wheel;
        HorizontalProgressWheelView horizontalProgressWheelView = (HorizontalProgressWheelView) d.a(view, i10);
        if (horizontalProgressWheelView != null) {
            i10 = R.id.text_view_rotate;
            TextView textView = (TextView) d.a(view, i10);
            if (textView != null) {
                i10 = R.id.wrapper_reset_rotate;
                FrameLayout frameLayout = (FrameLayout) d.a(view, i10);
                if (frameLayout != null) {
                    i10 = R.id.wrapper_rotate_by_angle;
                    FrameLayout frameLayout2 = (FrameLayout) d.a(view, i10);
                    if (frameLayout2 != null) {
                        return new UcropLayoutRotateWheelBinding((RelativeLayout) view, horizontalProgressWheelView, textView, frameLayout, frameLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static UcropLayoutRotateWheelBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 50023, new Class[]{LayoutInflater.class}, UcropLayoutRotateWheelBinding.class);
        return patchProxyResultProxy.isSupported ? (UcropLayoutRotateWheelBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static UcropLayoutRotateWheelBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 50024, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, UcropLayoutRotateWheelBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcropLayoutRotateWheelBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_layout_rotate_wheel, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50026, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
