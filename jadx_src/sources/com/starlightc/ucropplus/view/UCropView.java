package com.starlightc.ucropplus.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.starlightc.ucropplus.R;
import com.starlightc.ucropplus.callback.CropBoundsChangeListener;
import com.starlightc.ucropplus.callback.OverlayViewChangeListener;
import com.starlightc.ucropplus.enums.EDIT_MODE;

/* JADX INFO: loaded from: classes4.dex */
public class UCropView extends FrameLayout implements StickerView.StickerStatusChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final View mBlockView;
    private GestureCropImageView mGestureCropImageView;
    private final StickerView mStickerView;
    private final OverlayView mViewOverlay;
    private StickerView.StickerStatusChangeListener stickerStatusListener;

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UCropView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.ucrop_view, (ViewGroup) this, true);
        this.mGestureCropImageView = (GestureCropImageView) findViewById(R.id.image_view_crop);
        OverlayView overlayView = (OverlayView) findViewById(R.id.view_overlay);
        this.mViewOverlay = overlayView;
        this.mBlockView = findViewById(R.id.v_block);
        StickerView stickerView = (StickerView) findViewById(R.id.sticker_view);
        this.mStickerView = stickerView;
        stickerView.setStickerStatusChangeListener(this);
        if (context instanceof StickerView.StickerStatusChangeListener) {
            this.stickerStatusListener = (StickerView.StickerStatusChangeListener) context;
        }
        stickerView.setParentView(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ucrop_UCropView);
        overlayView.processStyledAttributes(typedArrayObtainStyledAttributes);
        this.mGestureCropImageView.processStyledAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setListenersToViews();
    }

    private void setListenersToViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51143, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mGestureCropImageView.setCropBoundsChangeListener(new CropBoundsChangeListener() { // from class: com.starlightc.ucropplus.view.UCropView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.callback.CropBoundsChangeListener
            public void onCropAspectRatioChanged(float f10) {
                if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 51147, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                UCropView.this.mViewOverlay.setTargetAspectRatio(f10);
            }
        });
        this.mViewOverlay.setOverlayViewChangeListener(new OverlayViewChangeListener() { // from class: com.starlightc.ucropplus.view.UCropView.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.starlightc.ucropplus.callback.OverlayViewChangeListener
            public void onCropRectUpdated(RectF rectF) {
                if (PatchProxy.proxy(new Object[]{rectF}, this, changeQuickRedirect, false, 51148, new Class[]{RectF.class}, Void.TYPE).isSupported) {
                    return;
                }
                UCropView.this.mGestureCropImageView.setCropRect(rectF);
            }

            @Override // com.starlightc.ucropplus.callback.OverlayViewChangeListener
            public void onCropRectUpdatedWithCropAreaResizeCallback(RectF rectF, OverlayViewChangeListener.CropAreaResizeCallback cropAreaResizeCallback) {
                if (PatchProxy.proxy(new Object[]{rectF, cropAreaResizeCallback}, this, changeQuickRedirect, false, 51149, new Class[]{RectF.class, OverlayViewChangeListener.CropAreaResizeCallback.class}, Void.TYPE).isSupported) {
                    return;
                }
                UCropView.this.mGestureCropImageView.setCropRectWithResizeCropAreaCallback(rectF, cropAreaResizeCallback);
            }
        });
    }

    @n0
    public View getBlockView() {
        return this.mBlockView;
    }

    @n0
    public GestureCropImageView getCropImageView() {
        return this.mGestureCropImageView;
    }

    @n0
    public OverlayView getOverlayView() {
        return this.mViewOverlay;
    }

    @n0
    public StickerView getStickerView() {
        return this.mStickerView;
    }

    @Override // com.starlightc.ucropplus.view.StickerView.StickerStatusChangeListener
    public void onItemDelete(int i10, int i11) {
    }

    @Override // com.starlightc.ucropplus.view.StickerView.StickerStatusChangeListener
    public void onStatusChanged(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 51145, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        StickerView.StickerStatusChangeListener stickerStatusChangeListener = this.stickerStatusListener;
        if (stickerStatusChangeListener != null) {
            stickerStatusChangeListener.onStatusChanged(z10);
        }
        this.mBlockView.setClickable(z10);
    }

    @Override // com.starlightc.ucropplus.view.StickerView.StickerStatusChangeListener
    public void requestChangeMode(@n0 EDIT_MODE edit_mode) {
        StickerView.StickerStatusChangeListener stickerStatusChangeListener;
        if (PatchProxy.proxy(new Object[]{edit_mode}, this, changeQuickRedirect, false, 51146, new Class[]{EDIT_MODE.class}, Void.TYPE).isSupported || (stickerStatusChangeListener = this.stickerStatusListener) == null) {
            return;
        }
        stickerStatusChangeListener.requestChangeMode(edit_mode);
    }

    public void resetCropImageView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51144, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        removeView(this.mGestureCropImageView);
        this.mGestureCropImageView = new GestureCropImageView(getContext());
        setListenersToViews();
        this.mGestureCropImageView.setCropRect(getOverlayView().getCropViewRect());
        addView(this.mGestureCropImageView, 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
