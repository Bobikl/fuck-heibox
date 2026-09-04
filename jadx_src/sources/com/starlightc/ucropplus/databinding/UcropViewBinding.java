package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.view.GestureCropImageView;
import com.starlightc.ucropplus.view.OverlayView;
import com.starlightc.ucropplus.view.StickerView;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class UcropViewBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    public final GestureCropImageView imageViewCrop;

    @n0
    private final View rootView;

    @n0
    public final StickerView stickerView;

    @n0
    public final View vBlock;

    @n0
    public final OverlayView viewOverlay;

    private UcropViewBinding(@n0 View view, @n0 GestureCropImageView gestureCropImageView, @n0 StickerView stickerView, @n0 View view2, @n0 OverlayView overlayView) {
        this.rootView = view;
        this.imageViewCrop = gestureCropImageView;
        this.stickerView = stickerView;
        this.vBlock = view2;
        this.viewOverlay = overlayView;
    }

    @n0
    public static UcropViewBinding bind(@n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 50032, new Class[]{View.class}, UcropViewBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcropViewBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.image_view_crop;
        GestureCropImageView gestureCropImageView = (GestureCropImageView) d.a(view, i10);
        if (gestureCropImageView != null) {
            i10 = R.id.sticker_view;
            StickerView stickerView = (StickerView) d.a(view, i10);
            if (stickerView != null && (viewA = d.a(view, (i10 = R.id.v_block))) != null) {
                i10 = R.id.view_overlay;
                OverlayView overlayView = (OverlayView) d.a(view, i10);
                if (overlayView != null) {
                    return new UcropViewBinding(view, gestureCropImageView, stickerView, viewA, overlayView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static UcropViewBinding inflate(@n0 LayoutInflater layoutInflater, @n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, 50031, new Class[]{LayoutInflater.class, ViewGroup.class}, UcropViewBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (UcropViewBinding) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.ucrop_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // l3.c
    @n0
    public View getRoot() {
        return this.rootView;
    }
}
