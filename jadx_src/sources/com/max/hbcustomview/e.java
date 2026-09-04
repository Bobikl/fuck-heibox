package com.max.hbcustomview;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: Rotate3dAnimation.java */
/* JADX INFO: loaded from: classes10.dex */
public class e extends Animation {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f69071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f69072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f69073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f69074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f69075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f69076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Camera f69077h;

    public e(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        this.f69071b = f10;
        this.f69072c = f11;
        this.f69073d = f12;
        this.f69074e = f13;
        this.f69075f = f14;
        this.f69076g = z10;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f10, Transformation transformation) {
        if (PatchProxy.proxy(new Object[]{new Float(f10), transformation}, this, changeQuickRedirect, false, bb.c.f.V9, new Class[]{Float.TYPE, Transformation.class}, Void.TYPE).isSupported) {
            return;
        }
        float f11 = this.f69071b;
        float f12 = f11 + ((this.f69072c - f11) * f10);
        float f13 = this.f69073d;
        float f14 = this.f69074e;
        Camera camera = this.f69077h;
        Matrix matrix = transformation.getMatrix();
        Log.i("interpolatedTime", f10 + "");
        camera.save();
        if (this.f69076g) {
            camera.translate(0.0f, 0.0f, this.f69075f * f10);
        } else {
            camera.translate(0.0f, 0.0f, this.f69075f * (1.0f - f10));
        }
        camera.rotateY(f12);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-f13, -f14);
        matrix.postTranslate(f13, f14);
    }

    @Override // android.view.animation.Animation
    public void initialize(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.U9, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.initialize(i10, i11, i12, i13);
        this.f69077h = new Camera();
    }
}
