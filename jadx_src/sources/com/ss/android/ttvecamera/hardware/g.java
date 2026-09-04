package com.ss.android.ttvecamera.hardware;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.SizeF;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: TECameraSSProxy.java */
/* JADX INFO: loaded from: classes9.dex */
@TargetApi(21)
public class g extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, Float> f97550e;

    public g(Context context) {
        super(context);
        this.f97550e = new HashMap();
    }

    public void C(CameraCharacteristics cameraCharacteristics, String str) {
        this.f97550e.put(str, Float.valueOf(((SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)).getHeight()));
    }

    public String D() {
        Map<String, Float> map = this.f97550e;
        if (map == null) {
            return null;
        }
        float f10 = 0.0f;
        String str = "";
        for (String str2 : map.keySet()) {
            float fFloatValue = this.f97550e.get(str2).floatValue();
            if (f10 < fFloatValue) {
                str = str2;
                f10 = fFloatValue;
            }
        }
        return str;
    }

    public String E(CameraManager cameraManager, int i10, String[] strArr) throws CameraAccessException {
        int i11 = 0;
        for (String str : strArr) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            int i12 = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1 ? 0 : 1;
            if (i12 == i10 && i12 == 1) {
                C(cameraCharacteristics, str);
                i11++;
            }
        }
        if (i11 >= 2) {
            return D();
        }
        return null;
    }
}
