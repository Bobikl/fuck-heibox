package com.huawei.hms.scankit.p;

import android.hardware.Camera;
import android.util.Log;

/* JADX INFO: compiled from: CameraExposureManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Camera f61875a;

    public synchronized g0 a() {
        return new g0(this.f61875a.getParameters().getMaxExposureCompensation(), this.f61875a.getParameters().getMinExposureCompensation(), this.f61875a.getParameters().getExposureCompensation(), this.f61875a.getParameters().getExposureCompensationStep());
    }

    public synchronized void a(int i10) {
        try {
            Camera camera = this.f61875a;
            if (camera == null) {
                return;
            }
            try {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setExposureCompensation(i10);
                Log.i("WWYYEHG", "setExpuseModeA: " + parameters.getAutoExposureLock());
                this.f61875a.setParameters(parameters);
                Log.i("WWYYEHG", "setExpuseModeB: " + parameters.getAutoExposureLock());
            } catch (RuntimeException unused) {
                Log.w("CameraManager", "CameraExposureManager::setCompensation failed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(Camera camera) {
        this.f61875a = camera;
    }
}
