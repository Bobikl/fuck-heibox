package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes6.dex */
public class PhotoView extends AppCompatImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f43049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView.ScaleType f43050c;

    public PhotoView(Context context) {
        this(context, null);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init();
    }

    private void init() {
        this.f43049b = new l(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f43050c;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f43050c = null;
        }
    }

    public void d(Matrix matrix) {
        this.f43049b.D(matrix);
    }

    public void g(Matrix matrix) {
        this.f43049b.P(matrix);
    }

    public l getAttacher() {
        return this.f43049b;
    }

    public RectF getDisplayRect() {
        return this.f43049b.E();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f43049b.H();
    }

    public float getMaximumScale() {
        return this.f43049b.K();
    }

    public float getMediumScale() {
        return this.f43049b.L();
    }

    public float getMinimumScale() {
        return this.f43049b.M();
    }

    public float getScale() {
        return this.f43049b.N();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f43049b.O();
    }

    public boolean h() {
        return this.f43049b.S();
    }

    public boolean i(Matrix matrix) {
        return this.f43049b.W(matrix);
    }

    public boolean j(Matrix matrix) {
        return this.f43049b.W(matrix);
    }

    public void setAllowParentInterceptOnEdge(boolean z10) {
        this.f43049b.U(z10);
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        if (frame) {
            this.f43049b.v0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        l lVar = this.f43049b;
        if (lVar != null) {
            lVar.v0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        l lVar = this.f43049b;
        if (lVar != null) {
            lVar.v0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        l lVar = this.f43049b;
        if (lVar != null) {
            lVar.v0();
        }
    }

    public void setMaximumScale(float f10) {
        this.f43049b.Y(f10);
    }

    public void setMediumScale(float f10) {
        this.f43049b.Z(f10);
    }

    public void setMinimumScale(float f10) {
        this.f43049b.a0(f10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f43049b.b0(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f43049b.c0(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f43049b.d0(onLongClickListener);
    }

    public void setOnMatrixChangeListener(e eVar) {
        this.f43049b.e0(eVar);
    }

    public void setOnOutsidePhotoTapListener(f fVar) {
        this.f43049b.f0(fVar);
    }

    public void setOnPhotoTapListener(g gVar) {
        this.f43049b.g0(gVar);
    }

    public void setOnScaleChangeListener(h hVar) {
        this.f43049b.h0(hVar);
    }

    public void setOnSingleFlingListener(i iVar) {
        this.f43049b.i0(iVar);
    }

    public void setOnViewDragListener(j jVar) {
        this.f43049b.j0(jVar);
    }

    public void setOnViewTapListener(k kVar) {
        this.f43049b.k0(kVar);
    }

    public void setRotationBy(float f10) {
        this.f43049b.l0(f10);
    }

    public void setRotationTo(float f10) {
        this.f43049b.m0(f10);
    }

    public void setScale(float f10) {
        this.f43049b.n0(f10);
    }

    public void setScale(float f10, float f11, float f12, boolean z10) {
        this.f43049b.o0(f10, f11, f12, z10);
    }

    public void setScale(float f10, boolean z10) {
        this.f43049b.p0(f10, z10);
    }

    public void setScaleLevels(float f10, float f11, float f12) {
        this.f43049b.q0(f10, f11, f12);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        l lVar = this.f43049b;
        if (lVar == null) {
            this.f43050c = scaleType;
        } else {
            lVar.r0(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i10) {
        this.f43049b.t0(i10);
    }

    public void setZoomable(boolean z10) {
        this.f43049b.u0(z10);
    }
}
