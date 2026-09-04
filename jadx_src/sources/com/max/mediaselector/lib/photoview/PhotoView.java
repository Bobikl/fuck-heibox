package com.max.mediaselector.lib.photoview;

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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes2.dex */
public class PhotoView extends AppCompatImageView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f75335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView.ScaleType f75336c;

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
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34646c3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75335b = new k(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f75336c;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f75336c = null;
        }
    }

    public void d(Matrix matrix) {
        if (PatchProxy.proxy(new Object[]{matrix}, this, changeQuickRedirect, false, bb.c.m.f34991r3, new Class[]{Matrix.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.B(matrix);
    }

    public void g(Matrix matrix) {
        if (PatchProxy.proxy(new Object[]{matrix}, this, changeQuickRedirect, false, bb.c.m.f35035t3, new Class[]{Matrix.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.N(matrix);
    }

    public k getAttacher() {
        return this.f75335b;
    }

    public RectF getDisplayRect() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34969q3, new Class[0], RectF.class);
        return patchProxyResultProxy.isSupported ? (RectF) patchProxyResultProxy.result : this.f75335b.C();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34693e3, new Class[0], Matrix.class);
        return patchProxyResultProxy.isSupported ? (Matrix) patchProxyResultProxy.result : this.f75335b.F();
    }

    public float getMaximumScale() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35123x3, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : this.f75335b.I();
    }

    public float getMediumScale() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35101w3, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : this.f75335b.J();
    }

    public float getMinimumScale() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35079v3, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : this.f75335b.K();
    }

    public float getScale() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f35145y3, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : this.f75335b.L();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34670d3, new Class[0], ImageView.ScaleType.class);
        return patchProxyResultProxy.isSupported ? (ImageView.ScaleType) patchProxyResultProxy.result : this.f75335b.M();
    }

    public boolean h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.f34923o3, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f75335b.Q();
    }

    public boolean i(Matrix matrix) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{matrix}, this, changeQuickRedirect, false, bb.c.m.f35013s3, new Class[]{Matrix.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f75335b.U(matrix);
    }

    public boolean j(Matrix matrix) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{matrix}, this, changeQuickRedirect, false, bb.c.m.f35057u3, new Class[]{Matrix.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f75335b.U(matrix);
    }

    public void setAllowParentInterceptOnEdge(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.f35167z3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.S(z10);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.f34854l3, new Class[]{cls, cls, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean frame = super.setFrame(i10, i11, i12, i13);
        if (frame) {
            this.f75335b.t0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.m.f34785i3, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        super.setImageDrawable(drawable);
        k kVar = this.f75335b;
        if (kVar != null) {
            kVar.t0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.f34808j3, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setImageResource(i10);
        k kVar = this.f75335b;
        if (kVar != null) {
            kVar.t0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.m.f34831k3, new Class[]{Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        super.setImageURI(uri);
        k kVar = this.f75335b;
        if (kVar != null) {
            kVar.t0();
        }
    }

    public void setMaximumScale(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.C3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.W(f10);
    }

    public void setMediumScale(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.B3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.X(f10);
    }

    public void setMinimumScale(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.A3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.Y(f10);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, bb.c.m.f34739g3, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.Z(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (PatchProxy.proxy(new Object[]{onDoubleTapListener}, this, changeQuickRedirect, false, bb.c.m.N3, new Class[]{GestureDetector.OnDoubleTapListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.a0(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        if (PatchProxy.proxy(new Object[]{onLongClickListener}, this, changeQuickRedirect, false, bb.c.m.f34716f3, new Class[]{View.OnLongClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.b0(onLongClickListener);
    }

    public void setOnMatrixChangeListener(d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.m.E3, new Class[]{d.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.c0(dVar);
    }

    public void setOnOutsidePhotoTapListener(e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, bb.c.m.G3, new Class[]{e.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.d0(eVar);
    }

    public void setOnPhotoTapListener(f fVar) {
        if (PatchProxy.proxy(new Object[]{fVar}, this, changeQuickRedirect, false, bb.c.m.F3, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.e0(fVar);
    }

    public void setOnScaleChangeListener(g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.m.O3, new Class[]{g.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.f0(gVar);
    }

    public void setOnSingleFlingListener(h hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.m.P3, new Class[]{h.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.g0(hVar);
    }

    public void setOnViewDragListener(i iVar) {
        if (PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.m.I3, new Class[]{i.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.h0(iVar);
    }

    public void setOnViewTapListener(j jVar) {
        if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, bb.c.m.H3, new Class[]{j.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.i0(jVar);
    }

    public void setRotationBy(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.f34900n3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.j0(f10);
    }

    public void setRotationTo(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.f34877m3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.k0(f10);
    }

    public void setScale(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.J3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.l0(f10);
    }

    public void setScale(float f10, float f11, float f12, boolean z10) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.L3, new Class[]{cls, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.m0(f10, f11, f12, z10);
    }

    public void setScale(float f10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.K3, new Class[]{Float.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.n0(f10, z10);
    }

    public void setScaleLevels(float f10, float f11, float f12) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.D3, new Class[]{cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.o0(f10, f11, f12);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (PatchProxy.proxy(new Object[]{scaleType}, this, changeQuickRedirect, false, bb.c.m.f34762h3, new Class[]{ImageView.ScaleType.class}, Void.TYPE).isSupported) {
            return;
        }
        k kVar = this.f75335b;
        if (kVar == null) {
            this.f75336c = scaleType;
        } else {
            kVar.p0(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.M3, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.r0(i10);
    }

    public void setZoomable(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.f34946p3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75335b.s0(z10);
    }
}
