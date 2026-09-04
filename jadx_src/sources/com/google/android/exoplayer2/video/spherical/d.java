package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: compiled from: OrientationListener.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f51878b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f51879c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f51880d = new float[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f51881e = new float[3];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Display f51882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a[] f51883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f51884h;

    /* JADX INFO: compiled from: OrientationListener.java */
    public interface a {
        void a(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f51882f = display;
        this.f51883g = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f51879c);
        SensorManager.getOrientation(this.f51879c, this.f51881e);
        return this.f51881e[2];
    }

    private void b(float[] fArr, float f10) {
        for (a aVar : this.f51883g) {
            aVar.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f51884h) {
            c.a(this.f51880d, fArr);
            this.f51884h = true;
        }
        float[] fArr2 = this.f51879c;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f51879c, 0, this.f51880d, 0);
    }

    private void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 130;
            int i12 = 129;
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
                i11 = 129;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i12 = 1;
            }
            float[] fArr2 = this.f51879c;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f51879c, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    @androidx.annotation.g
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f51878b, sensorEvent.values);
        d(this.f51878b, this.f51882f.getRotation());
        float fA = a(this.f51878b);
        e(this.f51878b);
        c(this.f51878b);
        b(this.f51878b, fA);
    }
}
