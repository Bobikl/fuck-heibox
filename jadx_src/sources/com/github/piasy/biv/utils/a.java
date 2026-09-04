package com.github.piasy.biv.utils;

import android.graphics.PointF;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: compiled from: DisplayOptimizeListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements SubsamplingScaleImageView.OnImageEventListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f43456c = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SubsamplingScaleImageView f43457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43458b;

    public a(SubsamplingScaleImageView subsamplingScaleImageView) {
        this.f43457a = subsamplingScaleImageView;
    }

    public void a(int i10) {
        this.f43458b = i10;
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoadError(Exception exc) {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onImageLoaded() {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewLoadError(Exception exc) {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onPreviewReleased() {
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onReady() {
        float f10;
        float f11;
        int sWidth = this.f43457a.getSWidth();
        int sHeight = this.f43457a.getSHeight();
        int width = this.f43457a.getWidth();
        int height = this.f43457a.getHeight();
        boolean z10 = sWidth == 0 || sHeight == 0 || width == 0 || height == 0;
        float f12 = 0.5f;
        if (!z10) {
            if (sWidth <= sHeight) {
                f10 = width;
                f11 = sWidth;
            } else {
                f10 = height;
                f11 = sHeight;
            }
            f12 = f10 / f11;
        }
        if (!z10 && sHeight / sWidth > 2.0f) {
            this.f43457a.animateScaleAndCenter(f12, new PointF(sWidth / 2, 0.0f)).withEasing(1).start();
        }
        if (Math.abs(((double) f12) - 0.1d) < 0.20000000298023224d) {
            f12 += 0.2f;
        }
        if (this.f43458b == 7) {
            float f13 = width / sWidth;
            float f14 = height / sHeight;
            float fMax = Math.max(f13, f14);
            if (fMax > 1.0f) {
                this.f43457a.setMinScale(1.0f);
                this.f43457a.setMaxScale(Math.max(this.f43457a.getMaxScale(), 1.2f * fMax));
            } else {
                this.f43457a.setMinScale(Math.min(f13, f14));
            }
            this.f43457a.setScaleAndCenter(fMax, new PointF(sWidth / 2, sHeight / 2));
        }
        this.f43457a.setDoubleTapZoomScale(f12);
    }

    @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
    public void onTileLoadError(Exception exc) {
    }
}
