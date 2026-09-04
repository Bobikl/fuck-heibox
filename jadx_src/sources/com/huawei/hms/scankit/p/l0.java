package com.huawei.hms.scankit.p;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: CameraMeteringManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Camera f62048a;

    public synchronized k0 a() {
        int maxNumMeteringAreas;
        RuntimeException e10;
        Rect rect;
        try {
            maxNumMeteringAreas = this.f62048a.getParameters().getMaxNumMeteringAreas();
            try {
                rect = this.f62048a.getParameters().getMeteringAreas().get(0).rect;
            } catch (RuntimeException e11) {
                e10 = e11;
                Log.w("CameraManager", "CameraMeteringManager::getCameraMeteringData failed: " + e10.getMessage());
                rect = null;
            }
        } catch (RuntimeException e12) {
            maxNumMeteringAreas = 0;
            e10 = e12;
        }
        return new k0(maxNumMeteringAreas, rect);
    }

    public synchronized void a(Camera camera) {
        this.f62048a = camera;
    }

    public synchronized void a(List<k0.a> list) {
        Camera camera = this.f62048a;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(new Camera.Area(list.get(i10).f62025a, list.get(i10).f62026b));
        }
        parameters.setMeteringAreas(arrayList);
        try {
            this.f62048a.setParameters(parameters);
        } catch (RuntimeException e10) {
            Log.w("CameraManager", "CameraMeteringManager::setCameraMeteringArea failed: " + e10.getMessage());
        }
    }
}
