package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.view.UCropView;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class UcropFragmentPhotoboxBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final FrameLayout controlsWrapper;

    @n0
    public final ImageView imageViewLogo;

    @n0
    private final RelativeLayout rootView;

    @n0
    public final UCropView ucrop;

    @n0
    public final FrameLayout ucropFrame;

    @n0
    public final RelativeLayout ucropPhotobox;

    private UcropFragmentPhotoboxBinding(@n0 RelativeLayout relativeLayout, @n0 FrameLayout frameLayout, @n0 ImageView imageView, @n0 UCropView uCropView, @n0 FrameLayout frameLayout2, @n0 RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.controlsWrapper = frameLayout;
        this.imageViewLogo = imageView;
        this.ucrop = uCropView;
        this.ucropFrame = frameLayout2;
        this.ucropPhotobox = relativeLayout2;
    }

    @n0
    public static UcropFragmentPhotoboxBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 50021, new Class[]{View.class}, UcropFragmentPhotoboxBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcropFragmentPhotoboxBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.controls_wrapper;
        FrameLayout frameLayout = (FrameLayout) d.a(view, i10);
        if (frameLayout != null) {
            i10 = R.id.image_view_logo;
            ImageView imageView = (ImageView) d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.ucrop;
                UCropView uCropView = (UCropView) d.a(view, i10);
                if (uCropView != null) {
                    i10 = R.id.ucrop_frame;
                    FrameLayout frameLayout2 = (FrameLayout) d.a(view, i10);
                    if (frameLayout2 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        return new UcropFragmentPhotoboxBinding(relativeLayout, frameLayout, imageView, uCropView, frameLayout2, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static UcropFragmentPhotoboxBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 50019, new Class[]{LayoutInflater.class}, UcropFragmentPhotoboxBinding.class);
        return patchProxyResultProxy.isSupported ? (UcropFragmentPhotoboxBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static UcropFragmentPhotoboxBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 50020, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, UcropFragmentPhotoboxBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcropFragmentPhotoboxBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.ucrop_fragment_photobox, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50022, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
