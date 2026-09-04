package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
public final class UcropControlsBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final ImageView controlsShadow;

    @n0
    public final ImageView imageViewStateAspectRatio;

    @n0
    public final ImageView imageViewStateRotate;

    @n0
    public final ImageView imageViewStateScale;

    @n0
    public final LinearLayout layoutAspectRatio;

    @n0
    public final UcropLayoutRotateWheelBinding layoutRotateWheel;

    @n0
    public final UcropLayoutScaleWheelBinding layoutScaleWheel;

    @n0
    private final RelativeLayout rootView;

    @n0
    public final LinearLayout stateAspectRatio;

    @n0
    public final LinearLayout stateRotate;

    @n0
    public final LinearLayout stateScale;

    @n0
    public final TextView textViewCrop;

    @n0
    public final TextView textViewRotate;

    @n0
    public final TextView textViewScale;

    @n0
    public final FrameLayout wrapperControls;

    @n0
    public final LinearLayout wrapperStates;

    private UcropControlsBinding(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 ImageView imageView3, @n0 ImageView imageView4, @n0 LinearLayout linearLayout, @n0 UcropLayoutRotateWheelBinding ucropLayoutRotateWheelBinding, @n0 UcropLayoutScaleWheelBinding ucropLayoutScaleWheelBinding, @n0 LinearLayout linearLayout2, @n0 LinearLayout linearLayout3, @n0 LinearLayout linearLayout4, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 FrameLayout frameLayout, @n0 LinearLayout linearLayout5) {
        this.rootView = relativeLayout;
        this.controlsShadow = imageView;
        this.imageViewStateAspectRatio = imageView2;
        this.imageViewStateRotate = imageView3;
        this.imageViewStateScale = imageView4;
        this.layoutAspectRatio = linearLayout;
        this.layoutRotateWheel = ucropLayoutRotateWheelBinding;
        this.layoutScaleWheel = ucropLayoutScaleWheelBinding;
        this.stateAspectRatio = linearLayout2;
        this.stateRotate = linearLayout3;
        this.stateScale = linearLayout4;
        this.textViewCrop = textView;
        this.textViewRotate = textView2;
        this.textViewScale = textView3;
        this.wrapperControls = frameLayout;
        this.wrapperStates = linearLayout5;
    }

    @n0
    public static UcropControlsBinding bind(@n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 50017, new Class[]{View.class}, UcropControlsBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcropControlsBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.controls_shadow;
        ImageView imageView = (ImageView) d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.image_view_state_aspect_ratio;
            ImageView imageView2 = (ImageView) d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.image_view_state_rotate;
                ImageView imageView3 = (ImageView) d.a(view, i10);
                if (imageView3 != null) {
                    i10 = R.id.image_view_state_scale;
                    ImageView imageView4 = (ImageView) d.a(view, i10);
                    if (imageView4 != null) {
                        i10 = R.id.layout_aspect_ratio;
                        LinearLayout linearLayout = (LinearLayout) d.a(view, i10);
                        if (linearLayout != null && (viewA = d.a(view, (i10 = R.id.layout_rotate_wheel))) != null) {
                            UcropLayoutRotateWheelBinding ucropLayoutRotateWheelBindingBind = UcropLayoutRotateWheelBinding.bind(viewA);
                            i10 = R.id.layout_scale_wheel;
                            View viewA2 = d.a(view, i10);
                            if (viewA2 != null) {
                                UcropLayoutScaleWheelBinding ucropLayoutScaleWheelBindingBind = UcropLayoutScaleWheelBinding.bind(viewA2);
                                i10 = R.id.state_aspect_ratio;
                                LinearLayout linearLayout2 = (LinearLayout) d.a(view, i10);
                                if (linearLayout2 != null) {
                                    i10 = R.id.state_rotate;
                                    LinearLayout linearLayout3 = (LinearLayout) d.a(view, i10);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.state_scale;
                                        LinearLayout linearLayout4 = (LinearLayout) d.a(view, i10);
                                        if (linearLayout4 != null) {
                                            i10 = R.id.text_view_crop;
                                            TextView textView = (TextView) d.a(view, i10);
                                            if (textView != null) {
                                                i10 = R.id.text_view_rotate;
                                                TextView textView2 = (TextView) d.a(view, i10);
                                                if (textView2 != null) {
                                                    i10 = R.id.text_view_scale;
                                                    TextView textView3 = (TextView) d.a(view, i10);
                                                    if (textView3 != null) {
                                                        i10 = R.id.wrapper_controls;
                                                        FrameLayout frameLayout = (FrameLayout) d.a(view, i10);
                                                        if (frameLayout != null) {
                                                            i10 = R.id.wrapper_states;
                                                            LinearLayout linearLayout5 = (LinearLayout) d.a(view, i10);
                                                            if (linearLayout5 != null) {
                                                                return new UcropControlsBinding((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, linearLayout, ucropLayoutRotateWheelBindingBind, ucropLayoutScaleWheelBindingBind, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, frameLayout, linearLayout5);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static UcropControlsBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 50015, new Class[]{LayoutInflater.class}, UcropControlsBinding.class);
        return patchProxyResultProxy.isSupported ? (UcropControlsBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static UcropControlsBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 50016, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, UcropControlsBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcropControlsBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_controls, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50018, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
