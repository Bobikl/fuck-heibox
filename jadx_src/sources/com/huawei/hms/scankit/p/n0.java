package com.huawei.hms.scankit.p;

import android.hardware.Camera;
import android.util.Log;

/* JADX INFO: compiled from: CameraZoomManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Camera f62123a;

    public synchronized m0 a() {
        return new m0(this.f62123a.getParameters().getMaxZoom(), this.f62123a.getParameters().getZoom(), this.f62123a.getParameters().getZoomRatios());
    }

    public synchronized void a(int i10) {
        Camera camera = this.f62123a;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        parameters.setZoom(i10);
        try {
            this.f62123a.setParameters(parameters);
        } catch (RuntimeException e10) {
            Log.e("CameraManager", "CameraZoomManager::setCameraZoomIndex failed: " + e10.getMessage());
        }
    }

    public synchronized void a(Camera camera) {
        this.f62123a = camera;
    }

    public synchronized boolean b() {
        Camera camera = this.f62123a;
        if (camera == null) {
            return false;
        }
        return camera.getParameters().isZoomSupported();
    }
}
